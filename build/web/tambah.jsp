<%-- 
    Document   : tambah
    Created on : Dec 27, 2018, 10:29:58 AM
    Author     : Rizal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Data</title>
    </head>
    <body>
        <h1>Tambah Data</h1>
        <%@page  import="java.sql.*" %> 
        <%     String npm=request.getParameter("npm");     
        String nama=request.getParameter("nama");         
        String prodi = request.getParameter("prodi");     
        String semester=request.getParameter("semester");          
        try {         
        String Host = "jdbc:mysql://localhost:3306/kontrakmk";         
        Class.forName("com.mysql.jdbc.Driver");         
        Connection con = DriverManager.getConnection(Host, "root", "");         
        Statement statement = con.createStatement();         
        String sql="insert into mahasiswa (npm, nama, prodi, semester) values "+ "('"+npm+"','"+nama+"','"+prodi+"','"+semester+"')";         
        statement=con.createStatement();         
        statement.executeUpdate(sql);         
        response.sendRedirect("index.jsp");     
        } 
        catch (Exception e){ } %> 
    </body>
</html>
