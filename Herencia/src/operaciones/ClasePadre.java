package operaciones;
// La clase padre o tambien conocida como la clase base

/*
* Es la que se debe de crear primero, donde se encuentra escrito el
* codigo que contiene a las variables y metodos que se van a 
* reutilizar.
* 
* Es decir, en esta clase declaramos las variables y creamos los 
* metodos con las cuales va a funcionar parte de nuestro programa.
*/

import java.util.Scanner;

public class ClasePadre {
    //Crear los atributos o varibales de manera protegida
    protected int valor1, valor2, resultado;
    Scanner input = new Scanner(System.in);
    
    //Crear un metodo que podamos heredar en otras clases con public
    public void PedirDatos() {
        System.out.print("Dame el primer valor: ");
        valor1 = input.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = input.nextInt();
    }
    
    //Este metodo muestra el resultado
    public void MostrarResultado() {
        System.out.print(resultado + "\n");
    }
    
}
