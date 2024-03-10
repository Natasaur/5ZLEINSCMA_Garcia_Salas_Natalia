package Controlador;

/**
 *
 * @author jakeg
 */

import java.sql.*;
import Modelo.Alumno;
import java.util.ArrayList;
import java.util.List;

public class AccionesAlumno {
    //Registro
    public static int registrarAlumno(Alumno alu){
        int status = 0;
        try{
            //Se establece la conexion
            Connection con = Conexion.getConnection();
            String q = "insert into alumno(nom_alu,appat_alu,apmat_alu,edad_alu) values (?,?,?,?)";
            //Hay que preparar la sentencia
            PreparedStatement ps = con.prepareStatement(q);
            
            //Obtener cada uno de los elementos del objeto
            ps.setString(1,alu.getNom_alu());
            ps.setString(2,alu.getAppat_alu());
            ps.setString(3,alu.getApmat_alu());
            ps.setInt(4,alu.getEdad_alu());
            
            //Con la sentencia ya preparada, se ejecuta
            status = ps.executeUpdate();
            System.out.println("Alumno registrado con éxito");
            con.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se pudo registrar al alumno");   
        }
        return status;
    }
    
    //Visualizar a todos los alumnos
    public static List<Alumno> getAllAlumnos(){
        //Genero el objeto lista a partir de una ArrayList
        List<Alumno> lista = new ArrayList<Alumno>();
        try{
            Connection con = Conexion.getConnection();
            String q = "select * from alumno";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery(q);
            
            while(rs.next()){
               Alumno alu = new Alumno();
               alu.setIdAlumno(rs.getInt(1));
               alu.setNom_alu(rs.getString(2));
               alu.setAppat_alu(rs.getString(3));
               alu.setApmat_alu(rs.getString(4));
               alu.setEdad_alu(rs.getInt(5));
               
               lista.add(alu);
            }
            System.out.println("Se hizo la consulta del alumno");
            con.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se encontró la tabla");
        }
        return lista;
    }
    
    //buscar alumno por id
    public static Alumno buscarAlumnoById(int id){
        //necesito crear una instancia del alumno
        Alumno alu = new Alumno();
        try{
            Connection con = Conexion.getConnection();
            String q = "select * from alumno where idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            //tengo que buscar dentro de la tabla
            if(rs.next()){
                //get y set
                alu.setIdAlumno(rs.getInt(1));
                alu.setNom_alu(rs.getString(2));
                alu.setAppat_alu(rs.getString(3));
                alu.setApmat_alu(rs.getString(4));
                alu.setEdad_alu(rs.getInt(5));
            }
            System.out.println("Se encontro al alumno");
            con.close();
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
            System.out.println("No se encontro el alumno");
        }
        return alu;
    }
    
    public static int ActualizarAlumno(Alumno alu){
        int estatus = 0;
        
        try{
            Connection con = Conexion.getConnection();
            String q = "update alumno set nom_alu = ?, appat_alu = ?, apmat_alu = ?, edad_alu = ? "
                    + "where idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, alu.getNom_alu());
            ps.setString(2, alu.getAppat_alu());
            ps.setString(3, alu.getApmat_alu());
            ps.setInt(4, alu.getEdad_alu());
            ps.setInt(5, alu.getIdAlumno());
            
            estatus = ps.executeUpdate();
            System.out.println("Se actualizo el alumno");
            con.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se pudo actualizar el alumno");
        }
        return estatus;
    }
    
    public static int eliminarAlumno(int id){
        int estatus = 0;
        
        try{
            Connection con = Conexion.getConnection();
            String q = "delete from alumno where idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setInt(1, id);
            estatus = ps.executeUpdate();
            System.out.println("Se elimino al alumno de la lista");
            con.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("No se elimino al alumno");
        
        }
        return estatus;
    }    
}
