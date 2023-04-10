using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace saddle
{
    class Program

     {
        static bool findSaddlePoint(int[,] mat,
                                int n)
        {

            // Process all rows one by one
            for (int i = 0; i < n; i++)
            {

                // Find the minimum element of
                // row i. Also find column index
                // of the minimum element
                int min_row = mat[i, 0], col_ind = 0;
                for (int j = 1; j < n; j++)
                {
                    if (min_row < mat[i, j])
                    {
                        min_row = mat[i, j];
                        col_ind = j;
                    }
                }

                // Check if the minimum element
                // of row is also the maximum
                // element of column or not
                int k;
                for (k = 0; k < n; k++)

                    // Note that col_ind is fixed
                    if (min_row > mat[k, col_ind])
                        break;

                // If saddle point is present in this row then
                // print it
                if (k == n)
                {
                    Console.WriteLine("Value of Saddle Point "
                                                    + min_row);
                    return true;
                }
            }

            // If Saddle Point not found
            return false;

            Console.ReadKey();
        }
        static void Main(string[] args)
        {

            Console.WriteLine("enter rows");
            int rows = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("enter coloumn");
            int columns = Convert.ToInt32(Console.ReadLine());


            int[,] arr = new int[rows, columns];
            int i, j;

            for (i = 0; i < rows; i++)
            {
                for (j = 0; j < columns; j++)
                {
                     
                    arr[i, j] = int.Parse(Console.ReadLine());

                }
            }

            Console.WriteLine();


            Console.WriteLine("matrix is : ");

            for (i = 0; i < rows; i++)
            {
                for (j = 0; j < columns; j++)
                {

                    Console.Write(arr[i, j]);

                }
                Console.WriteLine();
            }

            Console.WriteLine();

            if (findSaddlePoint(arr,rows) == false)
                Console.WriteLine("No Saddle Point ");
            Console.ReadKey();
        }
    }
}
