package main;
//HERENCIA EN JAVA

/*
* La herencia en Java, es el procedimiento utilizado para reutilizar
* codigo cuando creamos nuevas clases.
*
* Pues lo unico que se hace, es indicar al programa que queremos 
* utilizar las varibles y funciones de una clase que ya hemos creado
* anteriormente.
* 
* Es decir podemos utilizar los metodos y atributos de una clase que
* ya existe, y colocarlos dentro de una nueva clase sin la necesidad
* de volver a escribir codigo
*
* La herencia o reutilizacion de codigo, es una gran ventaja porque
* ayuda al programador a ahorrar codigo y tiempo, al no tener que
* volve a escribir las mismas lineas de codigo nuevamente. 
*
* Cuando utilizamos la herencia, existen dos terminos muy peculiares
* para referirse a las clases 
*
* La clase padre o tambien conocida como la clase base
* La clase hija o tambien conocida como clase derivada
*/

// La clase padre o tambien conocida como la clase base

import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {
    //Indicarle al programa que vamos a trabajar con clases que estan en un 
    //paquete diferente
    
    public static void main(String[] args) {
        //Forzosamente hay que crear instancias y objetos
        
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();
        
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.print("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();
    }
}
