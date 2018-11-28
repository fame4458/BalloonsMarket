package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Address_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <title>Address</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: darksalmon;color: #fff;font-family: 'Caveat', cursive;\">\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container contact\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\" style=\"background-color: peru\">\n");
      out.write("                    <div class=\"contact-info\">\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <img src=\"https://image.ibb.co/kUASdV/contact-image.png\" alt=\"image\"/>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <h2>Address</h2>\n");
      out.write("                        <br>\n");
      out.write("                        <h4>We would love to hear from you !</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div class=\"contact-form\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"fname\">First Name:</label>\n");
      out.write("                            <div class=\"col-sm-10\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"fname\" placeholder=\"Enter First Name\" name=\"fname\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"lname\">Last Name:</label>\n");
      out.write("                            <div class=\"col-sm-10\">          \n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"lname\" placeholder=\"Enter Last Name\" name=\"lname\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"tel\">Tel.:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"tel\" placeholder=\"Enter Tel.\" name=\"tel\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" for=\"address\">Address:</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <textarea class=\"form-control\" rows=\"5\" id=\"comment\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"Thank\" method=\"post\">\n");
      out.write("            <div class=\"col-lg-12 text-center\" >\n");
      out.write("                <input type=\"submit\" class=\"btn px-5 py-2 mt-3\"style=\"background-color: peru; color: #fff\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div class=\"m-2 text-center\">\n");
      out.write("            <a href=\"Cart.jsp\" style=\"color: #fff\">Back</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("       <!--pop up Code-->\n");
      out.write("        <div class=\"popup\" onclick=\"myFunction()\">Click me!\n");
      out.write("            <span class=\"popuptext\" id=\"myPopup\">Thank You</span>\n");
      out.write("        </div>\n");
      out.write("\n");
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
