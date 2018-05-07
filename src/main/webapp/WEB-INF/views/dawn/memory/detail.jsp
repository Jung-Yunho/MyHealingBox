<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<article style="margin-top:15px;">
			<header>
				<h1>Title</h1>
				<h4>Sub-Title</h4>
			</header>
			
			<footer>
				<span>Writer-Id</span>
				<span>Reg-Date</span>
				<%-- <span><fmt:formatDate pattern="yyyy-MM-dd a hh:mm E" value="날짜"/></span> --%>
				<!--fmt는 포매팅-->
			</footer>
			
			<div>
				Content
			</div>
	</article>
	
	
	<!-- div는 block span은 content -->
	<nav class="btn-list btn-write-go">
		<h1 class="hidden">버튼목록</h1>
		<ul>
			<li id="sel-button"><span><img src="${root}/resources/images/dawn/writeGo_button_img.png"></span></li>
			<li id="edit-button"><a href="" >수정</a></li>
			<li id="del-button"><a href="">삭제</a></li>
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