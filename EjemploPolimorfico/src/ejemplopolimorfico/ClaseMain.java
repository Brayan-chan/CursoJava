package ejemplopolimorfico;

public class ClaseMain {
    public static void main(String[] args) {
        
        ClasePadre mensajeroSuma = new Suma_ClaseHija();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.HacerOperaciones();
        mensajeroSuma.MostarResultado();
        
        ClasePadre mensajeroResta = new Resta_ClaseHija();
        mensajeroResta.PedirDatos();
        mensajeroResta.HacerOperaciones();
        mensajeroResta.MostarResultado();
    }
}
