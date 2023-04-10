using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab4Forms
{
    internal class Decorators
    {
        public int decorationExpenses = 10000;
        public int totalDecorationExpense;

        public Decorators()
        {
            College.CollegeFest += new College.EQ_EventHandler(College_CollegeFest);
        }

        public void College_CollegeFest(object sender, EQ_EventArgs ea) {
            totalDecorationExpense = decorationExpenses + (ea.numOfPeople * 10);
        }
    }
}
