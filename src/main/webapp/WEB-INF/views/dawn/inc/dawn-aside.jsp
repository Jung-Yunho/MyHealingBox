<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<nav class="aside">
	<h1 class="hidden">햄버거 메뉴</h1>
	<ul>
		<li id="my-box"><a href="">내 힐링박스</a></li>
		<li><a href="">내 정보</a></li>
	</ul>
</nav>

<script>
	window.addEventListener("load", function(){
		var myBox = document.querySelector("#my-box");
		var aside2 = document.querySelector(".aside2");

		myBox.onclick = function(e){
			if(aside2.classList.contains("show2"))
				aside2.classList.remove("show2");
			else
				aside2.classList.add("show2");
			e.preventDefault();
		};
	});
</script>