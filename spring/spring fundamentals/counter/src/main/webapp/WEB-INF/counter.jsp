<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h3>you have visited <a href="http://localhost:8080"> </a> <c:out value = "${count}"/> times
</h3>
<a href="http://localhost:8080"> Test another visit? </a>
</body>
</html>