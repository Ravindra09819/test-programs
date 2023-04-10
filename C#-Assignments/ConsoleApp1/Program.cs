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
            int n;
            Console.WriteLine("Enter the size of an array:");
            n=Convert.ToInt32(Console.ReadLine());
            String[] stringArr = new String[n];

            Console.WriteLine("Enter "+n+" Strings:");
            for (int i = 0; i < n; i++) { 
                stringArr[i] = Console.ReadLine();
            }

            for (int i = 0; i < stringArr.Length; i++) {
                for (int j = i+1; j <stringArr.Length ; j++)
                {
                    if (stringArr[j].Length < stringArr[i].Length) {
                        String temp = stringArr[i];
                        stringArr[i]=stringArr[j];
                        stringArr[j]=temp;
                    }
                }      
            }
            Console.WriteLine("Second Largest String is:"+stringArr[stringArr.Length-2]);
            Console.ReadKey();
        }
    }
}
