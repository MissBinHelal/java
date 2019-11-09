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
<form method="POST" action="/trycode" >
	<p style="color:red"><c:out value="${error}"/></p>

<label>Enter the code </label>
<input type="text" name="code">
<button>Try Code</button>
</form>

</body>
</html>