/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-23 02:52:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stationMonitor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("\t<head>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<title>Hello, World</title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\thtml {\r\n");
      out.write("\t\t\t\theight: 100%\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tbody {\r\n");
      out.write("\t\t\t\theight: 100%;\r\n");
      out.write("\t\t\t\tmargin: 0px;\r\n");
      out.write("\t\t\t\tpadding: 0px\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#container {\r\n");
      out.write("\t\t\t\theight: 100%\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=3.0&ak=xoKsurOO9lwXDwRt57TMef0A4eZ5m2ir\">\r\n");
      out.write("\t\t\t//v3.0版本的引用方式：src=\"http://api.map.baidu.com/api?v=3.0&ak=您的密钥\"\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/SearchInfoWindow_min.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://api.map.baidu.com/library/SearchInfoWindow/1.5/src/Sea\r\n");
      out.write("\t\trchInfoWindow_min.css\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"utf-8\" src=\"/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../../statics/css/layui.css\" media=\"all\">\r\n");
      out.write("\t\t\t<script src=\"../../statics/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"container\"></div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"infos\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${info}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tvar map = new BMap.Map(\"container\");\r\n");
      out.write("\t\t\tvar point = new BMap.Point(118.844765, 32.065069);\r\n");
      out.write("\t\t\tmap.centerAndZoom(point, 10); // 编写自定义函数，创建标注 \r\n");
      out.write("\t\t\tmap.enableScrollWheelZoom(true);\r\n");
      out.write("\t\t\t/*var icon = new BMap.Icon(\"markers.png\",new BMap.Size(23,25),{\r\n");
      out.write("\t\t\t});*/\r\n");
      out.write("\t\t\tvar longtitude=[];\r\n");
      out.write("\t\t\tvar latitude = [];\r\n");
      out.write("\t\t\tvar sid = [];\r\n");
      out.write("\t\t\tvar loca =[];\r\n");
      out.write("\t\t\tvar markPoints = [];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar sids = document.getElementsByClassName(\"sid\");\r\n");
      out.write("\t\t\r\n");
      out.write("             for(var i=0;i<sids.length;i++)\r\n");
      out.write("            {\r\n");
      out.write("            \tmarkPoints.push(\r\n");
      out.write("            \t\t{\r\n");
      out.write("            \t\t\ty:longtitude[i],\r\n");
      out.write("            \t\t\tx:latitude[i],\r\n");
      out.write("            \t\t\ttitle:loca[i],\r\n");
      out.write("            \t\t\tcon:sids[i],\r\n");
      out.write("            \t\t\tbranch:i\r\n");
      out.write("            \t\t}\t\t\r\n");
      out.write("            \t)\r\n");
      out.write("            } \r\n");
      out.write("            alert(JSON.stringify(markPoints));\r\n");
      out.write("             var marker = new BMap.Marker(point);\r\n");
      out.write("            map.addOverlay(marker);\r\n");
      out.write("            function markFun(points,label,infoWindows){\r\n");
      out.write("            \tvar markers = new BMap.Marker(points);\r\n");
      out.write("            \tmap.addOverlay(markers);\r\n");
      out.write("            \tmarkers.setLabel(label);\r\n");
      out.write("            \tmarkers.addEventListener(\"click\",function(event){\r\n");
      out.write("            \t\tmap.openInfoWindow(infoWindows,points);\r\n");
      out.write("            \t})\r\n");
      out.write("            }\r\n");
      out.write("           var j =0;\r\n");
      out.write("\t\t\tfor( ;j<markPoints.length;j++)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar point = new BMap.Point(markPoints[j].y,markPoints[j].x);\r\n");
      out.write("\t\t\t\tvar label = new BMap.Label(markPoints[j].branch,{\r\n");
      out.write("\t                    offset:new BMap.Size(25,5)\r\n");
      out.write("\t                });\r\n");
      out.write("\t\t\t\tvar info = new BMap.InfoWindow(markPoints[j].con,\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\twidth:200,\r\n");
      out.write("\t\t\t\t\t\t\theight:200,\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\tmarkFun(point,label,info);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
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
    // /WEB-INF/jsp/stationMonitor.jsp(39,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/stationMonitor.jsp(39,2) '${info }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${info }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/stationMonitor.jsp(39,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div  style=\"display:hidden\" class=\"sid\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.sid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t<div class=\"layui-form\" style=\"display:hidden\">\r\n");
          out.write("\t\t\t\t\t<table style=\"display:hidden\" class=\"layui-table\">\r\n");
          out.write("\t\t\t\t\t\t<colgroup>\r\n");
          out.write("\t\t\t\t\t\t\t<col width=\"120\"/>\r\n");
          out.write("\t\t\t\t\t\t\t<col />\r\n");
          out.write("\t\t\t\t\t\t</colgroup>\r\n");
          out.write("\t\t\t\t\t\t<thead>\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<th colspan=\"2\"><i class=\"layui-icon layui-icon-release\" style=\"font-size: 30px; color: #1E9FFF;\"></i>  \r\n");
          out.write("\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.location }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</th>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t</thead>\r\n");
          out.write("\t\t\t\t\t\t<tbody>\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t站点编号:\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.sid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t站点负责人:\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.charge}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<button class=\"layui-btn layui-btn-normal layui-btn-sm\">查看详情</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t</tbody>\r\n");
          out.write("\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/stationMonitor.jsp(97,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/stationMonitor.jsp(97,3) '${info}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${info}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/stationMonitor.jsp(97,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("i");
    // /WEB-INF/jsp/stationMonitor.jsp(97,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\tlongtitude.push(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.longtitude}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(");\r\n");
          out.write("\t\t\t\tlatitude.push(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.latitude}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(");\r\n");
          out.write("\t\t\t\tloca.push(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\");\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t/* markPoints.push(\r\n");
          out.write("\t            \t\t{\r\n");
          out.write("\t            \t\t\ty:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.longtitude}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(",\r\n");
          out.write("\t            \t\t\tx:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.latitude}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(",\r\n");
          out.write("\t            \t\t\ttitle:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.location}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\",\r\n");
          out.write("\t            \t\t\tcon:sids[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("],\r\n");
          out.write("\t            \t\t\tbranch:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t            \t\t});\t */\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("       \t ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
