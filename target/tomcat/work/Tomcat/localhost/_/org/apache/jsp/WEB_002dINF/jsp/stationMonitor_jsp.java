/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-25 07:48:51 UTC
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
      out.write("\t\t\t\theight: 100%;\r\n");
      out.write("\t\t\t\twidth:100%;\r\n");
      out.write("\t\t\t\tpostion:relative;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#lis{\r\n");
      out.write("\t\t\t\theight:100%;\r\n");
      out.write("\t\t\t\twidth:20%;\r\n");
      out.write("\t\t\t\tpostion:relative\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t/* \t#lis{\r\n");
      out.write("\t\t\t\t postion:absolute;\r\n");
      out.write("\t\t\t\t height:300px;\r\n");
      out.write("\t\t\t\t width:300px;\r\n");
      out.write("\t\t\t\t top:80px;\r\n");
      out.write("\t\t\t\t border:1px black solid;\r\n");
      out.write("\t\t\t\t background-color:darkorange;\r\n");
      out.write("\t\t\t\t z-index:99\r\n");
      out.write("\t\t\t} */\r\n");
      out.write("\t\t\t.sid{\r\n");
      out.write("\t\t\t\tdisplay:block;\r\n");
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
      out.write("\t\t<div id=\"container\" style=\"border:1px red solid\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
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
      out.write("\t\t\tmap.addControl(new BMap.NavigationControl());\r\n");
      out.write("\t\t\tmap.addControl(new BMap.GeolocationControl());\r\n");
      out.write("\t\t\tmap.addControl(new BMap.OverviewMapControl());\r\n");
      out.write("\t\t\tmap.addControl(new BMap.MapTypeControl());\r\n");
      out.write("\t\t\t//http://developer.baidu.com/map/jsdemo/img/fox.gif\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar longtitude=[];\r\n");
      out.write("\t\t\tvar latitude = [];\r\n");
      out.write("\t\t\tvar esid = [];\r\n");
      out.write("\t\t\tvar usid =[];\r\n");
      out.write("\t\t\tvar loca =[];\r\n");
      out.write("\t\t\tvar markPoints = [];\r\n");
      out.write("\t\t\tvar slevel = [];\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t var arr = [];\r\n");
      out.write("\t\t var jsonstr = {};\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t\talert(JSON.stringify(jsonstr));\r\n");
      out.write("\t\t\t/* alert(usid); */\r\n");
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
      out.write("            \t\t\tbranch:slevel[i]\r\n");
      out.write("            \t\t}\t\t\r\n");
      out.write("            \t)\r\n");
      out.write("          /*   \talert(JSON.stringify(sids[i])); */\r\n");
      out.write("            }\r\n");
      out.write("          \r\n");
      out.write("          /*   alert(JSON.stringify(markPoints));  */\r\n");
      out.write("            var marker = new BMap.Marker(point);\r\n");
      out.write("            map.addOverlay(marker);\r\n");
      out.write("            function markFun(points,label,icon,infoWindows){\r\n");
      out.write("            \tvar markers = new BMap.Marker(points,{icon:myIcon});\r\n");
      out.write("            \tmap.addOverlay(markers);\r\n");
      out.write("            \tmarkers.setLabel(label);\r\n");
      out.write("            \t\r\n");
      out.write("            \tmarkers.addEventListener(\"click\",function(event){\r\n");
      out.write("            \t\tmap.openInfoWindow(infoWindows,points);\r\n");
      out.write("            \t})\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("           var j =0;\r\n");
      out.write("\t\t\tfor( ;j<markPoints.length;j++)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar point = new BMap.Point(markPoints[j].y,markPoints[j].x);\r\n");
      out.write("\t\t\t\tvar label = new BMap.Label(markPoints[j].branch,{\r\n");
      out.write("\t                    offset:new BMap.Size(25,5)\r\n");
      out.write("\t                });\r\n");
      out.write("\t\t\t\tif(markPoints[j].branch==1)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tvar myIcon = new BMap.Icon(\"/imgs/mark2.png\",new BMap.Size(35,40),\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t   anchor: new BMap.Size(10, 15),   \r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(markPoints[j].branch==2)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tvar myIcon = new BMap.Icon(\"/imgs/mark3.png\",new BMap.Size(35,40),\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t   anchor: new BMap.Size(10, 15),   \r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(markPoints[j].branch==3)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tvar myIcon = new BMap.Icon(\"/imgs/mark4.png\",new BMap.Size(35,40),\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t   anchor: new BMap.Size(10, 15),   \r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(markPoints[j].branch==4)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tvar myIcon = new BMap.Icon(\"/imgs/mark5.png\",new BMap.Size(35,40),\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t   anchor: new BMap.Size(10, 15),   \r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\tvar info = new BMap.InfoWindow(markPoints[j].con,\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\twidth:200,\r\n");
      out.write("\t\t\t\t\t\t\theight:250,\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\tmarkFun(point,label,myIcon,info);\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction openDetatil(sid){\r\n");
      out.write("\t\t\t\tlayui.use(['layer','jquery'],function(){\r\n");
      out.write("\t\t\t\t\tvar layer = layui.layer,\r\n");
      out.write("\t\t\t\t\t$$ = layui.jquery;\r\n");
      out.write("\t\t\t/* \t\tvar eid = $$(\"#equipId\").val(); */\r\n");
      out.write("\t\t\t\t\t$$(window).one(\"resize\",function(){\r\n");
      out.write("\t\t\t\t\t\tvar index = layer.open({\r\n");
      out.write("\t\t\t\t\t\t\ttitle :'站点详情',\r\n");
      out.write("\t\t\t\t\t\t\ttype:2,\r\n");
      out.write("\t\t\t\t\t\t\tmaxmin: true,\r\n");
      out.write("\t\t\t\t\t\t\tresize:true,\r\n");
      out.write("\t\t\t\t\t\t\tskin: 'layui-layer-rim', \r\n");
      out.write("\t\t\t\t\t\t\tarea: ['1500px', '850px'],\r\n");
      out.write("\t\t\t\t\t\t\tcontent:'/showStationQuality?sid='+sid,\r\n");
      out.write("\t\t\t\t\t\t\tsuccess:function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t layer.tips('按x返回', '.layui-layer-setwin .layui-layer-close',{tips:1});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\tlayer.full(index);\r\n");
      out.write("\t\t\t\t\t}).resize();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t function DivControl() {\r\n");
      out.write("\t \t\t\t\tthis.defaultAnchor = BMAP_ANCHOR_TOP_LEFT;\r\n");
      out.write("\t \t\t\t\tthis.defaultOffset = new BMap.Size(10, 10);\r\n");
      out.write("\t \t\t\t}\r\n");
      out.write("\t \t\t\tDivControl.prototype = new BMap.Control();\r\n");
      out.write("\t \t\t\tDivControl.prototype.initialize = function(map) {\r\n");
      out.write("\t \t\t\t\tvar div = document.createElement(\"div\");\r\n");
      out.write("\t \t\t\t\t/*\tdiv.appendChild(document.createTextNode(\"这是自定义控件\"));*/\r\n");
      out.write("\t \t\t\t\tvar tb = \"\";\r\n");
      out.write("\t \t\t\t\r\n");
      out.write("\t \t\t\t\tfor(var i=0;i<arr.length;i++)\r\n");
      out.write("\t \t\t\t\t{\r\n");
      out.write("\t \t\t\t\t\tvar co = JSON.stringify(markPoints[i].con);\r\n");
      out.write("\t \t\t\t\t\r\n");
      out.write("\t \t\t\t\t\t\r\n");
      out.write("\t \t\t\t\t\ttb += \"<tr><td align='center'><a href='javascript:proAcityConn(\"+arr[i][0]+\",\"+markPoints[i].y+\",\"+markPoints[i].x+\",\"+co\r\n");
      out.write("\t \t\t\t\t\t\t\t+\")'>\"+arr[i][1]+\"</a></td></tr>\"\r\n");
      out.write("\t \t\t\t\t}\r\n");
      out.write("\t \t\t\t\tdiv.innerHTML = \"<div style='border:1px red solid;width:200px;float:left;'><table class='layui-table'><thead><tr><th style='text-align:center'>站点名称</th></tr></thead><tbody>\"+tb\r\n");
      out.write("\t \t\t\t\t+\"</tbody></table></div><div style='border:1px red solid;width:200px;float:left'><table class='layui-table'><thead><tr><th style='text-align:center'>站点名称</th></tr></thead><tbody id='tbd'></tbody></table></div>\";\r\n");
      out.write("\t\t\t\t\tdiv.style.height=\"300px\";\r\n");
      out.write("\t\t\t\t\tdiv.style.position=\"absolute\";\r\n");
      out.write("\t\t\t\t\tdiv.style.marginTop=\"200px\";\r\n");
      out.write("\t\t\t\t\tdiv.style.marginLeft=\"1350px\"\r\n");
      out.write("\t\t\t\t\tdiv.style.width=\"500px\";\r\n");
      out.write("\t\t\t\t\tdiv.style.border=\"1px red solid\";\r\n");
      out.write("\t\t\t\t\tdiv.style.cursor = \"pointer\";\r\n");
      out.write("\t\t\t\t\tdiv.id=\"pc\";\r\n");
      out.write("\t \t\t\t\tmap.getContainer().appendChild(div);\r\n");
      out.write("\t \t\t\t\treturn div;\r\n");
      out.write("\t \t\t\t};\r\n");
      out.write("\t \t\t\tmap.addControl(new DivControl());\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\t\tfunction moveToPoint(lgt,lat)\r\n");
      out.write("\t \t\t\t{\r\n");
      out.write("\t \t\t\t\t/* alert(map.getCenter()); */\r\n");
      out.write("\t \t\t\t\tmap.panTo(new BMap.Point(lgt, lat));\r\n");
      out.write("\t \t\t\t\tmap.setZoom(15);\r\n");
      out.write("\t \t\t\t\t\r\n");
      out.write("\t \t\t\t};\r\n");
      out.write("\t \t\t\t\r\n");
      out.write("\t \t\t\tfunction proAcityConn(id,lgt,lat,con)\r\n");
      out.write("\t \t\t\t{\r\n");
      out.write("\t \t\t\t\tvar pc = $(\"#tbd\");\r\n");
      out.write("\t \t\t\t\tvar suba = jsonstr[id];\r\n");
      out.write("\t \t\t\t\tvar su = $(suba);\r\n");
      out.write("\t \t\t\t\tpc.html(\"\");\r\n");
      out.write("\t\t\t\t\tsu.each(function(){\r\n");
      out.write("\t\t\t\t\t\tpc.append(\"<tr><td align='center'><a href='#'>\"+this+\"<a/></td></tr>\");\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\tmap.panTo(new BMap.Point(lgt, lat));\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t \t\t\t\tmap.setZoom(15);\r\n");
      out.write("\t \t\t\t\tvar opts = {    \r\n");
      out.write("\t \t\t\t\t\t    width : 250,     // 信息窗口宽度    \r\n");
      out.write("\t \t\t\t\t\t    height: 100,     // 信息窗口高度    \r\n");
      out.write("\t \t\t\t\t\t     // 信息窗口标题   \r\n");
      out.write("\t \t\t\t\t\t};    \r\n");
      out.write("\t \t \r\n");
      out.write("\t \t\t\t\tvar infoWindow = new BMap.InfoWindow(\"hello world\", opts);  // 创建信息窗口对象    \r\n");
      out.write("\t \t\t\t\tmap.openInfoWindow(infoWindow,new BMap.Point(lgt, lat));  \r\n");
      out.write("\t \t\t\t\t/* for(var i=0;i<suba.length;suba++)\r\n");
      out.write("\t \t\t\t\t{\r\n");
      out.write("\t \t\t\t\t\t\r\n");
      out.write("\t \t\t\t\t} */\r\n");
      out.write("\t \t\t\t\t\r\n");
      out.write("\t \t\t\t\t\r\n");
      out.write("\t \t\t\t}\r\n");
      out.write("\t \t\t\t\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t\t\r\n");
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
    // /WEB-INF/jsp/stationMonitor.jsp(63,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/stationMonitor.jsp(63,2) '${info }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${info }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/stationMonitor.jsp(63,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div class=\"sid\">\r\n");
          out.write("\t\t\t\t<div class=\"layui-form\" style=\"display:inherit\">\r\n");
          out.write("\t\t\t\t\t<table style=\"display:inherit\" class=\"layui-table\">\r\n");
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
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t水质质量:\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.slevel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:openDetatil(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.sid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\" class=\"layui-btn layui-btn-normal layui-btn-sm\">查看详情</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t</tbody>\r\n");
          out.write("\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t\r\n");
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
    // /WEB-INF/jsp/stationMonitor.jsp(135,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/stationMonitor.jsp(135,3) '${info}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${info}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/stationMonitor.jsp(135,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("i");
    // /WEB-INF/jsp/stationMonitor.jsp(135,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          out.write("\t\t\t\tslevel.push(Math.floor(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.slevel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("));\r\n");
          out.write("\t\t\t\tusid.push(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.sid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\")\r\n");
          out.write("       \t \t");
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

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/jsp/stationMonitor.jsp(145,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/stationMonitor.jsp(145,3) '${pcc}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pcc}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/stationMonitor.jsp(145,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("p");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t var subArr = [];\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\tarr.push([");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.did}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.dname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\",subArr]);\r\n");
          out.write("\t\t\t\tjsonstr[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.did}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("] = subArr;\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/jsp/stationMonitor.jsp(147,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/stationMonitor.jsp(147,4) '${p.areas}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${p.areas}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/stationMonitor.jsp(147,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("a");
    // /WEB-INF/jsp/stationMonitor.jsp(147,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\tsubArr.push(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\");\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }
}
