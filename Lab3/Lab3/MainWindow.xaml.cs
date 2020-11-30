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
using System.Globalization;
using System.Collections.ObjectModel;
using System.ComponentModel;


namespace Lab3
{
    /// <summary>
    /// Logika interakcji dla klasy MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        /*Proszę napisać aplikację Kontakty, która pozwala na:
            +1 dodawanie i wyświetlanie danych osób (imię, miasto, data urodzenia)
            ++2 edycję tych danych
            ++3 usuwanie osób z listy
            ++4 aplikacja zawiera klasę Person
            ++5 aplikacja zawiera listę osób w code behind
            ++6 ta lista osób powinna być powiązana z wyświetlającą ją kontrolką
            ++7 w kontrolce z listą osób wyświetlane jest imię i miasto
            ++8 klasa Person powinna implementować INotifyPropertyChanged
            ++9 dane zaznaczonej osoby powinny automatycznie wyświetlać się w polach edycyjnych lub etykietach
            ++10 wszystkie rodzaje kontrolek w oknie powinny mieć styl domyślny, a wybrane, pojedyncze kontrolki - jawnie przypisany styl z kluczem
           ++ 11 przyciski są okrągłe (szablon)
        Oceny: maks. 5+, pół oceny w dół za każdy brakujący punkt*/

        //private ObservableCollection<Person> listPersons = new ObservableCollection<Person>();

        PersonsModel model;
        //PatProperty newProp;
        //private static ObservableCollection<Person> newColl = new ObservableCollection<Person>();
        private static Person k;
        public MainWindow()
        {
            InitializeComponent();
            //newProp = new PatProperty();
            k = new Person();
            model = new PersonsModel() {NewPers = k/*, Persons = newColl*/};
            this.DataContext = model;
        }


        private void Add_Click(object sender, RoutedEventArgs e)
        {
            //k = new Person() { Name = Name.Text, City = City.Text /*, Date = DateTime.ParseExact(DateOfBirth.Text, "dd-MM-yyyy", CultureInfo.InvariantCulture)*/ };

            /*k = new Person() { Name = Name.Text, City = City.Text /*, Date = DateTime.ParseExact(DateOfBirth.Text, "dd-MM-yyyy", CultureInfo.InvariantCulture)*//* };*/
            //newColl.Add(k);
        }

        private void Remove_Click(object sender, RoutedEventArgs e)
        {
            
        }

        private void Edit_Click(object sender, RoutedEventArgs e)
        {

        }
    }
}
