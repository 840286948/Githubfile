package org.apache.jsp.qiantaiblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'header.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\turl: \"page/AjaxCoulmn.do\",\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tvar columns = \"\";\r\n");
      out.write("\t\t\t\t$.each(data,function(index,column){\r\n");
      out.write("\t\t\t\t\tcolumns += \"<li><a href='page/indexListcolumn.do?columnid=\"+column.id+\"'>\"+column.column_name+\"</a></li>\";\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\"#columnUL\").append(columns);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction tick(){\r\n");
      out.write("\t\t\tvar oDate = new Date();\r\n");
      out.write("\t\t\tvar month=oDate.getMonth()+1;\r\n");
      out.write("\t\t\tvar date = oDate.getDate();\r\n");
      out.write("\t\t\tif(month < 10){\r\n");
      out.write("\t\t\t\tmonth = \"0\"+month;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(date < 10){\r\n");
      out.write("\t\t\t\tdate = \"0\"+date;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar sj = oDate.getFullYear()+\"-\"+month+\"-\"+date+\"  \"+oDate.getHours()+\":\"+oDate.getMinutes()+\":\"+oDate.getSeconds();\r\n");
      out.write("\t\t\t$(\"#ticks\").html(sj);\r\n");
      out.write("\t\t\tsetInterval(tick, 1000);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body onload=\"tick()\">\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("  <nav class=\"navbar navbar-default\" id=\"navbar\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"header-topbar hidden-xs link-border\">\r\n");
      out.write("        <ul class=\"site-nav topmenu\">\r\n");
      out.write("          <!-- <li><a href=\"tags.html\">标签云</a></li>\r\n");
      out.write("          <li><a href=\"readers.html\" rel=\"nofollow\">读者墙</a></li> -->\r\n");
      out.write("          <li><a href=\"page/links.do\" rel=\"nofollow\">友情链接</a></li>\r\n");
      out.write("          <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" rel=\"nofollow\"><!-- 关注本站 --> <span class=\"caret\"></span></a>\r\n");
      out.write("            <ul class=\"dropdown-menu header-topbar-dropdown-menu\">\r\n");
      out.write("              <li><a data-toggle=\"modal\" data-target=\"#WeChat\" rel=\"nofollow\"><i class=\"fa fa-weixin\"></i> 微信</a></li>\r\n");
      out.write("              <li><a href=\"#\" rel=\"nofollow\"><i class=\"fa fa-weibo\"></i> 微博</a></li>\r\n");
      out.write("              <li><a data-toggle=\"modal\" data-target=\"#areDeveloping\" rel=\"nofollow\"><i class=\"fa fa-rss\"></i> RSS</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <span id=\"ticks\"></span>\r\n");
      out.write("        <!-- <a data-toggle=\"modal\" data-target=\"#loginModal\" class=\"login\" rel=\"nofollow\">Hi,请登录</a>&nbsp;&nbsp;<a href=\"javascript:;\" class=\"register\" rel=\"nofollow\">我要注册</a>&nbsp;&nbsp;<a href=\"\" rel=\"nofollow\">找回密码</a> -->\r\n");
      out.write("        </div>\r\n");
      out.write("      <div class=\"navbar-header\">\r\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#header-navbar\" aria-expanded=\"false\"> <span class=\"sr-only\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\r\n");
      out.write("        <h1 class=\"logo hvr-bounce-in\"><a href=\"\" title=\"\"><img src=\"qiantaiblog/images/logo.png\" alt=\"\"></a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"header-navbar\">\r\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" id=\"columnUL\">\r\n");
      out.write("          <li class=\"hidden-index active\"><a data-cont=\"异清轩首页\" href=\"page/indexListcolumn.do\">异清轩首页</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"navbar-form visible-xs\" action=\"/Search\" method=\"post\">\r\n");
      out.write("          <div class=\"input-group\">\r\n");
      out.write("            <input type=\"text\" name=\"keyword\" class=\"form-control\" placeholder=\"请输入关键字\" maxlength=\"20\" autocomplete=\"off\">\r\n");
      out.write("            <span class=\"input-group-btn\">\r\n");
      out.write("            <button class=\"btn btn-default btn-search\" name=\"search\" type=\"submit\">搜索</button>\r\n");
      out.write("            </span> </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("  \r\n");
      out.write("</header>\r\n");
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
