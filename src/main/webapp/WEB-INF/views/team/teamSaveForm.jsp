  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://kit.fontawesome.com/f24559dc3c.js"></script>
<meta charset="UTF-8">
<title>팀 등록 페이지</title>
<script src="https://kit.fontawesome.com/f24559dc3c.js"></script>
</head>
<body>
<h1>팀 등록 페이지</h1>
<hr>
<form action="/team" method="post">
팀 이름 : 
<input type="text" name="name"></input>
<br />
<select name="stadiumId">
	<c:forEach var="stadium" items="${stadiums}">
		<option value="${stadium.id}">${stadium.name}</option>
	</c:forEach>
</select>

<br />
<button style="cursor: pointer; border: none; padding: 0px 0; text-decoration: none; display: inline-block; border-radius:10px;">
<i class="fas fa-registered"></i>
</button>
</form>


</body>
</html>