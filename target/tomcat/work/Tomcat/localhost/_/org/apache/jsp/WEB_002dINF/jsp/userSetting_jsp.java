/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-22 03:19:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userSetting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>添加用户</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../statics/css/layui.css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"childrenBody\">\r\n");
      out.write("\t<form class=\"layui-form\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t<!-- <div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">自定义属性</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"tuijian\" class=\"tuijian\" title=\"推荐\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"shenhe\" class=\"newsStatus\" title=\"审核\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"show\" class=\"isShow\" title=\"展示\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">用户账号</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t<input name=\"id\" type=\"text\" class=\"layui-input newsAuthor\"\r\n");
      out.write("\t\t\t\t\t\tid=\"mid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" lay-verify=\"required\" disabled=\"true\" placeholder=\"请输入用户账号\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t<label class=\"layui-form-label\">姓名</label>\r\n");
      out.write("\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t<input id=\"mname\" name=\"mname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"layui-input \" lay-verify=\"required\" placeholder=\"请输入姓名\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">用户权限</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t<select value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"auth\" name=\"auth\" class=\"newsLook\" lay-filter=\"sel\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">成员</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">管理员</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">用户状态</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t\t<select value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${locked}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"state\" name=\"state\" class=\"newsLook\" lay-filter=\"sel2\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">正常</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">锁定</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t<label class=\"layui-form-label\">信用积分</label>\r\n");
      out.write("\t\t\t<div class=\"layui-input-inline\">\r\n");
      out.write("\t\t\t\t<input id=\"credit\" name=\"credit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${credit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"layui-input \" placeholder=\"请输入联系方式\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t<button lay-submit lay-filter=\"formDemo\" class=\"layui-btn\" >立即提交</button>\r\n");
      out.write("\t\t\t\t<button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"../../statics/layui.js\"></script>\r\n");
      out.write("\t<!-- <script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"\\Manage\\src\\main\\webapp\\js\\newsAdd.js\"></script> -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t//监听lay-filter为sel的select组件\r\n");
      out.write("\t\tlayui.use('form', function() {\r\n");
      out.write("\t\t\tvar form = layui.form;\r\n");
      out.write("\t\t\tform.on('select(sel)', function(data) {\r\n");
      out.write("\t\t\t\t//将select的option值赋给select\r\n");
      out.write("\t\t\t\tselect = data.value;\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tlayui.use('form', function() {\r\n");
      out.write("\t\t\tvar form = layui.form;\r\n");
      out.write("\t\t\tform.on('select(sel2)', function(data) {\r\n");
      out.write("\t\t\t\t//将select的option值赋给select\r\n");
      out.write("\t\t\t\tselect = data.value;\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tlayui.use(['form','layer','jquery'], function(){\r\n");
      out.write("\t        var form = layui.form,\r\n");
      out.write("\t        layer=layui.layer,\r\n");
      out.write("\t        $$=layui.jquery;\r\n");
      out.write("\t        form.on('submit(formDemo)', function(){\r\n");
      out.write("\t        \r\n");
      out.write("\t             var id = $$(\"#mid\").val();\r\n");
      out.write("\t             var name = $$('#mname').val();\r\n");
      out.write("\t             var auth = $$('#auth').val();\r\n");
      out.write("\t             var state = $$('#state').val();\r\n");
      out.write("\t             var credit = $$(\"#credit\").val();\r\n");
      out.write("\t             $$.ajax({\r\n");
      out.write("\t            \turl:\"/setting\",\r\n");
      out.write("\t            \ttype:\"post\",\r\n");
      out.write("\t            \tdata:{'id':id,'name':name,'auth':auth,'state':state,'credit':credit},\r\n");
      out.write("\t            \tdataType:\"json\",\r\n");
      out.write("\t            \tsuccess:function(data)\r\n");
      out.write("\t            \t{\r\n");
      out.write("\t            \t\tvar index = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("\t            \t\tlayer.msg(\"修改成功\",{icon:6,time:1000});\r\n");
      out.write("\t            \t\tsetTimeout(function () { parent.layer.close(index) }, 1000);\r\n");
      out.write("\t            \t\tparent.layui.table.reload('idTest',{page:{curr:1}});\r\n");
      out.write("\t            \t\t\r\n");
      out.write("\t            \t} \r\n");
      out.write("            });\r\n");
      out.write("             return false;\r\n");
      out.write("           \r\n");
      out.write("\t            \r\n");
      out.write("\t        });\r\n");
      out.write("\t     });\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
