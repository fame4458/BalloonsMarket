package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid\" style=\"background-color: darksalmon;height: 100vh;\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"container mt-5 text-center\" >\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 col-md-offset-3\">\r\n");
      out.write("                        <div class=\"panel panel-login\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <a href=\"#\" class=\"active\" id=\"login-form-link\">Login</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-6\">\r\n");
      out.write("                                        <a href=\"#\" id=\"register-form-link\">Register</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <hr>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-lg-12\">\r\n");
      out.write("                                        <form id=\"login-form\" action=\"https://phpoll.com/login/process\" method=\"post\" role=\"form\" style=\"display: block;\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group text-center\">\r\n");
      out.write("                                                <input type=\"checkbox\" tabindex=\"3\" class=\"\" name=\"remember\" id=\"remember\">\r\n");
      out.write("                                                <label for=\"remember\"> Remember Me</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-sm-6 col-sm-offset-3\">\r\n");
      out.write("                                                        <input style=\"color:#fff;background-color:peru;\" type=\"submit\" name=\"login-submit\" id=\"login-submit\" tabindex=\"4\" class=\"form-control btn btn-login\" value=\"Log In\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-lg-12\">\r\n");
      out.write("                                                        <div class=\"text-center\">\r\n");
      out.write("                                                            <a href=\"https://phpoll.com/recover\" tabindex=\"5\" class=\"forgot-password\">Forgot Password?</a>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        <form id=\"register-form\" action=\"https://phpoll.com/register/process\" method=\"post\" role=\"form\" style=\"display: none;\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"text\" name=\"username\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"email\" name=\"email\" id=\"email\" tabindex=\"1\" class=\"form-control\" placeholder=\"Email Address\" value=\"\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"password\" name=\"confirm-password\" id=\"confirm-password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Confirm Password\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-sm-6 col-sm-offset-3\">\r\n");
      out.write("                                                        <input type=\"submit\" name=\"register-submit\" id=\"register-submit\" tabindex=\"4\" class=\"form-control btn btn-register\" value=\"Register Now\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
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
}
