/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.13
 * Generated at: 2023-09-27 06:17:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class CreateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/header.html", Long.valueOf(1695226473610L));
    _jspx_dependants.put("/CreateAccount.html", Long.valueOf(1695401334897L));
    _jspx_dependants.put("/footer.html", Long.valueOf(1695401082399L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<title>Admin Login</title>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"header.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<header>\r\n");
      out.write("		<nav>\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><a href=\"main.jsp\">Home</a></li>\r\n");
      out.write("				<li><a href=\"#\">Update Data</a></li>\r\n");
      out.write("				<li><a href=\"#\">Statement</a></li>\r\n");
      out.write("				<li><a href=\"Login.html\">Logout</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<title>Create New Account</title>\r\n");
      out.write("	<style>\r\n");
      out.write("		label {\r\n");
      out.write("			display: block;\r\n");
      out.write("			margin-bottom: 10px;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		input[type=text], input[type=number] {\r\n");
      out.write("			padding: 5px;\r\n");
      out.write("			margin-bottom: 20px;\r\n");
      out.write("			border: 1px solid #ccc;\r\n");
      out.write("			border-radius: 4px;\r\n");
      out.write("			box-sizing: border-box;\r\n");
      out.write("			width: 100%;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		input[type=submit] {\r\n");
      out.write("			background-color: #4CAF50;\r\n");
      out.write("			color: white;\r\n");
      out.write("			padding: 10px 20px;\r\n");
      out.write("			border: none;\r\n");
      out.write("			border-radius: 4px;\r\n");
      out.write("			cursor: pointer;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		input[type=submit]:hover {\r\n");
      out.write("			background-color: #45a049;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		.container {\r\n");
      out.write("			margin: auto;\r\n");
      out.write("			max-width: 600px;\r\n");
      out.write("			padding: 20px;\r\n");
      out.write("		}\r\n");
      out.write("	</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h2>Create Account</h2>\r\n");
      out.write("		<form action=\"create\" method=\"POST\">\r\n");
      out.write("			\r\n");
      out.write("			<label for=\"unique_id\">Unique  Id:</label>\r\n");
      out.write("			<input type=\"number\" id=\"U_ID\" name=\"U_ID\" maxlength=\"20\" required>\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			<label for=\"account_number\">Enter Account Number:</label>\r\n");
      out.write("			<input type=\"number\" id=\"account_number\" name=\"account_number\" maxlength=\"20\" required>\r\n");
      out.write("\r\n");
      out.write("			<label for=\"account\">Account Holder Name:</label>\r\n");
      out.write("			<input type=\"text\" id=\"amount\" name=\"account\" required>\r\n");
      out.write("\r\n");
      out.write("			<label for=\"date\">Account Opening Date:</label>\r\n");
      out.write("			<input type=\"date\" id=\"date\" name=\"date\" required> <br><br><br>\r\n");
      out.write("\r\n");
      out.write("			<input type=\"submit\" value=\"Submit\">\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("  var today = new Date().toISOString().slice(0, 10);\r\n");
      out.write("  document.getElementById(\"date\").setAttribute(\"value\", today);\r\n");
      out.write("  document.getElementById(\"date\").setAttribute(\"readonly\", true);\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("<footer>\r\n");
      out.write("    <div class=\"footer-Top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <h3>About Us</h3>\r\n");
      out.write("                    <p>Santosh Gawali.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                    <h3>Contact Us</h3>\r\n");
      out.write("                    <ul class=\"list-unstyled\">\r\n");
      out.write("                        <li><i class=\"fa fa-map-marker\"></i> Nanded, India</li>\r\n");
      out.write("                        <li><i class=\"fa fa-phone\"></i> +91-7378751690</li>\r\n");
      out.write("                        <li><i class=\"fa fa-envelope\"></i>santoshgawaliV@gmail.com</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"footer-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <p>Copyright Â© 2023\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}