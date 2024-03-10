package Modelo;

/**
 *
 * @author jakeg
 */
public class Alumno {
    private int idAlumno, edad_alu;
    private String nom_alu, appat_alu, apmat_alu;
    
    public void Alumno(){
    }
    
    public void Alumno(int idAlumno, String nom_alu, String appat_alu, String apmat_alu,int edad_alu){
        this.idAlumno = idAlumno;
        this.nom_alu = nom_alu;
        this.appat_alu = appat_alu;
        this.apmat_alu = apmat_alu;
        this.edad_alu = edad_alu;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getEdad_alu() {
        return edad_alu;
    }

    public void setEdad_alu(int edad_alu) {
        this.edad_alu = edad_alu;
    }

    public String getNom_alu() {
        return nom_alu;
    }

    public void setNom_alu(String nom_alu) {
        this.nom_alu = nom_alu;
    }

    public String getAppat_alu() {
        return appat_alu;
    }

    public void setAppat_alu(String appat_alu) {
        this.appat_alu = appat_alu;
    }

    public String getApmat_alu() {
        return apmat_alu;
    }

    public void setApmat_alu(String apmat_alu) {
        this.apmat_alu = apmat_alu;
    }   
}