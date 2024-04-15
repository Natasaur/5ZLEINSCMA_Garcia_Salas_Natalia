package Main;

/**
 *
 * @author jakeg
 */
import java.net.*;
import java.util.*;
import java.io.*;

public class Servidor {
    private static Scanner in;
    static PrintStream salida;
    static Socket cliente;
    static ServerSocket servidor;
    static int puerto = 7990;
    
    public static void main(String[] args) throws Exception{
        //Se realiza un bucle para comunicarnos con el socket
        
        try{
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor inicializado en el puerto " + puerto);
            System.out.println("Esperando comunicación...");
        }catch(Exception e){
            System.out.println("Error al inicializar");
            System.out.println(e.getMessage());
            return;
        }
        while(true){
            //Mantiene una comunicación con el sevidor
            //Se debe aceptar al cliente
            cliente = servidor.accept();
            System.out.println("Cliente IP: " + cliente.getInetAddress().getHostAddress());
            in = new Scanner(cliente.getInputStream());
            String entradaString;
            entradaString = in.nextLine();
            while(entradaString != null){
                System.out.println("Mensaje recibido " + cliente.getInetAddress().getHostAddress() + " : " + entradaString);
            }
            salida = new PrintStream(cliente.getOutputStream());
            salida.println("Servidor conectado nuevamente");
            
            //Cierro conexiones
            cliente.close();
            servidor.close();
        }
    }
    
}
