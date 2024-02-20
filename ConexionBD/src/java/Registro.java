/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import javax.servlet.ServletConfig;

/**
 *
 * @author jakeg
 */
public class Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //Servlet = Código en java que da una salida en html
    /**
     * Vamos a conectar a una base de datos 
    */
    
    private Connection con;
    //com es para establecer el objeto de conexción
    private Statement set;
    //El objeto statement es para poder definir las sentencias sql
    //Crear una tabla, registrar un dato
    private ResultSet rs;
    //Este objeto es exclusivo de consultas
    
    //Se crea un tipo de constructor
    public void init(ServletConfig scg) throws ServletException{ //ServletException porque no maneja una Exception normal
        //sirve para configurar el servicio
        //En este caso el servicio de la base de datos
        String url = "jdbc:mysql:3306//localhost/registroalumnos"; //java data base controller
                    //controlador:motorbd:puerto//IP/nombrebd
        String userName = "root";
        String password = "Pikachu_2231";
        
        try{
            //Vamos a intentar conectarnos a la base de datos
            url = "jdbc:mysql://localhost/registroalumnos"; //java data base controller
            Class.forName("com.mysql.jdbc.Driver");
            //Se debe obtener el objeto de coneccion
            con = DriverManager.getConnection(url,userName,password);
            set = con.createStatement();
            
            System.out.println("Conexion exitosa!");
        }catch(Exception e){
            System.out.println("No se conecto a la Base de Datos");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    
    //Request = Petición, cuando se solicita información
    //Response = 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            //Obtener los pa´rametros del formulario
            String nom,appat,apmat,ip,ipr;
            int edad,puerto,puertor;
            
            nom = request.getParameter("nombre");
            appat = request.getParameter("appat");
            apmat = request.getParameter("apmat");
            edad = Integer.parseInt(request.getParameter("edad"));
            
            ip = request.getLocalAddr();
            puerto = request.getLocalPort();
            
            ipr = request.getRemoteAddr();
            puertor = request.getRemotePort();
            
            System.out.println(nom);
            System.out.println(appat);
            System.out.println(apmat);
            System.out.println(edad);
            
            //Para conectar a la base de datos
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<a href='index.html'>Regresar al menu principal</a>");
            out.println("</body>");
            out.println("</html>");
            
            try{
                String q = "insert into alumno(nom_alu,appat_alu,apmat_alu,edad_alu)"
                        +"values ('"+nom+"',"
                        +"'"+appat+"','"+apmat+"',"+edad+")";
                
                //Se debe preparar la sentencia
                set.executeUpdate(q);
                System.out.println("Registro exitoso");
                out.println("<h1>Alumno registrado con exito</h1>");
            }catch(Exception e){
                System.out.println("Registro NO exitoso");
                out.println("<h1>El alumno no se pudo registrar</h1>");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
