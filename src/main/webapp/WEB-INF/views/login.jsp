<%@ page import="java.util.Date" %>
<html>
<head>
<title>Yahoo!! From JSP FILE</title>
</head>
<body>
<%
Date date = new Date();
%>

<strong>Current Time is</strong>: <%=new Date() %>
<p><font color="red">${errorMessage}</font></p>
	<form action="/login" method="POST">
		Name : <input name="name" type="text" /> Password : <input name="password" type="password" /> <input type="submit" />
	</form>

</body>
</html>