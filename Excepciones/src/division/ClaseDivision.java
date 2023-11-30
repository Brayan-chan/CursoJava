package division;

import java.util.Scanner;

public class ClaseDivision {

    public static void main(String[] args) {

        try {
            //Todo el codigo que queremos que se ejecute
            int valor1, valor2, resultado;

            Scanner input = new Scanner(System.in);

            System.out.print("Dame el primer valor: ");
            valor1 = input.nextInt();

            System.out.print("Dame el segundo valor: ");
            valor2 = input.nextInt();

            resultado = valor1 / valor2;

            System.out.println("Division es igual a: " + resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir entre 0" + e.getMessage());
        } finally {
            //finally siempre se ejecuta
            System.out.println("Division concluida!");
        }

    }

}
