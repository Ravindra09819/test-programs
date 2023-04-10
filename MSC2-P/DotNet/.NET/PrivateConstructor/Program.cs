using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrivateConstructor
{
    public sealed class Test
    {
        public static readonly Test test = new Test();
        public int a;

        private Test()
        {
            this.a = 99;

        }
        class program
        {
            static void Main(String[] args)
            {
                Test obj = Test.test;
                obj.a++;
                Console.WriteLine(obj.a);
                Console.ReadKey();

            }
        }
    }
}