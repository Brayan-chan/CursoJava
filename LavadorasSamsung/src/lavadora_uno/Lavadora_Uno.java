/*
* Creado por Brayan
* Version 1.0
* Creado el dia 29/11/23
*/
package lavadora_uno;
//importar el proyecto o libreria
import libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - Ropa blanca\nPresiona 2 - Ropa Color");
        int TipoDeRopa = input.nextInt();
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = input.nextInt();
        
        //Hacer la instancia de clases
        LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa);
        mensajero.CicloFinalizado();
        
    }
}
