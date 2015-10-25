using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CSharpTestApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            TestClassA a = new TestClassA("Some static arg");

            Console.WriteLine(a.Teststring);
            Console.WriteLine(a.GetTestString());
        }
    }
}
