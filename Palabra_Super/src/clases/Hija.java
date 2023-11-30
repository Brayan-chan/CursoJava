
package clases;

public class Hija extends Padre{
    public void Saludar() {
        //System.out.println("!Hola yo soy la hija");
        super.Saludar();
        
        /*
        * El uso de la palabra super nos va permitir acceder a los 
        * metodos y atributos de ua clase padre sin importar que el
        * metodo tenga el mismo nombre que un metodo de su clase hija
        */
    }
}
