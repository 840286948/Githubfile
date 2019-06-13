package org.apache.jsp.houtaiblog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t<title>异清轩博客管理系统</title>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"houtaiblog/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"apple-touch-icon-precomposed\" href=\"houtaiblog/images/icon/icon.png\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"houtaiblog/images/icon/favicon.ico\">\r\n");
      out.write("\t<script src=\"houtaiblog/js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"houtaiblog/wjs/user.js\"></script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("\t<body class=\"user-select\">\r\n");
      out.write("<section class=\"container-fluid\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-lg-10 col-md-offset-2 main\" id=\"main\">\r\n");
      out.write("      <h1 class=\"page-header\">信息总览</h1>\r\n");
      out.write("      <div class=\"row placeholders\">\r\n");
      out.write("        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("          <h4>文章</h4>\r\n");
      out.write("          <span class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${articleTote }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" 条</span> </div>\r\n");
      out.write("        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("          <h4>评论</h4>\r\n");
      out.write("          <span class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${commentTote }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" 条</span> </div>\r\n");
      out.write("        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("          <h4>友链</h4>\r\n");
      out.write("          <span class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${linkTote }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" 条</span> </div>\r\n");
      out.write("        <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("          <h4>登录访问量</h4>\r\n");
      out.write("          <span class=\"text-muted\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userlog }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span> </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <h1 class=\"page-header\">状态</h1>\r\n");
      out.write("      <div class=\"table-responsive\">\r\n");
      out.write("        <table class=\"table table-striped table-hover\">\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>登录者: <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUser.username }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>，这是您第 <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${longNumber }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span> 次登录</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>\r\n");
      out.write("              ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("      <h1 class=\"page-header\">系统信息</h1>\r\n");
      out.write("      <div class=\"table-responsive\">\r\n");
      out.write("        <table class=\"table table-striped table-hover\">\r\n");
      out.write("          <thead>\r\n");
      out.write("            <tr> </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"10%\">管理员个数:</td>\r\n");
      out.write("              <td width=\"8%\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleTote }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" 人</td>\r\n");
      out.write("              <td width=\"10%\">登录IP:</td>\r\n");
      out.write("              <td width=\"8%\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentIp }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</td>\r\n");
      out.write("              <td></td>\r\n");
      out.write("             <!--  <td>服务器软件:</td>\r\n");
      out.write("              <td>Apache/2.4.10 (Win32) OpenSSL/1.0.1i mod_fcgid/2.3.9</td> -->\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!-- <tr>\r\n");
      out.write("              <td>浏览器:</td>\r\n");
      out.write("              <td>Chrome47</td>\r\n");
      out.write("              <td>PHP版本:</td>\r\n");
      out.write("              <td>5.6.1</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>操作系统:</td>\r\n");
      out.write("              <td>Windows 10</td>\r\n");
      out.write("              <td>PHP运行方式:</td>\r\n");
      out.write("              <td>CGI-FCGI</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>登录者IP:</td>\r\n");
      out.write("              <td>::1:55570</td>\r\n");
      out.write("              <td>MYSQL版本:</td>\r\n");
      out.write("              <td>5.5.40</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>程序版本:</td>\r\n");
      out.write("              <td class=\"version\">YlsatCMS 1.0 <font size=\"-6\" color=\"#BBB\">(20160108160215)</font></td>\r\n");
      out.write("              <td>上传文件:</td>\r\n");
      out.write("              <td>可以 <font size=\"-6\" color=\"#BBB\">(最大文件：2M ，表单：8M )</font></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>程序编码:</td>\r\n");
      out.write("              <td>UTF-8</td>\r\n");
      out.write("              <td>当前时间:</td>\r\n");
      out.write("              <td>2016-01-08 15:50:30</td>\r\n");
      out.write("            </tr> -->\r\n");
      out.write("          </tbody>\r\n");
      out.write("          <tfoot>\r\n");
      out.write("            <tr></tr>\r\n");
      out.write("          </tfoot>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("      <footer>\r\n");
      out.write("        <!-- <h1 class=\"page-header\">程序信息</h1> -->\r\n");
      out.write("        <div class=\"table-responsive\">\r\n");
      out.write("        <table class=\"table table-striped table-hover\">\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <!-- <tr>\r\n");
      out.write("              <td><span style=\"display:inline-block; width:8em\">版权所有</span> POWERED BY WY ALL RIGHTS RESERVED</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td><span style=\"display:inline-block;width:8em\">页面加载时间</span> PROCESSED IN 1.0835s  SECONDS 更多模板：<a href=\"http://www.mycodes.net/\" target=\"_blank\">源码之家</a></td>\r\n");
      out.write("            </tr> -->\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        </div>\r\n");
      out.write("      </footer>\r\n");
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
    // /houtaiblog/index.jsp(65,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty lastLog }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("              上次登录时间: ");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("  , 上次登录IP: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lastLog.ip }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("              \t");
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
    // /houtaiblog/index.jsp(66,22) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lastLog.createTime }", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /houtaiblog/index.jsp(66,22) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setType("date");
    // /houtaiblog/index.jsp(66,22) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
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
    // /houtaiblog/index.jsp(68,15) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty lastLog }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("              \t\t您是第一次登录\r\n");
        out.write("              \t");
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
