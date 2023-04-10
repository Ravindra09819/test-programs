using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ClassLibrary2;

namespace CustomException
{
    public static void main (string[]args)
    {
        try
        {
            Myoperations.process(5, 0, 5);

        }
        catch (MyCustomException e)
        {
            Console.WriteLine($"Error code:{e.err_code},\n Error Message:{e.Message}");

        }
        Console.ReadKey();
    }
}
