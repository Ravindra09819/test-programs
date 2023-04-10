using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            StringBuilder orgStr = new StringBuilder("Hello C# ");
            String subStr ="";
            while (true) {
                Console.WriteLine("Do you want to append other strings (Enter 1 for Yes / Enter 0 for No):");
                int i = Convert.ToInt32(Console.ReadLine());

                if (i == 0) {
                    Console.WriteLine(orgStr); 
                    Console.ReadLine(); 
                    break;
                }
                Console.WriteLine("Enter string to append:");
                subStr=Convert.ToString(Console.ReadLine());
                orgStr.Append(subStr);
            }
        }
    }
}
