using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3
{
    class PersonsModel : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;
        void OnPropertyChanged(string propertyName)
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }

        PatProperty newProperty;
        public PersonsModel()
        {
            newPers = new Person(); // 2 num
            newProperty = new PatProperty();
            AddList(); // 1 num
            pDodaj = new PatPolecenia(DodajOs); // 3 num
            pEdytuj = new PatPolecenia(EditOs); // 4 num
            pUsun = new PatPolecenia(RemoveOs); // 5 num
        }

        #region Message
        /*private string message;
        public string Message
        {
            get
            { 
                return message; 
            }
            set 
            {
                message = value; 
                OnPropertyChanged("Message"); 
            }
        }*/
        #endregion

        #region Polecenia
        private PatPolecenia pDodaj;
        public PatPolecenia PDodaj
        {
            get
            {
                return pDodaj;
            }
        }

        private PatPolecenia pEdytuj;
        public PatPolecenia PEdytuj
        {
            get
            {
                return pEdytuj;
            }
        }

        private PatPolecenia pUsun;
        public PatPolecenia PUsun
        {
            get
            {
                return pUsun;
            }
        }
        #endregion

        #region 1 num
        private ObservableCollection<Person> listPersons = new ObservableCollection<Person>();
        public ObservableCollection<Person> Persons
        {
            get
            {
                return listPersons;
            }
            set
            {
                listPersons = value;
                OnPropertyChanged("Persons");
            }
        }
        private void AddList()
        {
            Persons = new ObservableCollection<Person>(newProperty.GetList());
        }
        #endregion

        #region 2 num
        private Person newPers;
        public Person NewPers
        {
            get
            {
                return newPers;
            }
            set 
            {
                newPers = value;
                OnPropertyChanged("NewPers"); 
            }
        }
        #endregion

        #region 3 num
        public void DodajOs()
        {
            newProperty.Add(newPers);
            AddList();
        }
        #endregion

        #region 4 num
        public void EditOs()
        {
            newProperty.Edit(newPers);
        }
        #endregion

        #region 5 num
        public void RemoveOs()
        {
            int index = listPersons.IndexOf(newPers);
            newProperty.Remove(index);
        }
        #endregion

    }
}
