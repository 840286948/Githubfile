package org.apache.jsp.houtaiblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addupd_002dlink_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("    <title>My JSP 'addupd-link.jsp' starting page</title>\r\n");
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
      out.write("<script src=\"houtaiblog/js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"houtaiblog/wjs/user.js\"></script>\r\n");
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
      out.write("      <div class=\"row\">\r\n");
      out.write("        <form action=\"other/addupdLink.do\" method=\"post\" class=\"add-flink-form\" autocomplete=\"off\" draggable=\"false\">\r\n");
      out.write("          <div class=\"col-md-9\">\r\n");
      out.write("            <h1 class=\"page-header\">增加友情链接</h1>\r\n");
      out.write("            <div class=\"add-article-box\">\r\n");
      out.write("              <h2 class=\"add-article-box-title\"><span>名称</span></h2>\r\n");
      out.write("              <div class=\"add-article-box-content\">\r\n");
      out.write("              \t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${links.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"id\"/>\r\n");
      out.write("                <input type=\"text\" id=\"flink-name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${links.link_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"link_name\" class=\"form-control\" placeholder=\"在此处输入名称\" required autofocus autocomplete=\"off\">\r\n");
      out.write("                <span class=\"prompt-text\">例如：异清轩技术博客</span> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"add-article-box\">\r\n");
      out.write("              <h2 class=\"add-article-box-title\"><span>WEB地址</span></h2>\r\n");
      out.write("              <div class=\"add-article-box-content\">\r\n");
      out.write("                <input type=\"text\" id=\"flink-url\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${links.link_url }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"link_url\" class=\"form-control\" placeholder=\"在此处输入URL地址\" required autocomplete=\"off\">\r\n");
      out.write("                <span class=\"prompt-text\">例子：<code>http://www.ylsat.com/</code>——不要忘了<code>http://</code></span> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"add-article-box\">\r\n");
      out.write("              <h2 class=\"add-article-box-title\"><span>图像地址</span></h2>\r\n");
      out.write("              <div class=\"add-article-box-content\">\r\n");
      out.write("                <input type=\"text\" id=\"flink-imgurl\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${links.link_image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"link_image\" class=\"form-control\" placeholder=\"在此处输入图像地址\" required autocomplete=\"off\">\r\n");
      out.write("                <span class=\"prompt-text\">图像地址是可选的，可以为网站LOGO地址等</span> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"add-article-box\">\r\n");
      out.write("              <h2 class=\"add-article-box-title\"><span>描述</span></h2>\r\n");
      out.write("              <div class=\"add-article-box-content\">\r\n");
      out.write("                <textarea class=\"form-control\" name=\"link_describe\" autocomplete=\"off\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${links.link_describe }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("                <span class=\"prompt-text\">描述是可选的手工创建的内容总结</span> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-3\">\r\n");
      out.write("            <h1 class=\"page-header\">操作</h1>\r\n");
      out.write("            <div class=\"add-article-box\">\r\n");
      out.write("              <!-- <h2 class=\"add-article-box-title\"><span>保存</span></h2>\r\n");
      out.write("              <div class=\"add-article-box-content\">\r\n");
      out.write("                <p>\r\n");
      out.write("                  <label>状态：</label>\r\n");
      out.write("                  <span class=\"article-status-display\">未增加</span></p>\r\n");
      out.write("                <p><label>target：</label><input type=\"radio\" name=\"target\" value=\"0\" checked />_blank&nbsp;&nbsp;<input type=\"radio\" name=\"target\" value=\"1\" />_self&nbsp;&nbsp;<input type=\"radio\" name=\"target\" value=\"2\" />_top</p>\r\n");
      out.write("                <p><label>rel：</label><input type=\"radio\" name=\"rel\" value=\"0\" checked />nofollow&nbsp;&nbsp;<input type=\"radio\" name=\"rel\" value=\"1\"/>none</p>\r\n");
      out.write("                <p>\r\n");
      out.write("                  <label>增加于：</label>\r\n");
      out.write("                  <span class=\"article-time-display\">\r\n");
      out.write("                  <input style=\"border: none;\" type=\"datetime\" name=\"time\" value=\"2016-01-09 17:29:37\" />\r\n");
      out.write("                  </span></p>\r\n");
      out.write("              </div> -->\r\n");
      out.write("              <div class=\"add-article-box-footer\">\r\n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\" name=\"submit\">\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blog.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"houtaiblog/js/bootstrap.min.js\"></script> \r\n");
      out.write("<script src=\"houtaiblog/js/admin-scripts.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /houtaiblog/addupd-link.jsp(93,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty links }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(' ');
        out.write('增');
        out.write('加');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /houtaiblog/addupd-link.jsp(94,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty links }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(' ');
        out.write('修');
        out.write('改');
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
