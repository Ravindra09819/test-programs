using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LinqAss//Linq :- Language Integrated Query used to make the code more readable
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> list = new List<int>() { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            var L = list.Where(x=>x > 0 && x > 10).ToList();//var :- used to declare an implicit type variable

            foreach (var i in L)//used to loop through each key/value pair in an array
            {
                Console.WriteLine(i + " ");
            }

            Console.ReadKey();
        }
    }
}
