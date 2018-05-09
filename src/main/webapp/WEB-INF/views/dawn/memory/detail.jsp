<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<article class="detail-box">
			<div>
				<h4>Category Name</h4>
			</div>
			<div class="detail-title-box">	
				<h1>Title</h1>
				<h5>regDate</h5>
			</div>
			<hr/>
		
			<div>
				<p>Content</p>
			</div>
			<hr/>
	</article>
	
	
	<!-- div는 block span은 content -->
	<nav class="btn-list btn-write-go">
		<h1 class="hidden">버튼목록</h1>
		<ul>
			<li id="sel-button"><span><img src="${root}/resources/images/dawn/writeGo_button_img.png"></span></li>
			<li id="edit-button"><a href="edit" >수정</a></li>
			<li id="del-button"><a href="list">삭제</a></li>
		</ul>
	</nav>
</main>
<script>
	window.addEventListener("load",function(){
		var selButton = document.querySelector("#sel-button");
		var editButton = document.querySelector("#edit-button");
		var delButton = document.querySelector("#del-button");
	
		selButton.onclick = function(){
			if(editButton.classList.contains("show")){
				editButton.classList.remove("show");
				delButton.classList.remove("show");
			}
			else{
				editButton.classList.add("show");
				delButton.classList.add("show");
			}
		};
	});
</script>