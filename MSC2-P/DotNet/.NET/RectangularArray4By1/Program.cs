using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RectangularArray4By1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] a = new int[3, 3];
            a[0, 1] = 1;
            a[0, 2] = 2;
            a[1, 0] = 3;
            a[1, 1] = 4;
            a[1, 2] = 5;
            a[2, 0] = 6;
            a[2, 1] = 7;
            a[2, 2] = 8;
            int i, j;

            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    Console.WriteLine("a[{0},{1}]={2}",i,j,a[i,j]);

                }
            }
            Console.ReadKey();
        }
    }
}
