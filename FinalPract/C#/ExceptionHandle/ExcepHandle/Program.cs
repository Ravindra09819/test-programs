using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ExceptionH;

namespace ExcepHandle
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try {
                MyOperations.CaptureDivisionException(5,0);
            }
            catch (MyCustomException e) {
                Console.WriteLine("\'Error Code\': " + e.ErrorCode + "\t\'Error Message\': " + e.ErrorMessage);
            }

            try {
                MyOperations.CaptureArraySizeException(7);
            }
            catch (MyCustomException e) {
                Console.WriteLine("\'Error Code\': " + e.ErrorCode + "\t\'Error Message\': " + e.ErrorMessage);
            }

            Console.ReadKey(); 
        }
    }
}
