<%-- 
    Document   : editar
    Created on : 27-may-2019, 15:36:20
    Author     : Miriam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar con REST</title>
    </head>
    <body>       
        <%@include file="cabecera.jsp" %>
        <h2>Editar con REST</h2>
        <form name="form1" id="form1">
            <label for="nombre">Nombre:</label> 
            <input id="nombre" name="nombre" type="text" 
                   required="required" size="50" maxlength="50"/>
            <br/>
            <label for="email">Email:</label> 
            <input id="email" name="email" type="email" 
                   required="required" size="50" maxlength="250"/>
            <br/>
            <label for="edad">Edad: </label> 
            <input id="edad" name="edad" type="number" 
                   required="required" size="3" max="200" min="1"/>
            <br/>
            <label for="activo">Activo: </label> 
            <input id="activo" name="activo" type="checkbox" checked="checked"/>
            <br/>
            <label for="password">Password</label> 
            <input id="password" name="password" type="password" 
                   required="required" size="50" maxlength="50"/>
            <input type="hidden" name="password_encrip"
                   id="password_encrip"/>
            <br/>
            <input type="reset" value="Limpiar"/>
            <input id="btn_modificar" type="button" value="Modificar"/>            
        </form>
        
        <div id="div_info" style="display: none">
            <p>Id: <span id="id_cli"></span></p>
            <p>Nombre: <span id="nombre_cli"></span></p>
            <p>Email: <span id="email_cli"></span></p>
            <p>Edad: <span id="edad_cli"></span></p>
            <p>Activo: <span id="activo_cli"></span></p>
        </div>
        
        
        <script src="js/md5.min.js"></script>
        <script src="js/encriptacion.js"></script>
        <script src="js/editar.js"></script>
    </body>
</html>
