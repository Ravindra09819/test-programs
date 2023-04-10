using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExceptionH
{
    public class MyOperations
    {
        public static int CaptureDivisionException(int a, int b)
        {
            try {
                return a / b;
            }
            catch (DivideByZeroException e) {
                MyCustomException ex = new MyCustomException("Division Error", "Can't divide any number by 0!", e.Message);
                throw ex;
            }

        }
        public static void CaptureArraySizeException(int n) {
            try {
                int[] arr = {12, 25, 18, 33, 44, 71 };

                for (int i = 0; i < n; i++) {
                    Console.WriteLine(arr[i]);
                }
            }
            catch (IndexOutOfRangeException e) {
                MyCustomException ce = new MyCustomException("Index Error", "array size limit exceeded!", e.Message);
                throw ce;
            }
        }
            
    }
}
