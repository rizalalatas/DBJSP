<%-- 
    Document   : index
    Created on : Dec 27, 2018, 11:16:37 AM
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
        <h1></h1>
        
        <%@ page import="java.sql.*" %>
<html>
<head>
    <script language="javascript">
        function editRecord(id){
            var f=document.form;
            f.method="post";
            f.action='edit.jsp?id='+id;
            f.submit();
        }
        function deleteRecord(id){
            var f=document.form;
            f.method="post";
            f.action='delete.jsp?id='+id;
            f.submit();
        }
    </script>
</head>
<body><center>
<!--    <form method="post" name="form">-->
<form method="post" name="form" action="input.jsp">
        <table border="1">
            <tr width="10" bgcolor="#999FFc">
                <td colspan="7"><center><h2>Daftar Mahasiswa</h2></center>
        </td>
</tr>
            <tr width="10" bgcolor="#0FF111"><th>NPM</th><th>Nama</th><th>Prodi</th><th>Semester</th><th>Ubah</th><th>Hapus</th></tr>
<% 
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/kontrakmk","root","");
        String query = "select * from mahasiswa";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
%>
            <tr>
                <TD><%=rs.getString("npm")%></TD>
                <TD><%=rs.getString("nama")%></TD>
                <TD><%=rs.getString("prodi")%></TD>
                <TD><%=rs.getString("semester")%></TD>

<td><input type="button" name="edit" value="Edit" style="background-color:#49743D;font-weight:bold;color:#ffffff;" onclick="editRecord(<%=rs.getString("id")%>);" ></td>
<td><input type="button" name="delete" value="Delete" style="background-color:#ff0000;font-weight:bold;color:#ffffff;" onclick="deleteRecord(<%=rs.getString("id")%>);" ></td>
</tr>
<%
        }
        rs.close();
st.close();
con.close();
} 

    
    catch(Exception e){
        e.printStackTrace();
    }
%>
</table>
<input type="submit" value="Tambah" style="background-color:#00FFFF;font-weight:bold;"/>
</form>
</body>
</html>
    </body>
</html>
