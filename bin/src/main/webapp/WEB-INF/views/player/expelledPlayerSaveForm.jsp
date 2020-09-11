<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<div class="container">
<h1>퇴출 선수 등록 페이지입니다.</h1>
<hr />
<form action="/out" method="post">

<select name="playerId">
	<c:forEach var="player" items="${players}">
		<option value="${player.id}">${player.playerName} ${player.teamName} (${player.position} ) </option>
	</c:forEach>
</select>
<br />
<!-- 선수 이름 : 
<input type="text" name="name"></input>
<br /> -->
이유 : 
<input type="text" name="reason"></input>
<br />
<button style="cursor: pointer; border: none; padding: 0px 0; text-decoration: none; display: inline-block; border-radius:10px;">
<i class="fas fa-registered"></i>
</button>

</form>
</div>
<%@include file="../layout/footer.jsp"%>