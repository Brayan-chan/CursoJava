package ejemplopolimorfico;

public class Resta_ClaseHija extends ClasePadre{
    @Override
    public void HacerOperaciones() {
        resultado = valor1 - valor2;
    }
}
