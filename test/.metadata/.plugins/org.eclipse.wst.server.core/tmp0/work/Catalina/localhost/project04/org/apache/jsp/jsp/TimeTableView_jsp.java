/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-11-19 03:08:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project4.controller.TimeTableCtl;
import java.util.LinkedHashMap;
import in.co.rays.project4.util.HTMLUtility;
import in.co.rays.project4.bean.TimetableBean;
import java.util.List;
import in.co.rays.project4.controller.TimeTableListCtl;
import in.co.rays.project4.util.DataUtility;
import in.co.rays.project4.util.ServletUtility;
import in.co.rays.project4.bean.RoleBean;
import in.co.rays.project4.controller.*;
import in.co.rays.project4.bean.UserBean;

public final class TimeTableView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1637060407003L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1636632921369L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("in.co.rays.project4.controller");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.LinkedHashMap");
    _jspx_imports_classes.add("in.co.rays.project4.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.project4.bean.TimetableBean");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.rays.project4.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.rays.project4.bean.UserBean");
    _jspx_imports_classes.add("in.co.rays.project4.controller.TimeTableCtl");
    _jspx_imports_classes.add("in.co.rays.project4.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.project4.controller.TimeTableListCtl");
    _jspx_imports_classes.add("in.co.rays.project4.bean.RoleBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16*16\"/>\r\n");
      out.write("<title> TimeTable Register Page</title>\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("  \r\n");
      out.write("  var d = new Date();\r\n");
      out.write("  function disableSunday(d){\r\n");
      out.write("	  var day = d.getDay();\r\n");
      out.write("	  if(day==0)\r\n");
      out.write("	  {\r\n");
      out.write("	   return [false];\r\n");
      out.write("	  }else\r\n");
      out.write("	  {\r\n");
      out.write("		  return [true];\r\n");
      out.write("	  }\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("   $( function() {\r\n");
      out.write("	  $(\"#udate5\").datepicker({\r\n");
      out.write("		  changeMonth :true,\r\n");
      out.write("		  changeYear :true,\r\n");
      out.write("		  yearRange :'0:+2',\r\n");
      out.write("		  dateFormat:'mm/dd/yy',\r\n");
      out.write("\r\n");
      out.write("// Disable for Sunday\r\n");
      out.write("		  beforeShowDay : disableSunday,		  \r\n");
      out.write(" //Disable for back date\r\n");
      out.write("		  minDate : 0   \r\n");
      out.write("	  });\r\n");
      out.write("  } );\r\n");
      out.write(" </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      in.co.rays.project4.bean.TimetableBean bean = null;
      bean = (in.co.rays.project4.bean.TimetableBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.rays.project4.bean.TimetableBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("<form action=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>jQuery UI Datepicker - Display month &amp; year menus</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"#datepicker\").datepicker({\r\n");
      out.write("			changeMonth : true,\r\n");
      out.write("			changeYear : true,\r\n");
      out.write("		//	yearRange : '1970:2030'\r\n");
      out.write("			maxDate: '12/31/2003',\r\n");
      out.write("			minDate: '01/01/1981',\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

	UserBean userBean = (UserBean) session.getAttribute("user");

	boolean userLoggedIn = userBean != null;

	String welcomeMsg = "Hi, ";

	if (userLoggedIn) {
		String role = (String) session.getAttribute("role");
		welcomeMsg += userBean.getFirstName() + " (" + role + ")";
	} else {
		welcomeMsg += "Guest";
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</a> |\r\n");
      out.write("			");

			if (userLoggedIn) {
		
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\r\n");
      out.write("\r\n");
      out.write("			");

				} else {
			
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> ");

 	}
 
      out.write("</td>\r\n");
      out.write("		<td rowspan=\"2\">\r\n");
      out.write("\r\n");
      out.write("			<center>\r\n");
      out.write("				<h1 align=\"right\">\r\n");
      out.write("					<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/rays.jpg\" width=\"318\"\r\n");
      out.write("						height=\"75\">\r\n");
      out.write("				</h1>\r\n");
      out.write("			</center>\r\n");
      out.write("		</td>\r\n");
      out.write("\r\n");
      out.write("	</tr>\r\n");
      out.write("\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td>\r\n");
      out.write("			<h3>");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

		if (userLoggedIn) {
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"2\"> <a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a>\r\n");
      out.write("		 |<a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get\r\n");
      out.write("				Marksheet</b>\r\n");
      out.write("		</a> | <a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet Merit\r\n");
      out.write("				List</b> </a>\r\n");
      out.write("		 ");

 	if (userBean.getRoleId() == RoleBean.ADMIN) {
 
      out.write("| <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> |<a\r\n");
      out.write("			href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a>| <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</b></a>| <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\r\n");
      out.write("			href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"  target=\"blank\">Java Doc</b></a> | \r\n");
      out.write("			");

				}
			
      out.write("\r\n");
      out.write("			");

            if  (userBean.getRoleId() == RoleBean.STUDENT) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write("		\r\n");
      out.write(" 		");

 		if (userBean.getRoleId()  == RoleBean.KIOSK) {
        
      out.write(" \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" 		\r\n");
      out.write(" 		 ");

            if  (userBean.getRoleId()  == RoleBean.COLLEGE_SCHOOL) {
           
          
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("\r\n");
      out.write("	</tr>\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("	");

	List <TimetableBean> courseList =(List<TimetableBean>)request.getAttribute("CourseList"); 
	List <TimetableBean> subjectList = (List<TimetableBean>)request.getAttribute("SubjectList");
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId() );
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" name=\"createdby\" value=\"");
      out.print(bean.getCreatedBy() );
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" name=\"modifiedby\" value=\"");
      out.print(bean.getModifiedBy() );
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" name=\"createddatetime\" value=\"");
      out.print(DataUtility.getTimestamp(bean.getCreatedDatetime()) );
      out.write("\">\r\n");
      out.write("	<input type=\"hidden\" name=\"modifiedby\" value=\"");
      out.print(DataUtility.getTimestamp(bean.getModifiedDatetime()));
      out.write("\">\r\n");
      out.write("	\r\n");
      out.write("	<div align = \"center\">\r\n");
      out.write("		<h1 >\r\n");
      out.write("			");
 if(bean != null && bean.getId() >0 ){ 
      out.write("\r\n");
      out.write("		<tr><th>Update TimeTable</th></tr>		\r\n");
      out.write("			");
 }else{ 
      out.write("\r\n");
      out.write("		<tr ><th >Add TimeTable</th></tr>	\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("		</h1>\r\n");
      out.write("	<h2 align=\"center\"><font style=\"color: red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></h2>\r\n");
      out.write("	<h2 align=\"center\"><font style=\"color: green\">");
      out.print(ServletUtility.getSuccessMessage(request) );
      out.write("</font></h2>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("	<tr>\r\n");
      out.write("	<th align=\"left\">Course <span style=\"color: red\">*</span></th>\r\n");
      out.write("	<td>");
      out.print(HTMLUtility.getList("courseId", String.valueOf(bean.getCourse_Id()), courseList) );
      out.write("</td>\r\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("courseId",request) );
      out.write("</font> \r\n");
      out.write("	</td></tr>\r\n");
      out.write("	\r\n");
      out.write(" <tr><th style=\"padding: 3px\"></th></tr>   \r\n");
      out.write("	\r\n");
      out.write("	<tr><th align=\"left\">Subject <span style=\"color: red\">*</span></th>\r\n");
      out.write("	<td>");
      out.print(HTMLUtility.getList("subjectId", String.valueOf(bean.getSubject_Id()), subjectList) );
      out.write("</td>\r\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("subjectId",request) );
      out.write("</font> \r\n");
      out.write("	</td></tr>\r\n");
      out.write("	\r\n");
      out.write(" <tr><th style=\"padding: 3px\"></th></tr>   \r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("	<th align=\"left\">Semester<span style=\"color: red\">*</span></th>\r\n");
      out.write("	<td>");

		LinkedHashMap<String , String> map = new LinkedHashMap< String , String>();
		map.put("1","1st");
		map.put("2","2nd");
		map.put("3","3rd");
		map.put("4","4th");
		map.put("5","5th");
		map.put("6","6th");
		map.put("7","7th");
		map.put("8","8th");
	
		String htmlList = HTMLUtility.getList("semester",String.valueOf(bean.getSemester()), map);
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(htmlList );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("semester",request) );
      out.write("</font> \r\n");
      out.write("	</td></tr>\r\n");
      out.write("	\r\n");
      out.write(" <tr><th  style=\"padding: 3px\"></th></tr>   \r\n");
      out.write("	<tr><th align=\"left\">Exam Date <span style=\"color: red\">*</span></th>\r\n");
      out.write("	<td> <input type=\"text\" readonly=\"readonly\" id=\"udate5\" size=\"23\" placeholder=\"Select Date\" name=\"ExDate\" value=\"");
      out.print(DataUtility.getDateString(bean.getExam_Date()) );
      out.write("\">\r\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("ExDate",request) );
      out.write("</font> \r\n");
      out.write("	</td></tr>\r\n");
      out.write("	\r\n");
      out.write(" <tr><th style=\"padding: 3px\"></th></tr>   \r\n");
      out.write("	<tr><th align=\"left\">Exam Time <span style=\"color: red\">*</span></span></th>\r\n");
      out.write("	<td>\r\n");
      out.write("	");

		LinkedHashMap<String , String > map1 = new LinkedHashMap<String  ,String >();
		map1.put("08:00 AM to 11:00 AM","08:00 AM to 11:00 AM");
		map1.put("12:00 PM to 03:00 PM","12:00 PM to 03:00 PM");
		map1.put("04:00 PM to 07:00 PM","04:00 PM to 07:00 PM");
	
		String htmlList1 = HTMLUtility.getList("ExTime", bean.getExam_Time(), map1);
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print(htmlList1 );
      out.write("\r\n");
      out.write("	</td>\r\n");
      out.write("	<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("ExTime",request) );
      out.write("</font> \r\n");
      out.write("	</td></tr>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" 	<tr><th style=\"padding: 3px\"></th>\r\n");
      out.write("	<td></td></tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr><th></th><td></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr align=\"center\">	\r\n");
      out.write("	");

	if(bean != null && bean.getId() > 0){
	
      out.write("\r\n");
      out.write("		<td colspan=\"2\">\r\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimeTableCtl.OP_UPDATE);
      out.write("\">\r\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimeTableCtl.OP_CANCEL);
      out.write("\">\r\n");
      out.write("		</td>\r\n");
      out.write("		");
} else { 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<td colspan=\"2\">\r\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimeTableCtl.OP_SAVE);
      out.write("\">\r\n");
      out.write("		<input type=\"submit\" name=\"operation\" value=\"");
      out.print(TimeTableCtl.OP_RESET);
      out.write("\">\r\n");
      out.write("		</td>\r\n");
      out.write("		");
 } 
      out.write("\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>	\r\n");
      out.write("</center>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style >\r\n");
      out.write("\r\n");
      out.write(".footer{\r\n");
      out.write("position: fixed;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  background-color: White;\r\n");
      out.write("  color: black;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  }</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class = \"footer\">\r\n");
      out.write("<HR>\r\n");
      out.write("<H2>&copy; Copyrights RAYS Technologies</H2>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
