/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-11 02:41:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class beef_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>beef</title>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\"/>\r\n");
      out.write("    <link href=\"resources/css/jquery-ui-themes.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"resources/css/axure_rp_page.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"data/styles.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <link href=\"files/beef/styles.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n");
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
      out.write("    <script src=\"files/beef/data.js\"></script>\r\n");
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
      out.write("      <div id=\"u226\" class=\"ax_default image\">\r\n");
      out.write("        <img id=\"u226_img\" class=\"img \" src=\"images/index/u103.jpg\"/>\r\n");
      out.write("        <!-- Unnamed () -->\r\n");
      out.write("        <div id=\"u227\" class=\"text\" style=\"display: none; visibility: hidden\">\r\n");
      out.write("          <p><span></span></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Unnamed (菜单) -->\r\n");
      out.write("      <div id=\"u228\" class=\"ax_default\">\r\n");
      out.write("        <img id=\"u228_menu\" class=\"img \" src=\"images/beef/u228_menu.png\" alt=\"u228_menu\"/>\r\n");
      out.write("\r\n");
      out.write("        <!-- Unnamed (表格) -->\r\n");
      out.write("        <div id=\"u229\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u230\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u230_img\" class=\"img \" src=\"images/beef/u230.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u231\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>所有产品分类</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u232\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u232_img\" class=\"img \" src=\"images/beef/u232.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u233\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>首页</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u234\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u234_img\" class=\"img \" src=\"images/beef/u232.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u235\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>购物车</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u236\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u236_img\" class=\"img \" src=\"images/beef/u236.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u237\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>收藏夹</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (Menu Item) -->\r\n");
      out.write("          <div id=\"u238\" class=\"ax_default menu_item\">\r\n");
      out.write("            <img id=\"u238_img\" class=\"img \" src=\"images/beef/u238.png\"/>\r\n");
      out.write("            <!-- Unnamed () -->\r\n");
      out.write("            <div id=\"u239\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("              <p><span>关于我们</span></p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Unnamed (菜单) -->\r\n");
      out.write("        <div id=\"u240\" class=\"ax_default sub_menu\">\r\n");
      out.write("          <img id=\"u240_menu\" class=\"img \" src=\"images/beef/u240_menu.png\" alt=\"u240_menu\"/>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (表格) -->\r\n");
      out.write("          <div id=\"u241\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (Menu Item) -->\r\n");
      out.write("            <div id=\"u242\" class=\"ax_default menu_item\">\r\n");
      out.write("              <img id=\"u242_img\" class=\"img \" src=\"images/beef/u242.png\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u243\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>肉类休闲零食</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (Menu Item) -->\r\n");
      out.write("            <div id=\"u244\" class=\"ax_default menu_item\">\r\n");
      out.write("              <img id=\"u244_img\" class=\"img \" src=\"images/beef/u242.png\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u245\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>糕点</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (Menu Item) -->\r\n");
      out.write("            <div id=\"u246\" class=\"ax_default menu_item\">\r\n");
      out.write("              <img id=\"u246_img\" class=\"img \" src=\"images/beef/u246.png\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u247\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>果干</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (菜单) -->\r\n");
      out.write("          <div id=\"u248\" class=\"ax_default sub_menu\">\r\n");
      out.write("            <img id=\"u248_menu\" class=\"img \" src=\"images/beef/u240_menu.png\" alt=\"u248_menu\"/>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (表格) -->\r\n");
      out.write("            <div id=\"u249\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u250\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u250_img\" class=\"img \" src=\"images/beef/u242.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u251\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>牛肉类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u252\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u252_img\" class=\"img \" src=\"images/beef/u242.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u253\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>猪肉类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u254\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u254_img\" class=\"img \" src=\"images/beef/u246.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u255\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>鸡鸭/禽肉类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (菜单) -->\r\n");
      out.write("            <div id=\"u256\" class=\"ax_default sub_menu\">\r\n");
      out.write("              <img id=\"u256_menu\" class=\"img \" src=\"images/beef/u256_menu.png\" alt=\"u256_menu\"/>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (表格) -->\r\n");
      out.write("              <div id=\"u257\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Unnamed (Menu Item) -->\r\n");
      out.write("                <div id=\"u258\" class=\"ax_default menu_item\">\r\n");
      out.write("                  <img id=\"u258_img\" class=\"img \" src=\"images/beef/u246.png\"/>\r\n");
      out.write("                  <!-- Unnamed () -->\r\n");
      out.write("                  <div id=\"u259\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                    <p><span>牛肉干</span></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (菜单) -->\r\n");
      out.write("          <div id=\"u260\" class=\"ax_default sub_menu\">\r\n");
      out.write("            <img id=\"u260_menu\" class=\"img \" src=\"images/beef/u240_menu.png\" alt=\"u260_menu\"/>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (表格) -->\r\n");
      out.write("            <div id=\"u261\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u262\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u262_img\" class=\"img \" src=\"images/beef/u242.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u263\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>传统糕点</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u264\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u264_img\" class=\"img \" src=\"images/beef/u242.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u265\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>西式糕点</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u266\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u266_img\" class=\"img \" src=\"images/beef/u246.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u267\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>其它糕点</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (菜单) -->\r\n");
      out.write("            <div id=\"u268\" class=\"ax_default sub_menu\">\r\n");
      out.write("              <img id=\"u268_menu\" class=\"img \" src=\"images/beef/u256_menu.png\" alt=\"u268_menu\"/>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (表格) -->\r\n");
      out.write("              <div id=\"u269\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Unnamed (Menu Item) -->\r\n");
      out.write("                <div id=\"u270\" class=\"ax_default menu_item\">\r\n");
      out.write("                  <img id=\"u270_img\" class=\"img \" src=\"images/beef/u246.png\"/>\r\n");
      out.write("                  <!-- Unnamed () -->\r\n");
      out.write("                  <div id=\"u271\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                    <p><span>蒸蛋糕</span></p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- Unnamed (菜单) -->\r\n");
      out.write("          <div id=\"u272\" class=\"ax_default sub_menu\">\r\n");
      out.write("            <img id=\"u272_menu\" class=\"img \" src=\"images/beef/u240_menu.png\" alt=\"u272_menu\"/>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (表格) -->\r\n");
      out.write("            <div id=\"u273\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u274\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u274_img\" class=\"img \" src=\"images/beef/u242.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u275\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>梅类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u276\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u276_img\" class=\"img \" src=\"images/beef/u242.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u277\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>枣类</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (Menu Item) -->\r\n");
      out.write("              <div id=\"u278\" class=\"ax_default menu_item\">\r\n");
      out.write("                <img id=\"u278_img\" class=\"img \" src=\"images/beef/u246.png\"/>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u279\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>山楂制品</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (菜单) -->\r\n");
      out.write("            <div id=\"u280\" class=\"ax_default sub_menu\">\r\n");
      out.write("              <img id=\"u280_menu\" class=\"img \" src=\"images/beef/u256_menu.png\" alt=\"u280_menu\"/>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (表格) -->\r\n");
      out.write("              <div id=\"u281\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Unnamed (Menu Item) -->\r\n");
      out.write("                <div id=\"u282\" class=\"ax_default menu_item\">\r\n");
      out.write("                  <img id=\"u282_img\" class=\"img \" src=\"images/beef/u246.png\"/>\r\n");
      out.write("                  <!-- Unnamed () -->\r\n");
      out.write("                  <div id=\"u283\" class=\"text\" style=\"visibility: visible;\">\r\n");
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
      out.write("      <div id=\"u284\" class=\"ax_default\" data-label=\"价格\">\r\n");
      out.write("        <div id=\"u284_state0\" class=\"panel_state\" data-label=\"State1\">\r\n");
      out.write("          <div id=\"u284_state0_content\" class=\"panel_state_content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u285\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u285_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u286\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>草原今朝 风干牛肉干160g超干原味 内蒙古特产零食</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u287\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u287_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u288\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p style=\"font-size:28px;\"><span style=\"font-size:18px;\">￥</span><span>79.9</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u289\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u289_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u290\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>价格</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u291\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u291_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u292\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>重量</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u293\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u293_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u294\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>0.16kg</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (水平线) -->\r\n");
      out.write("            <div id=\"u295\" class=\"ax_default line\">\r\n");
      out.write("              <img id=\"u295_img\" class=\"img \" src=\"images/beef/u295.png\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u296\" class=\"text\" style=\"display: none; visibility: hidden\">\r\n");
      out.write("                <p><span></span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u297\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u297_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u298\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>口味</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (复选框) -->\r\n");
      out.write("            <div id=\"u299\" class=\"ax_default checkbox\">\r\n");
      out.write("              <label for=\"u299_input\">\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u300\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>原味</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </label>\r\n");
      out.write("              <input id=\"u299_input\" type=\"checkbox\" value=\"checkbox\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (复选框) -->\r\n");
      out.write("            <div id=\"u301\" class=\"ax_default checkbox\">\r\n");
      out.write("              <label for=\"u301_input\">\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u302\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>香辣</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </label>\r\n");
      out.write("              <input id=\"u301_input\" type=\"checkbox\" value=\"checkbox\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (复选框) -->\r\n");
      out.write("            <div id=\"u303\" class=\"ax_default checkbox\">\r\n");
      out.write("              <label for=\"u303_input\">\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u304\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>红烧</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </label>\r\n");
      out.write("              <input id=\"u303_input\" type=\"checkbox\" value=\"checkbox\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u305\" class=\"ax_default _三级标题\">\r\n");
      out.write("              <div id=\"u305_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u306\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>数量</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (提交按钮) -->\r\n");
      out.write("            <div id=\"u307\" class=\"ax_default html_button\">\r\n");
      out.write("              <input id=\"u307_input\" type=\"submit\" value=\"加入购物车\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (组合) -->\r\n");
      out.write("            <div id=\"u308\" class=\"ax_default\">\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (文本框) -->\r\n");
      out.write("              <div id=\"u309\" class=\"ax_default text_field\">\r\n");
      out.write("                <input id=\"u309_input\" type=\"text\" value=\"\"/>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (矩形) -->\r\n");
      out.write("              <div id=\"u310\" class=\"ax_default button\">\r\n");
      out.write("                <div id=\"u310_div\" class=\"\"></div>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u311\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>+1</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <!-- Unnamed (矩形) -->\r\n");
      out.write("              <div id=\"u312\" class=\"ax_default button\">\r\n");
      out.write("                <div id=\"u312_div\" class=\"\"></div>\r\n");
      out.write("                <!-- Unnamed () -->\r\n");
      out.write("                <div id=\"u313\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                  <p><span>-1</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Unnamed (动态面板) -->\r\n");
      out.write("      <div id=\"u314\" class=\"ax_default\">\r\n");
      out.write("        <div id=\"u314_state0\" class=\"panel_state\" data-label=\"State1\">\r\n");
      out.write("          <div id=\"u314_state0_content\" class=\"panel_state_content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (矩形) -->\r\n");
      out.write("            <div id=\"u315\" class=\"ax_default _一级标题\">\r\n");
      out.write("              <div id=\"u315_div\" class=\"\"></div>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u316\" class=\"text\" style=\"visibility: visible;\">\r\n");
      out.write("                <p><span>商品详情</span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Unnamed (图片) -->\r\n");
      out.write("            <div id=\"u317\" class=\"ax_default image\">\r\n");
      out.write("              <img id=\"u317_img\" class=\"img \" src=\"images/beef/u317.jpg\"/>\r\n");
      out.write("              <!-- Unnamed () -->\r\n");
      out.write("              <div id=\"u318\" class=\"text\" style=\"display: none; visibility: hidden\">\r\n");
      out.write("                <p><span></span></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Unnamed (图片) -->\r\n");
      out.write("      <div id=\"u319\" class=\"ax_default image\">\r\n");
      out.write("        <img id=\"u319_img\" class=\"img \" src=\"images/beef/u319.png\"/>\r\n");
      out.write("        <!-- Unnamed () -->\r\n");
      out.write("        <div id=\"u320\" class=\"text\" style=\"display: none; visibility: hidden\">\r\n");
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
