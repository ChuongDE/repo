package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/temples/header.jsp");
    _jspx_dependants.add("/temples/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <link href=\"css/detail.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/home.css\" rel=\"stylesheet\"/>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .gallery-wrap .img-big-wrap img {\n");
      out.write("                height: 450px;\n");
      out.write("                width: auto;\n");
      out.write("                display: inline-block;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .gallery-wrap .img-small-wrap .item-gallery {\n");
      out.write("                width: 60px;\n");
      out.write("                height: 60px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                margin: 7px 2px;\n");
      out.write("                display: inline-block;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gallery-wrap .img-small-wrap {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .gallery-wrap .img-small-wrap img {\n");
      out.write("                max-width: 100%;\n");
      out.write("                max-height: 100%;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("            .img-big-wrap img{\n");
      out.write("                width: 100% !important;\n");
      out.write("                height: auto !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<div id=\"header\" class=\"col-md-11\">\n");
      out.write("\n");
      out.write("    <div class=\"search\">\n");
      out.write("        <input class=\"search-input\" width=\"80%\" type=\"text\" name=\"\"\n");
      out.write("               id=\"\" placeholder=\"Search\"\n");
      out.write("               style=\"padding-left: 15px;\">\n");
      out.write("        <div class=\"icon\">\n");
      out.write("            <i class=\"fa-sharp fa-solid fa-magnifying-glass\"></i>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <img width=\"10%\"\n");
      out.write("         src=\"./assets/IMG/thiet-ke-logo-nuoc-hoa-bee-design-02.jpg\"\n");
      out.write("         alt=\"\" class=\"logo\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<hr>\n");
      out.write("<div class=\"header col-md-11\" style=\"margin: 0 auto;\">\n");
      out.write("    <div class=\"hd2\">\n");
      out.write("        <nav class=\"hd2-menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"home\">HOME</a></li>\n");
      out.write("                <li><a href=\"#footer\">ABOUT</a></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">PRODUCT<i class=\"fa-solid fa-chevron-down\"></i></a>\n");
      out.write("                    <ul class=\"sub-menu\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"hd2-cart\" style=\"cursor: pointer;\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa-solid fa-cart-shopping\"></i>GIỎ HÀNG</a>\n");
      out.write("                    <ul class=\"sub-menu2\" >\n");
      out.write("                        <li style=\"font-family: Verdana, Geneva, Tahoma, sans-serif; display: flex; margin-left: 8%;\">TỔNG CỘNG</li>\n");
      out.write("                        <div class=\"menu22\">\n");
      out.write("\n");
      out.write("                            <li class=\"view-cart \"><a href=\"#\">XEM GIỎ HÀNG</a></li>\n");
      out.write("\n");
      out.write("                            <li class=\"view-cart\"><a href=\"#\">THANH TOÁN</a></li>\n");
      out.write("                        </div>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-9\" style=\"align-content: center\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <aside class=\"col-sm-5 border-right\">\n");
      out.write("                                    <article class=\"gallery-wrap\"> \n");
      out.write("                                        <div class=\"img-big-wrap\">\n");
      out.write("                                            <div> <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a></div>\n");
      out.write("                                        </div> <!-- slider-product.// -->\n");
      out.write("                                        <div class=\"img-small-wrap\">\n");
      out.write("                                        </div> <!-- slider-nav.// -->\n");
      out.write("                                    </article> <!-- gallery-wrap .end// -->\n");
      out.write("                                </aside>\n");
      out.write("                                <aside class=\"col-sm-7\">\n");
      out.write("                                    <article class=\"card-body p-5\">\n");
      out.write("                                        <h3 class=\"title mb-3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("                                        <p class=\"price-detail-wrap\"> \n");
      out.write("                                            <span class=\"price h3 text-warning\"> \n");
      out.write("                                                <span class=\"currency\">US $</span><span class=\"num\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                            </span> \n");
      out.write("                                        </p> <!-- price-detail-wrap .// -->\n");
      out.write("                                        <dl class=\"item-property\">\n");
      out.write("                                            <dt>Description</dt>\n");
      out.write("                                            <dd><p>\n");
      out.write("                                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                                </p></dd>\n");
      out.write("                                        </dl>\n");
      out.write("\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-sm-5\">\n");
      out.write("                                                <dl class=\"param param-inline\">\n");
      out.write("                                                    <dt>Quantity: </dt>\n");
      out.write("                                                    <dd>\n");
      out.write("                                                        <select class=\"form-control form-control-sm\" style=\"width:70px;\">\n");
      out.write("                                                            <option> 1 </option>\n");
      out.write("                                                            <option> 2 </option>\n");
      out.write("                                                            <option> 3 </option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </dd>\n");
      out.write("                                                </dl>  <!-- item-property .// -->\n");
      out.write("                                            </div> <!-- col.// -->\n");
      out.write("\n");
      out.write("                                        </div> <!-- row.// -->\n");
      out.write("                                        <hr>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-primary text-uppercase\"> Buy now </a>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-outline-primary text-uppercase\"> <i class=\"fas fa-shopping-cart\"></i> Add to cart </a>\n");
      out.write("                                    </article> <!-- card-body.// -->\n");
      out.write("                                </aside> <!-- col.// -->\n");
      out.write("                            </div> <!-- row.// -->\n");
      out.write("                        </div> <!-- card.// -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!---------- Footer ------------------>\n");
      out.write("\n");
      out.write("<footer id=\"footer\" class=\"page-footer font-small black pt-4\">\n");
      out.write("\n");
      out.write("    <!-- Footer Links -->\n");
      out.write("    <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("\n");
      out.write("        <!-- Grid row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-md-5 mt-md-5 mt-5\">\n");
      out.write("\n");
      out.write("                <!-- Content -->\n");
      out.write("                <h5 class=\"text-uppercase\">LIÊN HỆ VỚI CHÚNG TÔI</h5>\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <i class=\"fa-solid fa-location-dot\"></i>ADDRESS: <br>\n");
      out.write("                        <h6>\n");
      out.write("                            123 Street Name, City, England\n");
      out.write("                        </h6>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <i class=\"fa-sharp fa-solid fa-phone\"></i>PHONE: <br>\n");
      out.write("                        <h6>\n");
      out.write("                            Toll Free (123) 456-7890\n");
      out.write("                        </h6>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <i class=\"fa-solid fa-envelope\"></i>EMAIL: <br>\n");
      out.write("                        <h6>\n");
      out.write("                            mail@example.com\n");
      out.write("                        </h6>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <i class=\"fa-solid fa-timer\"></i>WORKING DAY/HOURS: <br>\n");
      out.write("                        <h6>\n");
      out.write("                            Mon - Sun / 9:00AM - 8:00PM\n");
      out.write("                        </h6>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("            <hr class=\"clearfix w-100 d-md-none pb-3\">\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-md-4 mb-md-5 mb-3 mt-md-5\">\n");
      out.write("\n");
      out.write("                <!-- Links -->\n");
      out.write("                <h5 class=\"text-uppercase\">SẢN PHẨM</h5>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\">NƯỚC HOA NAM</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\">NƯỚC HOA NỮ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\">NƯỚC HOA MINI</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("            <!-- Grid column -->\n");
      out.write("            <div class=\"col-md-3 mb-md-0 mb-3 mt-md-5\">\n");
      out.write("\n");
      out.write("                <!-- Links -->\n");
      out.write("                <h5 class=\"text-uppercase \">FOLLOW US</h5>\n");
      out.write("\n");
      out.write("                <ul class=\"list-unstyled footer-child1\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\"><i class=\"fa-brands fa-facebook\"></i> Facebook</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\"><i class=\"fa-brands fa-twitter\"></i> Twitter</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\"><i class=\"fa-brands fa-instagram\"></i> Instagram</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#!\">\n");
      out.write("\n");
      out.write("                            <i class=\"fa-brands fa-linkedin\"></i> Linked-In   \n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- Grid column -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Grid row -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- Footer Links -->\n");
      out.write("    <div class=\" text-center py-1\">\n");
      out.write("        <h3>THANH TOÁN BẰNG</h3>\n");
      out.write("        <a href=\"\" class=\"pay\">\n");
      out.write("            <i style=\"font-size: 40px;\" class=\"fa-brands fa-cc-paypal pay-icon\"></i>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"\" class=\"pay\">\n");
      out.write("            <i style=\"font-size: 40px;\" class=\"fa-brands fa-cc-visa pay-icon\"></i>\n");
      out.write("        </a>\n");
      out.write("        <a href=\"\" class=\"pay\"> \n");
      out.write("            <i style=\"font-size: 40px;\" class=\"fa-brands fa-cc-discover pay-icon\"></i>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Copyright -->\n");
      out.write("\n");
      out.write("    <div class=\"footer-copyright text-center py-3\" style=\"color: gray;\">© 2020 Copyright:\n");
      out.write("        <a href=\"/\"> ALLORA</a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Copyright -->\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("<!-- Footer -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("            integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script\n");
      out.write("        src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("        integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script\n");
      out.write("        src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\n");
      out.write("        integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/78025ca858.js\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li><a href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.a == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <li><a href=\"Login.jsp\">LOGIN</a></li>\n");
        out.write("                    <li><a href=\"Login.jsp\">SIGN UP</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.a != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <li><a href=\"#\">HELLO ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.a.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                    <li><a href=\"logout\">LOG OUT</a></li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
