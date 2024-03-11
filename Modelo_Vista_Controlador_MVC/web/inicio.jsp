<%-- 
    Document   : inicio
    Created on : 8 mar 2024, 09:54:44
    Author     : jakeg
--%>

<%@page import="java.util.List"%>
<%@page import="Modelo.Alumno"%>
<%@page import="Controlador.AccionesAlumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Alumnos</title>
    </head>
    <body>
        <h1>Lista General de Alumnos a presentar Extraordinarios</h1>
        <div class="container">
            <br>
            <table border="2">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellido Paterno</th>
                        <th>Apellido Materno</th>
                        <th>Edad</th>
                        <th>Editar</th>
                        <th>Eliminar</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        //Se obtiene la lista de los alumnos
                        List<Alumno> lista = AccionesAlumno.getAllAlumnos();
                        //Y se recorre toda la lista
                        for(Alumno alu : lista){
                        //Y se imprimen todos los datos de la lista
                    %>    
                    <tr>
                        <td> <%=alu.getIdAlumno()%>  </td>
                        <td> <%=alu.getNom_alu()%>  </td>
                        <td> <%=alu.getAppat_alu()%>  </td>
                        <td> <%=alu.getApmat_alu()%>  </td>
                        <td> <%=alu.getEdad_alu()%>  </td>
                        <td> <a href="editarAlumno.jsp?id=<%=alu.getIdAlumno()%>" >
                                <img src="">ICONO-Editar</a>     </td>
                        <td> <a href="eliminarAlumno?id=<%=alu.getIdAlumno()%>" >
                                ICONO-Eliminar</a>     </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
                <a href="opciones.jsp">Regresar al Menu Principal</a>    
            </div>
    </body>
</html>
