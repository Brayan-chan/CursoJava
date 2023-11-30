package polimorfismo;
//POLIMORFISMO EN JAVA

/*
* Es la capacidad que se le da a un metodo, de comportarse de de 
* manera diferente de acuerdo a la instancia creada.
*
* Es decir, dependiendo de la clase con la que se este interactuando,
* sera la funcion que va ejecutar el metodo.
*
* Por ejemplo:
* 
* Supongamos que Brayan es el metodo y recibe dos llamadas 
* telefonicas.
*
* Ernesta va a comportarse de manera diferente, dependiendo de quien
* se este comunicando con el.
*
* Si es una empresa que se comunica con Brayan, el se comportara de 
* manera muy formal y atenta.
*
* Pero si Brayan recibe una llamada telefonica de un amigo, Brayan 
* se comportara de manera amigable y divertido.
*
* En conclusion el polimorfismo consiste en hacer que un metodo se 
* comunique con clases diferentes, y dependiendo de la clase con la
* que tenga comunicacion, su comportamiento sera completamente 
* diferente.
*/

import java.util.Scanner;

public abstract class Operaciones_ClasePadre {
    //Crear a las variables
    protected int valor1, valor2, resultado;
    
    Scanner input = new Scanner(System.in);
    
    //Crear el metodo que heredaremos en las otras clase
    
    public void PedirDatos() {
        System.out.print("Dame el primer valor: ");
        valor1 = input.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = input.nextInt();
    }
    
    //Metodo para crear el polimorfismo
    //Debe ser capaz de comportarse diferente
    
    //Hay que utilizar abstact tanto para el metodo como para la clase
    //No lleva llaves y tampoco logica dentro de la clase
    public abstract void Operaciones();
    
    public void MostrarResultado() {
        System.out.println(resultado);
    }
}
