<%-- 
    Document   : input
    Created on : Dec 27, 2018, 10:50:30 AM
    Author     : Rizal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>input data</title>
    </head>
    <body>
        <h1>Input Data</h1>
        
        <%@page  import="java.sql.*" %>
<html>
<head>
    <title>Daftar Mahasiswa</title>
</head>
<center><form action="tambah.jsp">
        <table border="1" >
            <td><table width ="400" border="0"  bgcolor="red">
                    <tr>
                        <td colspan="3"><center><h2>Daftar Mahasiswa</h2></center>
            </td>
</tr>
<tr>
    <td>NPM</td>
    <td><input type="text" name="npm"></td>
</tr>
<tr>
    <td>Nama</td>
    <td><input type="text" name="nama"></td>
</tr>

<tr>
    <td>Prodi</td>
    <td><input type="text" name="prodi"></td>
</tr>
<tr>
    <td>Semester</td>
    <td><input type="text" name="semester"></td>
</tr>
<tr>
    <td colspan="2"><center>
        <input type="submit" name ="input" value="Input"/>
        <input type="submit" name="reset" value="Reset">
    </td>
</tr>
</table>
        <a href ="index.jsp">Kembali</a>
            </td>
        </table>
        </form>
        </center>
        </html>
    </body>
</html>
