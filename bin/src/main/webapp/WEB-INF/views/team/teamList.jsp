<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<br />
<h1>팀 목록 페이지</h1>
<hr>
<div class="container">
 <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>팀</th>
        <th>야구장</th>
        <th>등록날짜</th>
        <th>삭제</th>
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
  
  </div>
  
  <script>
  function deleteTeam(id,obj){
	  console.log("obj : "+obj);
	  
	  var tr = $(obj).parent().parent();
	  
	  let data={
			id : id  
	  }
	  
	  $.ajax({
		  type: "DELETE",
			url: "/team",
			data: data,
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "text"
	  }).done(function(result){
		  tr.remove();
		  alert("팀 삭제 성공!");
	  }).fail(function(error){
		  console.log(error);
		  alert("팀 삭제 실패");
	  });	  
  }
  </script>
  
<%@include file="../layout/footer.jsp"%>