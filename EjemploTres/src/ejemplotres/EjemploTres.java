/*
* Creado por Brayan
* Version 1.0
* Creado el dia 29/11/23
*/
package ejemplotres;


public class EjemploTres {
    //PROGRAMACIÒN ESTRUCTURADA O PROCEDIMENTAL
    /*
    * Es un paradigma de programaciòn a mejorar
    * la claridad, calidad y tiempo de desarrollo
    * de un progrma de computadora.
    */
    
    //Utilizando unicamentes subrutinas y tres estructuras:
    /*
    * SECUENCIA
    * SELECCION (if y switch)
    * ITERACIÒN (bucles: for, while, do-while)
    */
    
    //PROGRAMACIÒN ORIENTADA A OBJETOS (POO)
    /*
    * La POO, es una manera de diseñar y desarrollar software
    * que trata de imitar la realidad tomando algunos conceptos
    * esenciales de ella.
    *
    * El primero de èstos es, el objeto, cuyos rasgos son la
    * identidad, el estado y el comportamiento.
    *
    *
    * La IDENTIDAD: Es el nombre que distingue a un objeto de otro
    * El ESTADO: Son las caracterìsticas que lo distingue
    * El COMPORTAMIENTO: Es lo que puede hacer el objeto
    */
    
    
    
    
    public static void main(String[] args) {
        System.out.println("EJEMPLO UTILIZANDO EL OBJETO PERRO");
        //SUPONGAMOS QUE TENEMOS DOS PERROS
        
        //Chester y Milo es su identidad o identificadores
        Perro Chester = new Perro("Chester", "Chow Chow", "Peludo de color negro", 5);  //(ESTADO DEL OBJETO)
        Perro Milo = new Perro("Milo", "Pastor Aleman", "Enorme y orejon", 3);  //(ESTADO DEL OBJETO)

        System.out.println("Buscando a Chester..");
        System.out.println("==============================================");
        System.out.println(Chester.toString());
        System.out.println("==============================================");
        System.out.println("Comportamiento de Chester");
        
        //Esto es su coportamiento        
        Chester.Jugar();
        Chester.Correr();
        
        
        System.out.println("\n==============================================");        
        System.out.println("Buscando a Milo..");
        System.out.println("==============================================");
        System.out.println(Milo.toString());
        System.out.println("==============================================");
        System.out.println("Compotamiento de Milo");
        
        //Esto es su coportamiento
        Milo.Comer();
        Milo.Ladrar();

        
    }
    
}
