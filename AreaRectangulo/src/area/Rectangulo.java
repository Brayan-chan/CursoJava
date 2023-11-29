/*
* Creado por Brayan
* Version 1.0
* Creado el dia 29/11/23
*/
package area;

/**
 *
 * @author chanp
 */
public class Rectangulo {
    private int base, altura, area;
    
    public Rectangulo(int base, int altura) {
        //Hacer referencia a las variables de esta clase
        this.base = base;
        this.altura = altura;
    }
    
    public void CalculoArea() {
        area = base * altura;
    }
    
    public void imprimir() {
        CalculoArea();
        System.out.println("El area es: " + area);
    }
}
