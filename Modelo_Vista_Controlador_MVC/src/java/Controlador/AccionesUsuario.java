package Controlador;

/**
 *
 * @author jakeg
 */

import java.sql.Connection;
import Controlador.Conexion;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class AccionesUsuario {
    public static boolean validar(Usuario current_user){
        boolean valid = false;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario user = new Usuario();
        try{
            Connection con = Conexion.getConnection();
            
            //Busca si el usuario ingresado coincide con alguno en la base de datos
                        
            String q = "select * from usuario where correo = ?";
            PreparedStatement ps = con.prepareStatement(q);
            System.out.println(current_user.getUser());
            System.out.println(current_user.getPassword());
            ps.setString(1,current_user.getUser());
            //ps.setString(2,current_user.getPassword());
            
            ResultSet rs = ps.executeQuery();
            
            //valid = rs.next();
            //Se validan las credenciales ingresadas
            if(rs.next()){ //Si existe el usuario, crea otro usuario con las credendiales de la bd
                user.setUser(rs.getString(1));
                user.setPassword(rs.getString(2));
            }
            
            System.out.println();
            
            if(user.getPassword().equals(current_user.getPassword())){ //Valida que el usuario creado en el bloque anterior, tiene las mismas credenciales que se ingresaron en la página
                valid = true;
                System.out.println("True");
            }else{
                valid = false;
                System.out.println("False");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("El usuario y/o contraseña son incorrectos");
        }
        return valid;
    }
}
