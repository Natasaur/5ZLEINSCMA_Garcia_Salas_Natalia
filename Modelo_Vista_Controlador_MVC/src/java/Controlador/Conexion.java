package Controlador;

/**
 *
 * @author jakeg
 */

import java.sql.*;


public class Conexion {
    public static Connection getConnection(){
        String url,user,pass;
        url = "jdbc:mysql://localhost/registroalumnos";
        user = "root";
        pass = "Pikachu_2231";
        
        //Se establece el objeto de conexion
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexión exitosa a la Base de Datos");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("");       
        }
        return con;
    }
}
