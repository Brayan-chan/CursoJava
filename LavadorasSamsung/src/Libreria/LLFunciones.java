/*
* Clase para las funciones logicas de una lavadora
* Creado por Brayan
* Version 1.0
* Creado el dia 29/11/23
 */
package libreria;
//Una clase posee atributos y metodos.

/*
* Los atributos son las variables que contiene nustra clase.
* Mientras que los metodos son las funciones que va realizar nuestr clase
 */

 /*
* El ENCAPSULAMIENTO: Consiste en controlar el acceso a los datos, que
* conforman un objeto o instancia de una clase.
*
* Es decir...
*
* Indicar que metodos y atributos son publicos para poder revisar su
* contenido e incluso ser modificado.
*
* Y a su vez indicar que metodos y atributos son privados, para evitar el 
* acceso a su contenido o que se realice alguna modificacion en ellos.
*
* En conclusion, el encapsulamiento consiste en ocultar los atributos
* y metodos de una clase, para evitar que sean modificados desde otra 
* clase.
*
* Esto es con el fin de que cuando otro programador utilice nuestra clase,
* no pueda cambiar su estado o comportamiento de manera imprevista o
* incontrolada.
 */

 /*
* Para poder realizar la encapsulación, es necesasio utilizar los
* modificadores de acceso.
*
* Los modificadores de acceso permiten dar un nivel de seguridad mayor
* a nuestras aplicaciones restringiendo el acceso a diferentes atributos,
* metodos o constructores asegurandonos que el usuario deba seguir una 
* "ruta" especificada por nosotros para acceder a la informacion
 */
//EXISTEN 4 MODIFICADORES DE ACCESO
/*
* public		default
* 
* protected		private
 */
//EJERCICIO

/*
* Samsung solicita el desarrollo de una clase programada en Java, para el 
* funcionamiento lógico de su nueva línea de lavadoras, misma que puedan 
* implementar sus programadores de manera sencilla en los programas 
* desarrollados dentro de Samsung, con las siguientes características:
*
* 1. Debe recibir los kilos de ropa y tipo de ropa a través de argumentos.
*
* 2. Debe de realizar las funciones de llenado de agua, lavado y secado.
*
* 3. La clase debe estar correctamente encapsulada, para evitar que los 
* programadores de Samsung utilicen métodos o variables que no son 
* necesarios.
*
* 4. El único método disponible para importar, debe ser CicloFinalizado().
 */
public class LLFunciones {

    //ENCAPSULAR
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    public LLFunciones(int kilos, int TipoDeRopa) {
        this.kilos = kilos; // = kilos es un valor que estamos obteniendo desde otra clase
        this.TipoDeRopa = TipoDeRopa;
    }

    //CREAR METODOS encapsulados
    private void Llenado() {
        //Capacidad de 12 kilos para la lavadora
        if (getKilos() <= 12) {
            //llenadoCompleto cambia de estado a 1
            setLlenadoCompleto(1);
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }

    private void Lavado() {
        //Llamar al metodo llenado para saber si se lleno o no
        Llenado();
        //1 es completo
        if (getLlenadoCompleto() == 1) {
            //No esta anidado
            if (TipoDeRopa == 1) {
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                //Cambiar el estado a 1
                setLavadoCompleto(1);
            } else if (TipoDeRopa == 2) {
                System.out.println("Ropa de color/ Lavado intenso");
                System.out.println("Lavando...");
                setLavadoCompleto(1);
            } else {
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color / Lavado intenso");
                LavadoCompleto = 1;
            }
        } 
    }

    private void Secado() {
        //Llamar a lavado
        Lavado();
        if (getLavadoCompleto() == 1) {
            System.out.println("Secando...");
            setSecadoCompleto(1);
        }
    }

    //El unico metodo al que podran tener acceso
    public void CicloFinalizado() {
        Secado();
        if (getSecadoCompleto() == 1) {
            System.out.println("Tu ropa esta lista!");
        }
    }

    //getter y setter para tener acceso a encapsulamientos privados
    
    public int getTipoDeRopa() {
        return TipoDeRopa;
    }
    
    //El seter va permitir modificar el valor
    public void setTipoDeRopa(int TipoDeRopa) {
        this.TipoDeRopa = TipoDeRopa; 
    }
    
    //Pero y si  tuvieramos 50 o 100 variables que cambiar?
    
    
    
    
    
    //ENCAPSULAMIENTO EN JAVA

    /*
    * Sabemos que el encapsulamiento en java, sirve para ocultar metodos, 
    * atributos de una clase, lo cual resulta util, al momento de compartir
    * nuestras clases con otros programadores.
    *
    * Sin embargo en ocasiones es necesario o requerido al otorgar acceso a 
    * algunos atributos de nuestra clase, sin eliminar el encapsulamiento.
    *
    * PARA ESTAS SITUACIONES EXISTEN LOS METODOS GETTER Y SETTER
    *
    * Los setter y getters, son metodos que permiten el acceso a los atributos 
    * de una clase, que estan encapsulados de manera privada, con la finalidad,
    * de poder obtener establecer y obtener datos de los atributos 
    * encapsulados.
    *
    * El metodo set("ESTABLECER"): Nos sirve para asignar un valor a un 
    * atributo de nuestra clase, esto se hace de manera directa con este 
    * metodo, como este metodo no retorna nada, debe contener la palabra * void en su estructura, y siempre debe recibir un parametro de 
    * entrada.
    *
    * El metodo get("OBTENER"): accede a la clase para retornarnos el 
    * valor de algun atributo que queramos, este metodo si debe retornar
    * un valor por el cual la estructura de este metodo debe contener el 
    * tipo de valor que vamos a retornar con ese metodo.
     */

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    /**
     * @return the llenadoCompleto
     */
    public int getLlenadoCompleto() {
        return llenadoCompleto;
    }

    /**
     * @param llenadoCompleto the llenadoCompleto to set
     */
    public void setLlenadoCompleto(int llenadoCompleto) {
        this.llenadoCompleto = llenadoCompleto;
    }

    /**
     * @return the LavadoCompleto
     */
    public int getLavadoCompleto() {
        return LavadoCompleto;
    }

    /**
     * @param LavadoCompleto the LavadoCompleto to set
     */
    public void setLavadoCompleto(int LavadoCompleto) {
        this.LavadoCompleto = LavadoCompleto;
    }

    /**
     * @return the SecadoCompleto
     */
    public int getSecadoCompleto() {
        return SecadoCompleto;
    }

    /**
     * @param SecadoCompleto the SecadoCompleto to set
     */
    public void setSecadoCompleto(int SecadoCompleto) {
        this.SecadoCompleto = SecadoCompleto;
    }
}
