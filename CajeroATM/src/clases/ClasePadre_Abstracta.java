package clases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    Scanner input = new Scanner(System.in);

    //Protected para eredar
    protected int transacciones, retiro, deposito;

    //Encapsular con private, ya que no queremos compartir esto
    private static int saldo;

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        //do = haz
        do {
            do {
                System.out.println("Por favor seleccione una opcion: ");
                System.out.println("    1. CONSULTAR SALDO");
                System.out.println("    2. RETIRAR EFECTIVO");
                System.out.println("    3. DEPOSITAR");
                System.out.println("    4. SALIR");
                seleccion = input.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("==========================================");
                    System.out.println("Opcion no disponible, vuelva intentarlo");
                    System.out.println("==========================================");
                }
                //while = mientras
            } while (bandera == 0);
            
            if(seleccion == 1) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
                
            } else if(seleccion == 2) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
                
            } else if(seleccion == 3) {
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
                
            } else if(seleccion == 4) {
                System.out.println("========================");
                System.out.println("Gracias!, vuelva pronto");
                System.out.println("========================");
                bandera = 2;
            }
        } while (bandera != 2);

    }
    
    public void Retiro() {
        retiro = input.nextInt();
    }
    
    public void Deposito() {
        deposito = input.nextInt();
    }
    
    //Metodo abstracto polimorfismo
    public abstract void Transacciones();
    
    //GETTER Y SETTER
    //Consultar y modificar
    public int getSaldo() {
        return saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
