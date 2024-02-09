/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jakeg
 */
import java.util.*;

public class Tabla {
    private String puntosAMedir[];
    private ArrayList<Lista> valores = new ArrayList();
    //private Lista valores[];
    private String colores[];
    
    public void Tabla(){
    }
    
    //public void Tabla(String puntosAMedir[],double valores[],String colores[]){
    public void Tabla(String puntosAMedir[],ArrayList valores,String colores[]){
        this.puntosAMedir = puntosAMedir;
        this.valores = valores;
        this.colores = colores;
    }

    public String[] getPuntosAMedir() {
        return puntosAMedir;
    }

    public void setPuntosAMedir(String[] puntosAMedir) {
        this.puntosAMedir = puntosAMedir;
    }

    public ArrayList<Lista> getValores() {
        return valores;
    }

    public void setValores(ArrayList valores) {
        this.valores = valores;
    }

    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

}
