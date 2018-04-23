<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>


<main class="mhb-main">
		
		<div>
			<section id="night">밤</section>
		</div>
		
		<div>
			<img class="logo-main" alt="" src="${root}/resources/images/mhb-logo.png">
		</div>
					
		<div>
			<section id="dawn">새벽</section>
		</div>	
		
		<div>
			<section id="morning">아침</section>
		</div>
		
		<div>
			<section id="day">낮</section>
		</div>
	

	<%-- <img style="width: 100%; height: 100%;" src="${root}/resources/images/daynight9.jpg"> --%>
	
</main>

<script>
	window.addEventListener("load",function(){
		var mainScreen = document.querySelector(".logo-main");
		var nightButton = document.querySelector("#night");
		var dawnButton = document.querySelector("#dawn");
		var morningButton = document.querySelector("#morning");
		var dayButton = document.querySelector("#day");
		
		mainScreen.onclick=function(){
			alert("됏당!");
			nightButton = append(img)
		};


	});

</script>
