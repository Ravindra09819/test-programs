using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SwitchCase
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Enter country name");
            String Country = Console.ReadLine();
            
            switch (Country)
            {
                case "India":
                    Console.WriteLine("Country Name: India Countrty Code: +91");                    
                    break;
                case "England":
                    Console.WriteLine("Country Name: England Countrty Code: +44");
                    break ;
                case "Australia":
                    Console.WriteLine("Country Name: Australia Countrty Code: +61");                   
                    break;
                case "Canada":
                    Console.WriteLine("Country Name: Canada Countrty Code: +1");                 
                    break;
                default:
                    Console.WriteLine("Please Entre Valid Country Name");                  
                    break;
            }
            Console.ReadKey();
        }       
    }
}
