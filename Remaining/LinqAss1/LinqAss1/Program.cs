using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LinqAss1// LINQ :- Language Integrated Query used to makes the code more readable
{
    class Program
    {
        static void Main(string[] args)
        {
             string str = Console.ReadLine();//"Fergusson College";
             var s = from x in str group x by x into y select y;//var :- used to declare an implicit type variable

            foreach (var ch in s)//foreach :- used to loop through each key/value pair in an array
            {
                 Console.WriteLine("Character " + ch.Key + ": " + ch.Count() + "times");
             }

            Console.ReadKey();
        }
    }
}
