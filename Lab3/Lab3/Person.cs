using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;

namespace Lab3
{
    class Person : INotifyPropertyChanged
    {
        private string name;
        private string city;
        private DateTime dateOfBirth;

        public event PropertyChangedEventHandler PropertyChanged;
        void OnPropertyChanged(string propertyName)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        public string Name
        {
            get
            {
                return name;
            }
            set
            {
                name = value;
                OnPropertyChanged("name");
            }
        }

        public string City
        {
            get
            {
                return city;
            }
            set
            {
                city = value;
                OnPropertyChanged("city");
            }
        }

        public DateTime Date
        {
            get
            {
                return dateOfBirth;
            }
            set
            {
                dateOfBirth = value;
                OnPropertyChanged("data");
            }
        }

        public Person(string name, string city, DateTime date)
        {
            this.name = name;
            this.city = city;
            this.dateOfBirth = date;
        }
        public Person() { }
    }
}
