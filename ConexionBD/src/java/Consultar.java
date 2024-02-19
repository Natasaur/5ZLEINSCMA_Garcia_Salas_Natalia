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
public class Consultar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private Connection con;
    //com es para establecer el objeto de conexción
    private Statement set;
    //El objeto statement es para poder definir las sentencias sql
    //Crear una tabla, registrar un dato
    private ResultSet rs;
    //Este objeto es exclusivo de consultas
    
    public void init(ServletConfig scg) throws ServletException{ //ServletException porque no maneja una Exception normal
        //sirve para configurar el servicio
        //En este caso el servicio de la base de datos
        String url = "jdbc:mysql:3306//localhost/registroalumnos"; //java data base controller
                    //controlador:motorbd:puerto//IP/nombrebd
        String username = "Natasaur";
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
            System.out.println("no se conecto");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Consultar</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listado de alumnos registrados</h1>"
                    + "<br>"
                    + "<table border='2'>"
                    + "<tr>"
                    + "<th>Boleta</th>"
            );
            try{
                int id,edad;
                String nombre,appat,apmat;
                
                String q = "select * from alumno";
                
                set = con.createStatement();
                rs = set.executeQuery(q);
                
                while(rs.next()){
                    //Obtener cada dato
                    id = rs.getInt("idAlumno");
                    nombre = rs.getString("nom_alu");
                    appat = rs.getString("appat_alu");
                    apmat = rs.getString("apmat_alu");
                    edad = rs.getInt("edad");
                    
                    out.println("<tr>"
                            + "<td>"+id+"<td/>"
                            + "<td>"+nombre+" "+appat+" "+apmat+" "+edad+"<td/>"
                            +"</tr>");
                }
                rs.close();
                set.close();
            }catch(Exception e){
                
            }
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
