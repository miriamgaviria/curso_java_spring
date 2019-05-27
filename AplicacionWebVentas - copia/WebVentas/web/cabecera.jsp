<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header><h1>Web ventas</h1></header>

<nav>
    <c:if test="${login != 'ok'}" >
        <a href="registro.jsp">Nuevo cliente</a>
        <a href="login.jsp">Login</a>
    </c:if> 
        
    <a href="editar.jsp">Editar AJAX + Rest</a>

    <c:if test="${login == 'ok'}">
        <a href="listado.jsp">Listado clientes</a>
        <a href="listado_sql.jsp">Listado clientes JSTL - SQL</a>
        <a href="clientes.do">Listado clientes JSTL Y JavaBeans</a>
        <a href="editar.jsp">Editar AJAX + Rest</a>

        </br></br>

        <form method="GET" action="clientes.do">
            <input type="text" id="nombre" name="nombre"/>
            <input type="submit" value="Buscar">
        </form>

        </br>

        <%--<span><%= request.getCookies().length <= 1 ? "" : request.getCookies()[1].getValue()%></span>--%>
        <%--Cookies con Expression de Lenguaje EL--%>
        <span>Primer código para Cookie ${cookie.nombre_busqueda.value}</span></br>
        <span id="cookie_nom"></span>
        <span id="span_cookie_nom"></span>

    </c:if>

</nav>

<script src="js/cookies.js"></script>

