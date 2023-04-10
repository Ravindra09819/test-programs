using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab4Forms
{
    internal class Caterers
    {
        public int CateringChargesPerPlate = 200;
        public int totalCatering;

        public Caterers() {
            College.CollegeFest += new College.EQ_EventHandler(College_CollegeFest);
        }
        public void College_CollegeFest(object sender, EQ_EventArgs ea) {
            totalCatering = ea.numOfPeople * CateringChargesPerPlate;
        }
    }
}
