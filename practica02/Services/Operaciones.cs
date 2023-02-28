using System;
using WSDL.mensajes; 

//Aqui se define que se va a hacer (definir los metodos)
namespace WSDL.operaciones
{
    public class Operaciones : Mensajes
    {
        public string Saludar(string nombre)
        {
            string msj = "Hola" + nombre;
            return msj;
        }

        public string Mostrar(int id)
        {
            return "x";
        }
    }
}
