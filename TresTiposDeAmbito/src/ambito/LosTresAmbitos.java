package ambito;
/*
* El ambito de una variable define su alcance de uso, es decir indica
* en que secciones de codigo una variable estara disponible.
*
* Fuera de este ambito, una variable no podria ser accedida.
*
* En Java tenemos 3 tipos de ambito que pueden aplicar a una variable
* 
* Local
* Global
* Estatico
*/

public class LosTresAmbitos {
    
    static int variableEstatica;
    
    //La variable global no se inicializa
    int variableGlobal;
    
    
    /* 
    * Todas las variables sin importar su ambito deben de ser declaradas entre
    * las llavaes de apertura y cierre de nuestra clase 
    */
    
    void miMetodo(int parametro) {
        //La variable local si se inicializa a fuerzas
        int variableLocal = 52;
        
        //El parametro tambien es Local dentro del metodo
    }
    
    //VARIABLES DE AMBITO LOCAL
    /*
    * Las variables de ambito local, o tambien conocidas como variables de 
    * bloque, son aquellas que solo pueden ser accedidas desde el bloque de 
    * codigo en el que han sido declaradas.
    */
    
    //VARIABLES DE AMBITO GLOBAL
    
    /*
    * Las variables de ambito global, o de instancia, son aquellas que 
    * pertenecen a la clase donde han sido declaradas, y dependiendo del 
    * modificador de acceso utilizado, podran ser accedidas unicamente desde
    * la misma clase.
    */
    
    
    //VARIABLE ESTATICAS
    
    /*
    * Las variables estaticas, o tambien conocidas como variables de clase
    * son aquellas que pertenecen a la propia clase donde han sido declaradas,
    * y para poder acceder a ellas no es necesario crear una instancia de clases.
    */
}
