/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-05-21 10:48:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.PORTFOLIO.team.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"wide wow-animation\" lang=\"en\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$(\"button#btnsearch\").click(function(){\r\n");
      out.write("\t\t//alert('test');\r\n");
      out.write("\t\t$(\"form\").submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Site Title-->\r\n");
      out.write("    <title>SIST RENTCAR</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1.0\">\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write(" \t<!---------------------- Stylesheets ------------------->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=Oswald:200,400%7CLato:300,400,300italic,700%7CMontserrat:900\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fonts.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.c\r\n");
      out.write("\tom/css2?family=Nanum+Gothic+Coding&display=swap\" rel=\"stylesheet\">\r\n");
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
      out.write("                <div class=\"rd-navbar-brand\"><a class=\"brand-name\" href=\"index.html\"><img class=\"logo-default\" src=\"images/logo.png\" alt=\"\" width=\"208\" height=\"46\"/><img class=\"logo-inverse\" src=\"images/logo-inverse-208x46.png\" alt=\"\" width=\"208\" height=\"46\"/></a></div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- 웹 var. 메뉴바 -->\r\n");
      out.write("              <div class=\"rd-navbar-aside-center\">\r\n");
      out.write("                <div class=\"rd-navbar-nav-wrap\">\r\n");
      out.write("                  <ul class=\"rd-navbar-nav\">\r\n");
      out.write("                    <li class=\"active\"><a href=\"#\">HOME</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#reserve\">예약하기</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#community\">커뮤니티</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#review\">이용후기</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"rd-navbar-aside-right\">\r\n");
      out.write("              \t<a class=\"button button-sm button-secondary button-nina\" href=\"#\">Login</a>\r\n");
      out.write("              \t<a class=\"button button-sm button-secondary button-nina\" href=\"sub/join.jsp\">Join</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("      </header>\r\n");
      out.write("      <!------------------ 슬라이드 - 내용수정 --------------------->\r\n");
      out.write("      <section class=\"section\">\r\n");
      out.write("        <div class=\"swiper-form-wrap\">\r\n");
      out.write("          <div class=\"swiper-container swiper-slider swiper-slider_height-1 swiper-align-left swiper-align-left-custom context-dark bg-gray-darker\" data-loop=\"false\" data-autoplay=\"5500\" data-simulate-touch=\"false\" data-slide-effect=\"fade\">\r\n");
      out.write("            <div class=\"swiper-wrapper\">\r\n");
      out.write("              <div class=\"swiper-slide\" data-slide-bg=\"images/swiper-slide-1.jpg\">\r\n");
      out.write("                <div class=\"swiper-slide-caption\">\r\n");
      out.write("                  <div class=\"container container-bigger swiper-main-section\">\r\n");
      out.write("                    <div class=\"row row-fix justify-content-sm-center justify-content-md-start\">\r\n");
      out.write("                      <div class=\"col-md-6 col-lg-5 col-xl-4 col-xxl-5\">\r\n");
      out.write("                        <h3>Hundreds of Amazing Destinations</h3>\r\n");
      out.write("                        <div class=\"divider divider-decorate\"></div>\r\n");
      out.write("                        <p class=\"text-spacing-sm\">We offer a variety of destinations to travel to, ranging from exotic to some extreme ones. They include very popular countries and cities like Paris, Rio de Janeiro, Cairo and a lot of others.</p><a class=\"button button-default-outline button-nina button-sm\" href=\"#\">learn more</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"swiper-slide\" data-slide-bg=\"images/swiper-slide-2.jpg\">\r\n");
      out.write("                <div class=\"swiper-slide-caption\">\r\n");
      out.write("                  <div class=\"container container-bigger swiper-main-section\">\r\n");
      out.write("                    <div class=\"row row-fix justify-content-sm-center justify-content-md-start\">\r\n");
      out.write("                      <div class=\"col-md-6 col-lg-5 col-xl-4 col-xxl-5\">\r\n");
      out.write("                        <h3>The Trip of Your Dream</h3>\r\n");
      out.write("                        <div class=\"divider divider-decorate\"></div>\r\n");
      out.write("                        <p class=\"text-spacing-sm\">Our travel agency is ready to offer you an exciting vacation that is designed to fit your own needs and wishes. Whether it’s an exotic cruise or a trip to your favorite resort, you will surely have the best experience.</p><a class=\"button button-default-outline button-nina button-sm\" href=\"#\">learn more</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"swiper-slide\" data-slide-bg=\"images/swiper-slide-3.jpg\">\r\n");
      out.write("                <div class=\"swiper-slide-caption\">\r\n");
      out.write("                  <div class=\"container container-bigger swiper-main-section\">\r\n");
      out.write("                    <div class=\"row row-fix justify-content-sm-center justify-content-md-start\">\r\n");
      out.write("                      <div class=\"col-md-6 col-lg-5 col-xl-4 col-xxl-5\">\r\n");
      out.write("                        <h3>unique Travel Insights</h3>\r\n");
      out.write("                        <div class=\"divider divider-decorate\"></div>\r\n");
      out.write("                        <p class=\"text-spacing-sm\">Our team is ready to provide you with unique weekly travel insights that include photos, videos, and articles about untravelled tourist paths. We know everything about the places you’ve never been to!</p><a class=\"button button-default-outline button-nina button-sm\" href=\"#\">learn more</a>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 슬라이드 독바 -->\r\n");
      out.write("            <div class=\"swiper-pagination-wrap\">\r\n");
      out.write("              <div class=\"container container-bigger\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-sm-12\">\r\n");
      out.write("                    <div class=\"swiper-pagination\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!---------------- 예약 FORM -------------->\r\n");
      out.write("          <div class=\"container container-bigger form-request-wrap form-request-wrap-modern\">\r\n");
      out.write("            <div class=\"row row-fix justify-content-sm-center justify-content-lg-end\">\r\n");
      out.write("              <div class=\"col-lg-6 col-xxl-5\">\r\n");
      out.write("                <div class=\"form-request form-request-modern bg-gray-lighter novi-background\">\r\n");
      out.write("                  <!-- <h4>SIST RENT CAR</h4> --> \r\n");
      out.write("                  <form action=\"reserve.jsp\" class=\"rd-mailform form-fix\" id=\"reserve\" name=\"reserve\" method=\"post\">\r\n");
      out.write("                  <!-- 수정<form class=\"rd-mailform form-fix\" id=\"bookingBtn\"> -->\r\n");
      out.write("                    <div class=\"row row-20 row-fix\">\r\n");
      out.write("                      <div class=\"col-sm-12 col-lg-6\">\r\n");
      out.write("                        <label class=\"form-label-outside\">대여일시</label>\r\n");
      out.write("                        <div class=\"form-wrap form-wrap-validation\">\r\n");
      out.write("                          <!-- Select -->\r\n");
      out.write("                          <input class=\"form-input\" id=\"dateForm\" name=\"date1\" type=\"text\" data-time-picker=\"date\">\r\n");
      out.write("                          <label class=\"form-label\" for=\"dateForm\">날짜를 선택하세요.</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-sm-12 col-lg-6\">\r\n");
      out.write("                        <label class=\"form-label-outside\">반납일시</label>\r\n");
      out.write("                        <div class=\"form-wrap form-wrap-validation\">\r\n");
      out.write("                          <!-- Select -->\r\n");
      out.write("                          <input class=\"form-input\" id=\"dateForm\" name=\"date2\" type=\"text\" data-time-picker=\"date\">\r\n");
      out.write("                          <label class=\"form-label\" for=\"dateForm\">날짜를 선택하세요.</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-sm-12\">\r\n");
      out.write("                        <label class=\"form-label-outside\">대여지점</label>\r\n");
      out.write("                        <div class=\"form-wrap form-wrap-inline\">\r\n");
      out.write("                          <select class=\"form-input select-filter\" data-placeholder=\"All\" data-minimum-results-for-search=\"Infinity\" name=\"place\">\r\n");
      out.write("                            <option value=\"1\">전체보기</option>\r\n");
      out.write("                            <option value=\"2\">강남지점</option>\r\n");
      out.write("                            <option value=\"3\">잠실지점</option>\r\n");
      out.write("                            <option value=\"4\">구로지점</option>\r\n");
      out.write("                          </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"col-sm-12\">\r\n");
      out.write("                        <label class=\"form-label-outside\">차량유형</label>\r\n");
      out.write("                        <div class=\"form-wrap form-wrap-inline\">\r\n");
      out.write("                          <select class=\"form-input select-filter\" data-placeholder=\"All\" data-minimum-results-for-search=\"Infinity\" name=\"car\">\r\n");
      out.write("                            <option value=\"1\">전체보기</option>\r\n");
      out.write("                            <option value=\"2\">준중형</option>\r\n");
      out.write("                            <option value=\"3\">중형</option>\r\n");
      out.write("                            <option value=\"4\">대형</option>\r\n");
      out.write("                            <option value=\"5\">승합</option>\r\n");
      out.write("                          </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>                      \r\n");
      out.write("\r\n");
      out.write("                      <div class=\"col-sm-12\">\r\n");
      out.write("                        <label class=\"form-label-outside\">탑승인원</label>\r\n");
      out.write("                        <div class=\"form-wrap form-wrap-modern\">\r\n");
      out.write("                          <input class=\"form-input input-append\" id=\"form-element-stepper\" type=\"number\" min=\"0\" max=\"300\" value=\"2\"  name=\"people\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-wrap form-button\">\r\n");
      out.write("                      <button class=\"button button-block button-secondary\" type=\"submit\" id=\"btnsearch\">검색</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </form>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\t\r\n");
      out.write("      <section class=\"section section-variant-1 bg-default novi-background bg-cover\" id=\"community\"> \r\n");
      out.write("        <div class=\"container container-wide\">\r\n");
      out.write("          <div class=\"row row-fix justify-content-xl-end row-30 text-center text-xl-left\">\r\n");
      out.write("            <div class=\"col-xl-8\">\r\n");
      out.write("              <div class=\"parallax-text-wrap\">\r\n");
      out.write("                <h3>커뮤니티</h3><span class=\"parallax-text\">COMMUNITY     </span>\r\n");
      out.write("              </div>\r\n");
      out.write("              <hr class=\"divider divider-decorate\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row row-50\">\r\n");
      out.write("            <div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("              <article class=\"event-default-wrap\">\r\n");
      out.write("                <div class=\"event-default\">\r\n");
      out.write("                  <figure class=\"event-default-image\"><img src=\"images/landing-private-airlines-01-570x370.jpg\" alt=\"\" width=\"570\" height=\"370\"/>\r\n");
      out.write("                  </figure>\r\n");
      out.write("                  <div class=\"event-default-caption\"><a class=\"button button-xs button-secondary button-nina\" href=\"#\">learn more</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </article>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("              <article class=\"event-default-wrap\">\r\n");
      out.write("                <div class=\"event-default\">\r\n");
      out.write("                  <figure class=\"event-default-image\"><img src=\"images/landing-private-airlines-02-570x370.jpg\" alt=\"\" width=\"570\" height=\"370\"/>\r\n");
      out.write("                  </figure>\r\n");
      out.write("                  <div class=\"event-default-caption\"><a class=\"button button-xs button-secondary button-nina\" href=\"#\">learn more</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </article>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("              <article class=\"event-default-wrap\">\r\n");
      out.write("                <div class=\"event-default\">\r\n");
      out.write("                  <figure class=\"event-default-image\"><img src=\"images/landing-private-airlines-03-570x370.jpg\" alt=\"\" width=\"570\" height=\"370\"/>\r\n");
      out.write("                  </figure>\r\n");
      out.write("                  <div class=\"event-default-caption\"><a class=\"button button-xs button-secondary button-nina\" href=\"#\">learn more</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </article>\r\n");
      out.write("            </div>\r\n");
      out.write("<!--             <div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("              <article class=\"event-default-wrap\">\r\n");
      out.write("                <div class=\"event-default\">\r\n");
      out.write("                  <figure class=\"event-default-image\"><img src=\"images/landing-private-airlines-04-570x370.jpg\" alt=\"\" width=\"570\" height=\"370\"/>\r\n");
      out.write("                  </figure>\r\n");
      out.write("                  <div class=\"event-default-caption\"><a class=\"button button-xs button-secondary button-nina\" href=\"#\">learn more</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"event-default-inner\">\r\n");
      out.write("                  <h5><a class=\"event-default-title\" href=\"#\">Spain, Benidorm</a></h5><span class=\"heading-5\">from $350</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </article>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("              <article class=\"event-default-wrap\">\r\n");
      out.write("                <div class=\"event-default\">\r\n");
      out.write("                  <figure class=\"event-default-image\"><img src=\"images/landing-private-airlines-05-570x370.jpg\" alt=\"\" width=\"570\" height=\"370\"/>\r\n");
      out.write("                  </figure>\r\n");
      out.write("                  <div class=\"event-default-caption\"><a class=\"button button-xs button-secondary button-nina\" href=\"#\">learn more</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"event-default-inner\">\r\n");
      out.write("                  <h5><a class=\"event-default-title\" href=\"#\">Egypt,  Sharm El Sheikh</a></h5><span class=\"heading-5\">from $520</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </article>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("              <article class=\"event-default-wrap\">\r\n");
      out.write("                <div class=\"event-default\">\r\n");
      out.write("                  <figure class=\"event-default-image\"><img src=\"images/landing-private-airlines-06-570x370.jpg\" alt=\"\" width=\"570\" height=\"370\"/>\r\n");
      out.write("                  </figure>\r\n");
      out.write("                  <div class=\"event-default-caption\"><a class=\"button button-xs button-secondary button-nina\" href=\"#\">learn more</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"event-default-inner\">\r\n");
      out.write("                  <h5><a class=\"event-default-title\" href=\"#\">UK, London</a></h5><span class=\"heading-5\">from $600</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </article>\r\n");
      out.write("            </div> -->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("      <section class=\"section section-lg text-center bg-gray-lighter novi-background bg-cover\" id=\"review\">\r\n");
      out.write("        <div class=\"container container-bigger\">\r\n");
      out.write("          <h3>이용후기</h3>\r\n");
      out.write("          <div class=\"divider divider-decorate\"></div>\r\n");
      out.write("          <!-- Owl Carousel-->\r\n");
      out.write("          <div class=\"owl-carousel owl-layout-1\" data-items=\"1\" data-dots=\"true\" data-nav=\"true\" data-stage-padding=\"0\" data-loop=\"true\" data-margin=\"30\" data-mouse-drag=\"false\" data-autoplay=\"true\">\r\n");
      out.write("            <article class=\"quote-boxed\">\r\n");
      out.write("              <div class=\"quote-boxed-aside\"><img class=\"quote-boxed-image\" src=\"images/quote-user-1-210x210.jpg\" alt=\"\" width=\"210\" height=\"210\"/>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"quote-boxed-main\">\r\n");
      out.write("                <div class=\"quote-boxed-text\">\r\n");
      out.write("                  <p>I wanted to thank you very much for planning the trip to France for my boyfriend and me. It was amazing and exceeded my expectations! We had a wonderful time and were very pleased with the accommodations in Paris and Bayeux. Our private/small tour guides were fantastic! I appreciate all the effort to get us to the Eiffel Tower finally. </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"quote-boxed-meta\">\r\n");
      out.write("                  <p class=\"quote-boxed-cite\">Ann McMillan</p>\r\n");
      out.write("                  <p class=\"quote-boxed-small\">Regular Customer</p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </article>\r\n");
      out.write("            <article class=\"quote-boxed\">\r\n");
      out.write("              <div class=\"quote-boxed-aside\"><img class=\"quote-boxed-image\" src=\"images/quote-user-2-210x210.jpg\" alt=\"\" width=\"210\" height=\"210\"/>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"quote-boxed-main\">\r\n");
      out.write("                <div class=\"quote-boxed-text\">\r\n");
      out.write("                  <p>이용후기 내용.ㄴ맂마ㅓㅣ;ㅈ헉ㅁ히ㅓㄱ댷ㄷㄱ;호ㅑㅅ히ㅗㄴㄱㄷ해ㅑ;ㄷㄱ멓;ㄷ겋;ㄷㄱㅁ햐ㅓ;ㅓㅁㄷㅇㅎ;ㅣ</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"quote-boxed-meta\">\r\n");
      out.write("                  <p class=\"quote-boxed-cite\">이용지점</p>\r\n");
      out.write("                  <p class=\"quote-boxed-small\">사용자</p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </article>\r\n");
      out.write("            <article class=\"quote-boxed\">\r\n");
      out.write("              <div class=\"quote-boxed-aside\"><img class=\"quote-boxed-image\" src=\"images/quote-user-3-210x210.jpg\" alt=\"\" width=\"210\" height=\"210\"/>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"quote-boxed-main\">\r\n");
      out.write("                <div class=\"quote-boxed-text\">\r\n");
      out.write("                  <p>이용후기 내용.ㄴ맂마ㅓㅣ;ㅈ헉ㅁ히ㅓㄱ댷ㄷㄱ;호ㅑㅅ히ㅗㄴㄱㄷ해ㅑ;ㄷㄱ멓;ㄷ겋;ㄷㄱㅁ햐ㅓ;ㅓㅁㄷㅇㅎ;ㅣ</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"quote-boxed-meta\">\r\n");
      out.write("                  <p class=\"quote-boxed-cite\">이용지점</p>\r\n");
      out.write("                  <p class=\"quote-boxed-small\">사용자</p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </article>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-------------------------- Footer ---------------------->\r\n");
      out.write("      <footer class=\"section page-footer page-footer-minimal novi-background bg-cover text-center bg-gray-darker\">\r\n");
      out.write("        <div class=\"container container-wide\">\r\n");
      out.write("          <div class=\"row row-fix justify-content-sm-center align-items-md-center row-30\">\r\n");
      out.write("            <div class=\"col-md-10 col-lg-7 col-xl-4 text-xl-left\"><a href=\"index.html\"><img class=\"inverse-logo\" src=\"images/logo-inverse-208x46.png\" alt=\"\" width=\"208\" height=\"46\"/></a></div>\r\n");
      out.write("            <div class=\"col-md-10 col-lg-7 col-xl-4\">\r\n");
      out.write("              <p class=\"right\">가시안이며 비상업적 취업지원 포트폴리오 용도로만 사용됩니다.<br/>왼쪽 이니셜 클릭시 개별 email로 연결됩니다.</p>\r\n");
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
      out.write("    <script src=\"js/core.min.js\"></script>\r\n");
      out.write("    <script src=\"js/script.js\"></script>\r\n");
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
