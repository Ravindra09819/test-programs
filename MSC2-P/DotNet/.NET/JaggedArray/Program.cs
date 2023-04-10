using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int sizeOfArray;
            Console.WriteLine("Enter the size of the array:");
            sizeOfArray = Convert.ToInt32(Console.ReadLine());

            int[][] arr=new int[sizeOfArray][];

            for (int i = 0; i < sizeOfArray; i++) { 
                Console.WriteLine("\nEnter size of the column "+(i+1));
                int count=Convert.ToInt32(Console.ReadLine());
                arr[i]=new int[count];

                for (int j = 0; j < count; j++) { 
                    Console.WriteLine("Enter element "+(j+1));
                    arr[i][j]=Convert.ToInt32(Console.ReadLine());
                }
            }

            Console.WriteLine("Final Jagged Array:");
            for (int i = 0; i < arr.Length; i++) { 
                Console.WriteLine("\nElement stored at position "+i);
                for (int j = 0; j < arr[i].Length; j++) { 
                    Console.WriteLine(arr[i][j]+" ");
                }
            }
            Console.ReadKey();
        }
    }
}
