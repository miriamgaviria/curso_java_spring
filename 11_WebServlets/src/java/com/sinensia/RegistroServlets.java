
package com.sinensia;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin - Miriam
 */
public class RegistroServlets extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException{
        respuesta.setContentType("text/html;charset=UTF-8");
        try (PrintWriter salida = respuesta.getWriter()){
            salida.println("<html><head>");
            salida.println("<title>Web servlet desde Java </title>");
            salida.println("</head><body>");
            salida.println("<h1>Respuesta al registros</head>");
            salida.println("<h2>Ruta del servlet: " 
                    + peticion.getContextPath() + ", método: " + peticion.getMethod() + "</h2>");
            salida.println("<ul>");
            for (int i = 0; i<3; i++){
                salida.println("<li>Num " + i + "</li>");
            }
            
            String nombre = peticion.getParameter("nombre");
            String strEdad = peticion.getParameter("edad");
            int edad = Integer.parseInt(strEdad);
            String email = peticion.getParameter("email");
            String strActivo = peticion.getParameter("activo");
            boolean activo = strActivo != null;
            
            salida.println("<p>Nombre = "+ nombre + "</p>");
            salida.println("<p>Edad = "+ edad + "</p>");
            salida.println("<p>Email = "+ email + "</p>");
            salida.println("<p>activo = "+ activo + "</p>");
            
            
            salida.println("</body></html>");
            salida.println("");
        }
    }
    
    @Override
    public String getServletInfo(){
        return "Registro clientes";
    }
}
