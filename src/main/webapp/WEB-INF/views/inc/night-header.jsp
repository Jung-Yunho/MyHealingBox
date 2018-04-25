<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>

<header class="header">
      <h1><img class="header-logo" src="/myhealingbox/resources/images/night-logo.png"></h1>
      <nav class="main-menu">
         <h1 class="hidden">메인메뉴</h1>
         <ul>
            <li id="ham-button"><a href=""><img src="${root }/resources/images/menu_icon.png"/></a></li>
            <li>
            	<div>
		            <a href=""><img src="${root }/resources/images/MHB_icon.png"/></a>
            	</div>
            	<div>
		  			<a href=""><img src="${root }/resources/images/myinfo_icon.png"/></a>        	
            	</div>
	  		</li>            
         </ul>
      </nav>
</header>


<script>
	/* 이게 뭐죠?0?
		var btn = $('.dot-nav');
		btn.click(function() {
		  $('.nav-view').toggleClass('active');
		}); 
	*/
	
	
	window.addEventListener("load", function(event){
		var hamButton = document.querySelector("#ham-button");
		var aside = document.querySelector(".aside");

		hamButton.onclick = function(e){
			if(aside.classList.contains("show"))
				aside.classList.remove("show");
			else
				aside.classList.add("show");
			e.preventDefault();
		};

	});

</script>