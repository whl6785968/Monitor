/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-29 11:03:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stationDataQuery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../../themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/demo.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/jquery.easyui.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"margin: 20px 0;\"></div>\r\n");
      out.write("\t<table id=\"dg\" class=\"easyui-datagrid\" title=\"DataGrid Complex Toolbar\"\r\n");
      out.write("\t\tstyle=\"width: 100%; height: 500px\"\r\n");
      out.write("\t\tdata-options=\"rownumbers:true,singleSelect:true,url:'/getDetailData',method:'get',toolbar:'#tb'\" pagination=\"true\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'iid',width:80,align:'center'\">站点编号</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'itime',width:150,align:'center',formatter: DateTimeFormatter\">时间</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'tss',width:70,align:'center'\">tss</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'cod',width:70,align:'center'\">cod</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'tn',width:70,align:'center'\">tn</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'tp',width:70,align:'center'\">tp</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'dissolve',width:100,align:'center'\">dissolve</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'ph',width:70,align:'center'\">ph</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'temper',width:70,align:'center'\">temper</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'nhn',width:70,align:'center'\">nhn</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'conductivity',width:70,align:'center'\">conductivity</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div id=\"tb\" style=\"padding: 5px; height: auto\">\r\n");
      out.write("\t\t<div style=\"margin-bottom: 5px\">\r\n");
      out.write("\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\"\r\n");
      out.write("\t\t\t\tonclick=\"addInfo()\"></a> \r\n");
      out.write("\t\t\t<a href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\ticonCls=\"icon-edit\" plain=\"true\" onclick=\"editInfo()\"></a> \r\n");
      out.write("\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\"\r\n");
      out.write("\t\t\t\tplain=\"true\" onclick=\"removeInfo()\"></a>\r\n");
      out.write("\t\t\t<a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"easyui-linkbutton\" iconCls=\"icon-save\" plain=\"true\"></a> \r\n");
      out.write("\t\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-cut\" plain=\"true\"></a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tDate From: <input id=\"from\" class=\"easyui-datebox\" style=\"width: 80px\">\r\n");
      out.write("\t\t\tTo: <input id=\"to\" class=\"easyui-datebox\" style=\"width: 80px\">\r\n");
      out.write("\t\t\tstation: <select id=\"sid\" class=\"easyui-combobox\" panelHeight=\"auto\" style=\"width: 100px\">\r\n");
      out.write("\t\t\t\t<option value=\"0\">--显示全部--</option>\r\n");
      out.write("\t\t\t\t<option value=\"1\">玄武区</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">句容市</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">江宁区</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">秦淮区</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\tChoose: <select id=\"op\" class=\"easyui-combobox\" panelHeight=\"auto\" style=\"width: 100px\">\r\n");
      out.write("\t\t\t\t<option value=\"0\">--显示全部--</option>\r\n");
      out.write("\t\t\t\t<option value=\"1\">显示当天数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">显示昨天数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">显示近7天数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">显示近30天数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">显示本周数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"6\">显示上周数据</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\tChoose: <select id=\"op2\" class=\"easyui-combobox\" panelHeight=\"auto\" style=\"width: 100px\">\r\n");
      out.write("\t\t\t\t<option value=\"0\">--显示全部--</option>\r\n");
      out.write("\t\t\t\t<option value=\"1\">显示本月数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">显示上一月数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">显示本季度数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">显示上季度数据</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">显示本年数据</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<a href=\"javascript:search()\" class=\"easyui-linkbutton\" iconCls=\"icon-search\">Search</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"dlg\" class=\"easyui-dialog\"\r\n");
      out.write("\t\tstyle=\"width: 400px; height: 500px; padding: 10px 20px\" closed=\"true\"\r\n");
      out.write("\t\tbuttons=\"#dlg-buttons\">\r\n");
      out.write("\t\t<form id=\"fm\" method=\"post\">\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label style=\"width:100px\">站点编号:       </label> <input id =\"iid\" name=\"iid\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label style=\"width:100px\">时间:</label> <input id=\"itime\" name=\"itime\"\r\n");
      out.write("\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>tss:       </label> <input id=\"tss\" name=\"tss\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>cod:   </label> <input id=\"cod\" name=\"cod\" class=\"easyui-validatebox\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>tn:      </label> <input id=\"tn\" name=\"tn\" class=\"easyui-validatebox\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>tp:            </label> <input id=\"tp\" name=\"tp\" class=\"easyui-validatebox\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>dissolve:           </label> <input id=\"dissolve\" name=\"dissolve\" class=\"easyui-validatebox\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>ph:           </label> <input id=\"ph\" name=\"ph\" class=\"easyui-validatebox\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>temper:           </label> <input id=\"temper\" name=\"temper\" class=\"easyui-validatebox\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>nhn:           </label> <input id=\"nhn\" name=\"nhn\" class=\"easyui-validatebox\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"fitem\">\r\n");
      out.write("\t\t\t\t<label>conductivity:           </label> <input id=\"conductivity\" name=\"conductivity\" class=\"easyui-validatebox\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"dlg-buttons\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\tonclick=\"saveUser()\">Save</a> <a href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\ticonCls=\"icon-cancel\" onclick=\"javascript:$('#dlg').dialog('close')\">Cancel</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar url;\r\n");
      out.write("\tfunction addInfo(){\r\n");
      out.write("\t\t$('#dlg').dialog('open').dialog('setTitle','添加新站点');\r\n");
      out.write("\t\t$('#fm').form('clear');\r\n");
      out.write("\t \turl = '/insertStation';\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction saveUser(){\r\n");
      out.write("\t\tif(!$('#fm').form('validate')){\r\n");
      out.write("\t\t\t$.messager.alert('提示','表单还未填写完成!');\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$.post(url,$(\"#fm\").serialize(), function(data){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tif(data=!null){\r\n");
      out.write("\t\t\t\t$.messager.alert('提示','新增/修改商品成功!');\r\n");
      out.write("\t\t\t\t$('#dlg').dialog('close');\r\n");
      out.write("\t\t\t\t$('#dg').datagrid('reload');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction editInfo()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar row = $('#dg').datagrid('getSelected');\r\n");
      out.write("\t\tvar rsid = $(\"#sid\");\r\n");
      out.write("\t\tif (row){\r\n");
      out.write("\t\t\t$('#dlg').dialog('open').dialog('setTitle','Edit User');\r\n");
      out.write("\t\t\t $('#fm').form('load',row); \r\n");
      out.write("\t\t\t$('#sid').attr(\"disabled\",true);\r\n");
      out.write("\t\t\t url=\"/editStation\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction removeInfo()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar row = $('#dg').datagrid('getSelected');\r\n");
      out.write("\t\talert(row.sid);\r\n");
      out.write("\t\tif (row){\r\n");
      out.write("\t\t\t$.messager.confirm('Confirm','Are you sure you want to destroy this station?',function(r){\r\n");
      out.write("\t\t\t\tif (r){\r\n");
      out.write("\t\t\t\t\t$.post('/removeInfo',{'sid':row.sid},function(data){\r\n");
      out.write("\t\t\t\t\t\t\tif(data!=null)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('提示','删除商品成功!');\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#dg').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t},'json');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction search()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$('#dg').datagrid('load',{\r\n");
      out.write("\t\t\tfrom:$(\"#from\").val(),\r\n");
      out.write("\t\t\tto:$(\"#to\").val(),\r\n");
      out.write("\t\t\top:$(\"#op\").val()\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tDate.prototype.format = function(fmt) { \r\n");
      out.write("\t    var o = { \r\n");
      out.write("\t       \"M+\" : this.getMonth()+1,                 //月份 \r\n");
      out.write("\t       \"d+\" : this.getDate(),                    //日 \r\n");
      out.write("\t       \"h+\" : this.getHours(),                   //小时 \r\n");
      out.write("\t       \"m+\" : this.getMinutes(),                 //分 \r\n");
      out.write("\t       \"s+\" : this.getSeconds(),                 //秒 \r\n");
      out.write("\t       \"q+\" : Math.floor((this.getMonth()+3)/3), //季度 \r\n");
      out.write("\t       \"S\"  : this.getMilliseconds()             //毫秒 \r\n");
      out.write("\t   }; \r\n");
      out.write("\t   if(/(y+)/.test(fmt)) {\r\n");
      out.write("\t           fmt=fmt.replace(RegExp.$1, (this.getFullYear()+\"\").substr(4 - RegExp.$1.length)); \r\n");
      out.write("\t   }\r\n");
      out.write("\t    for(var k in o) {\r\n");
      out.write("\t       if(new RegExp(\"(\"+ k +\")\").test(fmt)){\r\n");
      out.write("\t            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : ((\"00\"+ o[k]).substr((\"\"+ o[k]).length)));\r\n");
      out.write("\t        }\r\n");
      out.write("\t    }\r\n");
      out.write("\t   return fmt; \r\n");
      out.write("\t}       \r\n");
      out.write("\tfunction DateTimeFormatter(value) {\r\n");
      out.write("\t    if (value == undefined) {\r\n");
      out.write("\t        return \"\";\r\n");
      out.write("\t    }\r\n");
      out.write("\t \tvar commontTime = new Date(value);\r\n");
      out.write("\t    return commontTime.format(\"yyyy-MM-dd hh:mm:ss\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
