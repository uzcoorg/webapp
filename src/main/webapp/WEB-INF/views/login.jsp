<%@ page import="java.util.Date" %>
<html>
<head>
<title>Yahoo!! From JSP FILE</title>
</head>
<body>
<%
Date date = new Date();
%>
Welcome To Jsp ${name} password is ${password}
<strong>Current Time is</strong>: <%=new Date() %>
</body>
</html>