<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
<!--장비넓이에 맞게 / 최소사이즈 / 줌 인,아웃  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>

<main class="box">

	<form method="post" enctype="multipart/form-data">
<div class="reg-form">
	<div class="reg-box">
		<div class="category-size">
			<h3>카테고리</h3>
			<select class="select-box">
				<c:forEach var="category" items="${category}">
					<option value="${category.title }"> ${category.title } </option>
					<!-- <option value="default-category" selected="selected"> 폴더1</option>
					<option value=""> 폴더2 </option>
					<option value=""> 폴더3 </option> -->
					</c:forEach>
				<!-- <option value="">폴더1</option> -->
			</select>
		</div>
	

			<div class="title">
				<h3>제목</h3>
				<input type="text" class="title-style" name="title" />
			</div>
			
			<div class="title">
				<h3>URL ID</h3>
				<input type="text" class="title-style" name="urlPath" />
			</div>
			
				<div class="hidden">
					<h3>첨부파일</h3>
					<input type="file" name="file" />
				</div>
				
				<div class="editor">
		<h3 class="hidden">내용</h3>
		<textarea rows="15" cols="50" name="content"></textarea>
		
	</div>
	
</div>
			</div>
			<div style="display: flex; justify-content: center;">
	<a href="${root }/night/video/list"> <input class="button-submit"
		type="submit" value="등록" />
	</a>
</div>
		</form>
		
		

</main>


<script>
	window.addEventListener("load", function() {
		var submitButton = document.querySelector("input[type='submit']");

		submitButton.onclick = function(e) {

			var request = new XMLHttpRequest();
			request.onload = function(evt) {
				alert(request.responseText);
			}
			request.open("GET", "data"); /* data는 요청하기 위한 url */
			request.send();

			//e.preventDefault();
		};
	});
</script>

<!-- 
<script src="http://js.nicedit.com/nicEdit-latest.js" type="text/javascript"></script>
<script type="text/javascript">bkLib.onDomLoaded(nicEditors.allTextAreas);</script>


 -->






