/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-05-28 23:32:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sistADD;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/github/RentCar/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MyBatisBasic_200521/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("jar:file:/D:/github/RentCar/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MyBatisBasic_200521/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1590057700728L));
  }

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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write(" \r\n");
      out.write("<html class=\"wide wow-animation\" lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Site Title-->\r\n");
      out.write("<title>SIST RENTCAR</title>\r\n");
      out.write("<!--     <meta name=\"format-detection\" content=\"telephone=no\"> -->\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, height=device-height, initial-scale=1.0\">\r\n");
      out.write("<!--     <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> -->\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- Stylesheets -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"//fonts.googleapis.com/css?family=Oswald:200,400%7CLato:300,400,300italic,700%7CMontserrat:900\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/fonts.css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"input#loginbtn\").click(function(){\r\n");
      out.write("\t\tif($(\"input#userId\").val().length==0){\r\n");
      out.write("\t\t\talert('정보를 입력해주세요');\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.loginFrm.submit();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("/* \t$(\"#idSave\").change(function(){\r\n");
      out.write("\t\tif($(#idSave).is(\":checked\")){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}); */\r\n");
      out.write("\t\r\n");
      out.write("\t/*  $(\"#idSaveCheck\").change(function(){ // 체크박스에 변화가 있다면,\r\n");
      out.write("        if($(\"#idSaveCheck\").is(\":checked\")){ // ID 저장하기 체크했을 때,\r\n");
      out.write("            var userInputId = $(\"input[name='id']\").val();\r\n");
      out.write("            setCookie(\"userInputId\", userInputId, 7); // 7일 동안 쿠키 보관\r\n");
      out.write("        }else{ // ID 저장하기 체크 해제 시,\r\n");
      out.write("            deleteCookie(\"userInputId\");\r\n");
      out.write("        }\r\n");
      out.write("    }); */\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\r\n");
      out.write("\tlabel{\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 10px;\r\n");
      out.write("\tfont-size: medium;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tform{\r\n");
      out.write("\tpadding-left: 40px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write(" html {\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tbody {\r\n");
      out.write("\t    width:100%;\r\n");
      out.write("\t    height:100%;\r\n");
      out.write("\t    margin: 0;\r\n");
      out.write("  \t\tpadding-top: 0px;\r\n");
      out.write("  \t\tpadding-bottom: 40px;\r\n");
      out.write("  \t\tfont-family: \"Nanum Gothic\", arial, helvetica, sans-serif;\r\n");
      out.write("  \t\tbackground-repeat: no-repeat;\r\n");
      out.write("  \t\tbackground:gray;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("    .card {\r\n");
      out.write("         margin: 0 auto; /* Added */\r\n");
      out.write("        float: none; /* Added */\r\n");
      out.write("        margin-bottom: 10px; /* Added */\r\n");
      out.write("        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\r\n");
      out.write("        padding-top: 10px;\r\n");
      out.write("        margin-top: 100px; \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.form-signin .form-control {\r\n");
      out.write("  \t\tposition: relative;\r\n");
      out.write("  \t\theight: auto;\r\n");
      out.write("  \t\t-webkit-box-sizing: border-box;\r\n");
      out.write("     \t-moz-box-sizing: border-box;\r\n");
      out.write("        \t box-sizing: border-box;\r\n");
      out.write("  \t\tpadding: 10px;\r\n");
      out.write("  \t\tfont-size: 16px;\r\n");
      out.write("\t}\r\n");
      out.write("form input#loginbtn{\r\n");
      out.write("margin-left: -20px;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!------------------ .page=전체 영역 ------------------->\r\n");
      out.write("\t<div class=\"page\">\r\n");
      out.write("\t\t<!------------------ Header ------------------->\r\n");
      out.write("\t\t<header class=\"section page-header\">\r\n");
      out.write("\t\t\t<div class=\"rd-navbar-wrap rd-navbar-corporate\">\r\n");
      out.write("\t\t\t\t<!----- 메뉴바 --------->\r\n");
      out.write("\t\t\t\t<nav class=\"rd-navbar\" id=\"menu\">\r\n");
      out.write("\t\t\t\t\t<div class=\"rd-navbar-inner\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 모바일 var - 메뉴토글-->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"rd-navbar-panel\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"rd-navbar-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-rd-navbar-toggle=\".rd-navbar-nav-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- logo -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"rd-navbar-brand\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"brand-name\" href=\"index.html\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"logo-default\" src=\"images/logo.png\" alt=\"\" width=\"208\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"46\" /><img class=\"logo-inverse\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"images/logo-inverse-208x46.png\" alt=\"\" width=\"208\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\theight=\"46\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- 웹 var. 메뉴바 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"rd-navbar-aside-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"rd-navbar-nav-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"rd-navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"#menu\">HOME</a> <!-- 예약하기/예약확인/ -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#branchGuide\">지점안내</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#reviews\">이용후기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"typography.html\">고객센터</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"rd-navbar-aside-right\">\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
/*추가*/
								if (session.getAttribute("id") == null) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"button button-sm button-secondary button-nina\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"login.jsp\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
									String userid = (String) session.getAttribute("id");
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"button button-sm button-secondary button-nina\" href=\"logoutPro.jsp\">Logout</a>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"button button-sm button-secondary button-nina\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"joinRentcar.jsp\">Join</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!------------------ 슬라이드 - 내용수정 --------------------->\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <h4>SIST RENT CAR</h4> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t<div class=\"card align-middle\" style=\"width:20rem; border-radius:20px;\">\r\n");
      out.write("\t\t<div class=\"card-title\" style=\"margin-top:20px;\">\r\n");
      out.write("\t\t\t<h2 class=\"card-title text-center\" style=\"color:#113366;\">LOGIN</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write(" \t<form id=\"loginFrm\"  class=\"form\" action=\"loginPro.jsp\"  name=\"loginFrm\" method=\"post\">\r\n");
      out.write("        <h5 class=\"form-signin-heading\">로그인 정보를 입력하세요</h5> <br>\r\n");
      out.write("        \r\n");
      out.write("       <label>아이디</label>\r\n");
      out.write("      \t <input type=\"text\" id=\"userId\" name=\"userId\" placeholder=\"아이디 입력\" maxlength=\"50\" autocomplete=\"off\" class=\"ui-autocomplete-input\">   <br>  \r\n");
      out.write("\t  <label>비밀번호</label>\r\n");
      out.write("\t     <input type=\"password\" id=\"userpassword\" name=\"userpassword\" maxlength=\"50\" autocomplete=\"off\">\r\n");
      out.write("       \r\n");
      out.write("         <div class=\"wrap-check\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--클릭시 label에 selected 클래스 추가-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"i-check\"><input type=\"checkbox\" name=\"idSave\" id=\"idSave\">아이디 저장</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("        <input type=\"submit\" id=\"loginbtn\" name=\"loginbtn\" class=\"btn btn-lg btn-primary btn-block\" value=\"로그인\"/> \r\n");
      out.write("      </form>\r\n");
      out.write("      \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"modal\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div><!--page전체  -->\r\n");
      out.write("\t<!-- Global Mailform Output-->\r\n");
      out.write("\t \r\n");
      out.write("\t<!-- Javascript-->\r\n");
      out.write("\t<script src=\"js/core.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/script.js\"></script>\r\n");
      out.write("\t<!-- coded by barber-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
