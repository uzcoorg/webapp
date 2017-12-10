<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.Date" %>
<html>
<head>
<title>Yahoo!! From JSP FILE</title>
</head>
<body>
<%
Date date = new Date();
%>
Welcome To Jsp
<strong>Current Time is</strong>: <%=new Date() %>

<form action="/login.do" method="POST">
<p><font color="red">${errorMessage}</font></p>
		Login ID  :  <input name="name" type="text" /> Password : <input name="password" type="password" /> <input type="submit" />

</strong>
	</form>
</body>
</html>