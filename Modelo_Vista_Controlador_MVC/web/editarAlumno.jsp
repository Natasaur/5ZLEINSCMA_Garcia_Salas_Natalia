<%-- 
    Document   : editaralumno
    Created on : 8 mar 2024, 09:45:33
    Author     : jakeg
--%>

<%@page import="Modelo.Alumno"%>
<%@page import="Controlador.AccionesAlumno"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Datos</title>
    </head>
    <body>
        <div class="container" >
            <form method="post" name="editar" action="actualizarAlumno" >
                <table border="2" >
                    <%
                        //Obtiene el id del alumno del que se desea editar sus datos
                        int id = Integer.parseInt(request.getParameter("id"));
                        //System.out.println(id);
                        
                        //Se realiza la busqueda del dato
                        Alumno alu = AccionesAlumno.buscarAlumnoById(id);
                    %>
                    <tr>
                        <!-- Se identifica al alumno por su id y ... -->
                        <td>ID</td>
                        <td> <input type="hidden" name="id2" value="<%=alu.getIdAlumno()%>" > </td>
                    </tr>
                    <tr>
                        <!-- ... Los campos se vuelven editables -->
                        <td>Nombre</td>
                        <td> <input type="text" name="nombre2" value="<%=alu.getNom_alu()%>" > </td>
                    </tr>
                    <tr>
                        <td>Apellido Paterno</td>
                        <td> <input type="text" name="appat2" value="<%=alu.getAppat_alu()%>" > </td>
                    </tr>
                    <tr>
                        <td>Apellido Materno</td>
                        <td> <input type="text" name="apmat2" value="<%=alu.getApmat_alu()%>" > </td>
                    </tr>
                    <tr>
                        <td>Edad</td>
                        <td> <input type="text" name="edad2" value="<%=alu.getEdad_alu()%>" > </td>
                    </tr>
                    <tr>
                        <td colspan="2" > <input type="submit" value="Actualizar Datos" > </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
