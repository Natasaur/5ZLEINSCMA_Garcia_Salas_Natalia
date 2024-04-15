package Main;

/**
 *
 * @author jakeg
 */
import java.net.*;
import java.util.*;
import java.io.*;

public class Cliente {
    private static Scanner in;
    static PrintStream salida;
    static Socket cliente;
    //static int puerto = 7990; -> El sevidor es el que tiene el puerto, no el cliente
    
    public static void main(String[] args) throws Exception{
        //Realizar la conexion con el servidor
        while(true){
            try{
                cliente = new Socket("localhost",7990); //localhost = IP de la maquina a la que se quiere comunicar
                System.out.println("Servidor IP: " + cliente.getInetAddress().getHostAddress());
            }catch(Exception e){
                System.out.println("Error al conectar con el servidor");
                System.out.println(e.getMessage());
            }
            //Etapa de conexion
            try{
                salida = new PrintStream(cliente.getOutputStream());
                salida.println("Vamos a reprobar a todos");
            }catch(Exception e){
                System.out.println("Error al enviar los datos");
                System.out.println(e.getMessage());
            }
            try{
                in = new Scanner(cliente.getInputStream());
                String entrada = in.nextLine();
                System.out.println("Enviado al servidor");
            }catch(Exception e){
                System.out.println("Error al respoder " + e.getMessage());
                return;
            }
        }
    }
}
