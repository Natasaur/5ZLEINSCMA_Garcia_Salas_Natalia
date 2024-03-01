/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jakeg
 */
public class Actualizar extends HttpServlet {

    private Connection con;
    private Statement set;
    private ResultSet rs;
        
    public void init(ServletConfig scg) throws ServletException{ //ServletException porque no maneja una Exception normal
        //sirve para configurar el servicio
        //En este caso el servicio de la base de datos
        String url = "jdbc:mysql:3306//localhost/registroalumnos"; //java data base controller
                    //controlador:motorbd:puerto//IP/nombrebd
        String username = "root";
        String password = "Pikachu_2231";
        
        try{
            //Vamos a intentar conectarnos a la base de datos
            url = "jdbc:mysql://localhost/registroalumnos"; //java data base controller
            Class.forName("com.mysql.jdbc.Driver");
            //Se debe obtener el objeto de coneccion
            con = DriverManager.getConnection(url,username,password);
            set = con.createStatement();
            
            System.out.println("Conexion exitosa!");
        }catch(Exception e){
            System.out.println("No se conecto a la Base de Datos");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String nom,appat,apmat;
            int edad;
            int bol;
            
            bol = Integer.parseInt(request.getParameter("bol"));
            nom = request.getParameter("nombre");
            appat = request.getParameter("appat");
            apmat = request.getParameter("apmat");
            edad = Integer.parseInt(request.getParameter("edad"));
                     
            try{
                //Se debe preparar la sentencia
                //Cambiar para actualizar
                /*String q = "insert into alumno(nom_alu,appat_alu,apmat_alu,edad_alu)"
                        +"values ('"+nom+"',"
                        +"'"+appat+"','"+apmat+"',"+edad+")";*/
                String q = "UPDATE alumno SET nom_alu = '"+nom+"' ,"
                        + " appat_alu = '"+appat+"' , apmat_alu = '"+apmat+"' ,"
                        + " edad_alu = "+edad+" WHERE idAlumno = "+bol+"";
                
                set.executeUpdate(q);
                System.out.println("Registro actualizado con éxito");
                out.println("<h1>Alumno actualizado con éxito</h1>");
                out.println("<a href='index.html'>Regresar al Menú Principal</a>");
            }catch(Exception e){
                System.out.println("No se pudo actualizar");
                out.println("<h1>El alumno no se pudo registrar</h1>");
                out.println("<a href='index.html'>Regresar al Menú Principal</a>");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Actualizar</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<a href='index.html'>Regresar al Menú Principal</a>");
            out.println("</body>");
            out.println("</html>");
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
