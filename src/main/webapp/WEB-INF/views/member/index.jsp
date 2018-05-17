<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>


<main class="mhb-main">
		
		<div>
			<img id="btn-intro" src="${root}/resources/images/intro-icon.png" alt="나의힐링박스 서비스 소개" />
		</div>
	
		<div class="main-nav">		
			<div id="morning"></div>			
			<div id="day"></div>			
			<div id="night"></div>			
			<div id="dawn"></div>		
		</div>
	
</main>

<script>
	window.addEventListener("load",function(event){
		var nightBox = document.querySelector("#night");
		var dawnBox = document.querySelector("#dawn");
		var morningBox = document.querySelector("#morning");
		var dayBox = document.querySelector("#day");
		
		var introButton = document.querySelector("#btn-intro");
		
		/* mainScreen.onclick=function(e){
			var nightLogo = document.createElement("img");
			var dawnLogo = document.createElement("img");
			var morningLogo = document.createElement("img");
			var dayLogo = document.createElement("img");

			nightLogo.style.width = "40px";
			nightLogo.src = "${root}/resources/images/night-logo.png";

			dawnLogo.style.width = "40px";
			dawnLogo.src = "${root}/resources/images/dawn-logo.png";

			morningLogo.style.width = "40px";
			morningLogo.src = "${root}/resources/images/morning-logo.png";

			dayLogo.style.width = "40px";
			dayLogo.src = "${root}/resources/images/day-logo.png";
			
			nightBox.appendChild(nightLogo);
			dawnBox.appendChild(dawnLogo);
			morningBox.appendChild(morningLogo);
			dayBox.appendChild(dayLogo);
		
		}; */
		/* if(mainScreen.contains("nightLogo"))
			e.preventDefault(); */

		nightBox.onclick=function(){
			window.location.href="${root}/night/category";
		};

		dawnBox.onclick=function(){
			window.location.href="${root}/dawn/home/index";
		};

		morningBox.onclick=function(){
			window.location.href="${root}/morning/list";
		};

		dayBox.onclick=function(){
			window.location.href="${root}/day/main";
		};
		
		introButton.onclick=function(){
			window.location.href="${root}/member/intro";
		};


	});

</script>
