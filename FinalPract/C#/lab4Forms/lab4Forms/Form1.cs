using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab4Forms
{
    public partial class Form1 : Form
    {
        College collegeObj;
        Caterers caterersObj;
        Decorators decoratorsObj;

        int cc, de;
        String Message;
        public Form1()
        {
            collegeObj = new College();
            caterersObj = new Caterers();
            decoratorsObj = new Decorators();

            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void submitBtn_Click(object sender, EventArgs e)
        {
            EQ_EventArgs ea_args = new EQ_EventArgs(int.Parse(numOfPeople.Text));
            collegeObj.onCollegeFest(sender, ea_args);
            
            cc = caterersObj.totalCatering;
            de = decoratorsObj.totalDecorationExpense;
            Message = $"Catering charges per person : Rs 200 \nThe total Catering cost (200 x {numOfPeople.Text}) i.e. Rs. {cc} \n\nDecoration charges: Rs 10000 + Rs 10 per person \nThe total Decorating expense (10000 + {numOfPeople.Text}x10) i.e Rs. {de} ";
            MessageBox.Show(Message);
        }
    }
}
