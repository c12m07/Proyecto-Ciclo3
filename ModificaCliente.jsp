<%@ page
    import="
        java.io.*,
        java.util.*,
        com.BO.TiendaVirtualSB.*,
        com.DTO.TiendaVirtualSB.*"
%>
<html>
<% 
    ClienteController cc=new ClienteController();
    ClienteVO cli=new ClienteVO();
    int cedula=Integer.parseInt(request.getParameter("cedula"));
    int telefono=Integer.parseInt(request.getParameter("telefono"));
    cli.setCedulaCliente(cedula);
    cli.setDireccionCliente(request.getParameter("direccion"));
    cli.setEmailCliente(request.getParameter("email"));
    cli.setNombreCliente(request.getParameter("nombre"));
    cli.setTelefonoCliente(telefono);
    cc.modificarCliente(cli);
%>
<head>
<title>Actualizar Cliente</title>
</head>
<body>
    <h1>Cliente Actualizado!</h1>
    <ul>
        <li><p>
                <b>Cedula:</b>
                <%= request.getParameter("cedula")%>
            </p></li>
        <li><p>
                <b>Direccion:</b>
                <%= request.getParameter("direccion")%>
            </p></li>
        <li><p>
                <b>Correo:</b>
                <%= request.getParameter("email")%>
            </p></li>
        <li><p>
                <b>Nombre:</b>
                <%= request.getParameter("nombre")%>
            </p></li>
        <li><p>
                <b>Telefono:</b>
                <%= request.getParameter("telefono")%>
            </p></li>
    </ul>
</body>
</html>