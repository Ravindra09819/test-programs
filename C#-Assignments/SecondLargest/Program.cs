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
            Console.WriteLine("Enter how many string you want to accept:");
            n = Convert .ToInt32(Console.ReadLine());
            string[] stringArr = new string[n];
            
            Console.WriteLine("Enter "+n+" Strings:");
            for (int i = 0; i < stringArr.Length; i++)
            {
                stringArr[i] = Console.ReadLine();
            }
            for(int i = 0; i < stringArr.Length; i++)
            {
                for (int j = i+1; j < stringArr.Length; j++)
                {
                    if (stringArr[j].Length < stringArr[i].Length)
                    {
                        string temp = stringArr[i];
                        stringArr[i]=stringArr[j];
                        stringArr[j]=temp;
                    }
                }
            }
            Console.WriteLine("Second Largest String is:" + stringArr[stringArr.Length - 2]);
            Console.ReadKey();
        }
    }
}
