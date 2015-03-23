<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<HTML>
<HEAD>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM Software Development Platform">
<TITLE>input.jsp</TITLE>
</HEAD>
<BODY>


<form action="/EmmaRun/EmmaTestServlet">
	Parameter One : <INPUT name="param1"><br>
	Parameter Two : <INPUT name="param2"><br>
	<input type="submit" value="Submit Request">
</form>

Output : <%= request.getAttribute("output") %>

</BODY>
</HTML>
