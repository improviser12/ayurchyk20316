using System;
using System.Windows.Input;

namespace Lab3
{
    class PatPolecenia : ICommand
    {
        public event EventHandler CanExecuteChanged;
        private Action Polecenie;

        public PatPolecenia(Action doIt) //konstruktor
        {
            Polecenie = doIt;
        }

        public bool CanExecute(object parameter) //po wciskaniu przycisku zwraca się prawda
        {
            return true;
        }

        public void Execute(object parameter) //wykonywanie polecenia
        {
            Polecenie();
        }
    }
}
