<%-- 
    Document   : delete
    Created on : Dec 27, 2018, 10:13:39 AM
    Author     : Rizal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>delete</title>
    </head>
    <body>
        <h1>Form Delete</h1>
        
      <%@page import="java.sql.*"%> <% String id1=request.getParameter("id"); 
      try { Class.forName("com.mysql.jdbc.Driver"); 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kontrakmk", "root", ""); 
        Statement st = conn.createStatement(); 
        st.executeUpdate("DELETE FROM mahasiswa WHERE id = '"+id+"'"); 
        response.sendRedirect("index.jsp"); 
        } catch(Exception e){} %> 
        
    </body>
</html>
