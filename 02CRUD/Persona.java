/*
 * Vamos a crear una aplicacion para poder tener una plantilla de registro
 */
package 02CRUD;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
}

//constructor
/*inicializa las variables
 * define la instancia del objeto
 * tipos de constructor n
 * sobrecarga, crear tantos constructores como sean, nombrar de la misma forma a u objeto pero con diferentes párametros
 */
public Persona(int id, String nombre, int edad){
    //this hace referencia al propio objeto
    this.id = id;
    this.nombre = nombre;
    this.edad = edad;
}

public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}

public int getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}

public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad = edad;
}

//funcion retorna un resultado, el método puede o no dar un resultado

/*
 * privado = solo se puede acceder desde la misma clase
 * modificadores privados = private(), private static(no va a ser alterado, solo a traves de get y set), private static final(no puede ser modificado)
 * protegido puede ser heredado, privado no
 * 
 */