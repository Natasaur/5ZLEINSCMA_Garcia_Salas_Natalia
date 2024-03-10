<%-- 
    Document   : registro
    Created on : 4 mar 2024, 09:45:49
    Author     : jakeg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MVC con JSP</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>   <!-- Crea un divisor -->
            <!-- REGISTRAR -->
            <h2>REGISTRAR</h2>
            <form name="formulario" action ="guardarAlumno" method="post">
                <!-- Con get se visualizan los datos a enviar -->
                <!-- Con post se ocultan los datos a enviar -->
                
                <!-- Se crean los campos para ingresar datos -->
                <label>Nombre: </label>
                <br>
                <input type="text" name="nombre">
                
                <br>
                <label>Apellido Paterno: </label>
                <br>
                <input type="text" name="appat">
                <br>
                
                <label>Apellido Materno: </label>
                <br>
                <input type="text" name="apmat">
                <br>
                
                <label>Edad: </label>
                <br>
                <input type="text" name="edad">
                <br>
                
                <input type="submit" name="enviar" value="Registrar Alumno">
                <input type="reset" name="borrar" value="Borrar datos">
            </form>
    </body>
</html>
