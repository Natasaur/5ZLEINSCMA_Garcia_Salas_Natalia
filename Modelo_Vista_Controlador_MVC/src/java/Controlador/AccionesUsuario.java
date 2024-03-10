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
    public boolean validarUsuario(String username,String pass){
        boolean valid = false;
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try{
            Connection con = Conexion.getConnection();
            
            //Primero creamos una lista con todos los usuarios que tienen acceso
            
            String q = "select * from usuario";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery(q);
            
            while(rs.next()){
                Usuario user = new Usuario();
                user.setUser(rs.getString(1));
                user.setPassword(rs.getString(2));
                
                usuarios.add(user);
            }
            
            
            
        }catch(Exception e){
            
            
        }
    }
}
