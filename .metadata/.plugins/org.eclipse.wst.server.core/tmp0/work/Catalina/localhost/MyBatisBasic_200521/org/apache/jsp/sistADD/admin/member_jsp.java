/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-05-29 05:43:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sistADD.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import dao.MemberDao;
import model.MemberBean;

public final class member_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dao.MemberDao");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("model.MemberBean");
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"wide wow-animation\" lang=\"en\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Site Title-->\r\n");
      out.write("    <title>Admin var.SIST RENTCAR</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1.0\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write(" \t<!---------------------- Stylesheets ------------------->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=Oswald:200,400%7CLato:300,400,300italic,700%7CMontserrat:900\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/fonts.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.smallBtn{\r\n");
      out.write("\t\tmargin: 0 auto;\r\n");
      out.write("\t    float: right;\r\n");
      out.write("\t    padding: 3px 0px;\r\n");
      out.write("\t    min-width: 100px;\r\n");
      out.write("\t    margin-right: 5px;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("   //최상단 체크박스 클릭\r\n");
      out.write("\t    $(\"#checkall\").click(function(){\r\n");
      out.write("\t        //클릭되었으면\r\n");
      out.write("\t    \t if ($(\"#checkall\").is(':checked')) {\r\n");
      out.write("\t                $(\"input[type=checkbox]\").prop(\"checked\", true);\r\n");
      out.write("\t            } else {\r\n");
      out.write("\t                $(\"input[type=checkbox]\").prop(\"checked\", false);\r\n");
      out.write("\t            }\r\n");
      out.write("\t        \r\n");
      out.write("\t        \r\n");
      out.write("\r\n");
      out.write("\t \t    $(\"#checkall\").click(function(){\r\n");
      out.write("\t \t    \t var chk = $(\"#checkall\").prop(\"checked\");\r\n");
      out.write("\t \t    \t if(chk) {\r\n");
      out.write("\t \t    \t  $(\"input[type=checkbox]\").prop(\"checked\", true);\r\n");
      out.write("\t \t    \t } else {\r\n");
      out.write("\t \t    \t  $(\"input[type=checkbox]\").prop(\"checked\", false);\r\n");
      out.write("\t \t    \t }\r\n");
      out.write("\t \t    \t});\r\n");
      out.write("\t \t\r\n");
      out.write("\t \t    $(\"input[type=checkbox]\").click(function(){\r\n");
      out.write("\t \t    \t  $(\"#checkall\").prop(\"checked\", false);\r\n");
      out.write("\t \t    \t });\r\n");
      out.write("\t        \r\n");
      out.write("\t    });\r\n");
      out.write("\t \r\n");
      out.write("\t    $('input[type=checkbox]:input[value=\"no\"]').prop(\"checked\", true);  \r\n");
      out.write("\t    \r\n");
      out.write("\t });\r\n");
      out.write("\t    \r\n");
      out.write("\t\t\t  function onMemberDelete(no){\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  var memberChk = document.getElementsByName(\"deleteMember\");\r\n");
      out.write("\t\t\t\t  var chked = false;\r\n");
      out.write("\t\t\t\t  var indexid = false;\r\n");
      out.write("\t\t\t\t  for(i=0; i < memberChk.length; i++){\r\n");
      out.write("\t\t\t\t   if(memberChk[i].checked){\r\n");
      out.write("\t\t\t\t    if(indexid){\r\n");
      out.write("\t\t\t\t      no = no + '-';\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\t\t\t\t    no = no + memberChk[i].value;\r\n");
      out.write("\t\t\t\t    indexid = true;\r\n");
      out.write("\t\t\t\t   }\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  if(!indexid){\r\n");
      out.write("\t\t\t\t   alert(\"삭제할 사용자를 체크해 주세요\");\r\n");
      out.write("\t\t\t\t   return;\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  document.userForm.delUserid.value = no;       // 체크된 사용자 아이디를 '-'로 묶은 userid 를      document.userForm.delUserid 의 value로 저장\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  var agree=confirm(\"삭제 하시겠습니까?\");\r\n");
      out.write("\t\t\t\t     if (agree){\r\n");
      out.write("\t\t\t\t   document.userForm.execute.value = \"userDel\";\r\n");
      out.write("\t\t\t\t     document.userForm.submit();\r\n");
      out.write("\t\t\t\t     }\r\n");
      out.write("\t\t\t\t  }﻿\r\n");
      out.write("\t    \r\n");
      out.write("\t    \r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\t function onMemberDelete(no) {\r\n");
      out.write("\t\t alert('onMemberDelete 삭제? = ' + no) \r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <!------------------ .page=전체 영역 ------------------->\r\n");
      out.write("    <div class=\"page\" id=\"page\">\r\n");
      out.write("      <!------------------ Header ------------------->\r\n");
      out.write("      <header class=\"section page-header\">\r\n");
      out.write("        <div class=\"rd-navbar-wrap rd-navbar-corporate\">\r\n");
      out.write("          <!----- 메뉴바 --------->\r\n");
      out.write("          <nav class=\"rd-navbar\"  id=\"menu\">\r\n");
      out.write("            <div class=\"rd-navbar-inner\">\r\n");
      out.write("              <!-- 모바일 var - 메뉴토글-->\r\n");
      out.write("              <div class=\"rd-navbar-panel\">\r\n");
      out.write("                <button class=\"rd-navbar-toggle\" data-rd-navbar-toggle=\".rd-navbar-nav-wrap\"><span></span></button>\r\n");
      out.write("                <!-- logo -->\r\n");
      out.write("                <div class=\"rd-navbar-brand\"><a class=\"brand-name\" href=\"../adminIndex.jsp\"><img class=\"logo-default\" src=\"../images/logo.png\" alt=\"\" width=\"208\" height=\"46\"/><img class=\"logo-inverse\" src=\"../images/logo-inverse-208x46.png\" alt=\"\" width=\"208\" height=\"46\"/></a></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- 웹 var. 메뉴바 -->\r\n");
      out.write("              <div class=\"rd-navbar-aside-center\">\r\n");
      out.write("                <div class=\"rd-navbar-nav-wrap\">\r\n");
      out.write("                  <ul class=\"rd-navbar-nav\">\r\n");
      out.write("                    <li><a href=\"#\">회원관리</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">예약관리</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"office.jsp\">지점관리</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">차량관리</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">게시판관리</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">통계</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"rd-navbar-aside-right\">\r\n");
      out.write("               \r\n");
      out.write("              \t");
/*추가*/
								if (session.getAttribute("id") == null) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"button button-sm button-secondary button-nina\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"login.jsp\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} else {
									String userid = (String) session.getAttribute("id");
									
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<b>");
      out.print(userid);
      out.write("님 환영합니다</b>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"button button-sm button-secondary button-nina\" href=\"logoutPro.jsp\">Logout</a>\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"button button-sm button-secondary button-nina\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"joinRentcar.jsp\">Join</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("      </header>\r\n");
      out.write("     \r\n");
      out.write("     <!------------------------------ 내용입력 ------------------------>\r\n");
      out.write("    <section class=\"section section-lg bg-gray-lighter novi-background bg-cover text-center\" id=\"reviews\">\r\n");
      out.write("    <form name=\"userForm\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t  <div>\r\n");
      out.write("\t\t   <h2>회원 목록</h2>\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t    ");

		    
		    List<MemberBean> list = null;
		    HashMap<String, Object> map = new HashMap<String, Object>();
			list = MemberDao.selectMember(map);
		    
			

			 
		    
      out.write("\r\n");
      out.write("\t\t <!--  <p>The .table-hover class enables a hover state on table rows:</p>    -->         \r\n");
      out.write("\t\t  <table class=\"table table-hover\">\r\n");
      out.write("\t\t    <thead>\r\n");
      out.write("\t\t      <tr>\r\n");
      out.write("\t\t        <th><input type=\"checkbox\" id=\"checkall\"/></th>\r\n");
      out.write("\t\t        <th>번호</th>\r\n");
      out.write("\t\t        <th>아이디</th>\r\n");
      out.write("\t\t        <th>성명</th>\r\n");
      out.write("\t\t        <th>주소</th>\r\n");
      out.write("\t\t        <th>전화번호</th>\r\n");
      out.write("\t\t        <th>메일</th>\r\n");
      out.write("\t\t        <th>생년월일</th>\r\n");
      out.write("\t\t      </tr>\r\n");
      out.write("\t\t    </thead>\r\n");
      out.write(" \r\n");
      out.write("               \r\n");
      out.write("\t\t    <tbody>\r\n");
      out.write("\t\t       ");

		       
		       
		       
		       for (MemberBean b : list) {	  
		    	  
		       
      out.write("\r\n");
      out.write("\t\t    \t<tr>\r\n");
      out.write("\t\t\t        <td><input type=\"checkbox\" id=\"check\" value=\"");
b.getMemno();
      out.write("\"/></td>\r\n");
      out.write("\t\t\t        <td>");
      out.print(b.getMemno() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print(b.getMemid() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print(b.getMname() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print(b.getMadress() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print(b.getMemtel() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print(b.getMemail() );
      out.write("</td>\r\n");
      out.write("\t\t\t        <td>");
      out.print(b.getMbirth());
      out.write("</td>\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t         \r\n");
      out.write(" \r\n");
      out.write("\t\t\t        <td>\r\n");
      out.write("\t\t\t        \t<a class=\"button button-sm button-secondary button-nina smallBtn\" href=\"#\">선택수정</a>\r\n");
      out.write("\t\t\t  \t\t\t<a class=\"button button-sm button-secondary button-nina smallBtn\" href=\"#\" name=\"deleteMember\" id=\"deleteMember\" onclick=\"onMemberDelete(");
      out.print(b.getMemno() );
      out.write(")\">선택삭제</a>\r\n");
      out.write("\t\t\t        </td>\r\n");
      out.write("\t\t      \t</tr>\r\n");
      out.write(" ");

		       }
 
      out.write("\r\n");
      out.write("\t\t    </tbody>\r\n");
      out.write("\t\t  </table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</section>\r\n");
      out.write(" \r\n");
      out.write("      <!-------------------------- Footer ---------------------->\r\n");
      out.write("      <footer class=\"section page-footer page-footer-minimal novi-background bg-cover text-center bg-gray-darker\">\r\n");
      out.write("        <div class=\"container container-wide\">\r\n");
      out.write("          <div class=\"row row-fix justify-content-sm-center align-items-md-center row-30\">\r\n");
      out.write("            <div class=\"col-md-10 col-lg-7 col-xl-4 text-xl-left\"><a href=\"../adminIndex.jsp\"><img class=\"inverse-logo\" src=\"../images/logo-inverse-208x46.png\" alt=\"\" width=\"208\" height=\"46\"/></a></div>\r\n");
      out.write("            <div class=\"col-md-10 col-lg-7 col-xl-4\">\r\n");
      out.write("              <p class=\"right\">가시안이며 비상업적 취업지원 포트폴리오 용도로만 사용됩니다.<br/>오른쪽 이니셜 클릭시 개별 email로 연결됩니다.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-10 col-lg-7 col-xl-4 text-xl-right\">\r\n");
      out.write("              <ul class=\"group-xs group-middle\"> \r\n");
      out.write("                <li><a class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi\" href=\"#\">CHJ</a></li>\r\n");
      out.write("                <li><a class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi\" href=\"#\">PIC</a></li>\r\n");
      out.write("                <li><a class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi\" href=\"#\">YMM</a></li>\r\n");
      out.write("                <li><a class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi\" href=\"#\">CSH</a></li>\r\n");
      out.write("                <li><a class=\"icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi\" href=\"#\">LHJ</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Global Mailform Output-->\r\n");
      out.write("    <div class=\"snackbars\" id=\"form-output-global\"> </div>\r\n");
      out.write("    <!-- Javascript-->\r\n");
      out.write("    <script src=\"../js/core.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/script.js\"></script>\r\n");
      out.write("    <!-- coded by barber-->\r\n");
      out.write("  </body>\r\n");
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
