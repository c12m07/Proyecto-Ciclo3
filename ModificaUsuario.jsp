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
    UsuarioVO cli=new UsuarioVO();
    int cedula=Integer.parseInt(request.getParameter("cedula"));
    cli.setCedulaUsuario(cedula);    
    cli.setUsuarioUsuario(request.getParameter("usuario"));
    cli.setNombreUsuario(request.getParameter("nombre"));
    cli.setContrasenaUsuario(request.getParameter("contrasena"));
    cli.setCorreoUsuario(request.getParameter("correo"));
    cc.modificarUsuario(cli);
%>
<head>
<title>Page Redirection</title>
</head>
<body>
    <h1>Cliente modificado</h1>
    <ul>
        <li><p>
                <b>Cedula:</b>
                <%= request.getParameter("cedula")%>
            </p></li>
        <li><p>
                <b>Nombre:</b>
                <%= request.getParameter("nombre")%>
            </p></li>
        <li><p>
                <b>Correo:</b>
                <%= request.getParameter("correo")%>
            </p></li>
        <li><p>
                <b>Usuario:</b>
                <%= request.getParameter("usuario")%>
            </p></li>
        <li><p>
                <b>Contrasena:</b>
                <%= request.getParameter("contrasena")%>
            </p></li>
    </ul>
</body>
</html>