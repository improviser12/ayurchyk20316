using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;


namespace Calculator.WPF.lab2
{
    /// <summary>
    /// Logika interakcji dla klasy MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        #region DeklaracjaZmiennych
        //po przecinku można wpisać tylko 5 znaków
        private float fnum;
        private float snum;
        private float res;

        bool plusBut = false;
        bool minusBut = false;
        bool multiplyBut = false;
        bool divideBut = false;
        #endregion

        public MainWindow()
        {
            InitializeComponent();
            poleEd1.Focus();
        }
        
        #region 741
        private void num7_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "7";
        }

        private void num4_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "4";
        }

        private void num1_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "1";
        }
        #endregion

        #region zmianaZnaku
        private void changeSymb_Click(object sender, RoutedEventArgs e)
        {
            if(poleEd1.Text.StartsWith("-"))
            {
                poleEd1.Text = poleEd1.Text.Remove(0, 1);
            }
            else
            {
                poleEd1.Text = '-' + poleEd1.Text;
            }
            
        }
        #endregion

        #region 8520
        private void num8_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "8";
        }

        private void num5_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "5";
        }

        private void num2_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "2";
        }

        private void num0_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "0";
        }
        #endregion

        #region 963
        private void num9_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "9";
        }

        private void num6_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "6";
        }

        private void num3_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Text += "3";
        }
        #endregion

        #region przecinek
        private void comma_Click(object sender, RoutedEventArgs e)
        {
            if (!poleEd1.Text.Contains(","))
            {
                poleEd1.Text += ",";
            }
        }
        #endregion

        #region DivideMyltiplyMinusPlus
        private void divide_Click(object sender, RoutedEventArgs e)
        {
            if (poleEd1.Text == "")
            {
                poleEd1.Text += "0";
            }
            fnum = float.Parse(poleEd1.Text);
            poleEd2.Text = Convert.ToString(fnum) + "÷";
            poleEd1.Clear();
            divideBut = true;
            poleEd1.Focus();
        }

        private void multiply_Click(object sender, RoutedEventArgs e)
        {
            if (poleEd1.Text == "")
            {
                poleEd1.Text += "0";
            }
            fnum = float.Parse(poleEd1.Text);
            poleEd2.Text = Convert.ToString(fnum) + "×";
            poleEd1.Clear();
            multiplyBut = true;
            poleEd1.Focus();
        }

        private void minus_Click(object sender, RoutedEventArgs e)
        {
            if (poleEd1.Text == "")
            {
                poleEd1.Text += "0";
            }
            fnum = float.Parse(poleEd1.Text);
            poleEd2.Text = Convert.ToString(fnum) + "-";
            poleEd1.Clear();
            minusBut = true;
            poleEd1.Focus();
        }

        private void plus_Click(object sender, RoutedEventArgs e)
        {
            if (poleEd1.Text == "")
            {
                poleEd1.Text += "0";
            }
            fnum = float.Parse(poleEd1.Text);
            poleEd2.Text = Convert.ToString(fnum) + "+";
            poleEd1.Clear();
            plusBut = true;
            poleEd1.Focus();
        }
        #endregion

        #region Equals
        private void equals_Click(object sender, RoutedEventArgs e)
        {

            if(plusBut == true)
            {
                snum = float.Parse(poleEd1.Text);
                poleEd1.Clear();
                poleEd2.Text += Convert.ToString(snum) + "=";
                res = fnum + snum;
                poleEd1.Text = Convert.ToString(res);
                plusBut = false;
            }
            else if (minusBut == true)
            {
                snum = float.Parse(poleEd1.Text);
                poleEd1.Clear();
                poleEd2.Text += Convert.ToString(snum) + "=";
                res = fnum - snum;
                poleEd1.Text = Convert.ToString(res);
                minusBut = false;
            }

            else if (multiplyBut == true)
            {
                snum = float.Parse(poleEd1.Text);
                poleEd1.Clear();
                poleEd2.Text += Convert.ToString(snum) + "=";
                res = fnum * snum;
                poleEd1.Text = Convert.ToString(res);
                multiplyBut = false;
            }
            else if (divideBut == true)
            {
                snum = float.Parse(poleEd1.Text);
                if(snum == 0)
                {
                    MessageBox.Show("Can't divide by zero!");
                    poleEd1.Clear();
                }
                else
                {
                    poleEd1.Clear();
                    poleEd2.Text += Convert.ToString(snum) + "=";
                    res = fnum / snum;
                    poleEd1.Text = Convert.ToString(res);
                    divideBut = false;
                }
            }
            poleEd1.Focus();
        }
        #endregion

        #region Delete
        private void dellAll_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Clear();
            poleEd2.Clear();
            poleEd1.Focus();
        }

        private void dellLast_Click(object sender, RoutedEventArgs e)
        {
            poleEd1.Clear();
            poleEd1.Focus();
        }
        #endregion

        #region Check_letters
        public bool ValidNumericString(string IPString)
        {
            return IPString.All(char.IsDigit);
            // OR make this check for thousands & decimals if required
        }

        private void poleEd1_TextChanged(object sender, TextChangedEventArgs e)
        {
            if (!ValidNumericString(poleEd1.Text))
            {
                MessageBox.Show("You have entered invalid characters! Please enter a number");
                Dispatcher.BeginInvoke(new Action(() => poleEd1.Undo()));
                e.Handled = true;
            }
        }
        #endregion
    }
}
