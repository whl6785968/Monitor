/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-23 08:51:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<script src=\"../../statics/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../statics/css/layui.css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/statics/js/bootstrap.min.js\" media=\"all\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"/echarts/echarts.min.js\" media=\"all\"> -->\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\"\r\n");
      out.write("\tsrc=\"/echarts/echarts.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"/echarts/china.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\"\r\n");
      out.write("\tsrc=\"/echarts/dataTool.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("html {\r\n");
      out.write("\tbackground-color: #f2f2f2;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-shortcut {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-shortcut li .layui-icon {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 60px;\r\n");
      out.write("\tline-height: 60px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tbackground-color: #F8F8F8;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("\ttransition: all .3s;\r\n");
      out.write("\t-webkit-transition: all .3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a cite {\r\n");
      out.write("\tfont-style: normal;\r\n");
      out.write("\t*cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-shortcut li {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-backlog-body h3 {\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-backlog .layadmin-backlog-body {\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-backlog-body p cite {\r\n");
      out.write("\tfont-style: normal;\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\tcolor: #009688;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-backlog .layadmin-backlog-body {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tpadding: 10px 15px;\r\n");
      out.write("\tbackground-color: #f8f8f8;\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\ttransition: all .3s;\r\n");
      out.write("\t-webkit-transition: all .3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layui-edge-top {\r\n");
      out.write("\ttop: -4px;\r\n");
      out.write("\tborder-bottom-color: #999;\r\n");
      out.write("\tborder-bottom-style: solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layui-progress {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\theight: 6px;\r\n");
      out.write("\tborder-radius: 20px;\r\n");
      out.write("\tbackground-color: #e2e2e2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-takerates .layui-progress {\r\n");
      out.write("\tmargin: 50px 0 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layui-card-header {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\theight: 42px;\r\n");
      out.write("\tline-height: 42px;\r\n");
      out.write("\tpadding: 0 15px;\r\n");
      out.write("\tborder-bottom: 1px solid #f6f6f6;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("\tborder-radius: 2px 2px 0 0;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layui-card-body {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tpadding: 10px 15px;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tline-height: 24px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-takerates {\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-takerates .layui-progress-bar {\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layui-progress-bar {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\twidth: 0;\r\n");
      out.write("\tmax-width: 100%;\r\n");
      out.write("\theight: 6px;\r\n");
      out.write("\tborder-radius: 20px;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\tbackground-color: #5FB878;\r\n");
      out.write("\ttransition: all .3s;\r\n");
      out.write("\t-webkit-transition: all .3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-takerates .layui-progress-text {\r\n");
      out.write("\ttop: -35px;\r\n");
      out.write("\tline-height: 26px;\r\n");
      out.write("\tfont-size: 26px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layui-progress-text {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\ttop: -20px;\r\n");
      out.write("\tline-height: 18px;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layadmin-takerates .layui-progress h3 {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tright: 0;\r\n");
      out.write("\ttop: -35px;\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".layui-card {\r\n");
      out.write("\tmargin-bottom: 15px;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("\tbox-shadow: 0 1px 2px 0 rgba(0, 0, 0, .05);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body class=\"childrenBody\">\r\n");
      out.write("\t<div class=\"layui-fluid\">\r\n");
      out.write("\t\t<div class=\"layui-row layui-col-space15\">\r\n");
      out.write("\t\t\t<div class=\"layui-col-md8\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-row layui-col-space15\">\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-col-md6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-card-header\">功能</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layadmin-shortcut\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"layui-col-space10 layui-this\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md3\"><a> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-icon layui-icon-console\"> </i> <cite>主页一</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md3\"><a> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-icon layui-icon-chart\"> </i> <cite>主页二</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md3\"><a> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-icon layui-icon-template-1\"> </i> <cite>弹层</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md3\"><a> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-icon layui-icon-chat\"> </i> <cite>聊天</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md3\"><a> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-icon layui-icon-find-fill\"> </i> <cite>进度条</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md3\"><a> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-icon layui-icon-survey\"> </i> <cite>调查</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md3\"><a> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-icon layui-icon-user\"> </i> <cite>用户</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md3\"><a> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-icon layui-icon-set\"> </i> <cite>设置</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-col-md6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-card-header\">设备详情</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layadmin-backlog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"layui-row layui-col-space10 layui-this\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md6\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"layadmin-backlog-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3>正常设备</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<cite>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${norCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md6\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"layadmin-backlog-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3>异常设备</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<cite>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errCount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md6\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"layadmin-backlog-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3>维修设备</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<cite>99</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"layui-col-md6\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"layadmin-backlog-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h3>其他</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<cite>20</cite>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-col-md12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-card-header\">数据概览</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layadmin-dataview\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"speedChart\" style=\"display: none;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- ä¸º ECharts åå¤ä¸ä¸ªå·å¤å¤§å°ï¼å®½é«ï¼ç DOM -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"speedChartMain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 811px; height: 332px; position: relative;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-card-header\">数据概览</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"layadmin-dataview\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"lineChart\" style=\"display: none;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- ä¸º ECharts åå¤ä¸ä¸ªå·å¤å¤§å°ï¼å®½é«ï¼ç DOM -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"lineChartMain\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 811px; height: 332px; position: relative;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-col-md4\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-card\">\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card-header\">异常设备</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card-body layui-text\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"layui-table\">\r\n");
      out.write("\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t<col width=\"100\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<col />\r\n");
      out.write("\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>渠道</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"layui-btn-container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"layui-btn layui-btn-danger\">你好</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"layui-btn\">我不好</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-card\">\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card-header\">效果报告 </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card-body layadmin-takerates\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-progress\" lay-showpercent=\"yes\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t转化率(日同比28% )<span class=\"layui-edge layui-edge-top\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlay-tips=\"å¢é¿\" lay-offset=\"-15\"></span>)\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-progress-bar\" lay-percent=\"65%\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 65%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"layui-progress-text\">65%</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-progress\" lay-showpercent=\"yes\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t转化率(日同比28% ) <span class=\"layui-edge layui-edge-top\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlay-tips=\"å¢é¿\" lay-offset=\"-15\"></span>)\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-progress-bar\" lay-percent=\"65%\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 65%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"layui-progress-text\">65%</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-card\">\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card-header\">实时监控</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-card-body layadmin-takerates\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-progress\" lay-showpercent=\"yes\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t转化率(日同比28% )<span class=\"layui-edge layui-edge-top\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlay-tips=\"å¢é¿\" lay-offset=\"-15\"></span>)\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-progress-bar\" lay-percent=\"65%\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 65%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"layui-progress-text\">65%</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-progress\" lay-showpercent=\"yes\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t转化率(日同比28% ) <span class=\"layui-edge layui-edge-top\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlay-tips=\"å¢é¿\" lay-offset=\"-15\"></span>)\r\n");
      out.write("\t\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"layui-progress-bar\" lay-percent=\"65%\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 65%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"layui-progress-text\">65%</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("/* \tfunction someDetail(){\r\n");
      out.write("\t\tlayui.use(['layer','jquery'],function(){\r\n");
      out.write("\t\t\tvar $$ = layui.jquery,\r\n");
      out.write("\t\t\tlayer = layui.layer;\r\n");
      out.write("\t\t\t$$.ajax({\r\n");
      out.write("\t\t\t\ttype:'post',\r\n");
      out.write("\t\t\t\turl:'/showMainDetail',\r\n");
      out.write("\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\tsuccess:function(data)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t} */\r\n");
      out.write("\tvar dataAll = [\r\n");
      out.write("\t\t\t[ [ 10.0, 8.04 ], [ 8.0, 6.95 ], [ 13.0, 7.58 ], [ 9.0, 8.81 ],\r\n");
      out.write("\t\t\t\t\t[ 11.0, 8.33 ], [ 14.0, 9.96 ], [ 6.0, 7.24 ],\r\n");
      out.write("\t\t\t\t\t[ 4.0, 4.26 ], [ 12.0, 10.84 ], [ 7.0, 4.82 ],\r\n");
      out.write("\t\t\t\t\t[ 5.0, 5.68 ] ],\r\n");
      out.write("\t\t\t[ [ 10.0, 9.14 ], [ 8.0, 8.14 ], [ 13.0, 8.74 ], [ 9.0, 8.77 ],\r\n");
      out.write("\t\t\t\t\t[ 11.0, 9.26 ], [ 14.0, 8.10 ], [ 6.0, 6.13 ],\r\n");
      out.write("\t\t\t\t\t[ 4.0, 3.10 ], [ 12.0, 9.13 ], [ 7.0, 7.26 ], [ 5.0, 4.74 ] ],\r\n");
      out.write("\t\t\t[ [ 10.0, 7.46 ], [ 8.0, 6.77 ], [ 13.0, 12.74 ], [ 9.0, 7.11 ],\r\n");
      out.write("\t\t\t\t\t[ 11.0, 7.81 ], [ 14.0, 8.84 ], [ 6.0, 6.08 ],\r\n");
      out.write("\t\t\t\t\t[ 4.0, 5.39 ], [ 12.0, 8.15 ], [ 7.0, 6.42 ], [ 5.0, 5.73 ] ],\r\n");
      out.write("\t\t\t[ [ 8.0, 6.58 ], [ 8.0, 5.76 ], [ 8.0, 7.71 ], [ 8.0, 8.84 ],\r\n");
      out.write("\t\t\t\t\t[ 8.0, 8.47 ], [ 8.0, 7.04 ], [ 8.0, 5.25 ],\r\n");
      out.write("\t\t\t\t\t[ 19.0, 12.50 ], [ 8.0, 5.56 ], [ 8.0, 7.91 ],\r\n");
      out.write("\t\t\t\t\t[ 8.0, 6.89 ] ] ];\r\n");
      out.write("\r\n");
      out.write("\tvar markLineOpt = {\r\n");
      out.write("\t\tanimation : false,\r\n");
      out.write("\t\tlabel : {\r\n");
      out.write("\t\t\tnormal : {\r\n");
      out.write("\t\t\t\tformatter : 'y = 0.5 * x + 3',\r\n");
      out.write("\t\t\t\ttextStyle : {\r\n");
      out.write("\t\t\t\t\talign : 'right'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tlineStyle : {\r\n");
      out.write("\t\t\tnormal : {\r\n");
      out.write("\t\t\t\ttype : 'solid'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\ttooltip : {\r\n");
      out.write("\t\t\tformatter : 'y = 0.5 * x + 3'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tdata : [ [ {\r\n");
      out.write("\t\t\tcoord : [ 0, 3 ],\r\n");
      out.write("\t\t\tsymbol : 'none'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tcoord : [ 20, 13 ],\r\n");
      out.write("\t\t\tsymbol : 'none'\r\n");
      out.write("\t\t} ] ]\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\toption = {\r\n");
      out.write("\t\ttitle : {\r\n");
      out.write("\t\t\ttext : 'Anscombe\\'s quartet',\r\n");
      out.write("\t\t\tx : 'center',\r\n");
      out.write("\t\t\ty : 0\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tgrid : [ {\r\n");
      out.write("\t\t\tx : '7%',\r\n");
      out.write("\t\t\ty : '7%',\r\n");
      out.write("\t\t\twidth : '38%',\r\n");
      out.write("\t\t\theight : '38%'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tx2 : '7%',\r\n");
      out.write("\t\t\ty : '7%',\r\n");
      out.write("\t\t\twidth : '38%',\r\n");
      out.write("\t\t\theight : '38%'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tx : '7%',\r\n");
      out.write("\t\t\ty2 : '7%',\r\n");
      out.write("\t\t\twidth : '38%',\r\n");
      out.write("\t\t\theight : '38%'\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tx2 : '7%',\r\n");
      out.write("\t\t\ty2 : '7%',\r\n");
      out.write("\t\t\twidth : '38%',\r\n");
      out.write("\t\t\theight : '38%'\r\n");
      out.write("\t\t} ],\r\n");
      out.write("\t\ttooltip : {\r\n");
      out.write("\t\t\tformatter : 'Group {a}: ({c})'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\txAxis : [ {\r\n");
      out.write("\t\t\tgridIndex : 0,\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 20\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tgridIndex : 1,\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 20\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tgridIndex : 2,\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 20\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tgridIndex : 3,\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 20\r\n");
      out.write("\t\t} ],\r\n");
      out.write("\t\tyAxis : [ {\r\n");
      out.write("\t\t\tgridIndex : 0,\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 15\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tgridIndex : 1,\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 15\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tgridIndex : 2,\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 15\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tgridIndex : 3,\r\n");
      out.write("\t\t\tmin : 0,\r\n");
      out.write("\t\t\tmax : 15\r\n");
      out.write("\t\t} ],\r\n");
      out.write("\t\tseries : [ {\r\n");
      out.write("\t\t\tname : 'I',\r\n");
      out.write("\t\t\ttype : 'scatter',\r\n");
      out.write("\t\t\txAxisIndex : 0,\r\n");
      out.write("\t\t\tyAxisIndex : 0,\r\n");
      out.write("\t\t\tdata : dataAll[0],\r\n");
      out.write("\t\t\tmarkLine : markLineOpt\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tname : 'II',\r\n");
      out.write("\t\t\ttype : 'scatter',\r\n");
      out.write("\t\t\txAxisIndex : 1,\r\n");
      out.write("\t\t\tyAxisIndex : 1,\r\n");
      out.write("\t\t\tdata : dataAll[1],\r\n");
      out.write("\t\t\tmarkLine : markLineOpt\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tname : 'III',\r\n");
      out.write("\t\t\ttype : 'scatter',\r\n");
      out.write("\t\t\txAxisIndex : 2,\r\n");
      out.write("\t\t\tyAxisIndex : 2,\r\n");
      out.write("\t\t\tdata : dataAll[2],\r\n");
      out.write("\t\t\tmarkLine : markLineOpt\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\tname : 'IV',\r\n");
      out.write("\t\t\ttype : 'scatter',\r\n");
      out.write("\t\t\txAxisIndex : 3,\r\n");
      out.write("\t\t\tyAxisIndex : 3,\r\n");
      out.write("\t\t\tdata : dataAll[3],\r\n");
      out.write("\t\t\tmarkLine : markLineOpt\r\n");
      out.write("\t\t} ]\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("\tvar myChart = echarts.init(document.getElementById('speedChartMain'));\r\n");
      out.write("\tmyChart.setOption(option);\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction openEquipDetail(eid){\r\n");
      out.write("\t\tlayui.use(['layer','jquery'],function(){\r\n");
      out.write("\t\t\tvar layer = layui.layer,\r\n");
      out.write("\t\t\t$$ = layui.jquery;\r\n");
      out.write("\t/* \t\tvar eid = $$(\"#equipId\").val(); */\r\n");
      out.write("\t\t\talert(eid);\r\n");
      out.write("\t\t\t$$(window).one(\"resize\",function(){\r\n");
      out.write("\t\t\t\tvar index = layer.open({\r\n");
      out.write("\t\t\t\t\ttitle :'设备详情',\r\n");
      out.write("\t\t\t\t\ttype:2,\r\n");
      out.write("\t\t\t\t\tmaxmin: true,\r\n");
      out.write("\t\t\t\t\tresize:true,\r\n");
      out.write("\t\t\t\t\tskin: 'layui-layer-rim', \r\n");
      out.write("\t\t\t\t\tarea: ['1500px', '850px'],\r\n");
      out.write("\t\t\t\t\tcontent:'/showEquipDetailed?eid='+eid,\r\n");
      out.write("\t\t\t\t\tsuccess:function(){\r\n");
      out.write("\t\t\t\t\t\t layer.tips('按x返回', '.layui-layer-setwin .layui-layer-close',{tips:1});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\tlayer.full(index);\r\n");
      out.write("\t\t\t}).resize();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/* layer.msg('sss'); */\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar base = +new Date(1968, 9, 3);\r\n");
      out.write("\tvar oneDay = 24 * 3600 * 1000;\r\n");
      out.write("\tvar date = [];\r\n");
      out.write("\r\n");
      out.write("\tvar data = [ Math.random() * 300 ];\r\n");
      out.write("\r\n");
      out.write("\tfor (var i = 1; i < 20000; i++) {\r\n");
      out.write("\t\tvar now = new Date(base += oneDay);\r\n");
      out.write("\t\tdate.push([ now.getFullYear(), now.getMonth() + 1, now.getDate() ]\r\n");
      out.write("\t\t\t\t.join('/'));\r\n");
      out.write("\t\tdata.push(Math.round((Math.random() - 0.5) * 20 + data[i - 1]));\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\toption = {\r\n");
      out.write("\t\ttooltip : {\r\n");
      out.write("\t\t\ttrigger : 'axis',\r\n");
      out.write("\t\t\tposition : function(pt) {\r\n");
      out.write("\t\t\t\treturn [ pt[0], '10%' ];\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\ttitle : {\r\n");
      out.write("\t\t\tleft : 'center',\r\n");
      out.write("\t\t\ttext : 'å¤§æ°æ®éé¢ç§¯å¾',\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\ttoolbox : {\r\n");
      out.write("\t\t\tfeature : {\r\n");
      out.write("\t\t\t\tdataZoom : {\r\n");
      out.write("\t\t\t\t\tyAxisIndex : 'none'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\trestore : {},\r\n");
      out.write("\t\t\t\tsaveAsImage : {}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\txAxis : {\r\n");
      out.write("\t\t\ttype : 'category',\r\n");
      out.write("\t\t\tboundaryGap : false,\r\n");
      out.write("\t\t\tdata : date\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tyAxis : {\r\n");
      out.write("\t\t\ttype : 'value',\r\n");
      out.write("\t\t\tboundaryGap : [ 0, '100%' ]\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tdataZoom : [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttype : 'inside',\r\n");
      out.write("\t\t\t\t\tstart : 0,\r\n");
      out.write("\t\t\t\t\tend : 10\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tstart : 0,\r\n");
      out.write("\t\t\t\t\tend : 10,\r\n");
      out.write("\t\t\t\t\thandleIcon : 'M10.7,11.9v-1.3H9.3v1.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4v1.3h1.3v-1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7V23h6.6V24.4z M13.3,19.6H6.7v-1.4h6.6V19.6z',\r\n");
      out.write("\t\t\t\t\thandleSize : '80%',\r\n");
      out.write("\t\t\t\t\thandleStyle : {\r\n");
      out.write("\t\t\t\t\t\tcolor : '#fff',\r\n");
      out.write("\t\t\t\t\t\tshadowBlur : 3,\r\n");
      out.write("\t\t\t\t\t\tshadowColor : 'rgba(0, 0, 0, 0.6)',\r\n");
      out.write("\t\t\t\t\t\tshadowOffsetX : 2,\r\n");
      out.write("\t\t\t\t\t\tshadowOffsetY : 2\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t} ],\r\n");
      out.write("\t\tseries : [ {\r\n");
      out.write("\t\t\tname : '大数据图',\r\n");
      out.write("\t\t\ttype : 'line',\r\n");
      out.write("\t\t\tsmooth : true,\r\n");
      out.write("\t\t\tsymbol : 'none',\r\n");
      out.write("\t\t\tsampling : 'average',\r\n");
      out.write("\t\t\titemStyle : {\r\n");
      out.write("\t\t\t\tcolor : 'rgb(255, 70, 131)'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tareaStyle : {\r\n");
      out.write("\t\t\t\tcolor : new echarts.graphic.LinearGradient(0, 0, 0, 1, [ {\r\n");
      out.write("\t\t\t\t\toffset : 0,\r\n");
      out.write("\t\t\t\t\tcolor : 'rgb(255, 158, 68)'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\toffset : 1,\r\n");
      out.write("\t\t\t\t\tcolor : 'rgb(255, 70, 131)'\r\n");
      out.write("\t\t\t\t} ])\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdata : data\r\n");
      out.write("\t\t} ]\r\n");
      out.write("\t};\r\n");
      out.write("\tvar linechart = echarts.init(document.getElementById('lineChartMain'));\r\n");
      out.write("\tlinechart.setOption(option);\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/main.jsp(293,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/main.jsp(293,8) '${errEquip}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${errEquip}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/main.jsp(293,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("e");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td> <a href=\"javascript:void(0)\" onclick=\"openEquipDetail(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.eid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(')');
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.eid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td><span class=\"layui-badge\" style=\"width:130px;height:30px;font-size: 15px;text-align: center;line-height: 30px;\">该设备出现异常!!!</span></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
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
