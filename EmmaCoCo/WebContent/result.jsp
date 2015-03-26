<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
<%String result =(String) request.getAttribute("result"); %>
<h1><%=result %></h1>

<%
	try {
	  String className = "net.sourceforge.cobertura.coveragedata.ProjectData";
	  String methodName = "saveGlobalProjectData";
	  Class saveClass = Class.forName(className);
	  java.lang.reflect.Method saveMethod = saveClass.getDeclaredMethod(methodName, new Class[0]);
	  saveMethod.invoke(null, new Object[0]);
	} catch(Throwable t) {
	}
%>
</body>
</html>