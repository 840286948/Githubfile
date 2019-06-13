package org.apache.jsp.houtaiblog;

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
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t#test{\r\n");
      out.write("\t\t\toverflow:auto;\r\n");
      out.write("\t\t\theight:300px;\r\n");
      out.write("\t\t\twidth: 600px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction yuedu(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\turl:\"userlog/AjaxupdStatus.do\",\r\n");
      out.write("\t\t\t\tdata:\"uid=\"+'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("\t\t\t\tdataType:\"JSON\",\r\n");
      out.write("\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction log(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\turl:\"userlog/AjaxlistGR.do\",\r\n");
      out.write("\t\t\t\tdata:\"uid=\"+'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("\t\t\t\tdataType:\"JSON\",\r\n");
      out.write("\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\tvar a = \"\";\r\n");
      out.write("\t\t\t\t\t$.each(data,function(index,log){\r\n");
      out.write("\t\t\t\t\t\tvar date=new Date(log.createTime);\r\n");
      out.write("\t\t\t\t\t\tvar month=date.getMonth()+1;\r\n");
      out.write("\t\t\t\t\t\ta += \"<tr><td>\"+log.ip+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\ta += \"<td>\"+date.getFullYear()+\"-\"+month+\"-\"+date.getDate()+\"&nbsp;\"+date.getHours()+\":\"+date.getMinutes()+\":\"+date.getSeconds()+\"</td>\";\r\n");
      out.write("\t\t\t\t\t\ta += \"<td>成功</td></tr>\";\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t$(\"#tbody\").html(a);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <!--个人信息模态框-->\r\n");
      out.write("<div class=\"modal fade\" id=\"seeUserInfo\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <form action=\"user/addupdatedel.do?jin=index\" method=\"post\"  onsubmit=\"return updateUsers(2)\">\r\n");
      out.write("      <div class=\"modal-content\">\r\n");
      out.write("        <div class=\"modal-header\">\r\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("          <h4 class=\"modal-title\" >个人信息</h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal-body\">\r\n");
      out.write("          <table class=\"table\" style=\"margin-bottom:0px;\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr><td><input type=\"hidden\" value=\"\" id=\"userid2\" name=\"id\"/></td> </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">姓名:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" value=\"\" class=\"form-control\" id=\"realname2\" name=\"realname\" maxlength=\"10\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">用户名:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" disabled=\"disabled\" value=\"\" id=\"username2\" class=\"form-control\" name=\"username\" maxlength=\"10\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">电话:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"text\" value=\"\" id=\"telephone2\" class=\"form-control\" name=\"telephone\" maxlength=\"13\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">旧密码:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"password\" onblur=\"passwordTest(2)\" class=\"form-control\" id=\"old_password2\" name=\"old_password\" onblur=\"pwd(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\" maxlength=\"18\" autocomplete=\"off\" /><span style=\"color:red;\" id=\"old_pwd2\"></span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">新密码:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"password\" class=\"form-control\" id=\"password2\" name=\"password\" maxlength=\"18\" autocomplete=\"off\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td wdith=\"20%\">确认密码:</td>\r\n");
      out.write("                <td width=\"80%\"><input type=\"password\" class=\"form-control\" id=\"new_password2\" name=\"new_password\" maxlength=\"18\" autocomplete=\"off\" /></td>\r\n");
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
      out.write("<!--个人登录记录模态框-->\r\n");
      out.write("<div class=\"modal fade\" id=\"seeUserLoginlog\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\" >登录记录</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\" id=\"test\">\r\n");
      out.write("          <table class=\"table\" style=\"margin-bottom:0px;\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th>登录IP</th>\r\n");
      out.write("                <th>登录时间</th>\r\n");
      out.write("                <th>状态</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody id=\"tbody\">\r\n");
      out.write("              \r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" onclick=\"yuedu()\" class=\"btn btn-default\" data-dismiss=\"modal\">朕已阅</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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
