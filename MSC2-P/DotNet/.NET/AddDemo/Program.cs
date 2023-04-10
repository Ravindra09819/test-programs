using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ClassLibrary1;
namespace AddDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 obj = new Class1();
            int c=obj.add(2,3);
            Console.WriteLine(c);
            Console.ReadKey();
        }
    }
}
