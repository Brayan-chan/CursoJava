package paquete1;

public class ClaseJavaUno {
    public static void main(String[] args) {
        
        //Especificar la clase con lo que nos queremos comunicar
        Atributos_Metodos mensajero = new Atributos_Metodos();
        mensajero.getValorUno();
        mensajero.setValorUno(56);
        System.out.println(mensajero.getValorUno());
    }
    
}
