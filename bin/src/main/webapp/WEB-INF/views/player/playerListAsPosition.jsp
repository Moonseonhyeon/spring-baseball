<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<div class="container">
<br />
<h1>포지션 별 선수 목록 페이지</h1>
<hr>

 <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>포지션</th>
        <th>롯데</th>
        <th>NC</th>
        <th>기아</th>
      </tr>
    </thead>
    <tbody>
  <c:forEach var="playerDto" items="${playersAsPositionDtos}">
      <tr>
        <td>${playerDto.position}</td>
        <td>${playerDto.lotte}</td>
        <td>${playerDto.nc}</td>
        <td>${playerDto.kia}</td>
      </tr>
  </c:forEach>
    </tbody>
  </table>
  
  </div>
  


<%@include file="../layout/footer.jsp"%>