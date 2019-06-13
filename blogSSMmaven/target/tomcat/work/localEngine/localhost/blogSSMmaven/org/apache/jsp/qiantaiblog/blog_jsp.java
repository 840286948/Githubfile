package org.apache.jsp.qiantaiblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'blog.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <footer class=\"footer\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <p>&copy; 2016 <a href=\"\">ylsat.com</a> &nbsp; <a href=\"#\" target=\"_blank\" rel=\"nofollow\">豫ICP备20151109-1</a> </p>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"gotop\"><a class=\"gotop\"></a></div>\r\n");
      out.write("</footer>\r\n");
      out.write("    <!--微信二维码模态框-->\r\n");
      out.write("<div class=\"modal fade user-select\" id=\"WeChat\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"WeChatModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\" style=\"margin-top:120px;max-width:280px;\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"WeChatModalLabel\" style=\"cursor:default;\">微信扫一扫</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\" style=\"text-align:center\"> <img src=\"images/weixin.jpg\" alt=\"\" style=\"cursor:pointer\"/> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--该功能正在日以继夜的开发中-->\r\n");
      out.write("<div class=\"modal fade user-select\" id=\"areDeveloping\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"areDevelopingModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"areDevelopingModalLabel\" style=\"cursor:default;\">该功能正在日以继夜的开发中…</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\"> <img src=\"images/baoman/baoman_01.gif\" alt=\"深思熟虑\" />\r\n");
      out.write("        <p style=\"padding:15px 15px 15px 100px; position:absolute; top:15px; cursor:default;\">很抱歉，程序猿正在日以继夜的开发此功能，本程序将会在以后的版本中持续完善！</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">朕已阅</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--登录注册模态框-->\r\n");
      out.write("<div class=\"modal fade user-select\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"loginModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <form action=\"/Admin/Index/login\" method=\"post\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("          <h4 class=\"modal-title\" id=\"loginModalLabel\">登录</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"loginModalUserNmae\">用户名</label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"loginModalUserNmae\" placeholder=\"请输入用户名\" autofocus maxlength=\"15\" autocomplete=\"off\" required>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"loginModalUserPwd\">密码</label>\r\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"loginModalUserPwd\" placeholder=\"请输入密码\" maxlength=\"18\" autocomplete=\"off\" required>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\">登录</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--右键菜单列表-->\r\n");
      out.write("<div id=\"rightClickMenu\">\r\n");
      out.write("  <ul class=\"list-group rightClickMenuList\">\r\n");
      out.write("    <li class=\"list-group-item disabled\">欢迎访问异清轩博客</li>\r\n");
      out.write("    <li class=\"list-group-item\"><span>IP：</span>172.16.10.129</li>\r\n");
      out.write("    <li class=\"list-group-item\"><span>地址：</span>河南省郑州市</li>\r\n");
      out.write("    <li class=\"list-group-item\"><span>系统：</span>Windows10 </li>\r\n");
      out.write("    <li class=\"list-group-item\"><span>浏览器：</span>Chrome47</li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
