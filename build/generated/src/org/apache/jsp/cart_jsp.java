package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Balloons Market</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Caveat:400,700\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body style=\"background-color: darksalmon; color: #fff;font-family: 'Caveat', cursive;\">\r\n");
      out.write("        <h1 class=\"m-5 text-center\">Your Cart</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table class=\"table mt-5\">\r\n");
      out.write("            <thead  style=\"background-color: peru\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"col\">#</th>\r\n");
      out.write("                    <th scope=\"col\">First</th>\r\n");
      out.write("                    <th scope=\"col\">Last</th>\r\n");
      out.write("                    <th scope=\"col\">Handle</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody style=\"background-color: #fff; color: black\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\">1</th>\r\n");
      out.write("                    <td>Mark</td>\r\n");
      out.write("                    <td>Otto</td>\r\n");
      out.write("                    <td>@mdo</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\">2</th>\r\n");
      out.write("                    <td>Jacob</td>\r\n");
      out.write("                    <td>Thornton</td>\r\n");
      out.write("                    <td>@fat</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"row\">3</th>\r\n");
      out.write("                    <td>Larry</td>\r\n");
      out.write("                    <td>the Bird</td>\r\n");
      out.write("                    <td>@twitter</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-lg-12 text-center\">\r\n");
      out.write("            <form action=\"Address\" method=\"post\">\r\n");
      out.write("                <input type=\"submit\" name=\"check\" tabindex=\"4\" class=\"btn px-5 py-2 mt-3\" \r\n");
      out.write("                       value=\"Check Out\" style=\"background-color: peru ;color: #fff;\" >\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"m-2 text-center\">\r\n");
      out.write("            <a href=\"index.html\" style=\"color: #fff\">Back</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
}
