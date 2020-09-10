<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   

<%@include file="../layout/header.jsp"%>
<div class="container">
<br />
<h1>선수 목록 페이지</h1>
<hr>

 <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>no</th>
        <th>선수이름</th>
        <th>팀</th>
        <th>포지션</th>
         <th>삭제</th>
      </tr>
    </thead>
    <tbody>
  <c:forEach var="playerDto" items="${playerDtos}">
      <tr class="team-${playerDto.id}">
        <td>${playerDto.no}</td>
        <td>${playerDto.playerName}</td>
        <td>${playerDto.teamName}</td>
        <td>${playerDto.position}</td>
        <td><i onclick="deletePlayer(${playerDto.id}, this);" class="fas fa-trash" > </i></td>
     </tr>
  </c:forEach>
    </tbody>
  </table>
  </div>
  
  <script>
  function deletePlayer(id,obj){
	  console.log("obj : "+obj);
	  
	  var tr = $(obj).parent().parent();
	  
	  let data={
			id : id  
	  }
	  
	  $.ajax({
		  type: "DELETE",
			url: "/player",
			data: data,
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "text"
	  }).done(function(result){
		  tr.remove();
		  alert("선수 삭제 성공!");
	  }).fail(function(error){
		  console.log(error);
		  alert("선수 삭제 실패");
	  });	  
  }
  </script>
  
<%@include file="../layout/footer.jsp"%>