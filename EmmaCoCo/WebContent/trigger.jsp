<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trigger</title>
</head>
<body>
<%
try {
	
	  String className = "net.sourceforge.cobertura.coveragedata.ProjectData";
	  String methodName = "saveGlobalProjectData";
	  Class saveClass = Class.forName(className);
	  java.lang.reflect.Method saveMethod = saveClass.getDeclaredMethod(methodName, new Class[0]);
	  saveMethod.invoke(null, new Object[0]);
	  System.out.print("Triggered");
	} catch(Throwable t) {
	}
%>
<h1>Triggered</h1>
</body>
</html>>