package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class permission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'permission.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/zTreeStyle.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.ztree.all.js\"></script>\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"js/permission.js\"></script> -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar setting = {\r\n");
      out.write("\t\t\t/* async: {//异步请求数据\r\n");
      out.write("\t\t\t\tenable: true,\r\n");
      out.write("\t\t\t\turl:\"permission/permissionAll.do\",\r\n");
      out.write("\t\t\t\tautoParam:[\"id\", \"name=n\", \"level=lv\"]，\r\n");
      out.write("\t\t\t\totherParam:{\"otherParam\":\"zTreeAsyncTest\"},\r\n");
      out.write("\t\t\t\tdataFilter: filter \r\n");
      out.write("\t\t\t}, */\r\n");
      out.write("\t\t\tcheck: {\r\n");
      out.write("\t\t\t\t\tenable: true//开启复选框\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tdata: {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tkey: {\r\n");
      out.write("\t\t\t\t\turl: \"\"//设置连接为空\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsimpleData: {\r\n");
      out.write("\t\t\t\t\tenable: true\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\turl: \"permission/permissionAll.do\",\r\n");
      out.write("\t\t\t\tdata:\"roleid=\"+1,\r\n");
      out.write("\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t$.fn.zTree.init($(\"#regionZTree\"), setting,data);//初始化\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t function doSave() {\r\n");
      out.write("           var zTree = $.fn.zTree.getZTreeObj(\"regionZTree\");\r\n");
      out.write("           var nodes = zTree.getCheckedNodes();//获取选中的复选框值\r\n");
      out.write("            var tmpNode;\r\n");
      out.write("            var array = new Array();\r\n");
      out.write("            alert(nodes.length);\r\n");
      out.write("            for(var i=0; i<nodes.length; i++){\r\n");
      out.write("                tmpNode = nodes[i];//nodes[i]  是permission对象值\r\n");
      out.write("                 alert(tmpNode.id);\r\n");
      out.write("                array.push(tmpNode.id);\r\n");
      out.write("              \r\n");
      out.write("               /*  if(i!=nodes.length-1){\r\n");
      out.write("                    ids += tmpNode.id+\",\";\r\n");
      out.write("                }else{\r\n");
      out.write("                    ids += tmpNode.id;\r\n");
      out.write("                } */\r\n");
      out.write("            }\r\n");
      out.write("            alert(array);\r\n");
      out.write("           /* var roleId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("            var params = roleId +\";\"+ids;\r\n");
      out.write("            alert(ids); */\r\n");
      out.write("          /*   $.ajax({\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                url: 'role/authorise.do',\r\n");
      out.write("                data: {params:params,tm:new Date().getTime()},\r\n");
      out.write("                dataType:'json',\r\n");
      out.write("                cache: false,\r\n");
      out.write("                success: function(data){\r\n");
      out.write("                    if(\"success\" == data.result){\r\n");
      out.write("                        alert('授权成功!请重新登录!');\r\n");
      out.write("                        parent.location.reload();\r\n");
      out.write("                        doDialogClose();\r\n");
      out.write("                    }else{\r\n");
      out.write("                        alert(\"授权失败!\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }); */\r\n");
      out.write("        }\r\n");
      out.write("</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<ul id=\"regionZTree\" class=\"ztree\"></ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<input type=\"button\" onclick=\"doSave()\" value=\"保存\" class=\"buttonStyle\" />\r\n");
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
