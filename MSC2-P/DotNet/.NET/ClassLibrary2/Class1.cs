using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary2
{
    public class MyCustomException : Exception
    {
        public string err_code;
        public string message;
        public MyCustomException(string code, string msg, string OrgExMsg) : base(OrgExMsg)
        {
            err_code = code;
            message = msg;

        }
    }
    public class Myoperations
    {
        public static int process(int a, int b, int n)
        {
            int result;
            try
            {
                result = a / b;

            }
            catch(DivideByZeroException e)
            {
                MyCustomException ex = new MyCustomException("Maths Error", "invalid Denominator", e.Message);
                throw (ex);

            }
            return result;

        }
         public static void process2()
        {
            int[] arr = new int[3] { 1, 2, 3 };
            try
            {
                Console.WriteLine(arr[0]);
                Console.WriteLine(arr[1]);
                Console.WriteLine(arr[2]);

            }
            catch (IndexOutOfRangeException e)
            {
                MyCustomException ex = new MyCustomException("index Error", "Invalid Denominator", e.Message);
                throw (ex);

            }
        }
    }



    }

