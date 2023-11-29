/*
* Creado por Brayan
* Version 1.0
* Creado el dia 29/11/23
*/
package suma;

import java.util.Scanner;

public class SumaMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dame el primer valor: ");
        int valorUno = input.nextInt();
        System.out.println("Dame el segundo valor: ");
        int valorDos = input.nextInt();
        
        //Indicar que queremos enviar estas variables a la clase suma
        
        //Crear un objeto
        //A esto se le conoce como enviar datos a traves de argumentos
        Suma valores = new Suma(valorUno, valorDos);
        
        valores.Imprimir();
    }
    
}
