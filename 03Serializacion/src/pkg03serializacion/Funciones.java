/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03serializacion;

import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author jakeg
 */
public class Funciones {
    ArrayList<Persona> listapersonas = new ArrayList(); //Es n dimendional, lo que lo diferencia de un vector que solo es lineal
    String rep = "si";
    String nombre = "";
    int edad, num_empleado, bol;
    
    //Aplicando Polimorfismo
    //Persona trabajador = new Trabajador();
    Persona alumno = new Alumno();
    
    //Menú
    void menu(){
        //Los bucles infinitos no son buenos porque se desperdician recursos
        while(rep.equalsIgnoreCase("si")){ 
        //EqualsIgnoreCase hace que no importe si se utilizan mayúscukas o minúsculas
            try{
                String var = JOptionPane.showInputDialog("Ingresa la opción deseada: \n"
                + "1. Registrar Alumno\n"
                + "2. Consultar Alumno\n"
                + "3. Salir\ns");
                if(var == null){
                    System.exit(0);
                }
                int opcion = Integer.parseInt(var);
                switch (opcion){
                    case 1:
                        //Método para pedir datos
                        //Ingresar
                        //Registrar es en el momento, son datos nuevos
                        //Guardar es cuando los datos ya existen
                        //Buscar 
                        //Imprimir
                        //Firmar
                        pedirDatosAlumno(); //Paradigma Interpretado
                        alumno = new Alumno(bol,nombre,edad);
                        guardarAlumno();
                        
                        break;
                    default:
                        System.out.println("Opción no válida");
                        rep = JOptionPane.showInputDialog("¿Desea repetir?");
                        break;
                }
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            
        }
    }
    private void pedirDatosAlumno(){
    bol = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta: "));
    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
    nombre = JOptionPane.showInputDialog("Ingresa el nombre: ");
    //Son los datos del objeto creado en la línea 49
    }
    
    private void guardarAlumno(){
        listapersonas.add(alumno);
    }
    
}


