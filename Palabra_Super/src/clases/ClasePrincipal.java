package clases;
//LA PALABRA RESERVADA SUPER

/*
* La palabra reservada super se usa para acceder a un elemento en la
* clase padre.
*
* Uno de los usos mas frecuentes que le damos es poder invocar al 
* constructor de la clase padre.
*
* Con ello podemos reducir la cantidad de codigo que debemos escribir 
* en nuestras clases hijas.
*/

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        //Instanciar con que clase queremos comunicarnos
        //Crear un objeto
        Hija mensajero = new Hija();
        mensajero.Saludar();
    }
}
