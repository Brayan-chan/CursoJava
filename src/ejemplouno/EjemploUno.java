package ejemplouno;

import java.util.Scanner;


public class EjemploUno {

    public static void main(String[] args) {
        //Inversor de palabras//
        
        //PRINCIPIO BASICO DE PROGRAMACION
        //Analizo, resuelvo y despues programo
        
        //VARIABLE = UN ESPACIO EN MEMORIA
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("==============================================");
        System.out.print("Escribe una palabra o frase: ");
        //Ctrl + ESPACIO
        palabra = input.nextLine();
        //Indicar que cuente la longitud de la palabra
        longitudPalabra = palabra.length();
        //decrementar con while
        while (longitudPalabra != 0) {
            //MIENTRAS != DIFERENTE DE CERO
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            // += VARIABLE DE ACUMULACION O DE GUARDAR
            
            //EN WHILE SIEMPRE HAY QUE INDICAR LA VARIABLE DE DECREMENTO
            longitudPalabra--;
        }
        
        System.out.print("Palabra Original: " + palabra);
        System.out.print("\nPalabra invertida: " + palabraInvertida);
        System.out.println("");
        System.out.println("==============================================");

    }
    
}
