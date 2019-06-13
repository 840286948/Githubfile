package org.apache.jsp.houtaiblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addupd_002dnotice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.release();
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
      out.write("    <title>My JSP 'addupd-notice.jsp' starting page</title>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"houtaiblog/wjs/ann.js\"></script>\r\n");
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
      out.write("        <form action=\"ann/addUpdAnn.do\" method=\"post\" class=\"add-article-form\" onsubmit=\"return annTest()\">\r\n");
      out.write("          <div class=\"col-md-9\">\r\n");
      out.write("            <h1 class=\"page-header\">撰写新公告</h1>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("              <input type=\"hidden\" name=\"user.id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("              <label for=\"article-title\" class=\"sr-only\">标题</label>\r\n");
      out.write("              <input type=\"text\" id=\"ann_title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann.announcement_title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"announcement_title\" class=\"form-control\" placeholder=\"在此处输入标题\" required autofocus autocomplete=\"off\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <label for=\"article-content\" class=\"sr-only\">内容</label>\r\n");
      out.write("              <textarea id=\"article-content\" name=\"announcement_content\" class=\"form-control\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann.announcement_content }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea> \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"add-article-box\">\r\n");
      out.write("              <h2 class=\"add-article-box-title\"><span>关键字</span></h2>\r\n");
      out.write("              <div class=\"add-article-box-content\">\r\n");
      out.write("              \t<input type=\"text\" id=\"ann_keyword\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann.announcement_keyword }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"请输入关键字\" name=\"announcement_keyword\" autocomplete=\"off\">\r\n");
      out.write("                <span class=\"prompt-text\">多个标签请用英文逗号,隔开。</span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"add-article-box\">\r\n");
      out.write("              <h2 class=\"add-article-box-title\"><span>描述</span></h2>\r\n");
      out.write("              <div class=\"add-article-box-content\">\r\n");
      out.write("              \t<textarea class=\"form-control\" id=\"ann_describe\" name=\"announcement_describe\" autocomplete=\"off\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann.announcement_describe }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("                <span class=\"prompt-text\">描述是可选的手工创建的内容总结，并可以在网页描述中使用</span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-3\">\r\n");
      out.write("            <h1 class=\"page-header\">操作</h1>\r\n");
      out.write("            <div class=\"add-article-box\">\r\n");
      out.write("              <h2 class=\"add-article-box-title\"><span>发布</span></h2>\r\n");
      out.write("              <div class=\"add-article-box-content\">\r\n");
      out.write("              \t<p><label>状态：</label><span class=\"article-status-display\">未发布</span></p>\r\n");
      out.write("                <p><label>公开度：</label><input type=\"radio\" name=\"status\" value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann.status == 0 or ann == null?\"checked='checked'\":''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/>公开\r\n");
      out.write("                 <input type=\"radio\" name=\"status\" value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann.status == 1?\"checked='checked'\":''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/>加密</p>\r\n");
      out.write("                <p>");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"add-article-box-footer\">\r\n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\" name=\"submit\">发布</button>\r\n");
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
      out.write("<script src=\"houtaiblog/js/admin-scripts.js\"></script> \r\n");
      out.write("<!--summernote富文本编辑器-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/lib/summernote/summernote.css\">\r\n");
      out.write("<script src=\"houtaiblog/lib/summernote/summernote.js\"></script> \r\n");
      out.write("<script src=\"houtaiblog/lib/summernote/lang/summernote-zh-CN.js\"></script> \r\n");
      out.write("<script>\r\n");
      out.write("$('#article-content').summernote({\r\n");
      out.write("\tlang: 'zh-CN'\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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
    // /houtaiblog/addupd-notice.jsp(84,19) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                 \t<label>发布于：\r\n");
        out.write("                 </label><span class=\"article-time-display\">\r\n");
        out.write("                 ");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                 </span>\r\n");
        out.write("                 ");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /houtaiblog/addupd-notice.jsp(87,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ann.createTime }", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /houtaiblog/addupd-notice.jsp(87,17) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setType("date");
    // /houtaiblog/addupd-notice.jsp(87,17) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }
}
