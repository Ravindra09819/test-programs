using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CheckedUnchecked
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int val1 = int.MaxValue;
            val1=unchecked(val1+2);
            Console.WriteLine(val1);

            int val2 = int.MaxValue;
            val2= checked(val2+2);
            Console.WriteLine(val2);
            Console.ReadKey();
        }
    }
}
