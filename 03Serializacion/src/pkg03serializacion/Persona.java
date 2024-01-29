package pkg03serializacion;

import java.io.*; //io | Input | Output | Entrada y salida de datos
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author jakeg
 */

/*
La serializacipon es el proceso mediante el cual el programa puede traducir a 
un archivo los objetos que se le marquen para su almacenamiento
La serialización puede ocurrir ya sea por objetos, principalmente en el buffer
mediante el cual se envia o se extre información*/

/*Buffer es el medio mediante el cual se transmiten los datos*/
public abstract class Persona implements Serializable { //Tiene el abstract por la declaración de más abajo
    private String nombre;
    private int edad;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //---------------Getters & Setters-----------------//
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /*
    Abstracto
    Algo que podemos imaginar, porque el concepto ya exist   
    */
    
    abstract String tipoPersona(); //La clase ya no es normal, es una clase abstracta
    //se agrega el abstract en la clase principal
    
    
}
