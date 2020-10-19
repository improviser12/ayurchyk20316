using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.ComponentModel;
using System.Drawing;
using System.Windows.Forms;
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;

namespace Calculator_lab1_
{
    class Calc : Form
    {
        #region Declare buttons
        public static Button butPlus;
        public static Button butMinus;
        public static Button butMultiply;
        public static Button butDivide;
        public static Button butRemove;
        #endregion

        #region Declare textboxes
        public static TextBox firstNum;
        public static TextBox secondNum;
        public static TextBox result;
        #endregion

        #region Declare numbs
        private float fnum;
        private float snum;
        private float res;
        #endregion

        public string mess = null;

        #region Declare labels
        private static Label symbol;
        private static Label equals;
        #endregion

        #region Close Console
        const int SW_HIDE = 0;
        /*const int SW_SHOW = 5;
        const int SW_Min = 2;
        const int SW_Max = 3;
        const int SW_Norm = 4;*/

        [DllImport("kernel32.dll")]
        static extern IntPtr GetConsoleWindow();

        [DllImport("user32.dll")]
        static extern bool ShowWindow(IntPtr hWnd, int nCmdShow);
        #endregion
        static void Main(string[] args)
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Calc());
            
            //отобразить консоль
            //ShowWindow(handle, SW_SHOW);

            //свернуть консоль
            //ShowWindow(handle, SW_Min);

            //развернуть консоль
            //ShowWindow(handle, SW_Max);

            //нормальный размер консоли
            //ShowWindow(handle, SW_Norm);
        }

        public Calc()
        {
            var handle = GetConsoleWindow();
            //скрыть консоль
            ShowWindow(handle, SW_HIDE);

            #region Buttons
            butPlus = new Button();
            butPlus.Size = new Size(50, 30);
            butPlus.Location = new Point(10, 80);
            butPlus.Text = "Plus";
            this.Controls.Add(butPlus);
            butPlus.Click += new EventHandler(butPlus_Click);

            butMinus = new Button();
            butMinus.Size = new Size(55, 30);
            butMinus.Location = new Point(70, 80);
            butMinus.Text = "Minus";
            this.Controls.Add(butMinus);
            butMinus.Click += new EventHandler(butMinus_Click);

            butMultiply = new Button();
            butMultiply.Size = new Size(65, 30);
            butMultiply.Location = new Point(135, 80);
            butMultiply.Text = "Multiply";
            this.Controls.Add(butMultiply);
            butMultiply.Click += new EventHandler(butMultiply_Click);

            butDivide = new Button();
            butDivide.Size = new Size(55, 30);
            butDivide.Location = new Point(210, 80);
            butDivide.Text = "Divide";
            this.Controls.Add(butDivide);
            butDivide.Click += new EventHandler(butDivide_Click);

            butRemove = new Button();
            butRemove.Size = new Size(38, 30);
            butRemove.Location = new Point(5, 210);
            butRemove.Text = "Del";
            this.Controls.Add(butRemove);
            butRemove.Click += new EventHandler(butRemove_Click);
            #endregion

            #region TextBoxes
            firstNum = new TextBox();
            firstNum.Size = new Size(78, 30);
            firstNum.Location = new Point(5, 30);
            this.Controls.Add(firstNum);

            secondNum = new TextBox();
            secondNum.Size = new Size(78, 30);
            secondNum.Location = new Point(98, 30);
            this.Controls.Add(secondNum);

            result = new TextBox();
            result.Size = new Size(79, 30);
            result.Location = new Point(191, 30);
            this.Controls.Add(result);
            #endregion

            symbol = new Label();
            symbol.AutoSize = true;
            symbol.Location = new Point(84, 31);
            symbol.ForeColor = System.Drawing.Color.Red;
            symbol.Text = null;
            this.Controls.Add(symbol);

            equals = new Label();
            equals.AutoSize = true;
            equals.Location = new Point(176, 31);
            equals.ForeColor = System.Drawing.Color.Red;
            equals.Text = "=";
            this.Controls.Add(equals);


        } // size 265

        #region ClickPlus
        private void butPlus_Click(object sender, EventArgs e)
        {
            try
            {
                fnum = float.Parse(firstNum.Text);
                snum = float.Parse(secondNum.Text);
            }
            catch
            {
                mess = "Wrong sign found";
                MessageBox.Show("Wrong sign found");
            }
            if (!(mess == "Wrong sign found"))
            {
                res = fnum + snum;
                result.Text = res.ToString();
                symbol.Text = "+";
            }
            mess = null;
        }
        #endregion
        #region ClickMinus
        private void butMinus_Click(object sender, EventArgs e)
        {
            try
            {
                fnum = float.Parse(firstNum.Text);
                snum = float.Parse(secondNum.Text);
            }
            catch
            {
                mess = "Wrong sign found";
                MessageBox.Show("Wrong sign found");
            }
            if (!(mess == "Wrong sign found"))
            {
                res = fnum - snum;
                result.Text = res.ToString();
                symbol.Text = "-";
            }
            mess = null;
        }
        #endregion
        #region ClickMultiply
        private void butMultiply_Click(object sender, EventArgs e)
        {
            try
            {
                fnum = float.Parse(firstNum.Text);
                snum = float.Parse(secondNum.Text);
            }
            catch
            {
                mess = "Wrong sign found";
                MessageBox.Show("Wrong sign found");
            }
            if (!(mess == "Wrong sign found"))
            {
                res = fnum * snum;
                result.Text = res.ToString();
                symbol.Text = "*";
            }
            mess = null;
        }
        #endregion
        #region ClickDivide
        private void butDivide_Click(object sender, EventArgs e)
        {
            try
            {
                fnum = float.Parse(firstNum.Text);
                snum = float.Parse(secondNum.Text);
            }
            catch
            {
                mess = "Wrong sign found";
                MessageBox.Show("Wrong sign found");
            }
            if (!(mess == "Wrong sign found"))
            {
                res = fnum / snum;
                result.Text = res.ToString();
                symbol.Text = "/"; 
            }
            mess = null;
        }
        #endregion
        #region ClickRemove
        private void butRemove_Click(object sender, EventArgs e)
        {
            firstNum.Clear();
            secondNum.Clear();
            result.Clear();
            symbol.Text = "";
            equals.Text = "";
        }
        #endregion
    }
}
