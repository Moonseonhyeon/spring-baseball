<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="../layout/header.jsp"%>
<div class="container">
<h1>야구장 등록 페이지</h1>
<hr>
<form action="/stadium" method="post">
경기장 이름 : 
<input type="text" name="name"></input>
<br />
경기장 주소 : 
<input type="text" name="address"></input>
<br />
<button style="cursor: pointer; border: none; padding: 0px 0; text-decoration: none; display: inline-block; border-radius:10px;">
<i class="fas fa-registered"></i>
</button>
</form>

</div>

<%@include file="../layout/footer.jsp"%>