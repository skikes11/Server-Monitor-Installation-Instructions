/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-08-26 14:22:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://use.fontawesome.com/b32121c496.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("	background-image :url(\"https://cdn.wallpapersafari.com/88/95/tCaJ3V.jpg\");\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	font-family: sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".box-form{\r\n");
      out.write("	width: 340px;\r\n");
      out.write("	height: 380px;\r\n");
      out.write("	margin: 10% auto;\r\n");
      out.write("	top:0px;\r\n");
      out.write("	padding: 80px 30px;\r\n");
      out.write("	background-color: rgb(0,0,0);\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("h2{\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-bottom: 0px;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".input-box{\r\n");
      out.write("	margin: 10px;\r\n");
      out.write("	width: 95%;\r\n");
      out.write("	border-bottom: 1px solid #fff;\r\n");
      out.write("	padding-top: 1px;\r\n");
      out.write("	padding-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write(".input-box input{\r\n");
      out.write("width:  95%;\r\n");
      out.write("border: none;\r\n");
      out.write("outline: none;\r\n");
      out.write("background: transparent;\r\n");
      out.write("color: #fff; \r\n");
      out.write("}\r\n");
      out.write(".box-form button {\r\n");
      out.write("	color: #fbfcfd;\r\n");
      out.write("    padding: 10px 25px;\r\n");
      out.write("    background : transparent;\r\n");
      out.write("    border: 2px solid #fff;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    margin:  7px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-ss{\r\n");
      out.write("color: #fbfcfd;\r\n");
      out.write("    padding: 10px 25px;\r\n");
      out.write("    background : transparent;\r\n");
      out.write("    border: 2px solid #fff;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    margin:  7px;\r\n");
      out.write("}\r\n");
      out.write(".fa{\r\n");
      out.write("margin-left: 35px;\r\n");
      out.write("}\r\n");
      out.write(".btn-box{\r\n");
      out.write("margin-bottom: 75px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<section>\r\n");
      out.write("<div class=\"box-form\">\r\n");
      out.write(" <form action=\"login\" method=\"get\">\r\n");
      out.write(" <h2> Login  </h2>\r\n");
      out.write(" 	<table style=\"with: 100%\">\r\n");
      out.write(" 	<tr>\r\n");
      out.write(" 	 <td> \r\n");
      out.write(" 	  <i class=\"fa fa-user-o\" aria-hidden=\"true\"> </i> </td>\r\n");
      out.write("     <td>\r\n");
      out.write("   <div class=\"input-box\">  <input type=\"text\" name=\"username\" value=\"skikes11\" > </div>\r\n");
      out.write("     </td>  \r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td><i class=\"fa fa-key\" aria-hidden=\"true\"></i></td>\r\n");
      out.write("     <td>\r\n");
      out.write("     <div class=\"input-box\">\r\n");
      out.write("     <input type=\"password\"  name=\"password\"  value=\"123456bo\" >\r\n");
      out.write("     </div>\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   </table>\r\n");
      out.write("   	<div class=\"btn-box\">\r\n");
      out.write("   	<button type=\"submit\" > Login </button>\r\n");
      out.write("   	&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("   	<a href=\"registerPage\" class=\"btn-ss\"> Sign Up </a>\r\n");
      out.write("   	</div>\r\n");
      out.write("   </form>\r\n");
      out.write("   </div>\r\n");
      out.write("   </section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>	");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
