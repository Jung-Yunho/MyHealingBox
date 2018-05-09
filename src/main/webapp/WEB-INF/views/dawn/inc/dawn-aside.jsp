<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<nav class="aside">
	<h1 class="hidden">햄버거 메뉴</h1>
	<ul>
		<li id="my-box"><a href="">내 힐링박스</a></li>
		<li><a href="${root }/member/mypage">내 정보</a></li>
	</ul>
</nav>

<script>
	window.addEventListener("load", function(event){
		var hamButton = document.querySelector("#ham-button");
		var aside = document.querySelector(".aside");
		var aside2 = document.querySelector(".aside2");
		var myBox = document.querySelector("#my-box");
		
		hamButton.onclick = function(e){
			if(aside.classList.contains("show")){
				aside.classList.remove("show");
				aside2.classList.remove("show2");
			}
			else
				aside.classList.add("show");
			e.preventDefault();
		};
		
		myBox.onclick = function(e){
			if(aside2.classList.contains("show2")){
				aside.classList.remove("show");
				aside2.classList.remove("show2");
			}
			else
				aside2.classList.add("show2");
			e.preventDefault();
		};
	
	});
</script>