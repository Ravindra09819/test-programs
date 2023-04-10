using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SwapString
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string a, b;
            Console.WriteLine("Enter first String");
            a = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter Second String");
            b = Convert.ToString(Console.ReadLine());
            Program p = new Program();
            p.SwapString(ref a, ref b);
            Console.WriteLine("First", + a);
            Console.WriteLine("second", +b);
            Console.ReadKey();

        }
        public void SwapString(ref a, ref bool, out int x, out int y)

        {
            String temp = a;
            a = b;
            b = temp;
            x = a;
            y = b;

        }

    }

}
