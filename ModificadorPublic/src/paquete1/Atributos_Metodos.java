package paquete1;
//MODIFICADORES DE ACCESO
/*
* Para poder implementar el encapsulamiento de las clases, es  
* indispensable utilizar modificadores de acceso.
*
* Los modificadores de acceso permiten dar un nivel de seguridad 
* mayor a nuestras clases, restringiendo el acceso a diferentes 
* atributos, metodos y constructores.
*
* 4 modificadores de acceso
*
* public		protected
*
* private		default
*
*
* El modificador de acceso por defecto, no tiene ninguna palabra 
* reservada asociada, pero se suele conocer como default o 
* packege-private.
* Entonces cuando no especificamos ningun modificador de acceso, se
* utiliza se utiliza el modificador de acceso por defecto, que 
* consiste en que el elemento puede ser accedido solo desde las 
* clases que pertenezcan al mismo paquete.
*/


public class Atributos_Metodos {
    //Crear tres argumentos = variables
    //Ya existe un modificador por defecto
    /*
    * Estos argumentos se encapsulan de manera que solo podemos acceder
    * a ellos desde una clase que este dentro del mismo paquete
    */
    public int valorUno = 4;
    public int valorDos;
    public String valorTres;
    
    //Encapulacion de manera publica
    public void metodoBrayan() {
        System.out.println("Hola mi nombre es Brayan y \nme encuentro en el paquete1");
    }
    
    //MODIFICADOR DE ACCESO public

    /*
    * El modificador de acceso public, permite acceder al elemento desde 
    * cualquier clase, independientemente de que esta pertenezca o no al
    * paquete en que se encuentra el elemento.
    */
    
}
