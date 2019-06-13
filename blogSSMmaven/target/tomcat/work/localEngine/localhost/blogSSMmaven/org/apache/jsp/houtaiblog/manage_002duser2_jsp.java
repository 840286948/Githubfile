package org.apache.jsp.houtaiblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class manage_002duser2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");

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
      out.write("    <title>My JSP 'manage-user.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"houtaiblog/images/icon/icon.png\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"houtaiblog/images/icon/favicon.ico\">\r\n");
      out.write("<script src=\"houtaiblog/js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<!--[if gte IE 9]>\r\n");
      out.write("  <script src=\"js/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("  <script src=\"js/html5shiv.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("  <script src=\"js/respond.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("  <script src=\"js/selectivizr-min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("  <script>window.location.href='upgrade-browser.html';</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"user-select\">\r\n");
      out.write("<section class=\"container-fluid\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "right.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main\" id=\"main\">\r\n");
      out.write("    <h1 class=\"page-header\">操作</h1>\r\n");
      out.write("        <ol class=\"breadcrumb\">\r\n");
      out.write("          <li><a data-toggle=\"modal\" data-target=\"#addUser\">增加用户</a></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("        <h1 class=\"page-header\">管理 <span class=\"badge\">2</span></h1>\r\n");
      out.write("        <div class=\"table-responsive\">\r\n");
      out.write("          <table class=\"table table-striped table-hover\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th><span class=\"glyphicon glyphicon-th-large\"></span> <span class=\"visible-lg\">ID</span></th>\r\n");
      out.write("                <th><span class=\"glyphicon glyphicon-user\"></span> <span class=\"visible-lg\">用户名</span></th>\r\n");
      out.write("                <th><span class=\"glyphicon glyphicon-bookmark\"></span> <span class=\"visible-lg\">姓名</span></th>\r\n");
      out.write("                <th><span class=\"glyphicon glyphicon-pushpin\"></span> <span class=\"visible-lg\">文章</span></th>\r\n");
      out.write("                <th><span class=\"glyphicon glyphicon-time\"></span> <span class=\"visible-lg\">上次登录时间</span></th>\r\n");
      out.write("                <th><span class=\"glyphicon glyphicon-pencil\"></span> <span class=\"visible-lg\">操作</span></th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("             \r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!--增加用户模态框-->\r\n");
      out.write("<div class=\"modal fade\" id=\"addUser\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"addUserModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\" style=\"max-width:450px;\">\r\n");
      out.write("    <form action=\"/User/add\" method=\"post\" autocomplete=\"off\" draggable=\"false\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("          <h4 class=\"modal-title\" >增加用户</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <table class=\"table\" style=\"margin-bottom:0px;\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr> </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">姓名:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" value=\"\" class=\"form-control\" name=\"truename\" maxlength=\"10\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">用户名:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" value=\"\" class=\"form-control\" name=\"username\" maxlength=\"10\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">电话:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" value=\"\" class=\"form-control\" name=\"usertel\" maxlength=\"13\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">新密码:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"password\" class=\"form-control\" name=\"password\" maxlength=\"18\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">确认密码:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"password\" class=\"form-control\" name=\"new_password\" maxlength=\"18\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("            <tfoot>\r\n");
      out.write("              <tr></tr>\r\n");
      out.write("            </tfoot>\r\n");
      out.write("          </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\">提交</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--用户信息模态框-->\r\n");
      out.write("<div class=\"modal fade\" id=\"seeUser\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"seeUserModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\" style=\"max-width:450px;\">\r\n");
      out.write("    <form action=\"/User/update\" method=\"post\" autocomplete=\"off\" draggable=\"false\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("          <h4 class=\"modal-title\">修改用户</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <table class=\"table\" style=\"margin-bottom:0px;\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr> </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">姓名:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" value=\"\" class=\"form-control\" id=\"truename\" name=\"truename\" maxlength=\"10\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">用户名:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" value=\"\" class=\"form-control\" id=\"username\" name=\"username\" maxlength=\"10\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">电话:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" value=\"\" class=\"form-control\" id=\"usertel\" name=\"usertel\" maxlength=\"13\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">旧密码:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"password\" class=\"form-control\" name=\"old_password\" maxlength=\"18\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">新密码:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"password\" class=\"form-control\" name=\"password\" maxlength=\"18\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">确认密码:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"password\" class=\"form-control\" name=\"new_password\" maxlength=\"18\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("            <tfoot>\r\n");
      out.write("              <tr></tr>\r\n");
      out.write("            </tfoot>\r\n");
      out.write("          </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-footer\">\r\n");
      out.write("          <input type=\"hidden\" name=\"userid\" value=\"\" />\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary\">提交</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--微信二维码模态框-->\r\n");
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
      out.write("<!--提示模态框-->\r\n");
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
      out.write("<script src=\"houtaiblog/js/bootstrap.min.js\"></script> \r\n");
      out.write("<script src=\"houtaiblog/js/admin-scripts.js\"></script> \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
