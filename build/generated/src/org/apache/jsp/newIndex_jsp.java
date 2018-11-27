package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Balloons Market</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Caveat:400,700\" rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                height: 100vh;\r\n");
      out.write("                width: 100vw;\r\n");
      out.write("                overflow-x: hidden; \r\n");
      out.write("                font-family: 'Caveat', cursive;\r\n");
      out.write("            }\r\n");
      out.write("            h1{\r\n");
      out.write("                font-family: 'Caveat', cursive;\r\n");
      out.write("            }\r\n");
      out.write("            h3{\r\n");
      out.write("                font-family: 'Caveat', cursive;\r\n");
      out.write("            }\r\n");
      out.write("            div{\r\n");
      out.write("                font-family: 'Caveat', cursive;\r\n");
      out.write("            }\r\n");
      out.write("            .carousel-item {\r\n");
      out.write("                height: 65vh;\r\n");
      out.write("                min-height: 300px;\r\n");
      out.write("                background: no-repeat center center scroll;\r\n");
      out.write("                -webkit-background-size: cover;\r\n");
      out.write("                -moz-background-size: cover;\r\n");
      out.write("                -o-background-size: cover;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/Navbar.jsp", out, false);
      out.write("\r\n");
      out.write("        <header>\r\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel mt-5\">\r\n");
      out.write("                <ol class=\"carousel-indicators\">\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                    <!-- Slide One - Set the background image for this slide in the line below -->\r\n");
      out.write("                    <div class=\"carousel-item active\" style=\"background-image: url('images/slide/slide1.jpg')\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Slide Two - Set the background image for this slide in the line below -->\r\n");
      out.write("                    <div class=\"carousel-item\" style=\"background-image: url('images/slide/slide2.jpg')\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Slide Three - Set the background image for this slide in the line below -->\r\n");
      out.write("                    <div class=\"carousel-item\" style=\"background-image: url('images/slide/slide3.jpg')\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"sr-only\">Next</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid text-light\" style=\"background-color: Peru  \">\r\n");
      out.write("            <div class=\"container text-center\" style=\"background-color: peru\">\r\n");
      out.write("                <h1>\r\n");
      out.write("                    Balloons Market\r\n");
      out.write("                </h1>\r\n");
      out.write("                <h3 style=\"margin-bottom: 0\">\r\n");
      out.write("                    Have a party Have a BALLOONS MARKET!\r\n");
      out.write("                </h3>   \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid\" style=\"background-color: darksalmon\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <p class=\"m-0 text-center text-white\">Copyright &copy; Balloons Market</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
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
