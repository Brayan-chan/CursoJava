/*
* Creado por Brayan
* Version 1.0
* Creado el dia 29/11/23
*/
package area;

import java.util.Scanner;


public class RectanguloMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dame el valor de la base: ");
        int base = input.nextInt();
        
        System.out.print("Dame el valor de la altura: ");
        int altura =input.nextInt();
        
        //Crear una instancia de clases
        
        //Una INSTANCIAS DE CLASES = Es hacer que dos clases se comuniquen entre si
        
        Rectangulo mensajero = new Rectangulo(base, altura);
        
        mensajero.imprimir();
    }
}
