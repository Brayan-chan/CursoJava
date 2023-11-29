/*
* Creado por Brayan
* Version 1.0
* Creado el dia 29/11/23
*/
package ejemplotres;

public class Perro {
    String nombre, raza, rasgos;
    int edad;

    public Perro(String nombre, String raza, String rasgos, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.rasgos = rasgos;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRasgos() {
        return rasgos;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Ladrar() {
        System.out.println("El perro ladra");
        System.out.println("GUAU GUAU...\n");
    }
    
    public void Correr() {
        System.out.println("El perro corre\n");
    }
    
    public void Jugar() {
        System.out.println("El perro juega a la pelota\n");
    }
    
    public void Comer() {
        System.out.println("El perro esta comiendo\n");
    }
    
    public void Dormir() {
        System.out.println("El perro esta durmiendo\n");
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + "\nraza:" + raza + "\nrasgos:" + rasgos + "\nedad:" + edad;
    }
    
    
    
}
