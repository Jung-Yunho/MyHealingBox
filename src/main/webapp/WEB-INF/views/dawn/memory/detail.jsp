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
		<ul class="detail-img">
			<li id="sel-button" style="background:white"><span><img class="detail-first-img" src="${root}/resources/images/dawn/plus.png"></span></li>
			<li id="edit-button"><a href="edit" ><img src="${root}/resources/images/dawn/tool.png"></a></li>
			<li id="del-button"><a href="list"><img src="${root}/resources/images/dawn/delete.png"></a></li>
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