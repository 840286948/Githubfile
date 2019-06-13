package org.apache.jsp.qiantaiblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class article_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    <title>My JSP 'article.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"qiantaiblog/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"qiantaiblog/css/nprogress.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"qiantaiblog/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"qiantaiblog/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"qiantaiblog/images/icon/icon.png\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"qiantaiblog/images/icon/favicon.ico\">\r\n");
      out.write("<script src=\"qiantaiblog/js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"qiantaiblog/js/nprogress.js\"></script>\r\n");
      out.write("<script src=\"qiantaiblog/js/jquery.lazyload.min.js\"></script>\r\n");
      out.write("<script src=\"qiantaiblog/wjs/qiantai.js\"></script>\r\n");
      out.write("<script src=\"http://pv.sohu.com/cityjson?ie=utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("</script>\r\n");
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
      out.write("<body class=\"user-select single\" onload=\"comments(1,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<section class=\"container\">\r\n");
      out.write("  <div class=\"content-wrap\">\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("      <header class=\"article-header\">\r\n");
      out.write("        <h1 class=\"article-title\"><a href=\"article.html\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.article_title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></h1>\r\n");
      out.write("        <div class=\"article-meta\"> <span class=\"item article-meta-time\">\r\n");
      out.write("          <time class=\"time\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"时间：2016-1-4 10:29:39\">\r\n");
      out.write("          ");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("</time>\r\n");
      out.write("          </span> \r\n");
      out.write("           <span class=\"item article-meta-category\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"栏目：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.column.column_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"><i class=\"glyphicon glyphicon-list\"></i> <a href=\"program\" title=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.column.column_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></span>\r\n");
      out.write("            <span class=\"item article-meta-views\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"查看：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.article_clicks }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"><i class=\"glyphicon glyphicon-eye-open\"></i> 共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.article_clicks }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("人观看</span> \r\n");
      out.write("            <span id=\"tota\" class=\"item article-meta-comment\" data-toggle=\"tooltip\" data-placement=\"bottom\"><i class=\"glyphicon glyphicon-comment\"></i> </span> </div>\r\n");
      out.write("      </header>\r\n");
      out.write("      <article class=\"article-content\">\r\n");
      out.write("      \t<p><img data-original=\"images/banner/banner_03.jpg\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.title_image }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" alt=\"\" /></p>\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.article_content }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("        <!-- <p class=\"article-copyright hidden-xs\">未经允许不得转载：<a href=\"\">异清轩博客</a> » <a href=\"article.html\">php如何判断一个日期的格式是否正确</a></p> -->\r\n");
      out.write("      </article>\r\n");
      out.write("      <div class=\"article-tags\">标签：<a href=\"\" rel=\"tag\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.article_label }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></div>\r\n");
      out.write("      <div class=\"relates\">\r\n");
      out.write("        <div class=\"title\">\r\n");
      out.write("          <h3>相关推荐</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <ul>\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"title\" id=\"comment\">\r\n");
      out.write("        <h3>评论 <small>抢沙发</small></h3>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--<div id=\"respond\">\r\n");
      out.write("        <div class=\"comment-signarea\">\r\n");
      out.write("          <h3 class=\"text-muted\">评论前必须登录！</h3>\r\n");
      out.write("          <p> <a href=\"javascript:;\" class=\"btn btn-primary login\" rel=\"nofollow\">立即登录</a> &nbsp; <a href=\"javascript:;\" class=\"btn btn-default register\" rel=\"nofollow\">注册</a> </p>\r\n");
      out.write("          <h3 class=\"text-muted\">当前文章禁止评论</h3>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>-->\r\n");
      out.write("      <div id=\"respond\">\r\n");
      out.write("        <form action=\"\" method=\"post\" id=\"comment-form\">\r\n");
      out.write("          <div class=\"comment\">\r\n");
      out.write("            <div class=\"comment-title\"><img class=\"avatar\" src=\"qiantaiblog/images/icon/icon.png\" alt=\"\" /></div>\r\n");
      out.write("            <div class=\"comment-box\">\r\n");
      out.write("              <textarea placeholder=\"您的评论可以一针见血\" name=\"comment_content\" id=\"comment-textarea\" cols=\"100%\" rows=\"3\" tabindex=\"1\" ></textarea>\r\n");
      out.write("              <div class=\"comment-ctrl\"> <span class=\"emotion\"></span>\r\n");
      out.write("              \t<input type=\"hidden\" value=\"\" id=\"ip\"/>\r\n");
      out.write("                <div class=\"comment-prompt\"> <i class=\"fa fa-spin fa-circle-o-notch\"></i> <span class=\"comment-prompt-text\"></span> </div>\r\n");
      out.write("                <button type=\"button\" onclick=\"insertComment(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.comment_status }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")\" name=\"comment-submit\" id=\"comment-submit\" tabindex=\"5\" articleid=\"1\">评论</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"postcomments\">\r\n");
      out.write("        <ol class=\"commentlist\" id=\"commentlist\">\r\n");
      out.write("          \r\n");
      out.write("        </ol>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"quotes\" id=\"quotes\">\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "right.jsp", out, false);
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blog.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- <script src=\"qiantaiblog/js/bootstrap.min.js\"></script>  -->\r\n");
      out.write("<script src=\"qiantaiblog/js/jquery.ias.js\"></script> \r\n");
      out.write("<script src=\"qiantaiblog/js/scripts.js\"></script> \r\n");
      out.write("<script src=\"qiantaiblog/js/jquery.qqFace.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('.emotion').qqFace({\r\n");
      out.write("\t\tid : 'facebox', \r\n");
      out.write("\t\tassign:'comment-textarea', \r\n");
      out.write("\t\tpath:'/Home/images/arclist/'\t//表情存放的路径\r\n");
      out.write("\t});\r\n");
      out.write(" });   \r\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /qiantaiblog/article.jsp(55,10) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articles.createTime }", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /qiantaiblog/article.jsp(55,10) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setType("date");
    // /qiantaiblog/article.jsp(55,10) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /qiantaiblog/article.jsp(72,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/qiantaiblog/article.jsp(72,9) '${articleList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${articleList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /qiantaiblog/article.jsp(72,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("a");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          \t\t<li><a href=\"page/articleDetails.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("&article_clicks=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.article_clicks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.article_title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\r\n");
          out.write("          \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
