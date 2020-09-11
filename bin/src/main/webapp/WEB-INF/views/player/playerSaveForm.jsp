<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@include file="../layout/header.jsp"%>
<div class="container">
<h1>선수 등록 페이지입니다.</h1>
<hr />
<form action="/player" method="post">
선수 이름 : 
<input type="text" name="name"></input>
<br />
포지션 : 
<input type="text" name="position"></input>
<br />
<select name="teamId">
	<c:forEach var="team" items="${teams}">
		<option value="${team.id}">${team.name}</option>
	</c:forEach>
</select>
<br />
<button style="cursor: pointer; border: none; padding: 0px 0; text-decoration: none; display: inline-block; border-radius:10px;">
<i class="fas fa-registered"></i>
</button>

</form>
</div>

<%@include file="../layout/footer.jsp"%>