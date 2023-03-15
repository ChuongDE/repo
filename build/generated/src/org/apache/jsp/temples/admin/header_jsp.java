package org.apache.jsp.temples.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\n");
      out.write("            crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href=\"manager1.css\"/>\n");
      out.write("        <title>Document</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\"><a href=\"#\">Admin Panel</a></div>\n");
      out.write("                <ul class=\"links\">\n");
      out.write("                    <li><a href=\"hero\">Dashboard</a></li>\n");
      out.write("                    <li><a href=\"about\">Product Manager</a></li>\n");
      out.write("                    <li><a href=\"services\">Inventory</a></li>\n");
      out.write("                    <li><a href=\"contact\">User Manager</a></li>\n");
      out.write("                    <li><a href=\"contact\">Home</a></li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                <div class=\"toggle_btn\">\n");
      out.write("                    <i class=\"fa-solid fa-bars\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dropdown_menu\">\n");
      out.write("                <li><a href=\"hero\">Home</a></li>\n");
      out.write("                <li><a href=\"about\">About</a></li>\n");
      out.write("                <li><a href=\"services\">Services</a></li>\n");
      out.write("                <li><a href=\"contact\">Contact</a></li>\n");
      out.write("                <li><a href=\"contact\">Home</a></li>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- <main>\n");
      out.write("            <section id=\"hero\">\n");
      out.write("                <h1>Welcome</h1>\n");
      out.write("                <p>\n");
      out.write("                    Lorem ipsum, dolor sit amet consectetur adipisicing elit. <br> Aperiam atque porro laudantium temporibus magnam corporis quia necessitatibus? Laudantium, quidem libero.\n");
      out.write("                </p>\n");
      out.write("            </section>\n");
      out.write("        </main> -->\n");
      out.write("        <script src=\"manager.js\"></script>\n");
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
