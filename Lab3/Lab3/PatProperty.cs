using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections.ObjectModel;

namespace Lab3
{
    class PatProperty
    {
        private static ObservableCollection<Person> newCol;
        public PatProperty()
        {
            newCol = new ObservableCollection<Person>();
            newCol.Add(new Person("Alex", "Baranovichi", new DateTime(1998, 08, 08)));
        }

        public ObservableCollection<Person> GetList()
        {
            return newCol;
        }
        /*********************************************************************************/

        public bool Add(Person p)
        {
            newCol.Add(p);
            return true;
        }

        public bool Edit(Person p)
        {
            int index = newCol.IndexOf(p);
            bool flaga = false;
            for (int i=0; i<newCol.Count; i++)
            {
                if(i==index)
                {
                    newCol[i].Name = p.Name;
                    newCol[i].City = p.City;
                    newCol[i].Date = p.Date;
                    flaga = true;
                    break;
                }
            }
            return flaga;
        }

        public bool Remove(int index)
        {
            bool flaga = false;
            for (int i = 0; i < newCol.Count; i++)
            {
                if (i == index)
                {
                    newCol.RemoveAt(i);
                    flaga = true;
                    break;
                }
            }
            return flaga;
        }

    }
}
