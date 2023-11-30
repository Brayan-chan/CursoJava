package ambito;

public class VariableLocal {
    void miMetodoLocal(int parametro) {
        int variableLocal = 52;
        
        System.out.println("El valor de variableLocal es: " + variableLocal);
        System.out.println("El valor de parametro es: " + parametro);
    }
    
    public void Prueba() {
        //Solo se pueden utilizar en el metodo en el que fueron declarados
        
        //System.out.println("El valor de variableLocal es: " + variableLocal);
    }
}
