package polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre {
    
    //sobreescribir un metodo con @override
    //Implementar su logica en una clase diferente
    @Override
    public void Operaciones() {
        resultado = valor1 + valor2;
    }
}
