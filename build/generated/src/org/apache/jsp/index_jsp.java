package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1></h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <script language=\"javascript\">\n");
      out.write("        function editRecord(id){\n");
      out.write("            var f=document.form;\n");
      out.write("            f.method=\"post\";\n");
      out.write("            f.action='edit.jsp?id='+id;\n");
      out.write("            f.submit();\n");
      out.write("        }\n");
      out.write("        function deleteRecord(id){\n");
      out.write("            var f=document.form;\n");
      out.write("            f.method=\"post\";\n");
      out.write("            f.action='delete.jsp?id='+id;\n");
      out.write("            f.submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body><center>\n");
      out.write("<!--    <form method=\"post\" name=\"form\">-->\n");
      out.write("<form method=\"post\" name=\"form\" action=\"input.jsp\">\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr width=\"10\" bgcolor=\"#999FFc\">\n");
      out.write("                <td colspan=\"7\"><center><h2>Daftar Mahasiswa</h2></center>\n");
      out.write("        </td>\n");
      out.write("</tr>\n");
      out.write("            <tr width=\"10\" bgcolor=\"#0FF111\"><th>NPM</th><th>Nama</th><th>Prodi</th><th>Semester</th><th>Ubah</th><th>Hapus</th></tr>\n");
 
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/kontrakmk","root","");
        String query = "select * from mahasiswa";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){

      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <TD>");
      out.print(rs.getString("npm"));
      out.write("</TD>\n");
      out.write("                <TD>");
      out.print(rs.getString("nama"));
      out.write("</TD>\n");
      out.write("                <TD>");
      out.print(rs.getString("prodi"));
      out.write("</TD>\n");
      out.write("                <TD>");
      out.print(rs.getString("semester"));
      out.write("</TD>\n");
      out.write("\n");
      out.write("<td><input type=\"button\" name=\"edit\" value=\"Edit\" style=\"background-color:#49743D;font-weight:bold;color:#ffffff;\" onclick=\"editRecord(");
      out.print(rs.getString("id"));
      out.write(");\" ></td>\n");
      out.write("<td><input type=\"button\" name=\"delete\" value=\"Delete\" style=\"background-color:#ff0000;font-weight:bold;color:#ffffff;\" onclick=\"deleteRecord(");
      out.print(rs.getString("id"));
      out.write(");\" ></td>\n");
      out.write("</tr>\n");

        }
        rs.close();
st.close();
con.close();
} 

    
    catch(Exception e){
        e.printStackTrace();
    }

      out.write("\n");
      out.write("</table>\n");
      out.write("<input type=\"submit\" value=\"Tambah\" style=\"background-color:#00FFFF;font-weight:bold;\"/>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
