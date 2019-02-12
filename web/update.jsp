<%-- 
    Document   : update
    Created on : Dec 27, 2018, 10:33:51 AM
    Author     : Rizal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%@page import="java.sql.*"%> 
        <%String id=request.getParameter("id");     
        String npm=request.getParameter("npm");     
        String nama=request.getParameter("nama");     
        String alamat=request.getParameter("alamat");     
        String prodi=request.getParameter("prodi");     
        String semester=request.getParameter("semester");     
        Connection con=null;     
        try {         
        Class.forName("com.mysql.jdbc.Driver");         
        con= DriverManager.getConnection("jdbc:mysql://localhost/kontrakmk","root","");         
        Statement statement = con.createStatement();         
        String sql="update mahasiswa set npm='"+npm+"',nama='"+nama+"',alamat='"+alamat+"', prodi='"+prodi+"', semester='"+semester+"' where id='"+id+"'";         
        statement=con.createStatement();         
        statement.executeUpdate(sql);         
        response.sendRedirect("index.jsp");     
        } catch(Exception e)
        { out.print("Gagal Mengubah Database "+e);} %> 
    </body>
</html>
