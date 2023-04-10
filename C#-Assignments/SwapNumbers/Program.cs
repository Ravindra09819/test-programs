using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace SwapNumbers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a, b;
            Console.WriteLine("Enter first number:");
            a=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter second number:");
            b = Convert.ToInt32(Console.ReadLine());

            Program p=new Program();
            p.swapNumbers(ref a, ref b);
            Console.WriteLine("First number="+a);
            Console.WriteLine("Second number=" +b);
            Console.ReadKey();
        }
        public void swapNumbers(ref int a,ref int b,out int x,out int y) {
            int temp = a;
            a = b;
            b = temp;
            x=a;
            y=b;
        }
    }
}
