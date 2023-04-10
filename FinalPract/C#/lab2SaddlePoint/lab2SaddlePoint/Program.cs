using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab2SaddlePoint
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int flag = 0;
            Console.WriteLine("Enter no. of rows");
            int rows = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter no. of columns: ");
            int cols = Convert.ToInt32(Console.ReadLine());

            int[,] arrMatrix = new int[rows,cols];

            Console.WriteLine("Enter array elements: ");
            for(int i=0; i<rows; i++)
            {
                for (int j = 0; j < cols; j++) { 
                    arrMatrix[i,j] = Convert.ToInt32(Console.ReadLine());
                }
            }

            Console.WriteLine("Entered arrMatrix: ");
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    Console.Write(arrMatrix[i, j] + "\t");
                }
                Console.WriteLine("\n");
            }

            for (int i = 0; i < rows; i++)         // iterating through every row to find max element in that row along
            {
                int max_row = arrMatrix[i,0];
                int col_idx = 0;
                for (int j = 0; j < cols; j++)
                {
                    if (max_row < arrMatrix[i, j]) {     //setting actual max row element to max_row if found
                        max_row = arrMatrix[i, j];
                        col_idx = j;        // setting that element's col index to col_idx
                    }
                    
                }
                int k = 0;
                for (k = 0; k < rows; k++)          // finding min of col element and setting it to max_row
                {
                    if (max_row > arrMatrix[k, col_idx])
                        break;

                }
                if (k == rows)          // when iteration completes, printing all possible saddle points present
                {
                    Console.WriteLine($"saddle point: present at arrMatrix[{i}, {col_idx}]:  " + max_row);
                    flag = 1;
                }
                
            }
            if (flag == 0)
            {
                Console.WriteLine("Saddle point not found");
            }
        }
    }
}
