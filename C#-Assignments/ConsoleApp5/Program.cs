using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            
            int[][] a;
            Console.WriteLine("Enter The limit for rows");
            int y = Convert.ToInt32(Console.ReadLine());
            a=new int[y][];
            for (int i = 0; i < y; i++)
            {
                Console.WriteLine("Enter numbers");
                int z = int.Parse(Console.ReadLine());
                a[i]=new int[z];
                for (int j = 0; j < z; j++)
                {
                    Console.WriteLine("Enter sub numbers");
                    a[i][j] = int.Parse(Console.ReadLine());
                }
            }
            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine("Row({0}):", i);
                for (int j = 0; j < a[i].Length; j++)
                { 
                    System.Console.WriteLine("{0}:-",a[i][j]);
                }
            }
            Console.ReadKey();
        }
    }
}
