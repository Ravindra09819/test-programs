using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab6linq
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> list = new List<int>() {1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            
            var positiveNos = from item in list where item > 10 select item;

            foreach (var num in positiveNos) { 
                Console.Write(num+"\t");
            }
            Console.WriteLine("\n");   

            string givenStr = "Fergusson College";

            var lfrequeny = from letter in givenStr group letter by letter into freq select freq;

            Console.WriteLine("Characters Occurences: ");
            foreach (var item in lfrequeny) {
                Console.WriteLine("Character "+ item.Key+ ":"+ item.Count());
            }

            Console.ReadLine();
        }
    }
}
