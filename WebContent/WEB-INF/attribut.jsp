<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Test</title>
	</head>
	
	<body>
		<p>Ceci est une page générée depuis une JSP.</p>
		<p>
			<%
			String attribut = (String) request.getAttribute("sendedName");
			out.println(attribut);
			%>
		</p>
	</body>
</html>