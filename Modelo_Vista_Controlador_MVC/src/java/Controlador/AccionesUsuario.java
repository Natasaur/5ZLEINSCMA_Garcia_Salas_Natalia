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
    public static boolean validar(String username,String pass){
        boolean valid = false;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        Usuario user = new Usuario();
        try{
            Connection con = Conexion.getConnection();
            
            //Busca si el usuario ingresado coincide con alguno en la base de datos
            
            String q = "select * from usuario where correo = ?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery(q);
            
            //Se validan las credenciales ingresadas
            if(rs.next()){
                user.setUser(rs.getString(1));
                user.setPassword(rs.getString(2));
            }
            if(user.getUser()==username && user.getPassword()==pass){
                valid = true;
            }else{
                valid = false;
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            System.out.println("El usuario y/o contraseña son incorrectos");
        }
        return valid;
    }
}
