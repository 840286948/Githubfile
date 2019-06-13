package org.apache.jsp.houtaiblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class update_002dcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'update-category.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"houtaiblog/images/icon/icon.png\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"houtaiblog/images/icon/favicon.ico\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"houtaiblog/wjs/user.js\"></script>\r\n");
      out.write("<script src=\"houtaiblog/js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"houtaiblog/wjs/column.js\"></script>\r\n");
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main\" id=\"main\">\r\n");
      out.write("      <h1 class=\"page-header\">修改栏目</h1>\r\n");
      out.write("      <form action=\"column/insertUpd.do\" method=\"post\" onsubmit=\"return columnTest()\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"category-name\">栏目名称</label>\r\n");
      out.write("          <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${column.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("          <input type=\"text\" onblur=\"columnName(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${column.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\" id=\"category-name\" name=\"column_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${column.column_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"form-control\" placeholder=\"在此处输入栏目名称\" required autocomplete=\"off\">\r\n");
      out.write("          <span class=\"prompt-text\">这将是它在站点上显示的名字。</span><span id=\"c_name\" style=\"color:red;\"></span></div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"category-alias\">栏目别名</label>\r\n");
      out.write("          <input type=\"text\" id=\"category-alias\" name=\"column_alias\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${column.column_alias }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"form-control\" placeholder=\"在此处输入栏目别名\" required autocomplete=\"off\">\r\n");
      out.write("          <span class=\"prompt-text\">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>\r\n");
      out.write("       <!--  <div class=\"form-group\">\r\n");
      out.write("          <label for=\"category-fname\">父节点</label>\r\n");
      out.write("          <select id=\"category-fname\" class=\"form-control\" name=\"fid\">\r\n");
      out.write("            <option value=\"0\" selected>无</option>\r\n");
      out.write("            <option value=\"1\">前端技术</option>\r\n");
      out.write("            <option value=\"2\">后端程序</option>\r\n");
      out.write("            <option value=\"3\">管理系统</option>\r\n");
      out.write("            <option value=\"4\">授人以渔</option>\r\n");
      out.write("            <option value=\"5\">程序人生</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          <span class=\"prompt-text\">栏目是有层级关系的，您可以有一个“音乐”分类目录，在这个目录下可以有叫做“流行”和“古典”的子目录。</span> </div> -->\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"category-keywords\">关键字</label>\r\n");
      out.write("          <input type=\"text\" id=\"category-keywords\" name=\"column_keywords\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${column.column_keywords }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"form-control\" placeholder=\"在此处输入栏目关键字\" autocomplete=\"off\">\r\n");
      out.write("          <span class=\"prompt-text\">关键字会出现在网页的keywords属性中。</span> </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"category-describe\">描述</label>\r\n");
      out.write("          <textarea class=\"form-control\" id=\"category-describe\" name=\"column_description\" rows=\"4\" autocomplete=\"off\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${column.column_description }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("          <span class=\"prompt-text\">描述会出现在网页的description属性中。</span> </div>\r\n");
      out.write("        <button class=\"btn btn-primary\" type=\"submit\" name=\"submit\">更新</button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blog.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"houtaiblog/js/bootstrap.min.js\"></script> \r\n");
      out.write("<script src=\"houtaiblog/js/admin-scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
