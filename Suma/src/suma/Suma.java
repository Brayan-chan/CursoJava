/*
* Creado por Brayan
* Version 1.0
* Creado el dia 29/11/23
*/
package suma;

public class Suma {
    /*Modificador privado por que solo quiero que se utilicen dentro de la clase
    * suma
    */
    
    private int vUno, vDos, Resultado;
    
    //Crear los espacios en memoria
    public Suma(int valorUno, int valorDos) {
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    
    //void = retornar un valor
    //public = que se puede cominicar con cualquier clase o metodo
    public void Operacion() {
        Resultado = vUno + vDos;
    }
    
    public void Imprimir() {
        //Se manda a llamar el metodo que se puede comunicar con el metodo
        Operacion();
        System.out.println("El resultado de la suma es: " + Resultado);
    }
}
