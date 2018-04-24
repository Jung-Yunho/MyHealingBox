<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class=main>
	
	<div class="day-main">
		
		<img src="${root}/resources/images/day/day_main_logo.png" />
		
		<%-- <div class="nav-box" id="go-write"><a href="${root}/day/write">오늘의 하고 싶은 일 기록</a></div> --%>
		<%-- <div class="nav-box" id="go-category"><a href="${root}/day/categoryList">나의 하고 싶은 일 박스</a></div> --%>
		<div class="nav-box" id="go-write"><img src="${root }/resources/images/day/writeGo_img.png" /></div>
		<div class="nav-box" id="go-category"><img src="${root }/resources/images/day/categoryGo_img.png"/></div>
	</div>
</main>

<script>
	window.addEventListener("load",function(event){
		var goButton1 = document.querySelector("#go-write");
		var goButton2 = document.querySelector("#go-category");

		goButton1.onclick = function(){
			window.location.href="${root}/day/write";
		};

		goButton2.onclick = function(){
			window.location.href="${root}/day/categoryList"
		};

	});


</script>