package pkg03serializacion;
//import pkg03serializacion.Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakeg
 */
public class Alumno extends Persona {
    private int boleta;
    
    //-----------Inicialización del objeto-----------//
    public Alumno(){    
    }
    
    //-----------Método para definir a un alumno------------//
    public Alumno(int boleta){
        this.boleta = boleta;
    }
    
    //-----------Herencia de la clase Persona con super-----------//
    public Alumno(int boleta, String nombre, int edad){
        super(nombre, edad);
        this.boleta = boleta;
    }
    
    //---------------Getters & Setters-----------------//
    public int getBoleta(){
        return boleta;
    }
    public void setBoleta(int boleta){
        this.boleta = boleta;
    }
    
    @Override 
    /*Sobrecarga
    Se aplica cuando tenemos varios métodos con el mismo nombre, pero diferentes parámetros
    */
    String tipoPersona(){
        return ("Alumno");
    }
}
