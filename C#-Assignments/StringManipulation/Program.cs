using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1) Append Data To Existing String till user wants to continue.\n2) Accept a sub string from user and replace it in original string is sub string is present");
            Console.WriteLine("3) Count occurences of given sub string in OrgString\n4) Implement remove string functionality by accepting start position and number of characters from end user.\n\n");
            String orgStr = "hello hello hello hello C#";
            StringBuilder sb = new StringBuilder(orgStr);
            Console.WriteLine("Enter substring to count occurences:");
            String subStr=Console.ReadLine();

            var matches = Regex.Matches(orgStr,subStr);
            Console.WriteLine("{0} occurences of Substring \"{1}\" ", matches.Count,subStr)   ;
            
            String substr2 = "Helloooo C#";
            StringBuilder sb3= new StringBuilder(substr2);
            sb3.Remove(5, 3);
            Console.WriteLine(sb3.ToString());
            Console.ReadLine();
        }
    }
}
