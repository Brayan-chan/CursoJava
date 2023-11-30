package polimorfismo;


public class ClasePrincipal {
    public static void main(String[] args) {
        
        //No se hace referencia a una nueva clase padre sino a la clase que se le
        //aplicara polimorfismo en este caso Suma_ClaseHija
        
        Operaciones_ClasePadre mensajeroSuma = new Suma_ClaseHija();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Operaciones();
        mensajeroSuma.MostrarResultado();
        
        Operaciones_ClasePadre mensajeroResta = new Resta_ClaseHija();
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        mensajeroResta.MostrarResultado();
    }
    
}
