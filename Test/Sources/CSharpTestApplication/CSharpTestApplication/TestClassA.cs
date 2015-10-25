using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CSharpTestApplication
{
    class TestClassA
    {
        private string m_TestString = string.Empty;

        public TestClassA(String aStringPassedToConstructorOfTestClassA)
        {
            m_TestString = aStringPassedToConstructorOfTestClassA;
        }

        public string GetTestString()
        {
            return m_TestString;
        }

        public string Teststring
        {
            get { return m_TestString; }
        }
    }
}
