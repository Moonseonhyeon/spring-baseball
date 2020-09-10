<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<div class="container">
<br />
<h1>야구장 목록 페이지</h1>
<hr>

 <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>야구장</th>
        <th>주소</th>
        <th>등록날짜</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
  <c:forEach var="stadium" items="${stadiums}">
      <tr class="stardium-${stardium.id}">
        <td>${stadium.name}</td>
        <td>${stadium.address}</td>
        <td><fmt:formatDate value="${stadium.createDate}" pattern="yyyy-MM-dd" /></td>
        <td><i onclick="deleteStadium(${stadium.id}, this);" class="fas fa-trash" > </i></td>
     </tr>
  </c:forEach>
    </tbody>
  </table>
  </div>
  
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
  

<%@include file="../layout/footer.jsp"%>