package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class input_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>input data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Input Data</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Daftar Mahasiswa</title>\n");
      out.write("</head>\n");
      out.write("<center><form action=\"tambah.jsp\">\n");
      out.write("        <table border=\"1\" >\n");
      out.write("            <td><table width =\"400\" border=\"0\"  bgcolor=\"red\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"3\"><center><h2>Daftar Mahasiswa</h2></center>\n");
      out.write("            </td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>NPM</td>\n");
      out.write("    <td><input type=\"text\" name=\"npm\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Nama</td>\n");
      out.write("    <td><input type=\"text\" name=\"nama\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td>Prodi</td>\n");
      out.write("    <td><input type=\"text\" name=\"prodi\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Semester</td>\n");
      out.write("    <td><input type=\"text\" name=\"semester\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td colspan=\"2\"><center>\n");
      out.write("        <input type=\"submit\" name =\"input\" value=\"Input\"/>\n");
      out.write("        <input type=\"submit\" name=\"reset\" value=\"Reset\">\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("        <a href =\"index.jsp\">Kembali</a>\n");
      out.write("            </td>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        </center>\n");
      out.write("        </html>\n");
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
