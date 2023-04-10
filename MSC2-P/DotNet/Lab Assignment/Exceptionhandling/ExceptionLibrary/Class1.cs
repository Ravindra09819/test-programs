using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ExceptionLibrary;

namespace ExceptionLibrary
{
    public class MyException : Exception

    {
        public string err_code;
        public string err_msg;

        public MyException(string code, string msg) : base(msg)
        {
            err_code = code;
            err_msg = msg;
        }
        public class MyOperation
        {
            public static int processdata(int a, int b, int n)
            {
                int result;
                try
                {
                    result = a / b;
                }
                catch (DivideByZeroException)
                {
                    MyException ex = new MyException("Math error", "Invalid denominator");
                    throw (ex);
                }
                return result;

            }


            public static int processarray()
            {
                int[] arr = new int[3] { 1, 2,3};
                try
                {
                    Console.WriteLine(arr[0]);
                    Console.WriteLine(arr[1]);
                    Console.WriteLine(arr[2]);
                    Console.WriteLine(arr[5]);
                    return 0;
                }
                catch (IndexOutOfRangeException)
                {
                    MyException ex = new MyException("enter valid index", "index out of range");
                    
                    throw (ex);
                }
            }
        }
    }
}