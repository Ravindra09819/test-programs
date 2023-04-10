using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RectangularArray
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the number of rows:");
            int rows=Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter the number of cols:");
            int cols = Convert.ToInt32(Console.ReadLine());
            int[,] array = new int[rows, cols];

            for (int i = 0; i < rows; i++) {
                Console.WriteLine("Enter elements for "+i+" row:");
                for (int j = 0; j < cols; j++) {
                    Console.WriteLine("Enter element at position ("+i+","+j+")");
                    array[i, j]=Convert.ToInt32(Console.ReadLine());
                }
            }

            Console.WriteLine("Final Rectangular Array:");
            for (int i = 0; i < rows; i++)
            {            
                for (int j = 0; j < cols; j++)
                {
                    Console.WriteLine("Element at position (" + i + "," + j + "):"+array[i,j]);                  
                }
            }
            Console.ReadKey();
        }
    }
}


