/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-11 02:41:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bayberry_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>bayberry</title>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\"/>\r\n");
      out.write("    <link href=\"resources/css/jquery-ui-themes.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"resources/css/axure_rp_page.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"data/styles.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"files/bayberry/styles.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <script src=\"resources/scripts/jquery-1.7.1.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/jquery-ui-1.8.10.custom.min.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/axQuery.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/globals.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axutils.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/annotation.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/axQuery.std.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/doc.js\"></script>\r\n");
      out.write("    <script src=\"data/document.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/messagecenter.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/events.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/recording.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/action.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/expr.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/geometry.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/flyout.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/ie.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/model.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/repeater.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/sto.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/utils.temp.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/variables.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/drag.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/move.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/visibility.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/style.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/adaptive.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/tree.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/init.temp.js\"></script>\r\n");
      out.write("    <script src=\"files/bayberry/data.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/legacy.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/viewer.js\"></script>\r\n");
      out.write("    <script src=\"resources/scripts/axure/math.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };\r\n");
      out.write("      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };\r\n");
      out.write("      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"base\" class=\"\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Unnamed (图片) -->\r\n");
      out.write("      <div id=\"u383\" class=\"ax_default image\">\r\n");
      out.write("        <img id=\"u383_img\" class=\"img \" src=\"images/index/u105.jpg\"/>\r\n");
      out.write("        <!-- Unnamed () -->\r\n");
      out.write("        <div id=\"u384\" class=\"text\" style=\"display: none; visibility: hidden\">\r\n");
      out.write("          <p><span></span></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Unnamed (菜单) -->\r\n");
      out.write("      <div id=\"u385\" class=\"ax_default\">\r\n");
      out.write("        <img id=\"u385_menu\" class=\"img \" src=\"images/beef/u193_menu.png\" alt=\"u385_menu\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- Unnamed (表格) -->\r\n");
      out.write("        <div id=\"u386\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u387\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u387_img\" class=\"img \" src=\"images/beef/u195.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u388\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>所有产品分类</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u389\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u389_img\" class=\"img \" src=\"images/beef/u197.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u390\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>首页</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u391\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u391_img\" class=\"img \" src=\"images/beef/u197.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u392\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>购物车</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u393\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u393_img\" class=\"img \" src=\"images/beef/u201.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u394\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>收藏夹</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u395\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u395_img\" class=\"img \" src=\"images/beef/u203.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u396\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>关于我们</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Unnamed (菜单) -->\r\n");
      out.write("        <div id=\"u397\" class=\"ax_default sub_menu\">\r\n");
      out.write("          <img id=\"u397_menu\" class=\"img \" src=\"images/beef/u205_menu.png\" alt=\"u397_menu\"/>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (表格) -->\r\n");
      out.write("          <div id=\"u398\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (Menu Item) -->\r\n");
      out.write("            <div id=\"u399\" class=\"ax_default menu_item\">\r\n");
      out.write("              <img id=\"u399_img\" class=\"img \" src=\"images/beef/u207.png\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u400\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>肉类休闲零食</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (Menu Item) -->\r\n");
      out.write("            <div id=\"u401\" class=\"ax_default menu_item\">\r\n");
      out.write("              <img id=\"u401_img\" class=\"img \" src=\"images/beef/u207.png\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u402\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>糕点</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (Menu Item) -->\r\n");
      out.write("            <div id=\"u403\" class=\"ax_default menu_item\">\r\n");
      out.write("              <img id=\"u403_img\" class=\"img \" src=\"images/beef/u211.png\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u404\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>果干</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (菜单) -->\r\n");
      out.write("          <div id=\"u405\" class=\"ax_default sub_menu\">\r\n");
      out.write("            <img id=\"u405_menu\" class=\"img \" src=\"images/beef/u205_menu.png\" alt=\"u405_menu\"/>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (表格) -->\r\n");
      out.write("            <div id=\"u406\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u407\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u407_img\" class=\"img \" src=\"images/beef/u207.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u408\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>牛肉类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u409\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u409_img\" class=\"img \" src=\"images/beef/u207.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u410\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>猪肉类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u411\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u411_img\" class=\"img \" src=\"images/beef/u211.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u412\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>鸡鸭/禽肉类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (菜单) -->\r\n");
      out.write("            <div id=\"u413\" class=\"ax_default sub_menu\">\r\n");
      out.write("              <img id=\"u413_menu\" class=\"img \" src=\"images/beef/u221_menu.png\" alt=\"u413_menu\"/>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (表格) -->\r\n");
      out.write("              <div id=\"u414\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Unnamed (Menu Item) -->\r\n");
      out.write("                <div id=\"u415\" class=\"ax_default menu_item\">\r\n");
      out.write("                  <img id=\"u415_img\" class=\"img \" src=\"images/beef/u211.png\"/>\r\n");
      out.write("                  <!-- Unnamed () -->\r\n");
      out.write("                  <div id=\"u416\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                    <p><span>牛肉干</span></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (菜单) -->\r\n");
      out.write("          <div id=\"u417\" class=\"ax_default sub_menu\">\r\n");
      out.write("            <img id=\"u417_menu\" class=\"img \" src=\"images/beef/u205_menu.png\" alt=\"u417_menu\"/>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (表格) -->\r\n");
      out.write("            <div id=\"u418\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u419\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u419_img\" class=\"img \" src=\"images/beef/u207.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u420\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>传统糕点</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u421\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u421_img\" class=\"img \" src=\"images/beef/u207.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u422\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>西式糕点</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u423\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u423_img\" class=\"img \" src=\"images/beef/u211.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u424\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>其它糕点</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (菜单) -->\r\n");
      out.write("            <div id=\"u425\" class=\"ax_default sub_menu\">\r\n");
      out.write("              <img id=\"u425_menu\" class=\"img \" src=\"images/beef/u221_menu.png\" alt=\"u425_menu\"/>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (表格) -->\r\n");
      out.write("              <div id=\"u426\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Unnamed (Menu Item) -->\r\n");
      out.write("                <div id=\"u427\" class=\"ax_default menu_item\">\r\n");
      out.write("                  <img id=\"u427_img\" class=\"img \" src=\"images/beef/u211.png\"/>\r\n");
      out.write("                  <!-- Unnamed () -->\r\n");
      out.write("                  <div id=\"u428\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                    <p><span>蒸蛋糕</span></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (菜单) -->\r\n");
      out.write("          <div id=\"u429\" class=\"ax_default sub_menu\">\r\n");
      out.write("            <img id=\"u429_menu\" class=\"img \" src=\"images/beef/u205_menu.png\" alt=\"u429_menu\"/>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (表格) -->\r\n");
      out.write("            <div id=\"u430\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u431\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u431_img\" class=\"img \" src=\"images/beef/u207.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u432\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>梅类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u433\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u433_img\" class=\"img \" src=\"images/beef/u207.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u434\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>枣类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u435\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u435_img\" class=\"img \" src=\"images/beef/u211.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u436\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>山楂制品</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (菜单) -->\r\n");
      out.write("            <div id=\"u437\" class=\"ax_default sub_menu\">\r\n");
      out.write("              <img id=\"u437_menu\" class=\"img \" src=\"images/beef/u221_menu.png\" alt=\"u437_menu\"/>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (表格) -->\r\n");
      out.write("              <div id=\"u438\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Unnamed (Menu Item) -->\r\n");
      out.write("                <div id=\"u439\" class=\"ax_default menu_item\">\r\n");
      out.write("                  <img id=\"u439_img\" class=\"img \" src=\"images/beef/u211.png\"/>\r\n");
      out.write("                  <!-- Unnamed () -->\r\n");
      out.write("                  <div id=\"u440\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                    <p><span>三只松鼠杨梅</span></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- 价格 (动态面板) -->\r\n");
      out.write("      <div id=\"u441\" class=\"ax_default\" data-label=\"价格\">\r\n");
      out.write("        <div id=\"u441_state0\" class=\"panel_state\" data-label=\"State1\">\r\n");
      out.write("          <div id=\"u441_state0_content\" class=\"panel_state_content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u442\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u442_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u443\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>三只松鼠 草莓干106g 休闲食品零食食品果脯草莓脯</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u444\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u444_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u445\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p style=\"font-size:28px;\"><span style=\"font-size:18px;\">￥</span><span>22.90</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u446\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u446_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u447\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>价格</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u448\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u448_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u449\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>重量</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u450\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u450_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u451\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>0.106kg</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (水平线) -->\r\n");
      out.write("            <div id=\"u452\" class=\"ax_default line\">\r\n");
      out.write("              <img id=\"u452_img\" class=\"img \" src=\"images/beef/u260.png\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u453\" class=\"text\" style=\"display: none; visibility: hidden\">\r\n");
      out.write("                <p><span></span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u454\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u454_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u455\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>数量</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (提交按钮) -->\r\n");
      out.write("            <div id=\"u456\" class=\"ax_default html_button\">\r\n");
      out.write("              <input id=\"u456_input\" type=\"submit\" value=\"加入购物车\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (组合) -->\r\n");
      out.write("            <div id=\"u457\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (文本框) -->\r\n");
      out.write("              <div id=\"u458\" class=\"ax_default text_field\">\r\n");
      out.write("                <input id=\"u458_input\" type=\"text\" value=\"\"/>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (矩形) -->\r\n");
      out.write("              <div id=\"u459\" class=\"ax_default button\">\r\n");
      out.write("                <div id=\"u459_div\" class=\"\"></div>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u460\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>+1</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (矩形) -->\r\n");
      out.write("              <div id=\"u461\" class=\"ax_default button\">\r\n");
      out.write("                <div id=\"u461_div\" class=\"\"></div>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u462\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>-1</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- 介绍 (动态面板) -->\r\n");
      out.write("      <div id=\"u463\" class=\"ax_default\" data-label=\"介绍\">\r\n");
      out.write("        <div id=\"u463_state0\" class=\"panel_state\" data-label=\"State1\">\r\n");
      out.write("          <div id=\"u463_state0_content\" class=\"panel_state_content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u464\" class=\"ax_default _一级标题\">\r\n");
      out.write("              <div id=\"u464_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u465\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>商品详情</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u466\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u466_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u467\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span style=\"color:#FF0000;\">商品名称：三只松鼠 草莓干106g 休闲食品零食食品果脯草莓脯</span></p><p><span style=\"color:#FF0000;\">商品编号：1593025426&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 店铺： 三只松鼠旗舰店商品</span></p><p><span style=\"color:#FF0000;\">毛重：212.00g&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 等级：其它</span></p><p><span style=\"color:#FF0000;\">国产/进口：国产&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 加工工艺：果脯类</span></p><p><span style=\"color:#FF0000;\">包装单位：袋装&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 分类：话梅类</span></p><p><span style=\"color:#FF0000;\">产品产地：中国大陆</span></p><p><span><br></span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (图片) -->\r\n");
      out.write("            <div id=\"u468\" class=\"ax_default image\">\r\n");
      out.write("              <img id=\"u468_img\" class=\"img \" src=\"images/bayberry/u468.jpg\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u469\" class=\"text\" style=\"display: none; visibility: hidden\">\r\n");
      out.write("                <p><span></span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Unnamed (图片) -->\r\n");
      out.write("      <div id=\"u470\" class=\"ax_default image\">\r\n");
      out.write("        <img id=\"u470_img\" class=\"img \" src=\"images/beef/u284.png\"/>\r\n");
      out.write("        <!-- Unnamed () -->\r\n");
      out.write("        <div id=\"u471\" class=\"text\" style=\"display: none; visibility: hidden\">\r\n");
      out.write("          <p><span></span></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
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