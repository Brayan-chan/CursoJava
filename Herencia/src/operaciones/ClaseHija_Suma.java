package operaciones;
// La clase hija o tambien conocida como clase derivada

/*
* Es la nueva clase, donde vamos a reutilizar los metodos y 
* atributos, que se crearon en la clase padre sin necesidad de volver
* a escribir el mismo codigo para poder utilizarlos.
*
* Es decir, con la herencia, la clase hija puede tomar las variables
* y funciones que tiene su clase padre y utilizarlas sin ningun 
* problema.
*/


//Indicar que vamos a heredar de una clase padre con extends
public class ClaseHija_Suma extends ClasePadre{
    
    //Crear un metodo para retornar un valor
    public void Sumar() {
        resultado = valor1 + valor2;
    }
}
