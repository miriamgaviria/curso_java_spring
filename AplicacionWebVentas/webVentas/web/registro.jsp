<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Registro</h1>
        
        <form name="form1" method="post" action="clientes.do"><!---->
            <label>Nombre: </label>
                <input type="text" id="nombre" name="nombre" size="50" maxlength="50" required="required"/></br></br>
            <label>Email: </label>
                <input type="email" id="email" name="email" size="80" maxlength="250" required="required"/></br></br>
            <label>Edad: </label>
                <input type="number" id="edad" name="edad" size="3" maxlength="3" required="required" max="200" min="1"/></br></br>
            <label>Activo: </label>
                <input type="checkbox" id="activo" name="activo" required="required" checked="checked"/></br></br>
            <label>Password: </label>
                <input type="password" id="password" name="password" required="required" /></br></br>
            <input type="reset" value="Limpiar"/>
            <input type="submit" value="Enviar"/>
                
            
            
        </form>
    </body>
</html>
