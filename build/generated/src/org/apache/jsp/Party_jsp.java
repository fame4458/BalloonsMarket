package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Party_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Balloons Market</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Caveat:400,700\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"font-family: 'Caveat', cursive;\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/Navbar.jsp", out, false);
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container my-5\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.1.0/css/all.css\" integrity=\"sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt\" crossorigin=\"anonymous\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12 col-md-10 col-lg-5 ml-auto\" >\r\n");
      out.write("                        <form class=\"card card-sm\" action=\"Search\" method=\"post\">\r\n");
      out.write("                            <div class=\"card-body row no-gutters align-items-center\">\r\n");
      out.write("                                <div class=\"col-auto col-1\">\r\n");
      out.write("                                    <i class=\"fas fa-search h4 text-body\"></i>\r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class=\"col\" name = \"name\">\r\n");
      out.write("                                    <input class=\"form-control form-control-lg form-control-borderless\" style=\"background-color:bisque\"  type=\"search\" placeholder=\"Search our balloons\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <select name=\"type\">\r\n");
      out.write("                                    <option value=\"Type\">Type</option>\r\n");
      out.write("                                    <option value=\"Party\">Party</option>\r\n");
      out.write("                                    <option value=\"Birthday\">Birthday</option>\r\n");
      out.write("                                    <option value=\"Celebrate\">Celebrate</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <div class=\"col-auto \">\r\n");
      out.write("                                    <button class=\"btn btn-lg\" style=\"background-color: peru; color: #fff\" type=\"submit\">Search</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write(" \r\n");
      out.write("                    </div>   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h1 class=\"text-center mt-5\">Party set</h1>\r\n");
      out.write("                <div class=\"row mt-2\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    _jspx_th_c_forEach_0.setVarStatus("vs");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-lg-4 col-sm-6 portfolio-item mt-5\">\r\n");
          out.write("                            <div class=\"card h-100\">\r\n");
          out.write("                                <a href=\"#\"><img class=\"card-img-top rounded\" height=\"400px\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productphoto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a>\r\n");
          out.write("                                <div class=\"card-body \">\r\n");
          out.write("                                    <div class=\"col-12 mb-3\">\r\n");
          out.write("                                        <h4 class=\"card-title\">\r\n");
          out.write("                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </h4>\r\n");
          out.write("                                        <p class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.productdescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <form action=\"cart\" method=\"post\">\r\n");
          out.write("                                        <div class=\"row\">\r\n");
          out.write("                                            <div class=\"col-6\">\r\n");
          out.write("                                                <input type=\"number\" name=\"quatity\" value=\"1\" min=\"1\" class=\"form-control\">\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <div class=\"col-6\">\r\n");
          out.write("                                                <input type=\"submit\" value=\"buy\" class=\"btn btn-block\" style=\"background-color: darksalmon;color: #fff;\">\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </form>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
