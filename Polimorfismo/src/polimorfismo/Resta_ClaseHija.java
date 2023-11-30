
package polimorfismo;

public class Resta_ClaseHija extends Operaciones_ClasePadre{
    
    //@Override para indicar que vamos a sobreescribir un metodo
    
    @Override
    public void Operaciones() {
        resultado = valor1 - valor2;
    }
    
}
