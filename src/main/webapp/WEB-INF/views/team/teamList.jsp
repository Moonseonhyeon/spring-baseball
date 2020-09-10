<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팀 목록 페이지</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/f24559dc3c.js"></script>

</head>
<body>
<br />
<h1>팀 목록 페이지</h1>
<hr>

 <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>팀</th>
        <th>야구장</th>
        <th>등록날짜</th>
         <td>삭제</td>
      </tr>
    </thead>
    <tbody>
  <c:forEach var="teamDto" items="${teamDtos}">
      <tr class="team-${teamDto.id}">
        <td>${teamDto.name}</td>
        <td>${teamDto.stadiumName}</td>
        <td><fmt:formatDate value="${teamDto.createDate}" pattern="yyyy-MM-dd" /></td>
        <td><i onclick="deleteTeam(${teamDto.id}, this);" class="fas fa-trash" > </i></td>
     </tr>
  </c:forEach>
    </tbody>
  </table>
  
  <script>
  function deleteStadium(id,obj){
	  console.log("obj : "+obj);
	  
	  var tr = $(obj).parent().parent();
	  
	  let data={
			id : id  
	  }
	  
	  $.ajax({
		  type: "DELETE",
			url: "/stadium",
			data: data,
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "text"
	  }).done(function(result){
		  tr.remove();
		  alert("경기장 삭제 성공!");
	  }).fail(function(error){
		  console.log(error);
		  alert("경기장 삭제 실패");
	  });	  
  }
  </script>
  
</body>
</html>