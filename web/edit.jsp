<%-- 
    Document   : edit
    Created on : Dec 27, 2018, 10:54:31 AM
    Author     : Rizal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>edit data</title>
    </head>
    <body>
        <h1>Form Edit</h1>
        
        <%@page language="java"%>
<%@page import="java.sql.*"%>
<html>
<head>
<script language="javascript">
function editRecord(id){
    var f=document.form;
    f.method="post";
    f.action='update.jsp?id='+id;
    f.submit();
}
</script>
</head>
<body><center>
<form method="post" name="form">
    <table border="1">
           <tr width="10" bgcolor="#999FFc">
                <td colspan="5"><center><h2>Ubah Mahasiswa</h2></center>
        </td>
</tr>
        <tr width="10" bgcolor="#0FF111"><th>NPM</th><th>Nama</th><th>Alamat</th><th>Prodi</th><th>Semester</th></tr>        
        <%
            String id=request.getParameter("id");
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kontrakmk", "root", "");
                String query = "select * from mahasiswa where id='"+id+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
        while(rs.next()){
        %>
        
        <tr>
           
            <td><input type="text" name="npm" value="<%=rs.getString("npm")%>"></td>
            <td><input type="text" name="nama" value="<%=rs.getString("nama")%>"></td>
            <td><input type="text" name="alamat" value="<%=rs.getString("alamat")%>"></td>
            <td><input type="text" name="prodi" value="<%=rs.getString("prodi")%>"></td>
            <td><input type="text" name="semester" value="<%=rs.getString("semester")%>"></td>
        </tr>
    </table>
            <input type="submit" name="Submit" value="Update" style="background-color:#FF6347;font-weight:bold;color:#ffffff;" onclick="editRecord(<%=rs.getString("id")%>);">
            <%
        }
            }
catch(Exception e){}
            %>
</form>
</body>
</html>

    </body>
</html>
