using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ExceptionLibrary;
using static ExceptionLibrary.MyException;

namespace ExceptionLibrary
{
    public class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                MyOperation.processdata(5, 0, 5);
            }
            catch (MyException ex)
            {
                Console.WriteLine(ex.err_code);
                Console.WriteLine(ex.err_msg);
            }

            try
            {
                MyOperation.processarray();
            }
            catch (MyException ex)
            {
                Console.WriteLine(ex.err_code);
                Console.WriteLine(ex.err_msg);
            }
            Console.ReadKey();
        }
    }
}