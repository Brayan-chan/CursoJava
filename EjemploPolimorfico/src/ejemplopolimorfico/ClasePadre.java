package ejemplopolimorfico;
import java.util.Scanner;

public abstract class ClasePadre {
    Scanner input = new Scanner(System.in);
    
    protected int valor1, valor2, resultado;
    
    public void PedirDatos() {
        System.out.print("Dame el primer valor: ");
        valor1 = input.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = input.nextInt();
    }
    
    public abstract void HacerOperaciones();
    
    public void MostarResultado() {
        System.out.println(resultado);
    }
    
}
