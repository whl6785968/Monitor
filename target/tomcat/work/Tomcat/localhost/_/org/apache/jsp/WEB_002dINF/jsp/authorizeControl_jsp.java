/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-22 03:08:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class authorizeControl_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>layui</title>\r\n");
      out.write("  <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../statics/css/layui.css\" media=\"all\">\r\n");
      out.write("  <script src=\"../../statics/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>  \r\n");
      out.write("<div style=\"margin-bottom: 5px;\">          \r\n");
      out.write(" \r\n");
      out.write("<!-- 示例-970 -->\r\n");
      out.write("<ins class=\"adsbygoogle\" style=\"display:inline-block;width:970px;height:90px\" data-ad-client=\"ca-pub-6111334333458862\" data-ad-slot=\"3820120620\"></ins>\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("<div class=\"layui-btn-group demoTable\">\r\n");
      out.write("  <button class=\"layui-btn\" data-type=\"getCheckData\">获取选中行数据</button>\r\n");
      out.write("  <button class=\"layui-btn\" data-type=\"getCheckLength\">获取选中数目</button>\r\n");
      out.write("  <button class=\"layui-btn\" data-type=\"isAll\">验证是否全选</button>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("<table class=\"layui-table\" lay-data=\"{width: 892, height:332, url:'/control', page:true, id:'idTest'}\" lay-filter=\"demo\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th lay-data=\"{type:'checkbox', fixed: 'left'}\"></th>\r\n");
      out.write("      <th lay-data=\"{field:'userId', width:80, sort: true, fixed: true}\">ID</th>\r\n");
      out.write("      <th lay-data=\"{field:'userName', width:80}\">用户名</th>\r\n");
      out.write("      <th lay-data=\"{field:'userType', width:80, sort: true}\">用户权限</th>\r\n");
      out.write("      <th lay-data=\"{field:'locked', width:160}\">用户状态</th>\r\n");
      out.write("      <th lay-data=\"{field:'credit', width:160}\">用户信用</th>\r\n");
      out.write("      <th lay-data=\"{fixed: 'right', width:178, align:'center', toolbar: '#barDemo'}\"></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("</table>\r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/html\" id=\"barDemo\">\r\n");
      out.write("  <a class=\"layui-btn layui-btn-primary layui-btn-xs\" lay-event=\"detail\">查看</a>\r\n");
      out.write("  <a class=\"layui-btn layui-btn-xs\" lay-event=\"edit\">编辑</a>\r\n");
      out.write("  <a class=\"layui-btn layui-btn-danger layui-btn-xs\" lay-event=\"del\">删除</a>\r\n");
      out.write("</script>\r\n");
      out.write("               \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("layui.use('table', function(){\r\n");
      out.write("  var table = layui.table;\r\n");
      out.write("  //监听表格复选框选择\r\n");
      out.write("  table.on('checkbox(demo)', function(obj){\r\n");
      out.write("    console.log(obj)\r\n");
      out.write("  });\r\n");
      out.write("  //监听工具条\r\n");
      out.write("  table.on('tool(demo)', function(obj){\r\n");
      out.write("    var data = obj.data;\r\n");
      out.write("    if(obj.event === 'detail'){\r\n");
      out.write("      layer.msg('ID：'+ data.id + ' 的查看操作');\r\n");
      out.write("    } else if(obj.event === 'del'){\r\n");
      out.write("      layer.confirm('真的删除行么', function(index){\r\n");
      out.write("        obj.del();\r\n");
      out.write("        layer.close(index);\r\n");
      out.write("      });\r\n");
      out.write("    } else if(obj.event === 'edit'){\r\n");
      out.write("    \tvar userId = data.userId;\r\n");
      out.write("\t\tvar userName = data.userName;\r\n");
      out.write("\t\tvar userType = data.userType;\r\n");
      out.write("\t\tvar locked = data.locked;\r\n");
      out.write("\t\tvar credit = data.credit;\r\n");
      out.write("\t\t var index = layer.open({\r\n");
      out.write("\t\t\t  title: '编辑用户',\r\n");
      out.write("\t\t\t  type: 2,\r\n");
      out.write("\t\t\t  skin: 'layui-layer-rim', //加上边框\r\n");
      out.write("\t\t\t  area: ['1000px', '650px'], //宽高\r\n");
      out.write("\t\t\t  content: \"/toSetting?userId=\"+userId+\"&userName=\"+userName+\"&userType=\"+userType+\"&locked=\"+locked+\r\n");
      out.write("\t\t\t\t\t  \"&credit=\"+credit,\r\n");
      out.write("\t\t\t  success:function(data)\r\n");
      out.write("\t\t\t  {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t\t}); \r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  var $ = layui.$, active = {\r\n");
      out.write("    getCheckData: function(){ //获取选中数据\r\n");
      out.write("      var checkStatus = table.checkStatus('idTest')\r\n");
      out.write("      ,data = checkStatus.data;\r\n");
      out.write("      layer.alert(JSON.stringify(data));\r\n");
      out.write("    }\r\n");
      out.write("    ,getCheckLength: function(){ //获取选中数目\r\n");
      out.write("      var checkStatus = table.checkStatus('idTest')\r\n");
      out.write("      ,data = checkStatus.data;\r\n");
      out.write("      layer.msg('选中了：'+ data.length + ' 个');\r\n");
      out.write("    }\r\n");
      out.write("    ,isAll: function(){ //验证是否全选\r\n");
      out.write("      var checkStatus = table.checkStatus('idTest');\r\n");
      out.write("      layer.msg(checkStatus.isAll ? '全选': '未全选')\r\n");
      out.write("    }\r\n");
      out.write("  };\r\n");
      out.write("  \r\n");
      out.write("  $('.demoTable .layui-btn').on('click', function(){\r\n");
      out.write("    var type = $(this).data('type');\r\n");
      out.write("    active[type] ? active[type].call(this) : '';\r\n");
      out.write("  });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
