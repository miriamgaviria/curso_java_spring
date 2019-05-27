<%-- 
    Document   : listado
    Created on : 24-may-2019, 9:31:07
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sinensia.modelo.logica.*" %>
<%@page import="com.sinensia.modelo.Cliente" %>
<%! ServicioClientes srvCli; %>
<% srvCli = new ServicioClientes();
    List<Cliente> cliente = srvCli.obtenerTodos();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado clientes</title>
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <h2>Listado Clientes</h2>
        <table border="2">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Edad</th>
                    <th>Activo</th>
                    
                </tr>
            </thead>
            
            <% for(int i=0; i<cliente.size();i++) { %>
            <tr>
                <td><%= cliente.get(i).getNombre()%></td>
                <td><%= cliente.get(i).getEmail()%></td>
                <td><%= cliente.get(i).getEdad()%></td>
                <td><%= cliente.get(i).getActivo()%></td>
            </tr>   
            <% }%>
            
            
            <%--Manera rollo servlet cutre
            <% for (Cliente cli : cliente){
                out.println("<tr><td>" + cli.getNombre() +  "</td>");
                out.println("<td>" + cli.getEmail() +  "</td></tr>");
                out.println("<td>" + cli.getEdad() +  "</td></tr>");
                out.println("<td>" + cli.getActivo() +  "</td></tr>");
            }%>--%>
        </table>
    </body>
</html>
