//Librerias
using System;
using System.ServiceModel;

//Definir los Mensajes, se define que se va a hacer (como un indicador)

namespace WSDL.mensajes  //namespace es el package
{
    //Se crea una interfaz, Mensajes es el nombre de la clase
    [ServiceContract] //El crear un contrato
    public interface Mensajes
    {
        //Definicion de metodos
        [OperationContract]
            String Saludar(string nombre);

        [OperationContract]
            String Mostrar(int id);
    }
}

