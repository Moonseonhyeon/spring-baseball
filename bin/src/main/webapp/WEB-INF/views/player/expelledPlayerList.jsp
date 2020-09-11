<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<div class="container">
<br />
<h1>퇴출 선수 목록 페이지</h1>
<hr>

 <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>playerId</th>
        <th>선수</th>
        <th>포지션</th>
         <th>이유</th>
         <th>퇴출일</th>
      </tr>
    </thead>
    <tbody>
  <c:forEach var="playerDto" items="${playerDtos}">
      <tr>
        <td>${playerDto.playerId}</td>
        <td>${playerDto.playerName}</td>
        <td>${playerDto.position}</td>
        <td>${playerDto.reason}</td>
        <td><fmt:formatDate value="${playerDto.day}" pattern="yyyy-MM-dd" /></td>
     </tr>
  </c:forEach>
    </tbody>
  </table>
  </div>
 
<%@include file="../layout/footer.jsp"%>