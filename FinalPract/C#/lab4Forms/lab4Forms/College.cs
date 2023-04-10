using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab4Forms
{
    internal class College
    {
        public delegate void EQ_EventHandler(object sender, EQ_EventArgs ea);

        public static event EQ_EventHandler CollegeFest;

        public void onCollegeFest(object sender, EQ_EventArgs ea) {
            if (CollegeFest != null) {
                CollegeFest(sender, ea);
            }
        }
    }

    public class EQ_EventArgs : EventArgs {
        public int numOfPeople;

        public EQ_EventArgs(int n) {
            numOfPeople = n;
        }
    }
}
