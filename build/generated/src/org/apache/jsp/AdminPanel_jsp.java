package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\n");
      out.write("    <title>Admin Dashboard</title>\n");
      out.write("\n");
      out.write("    <!-- Montserrat Font -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Material Icons -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons+Outlined\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Symbols+Outlined\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>        \n");
      out.write("    <div class=\"grid-container\">\n");
      out.write("\n");
      out.write("      <!-- Header -->\n");
      out.write("      <header class=\"header\">\n");
      out.write("        <div class=\"menu-icon\" onclick=\"openSidebar()\">\n");
      out.write("          <span class=\"material-icons-outlined\">menu</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header-left\">\n");
      out.write("          <span class=\"material-icons-outlined\">search</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header-right\">\n");
      out.write("          <span class=\"material-icons-outlined\">notifications</span>\n");
      out.write("          <span class=\"material-icons-outlined\">email</span>\n");
      out.write("          <span class=\"material-icons-outlined\">account_circle</span>\n");
      out.write("        </div>\n");
      out.write("      </header>\n");
      out.write("      <!-- End Header -->\n");
      out.write("\n");
      out.write("      <!-- Sidebar -->\n");
      out.write("      <aside id=\"sidebar\">\n");
      out.write("        <div class=\"sidebar-title\">\n");
      out.write("          <div class=\"sidebar-brand\">\n");
      out.write("            <span class=\"material-symbols-outlined\">\n");
      out.write("              admin_panel_settings\n");
      out.write("              </span> Admin Panel\n");
      out.write("          </div>\n");
      out.write("          <span class=\"material-icons-outlined\" onclick=\"closeSidebar()\">close</span>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <ul class=\"sidebar-list\">\n");
      out.write("          <li class=\"sidebar-list-item\">\n");
      out.write("            <a href=\"#\" target=\"_blank\">\n");
      out.write("              <span class=\"material-icons-outlined\">dashboard</span> Dashboard\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"sidebar-list-item\">\n");
      out.write("            <a href=\"manager\" target=\"\">\n");
      out.write("              <span class=\"material-icons-outlined\">inventory_2</span> Products\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"sidebar-list-item\">\n");
      out.write("            <a href=\"#\" target=\"_blank\">\n");
      out.write("              <span class=\"material-icons-outlined\">fact_check</span> Inventory\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"sidebar-list-item\">\n");
      out.write("            <a href=\"#\" target=\"_blank\">\n");
      out.write("              <span class=\"material-icons-outlined\">add_shopping_cart</span> Purchase Orders\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"sidebar-list-item\">\n");
      out.write("            <a href=\"#\" target=\"_blank\">\n");
      out.write("              <span class=\"material-icons-outlined\">shopping_cart</span> Sales Orders\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"sidebar-list-item\">\n");
      out.write("            <a href=\"userctl\" target=\"\">\n");
      out.write("              <span class=\"material-symbols-outlined\">manage_accounts</span> Account Manager\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"sidebar-list-item\">\n");
      out.write("            <a href=\"#\" target=\"_blank\">\n");
      out.write("              <span class=\"material-icons-outlined\">settings</span> Settings\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </aside>\n");
      out.write("      <!-- End Sidebar -->\n");
      out.write("\n");
      out.write("      <!-- Main -->\n");
      out.write("      <main class=\"main-container\">\n");
      out.write("        <div class=\"main-title\">\n");
      out.write("          <p class=\"font-weight-bold\">DASHBOARD</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main-cards\">\n");
      out.write("\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-inner\">\n");
      out.write("              <p class=\"text-primary\">PRODUCTS</p>\n");
      out.write("              <span class=\"material-icons-outlined text-blue\">inventory_2</span>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <span class=\"text-primary font-weight-bold\">249</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-inner\">\n");
      out.write("              <p class=\"text-primary\">PURCHASE ORDERS</p>\n");
      out.write("              <span class=\"material-icons-outlined text-orange\">add_shopping_cart</span>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"text-primary font-weight-bold\">83</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-inner\">\n");
      out.write("              <p class=\"text-primary\">SALES ORDERS</p>\n");
      out.write("              <span class=\"material-icons-outlined text-green\">shopping_cart</span>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"text-primary font-weight-bold\">79</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-inner\">\n");
      out.write("              <p class=\"text-primary\">INVENTORY ALERTS</p>\n");
      out.write("              <span class=\"material-icons-outlined text-red\">notification_important</span>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"text-primary font-weight-bold\">56</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"charts\">\n");
      out.write("\n");
      out.write("          <div class=\"charts-card\">\n");
      out.write("            <p class=\"chart-title\">Top 5 Products</p>\n");
      out.write("            <div id=\"bar-chart\"></div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"charts-card\">\n");
      out.write("            <p class=\"chart-title\">Purchase and Sales Orders</p>\n");
      out.write("            <div id=\"area-chart\"></div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </main>\n");
      out.write("      <!-- End Main -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Scripts -->\n");
      out.write("    <!-- ApexCharts -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/apexcharts/3.35.3/apexcharts.min.js\"></script>\n");
      out.write("    <!-- Custom JS -->\n");
      out.write("    <script src=\"js/admin.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
