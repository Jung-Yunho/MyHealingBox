<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>

<header class="header">
      <h1>
      	<a class="day-link" href="${root }/day/main">
    		<img class="day" src="${root }/resources/images/day-logo.png" />
      	</a>
	  </h1>
	  
      <nav class="main-menu">
         <h1 class="hidden">메인메뉴</h1>
         <ul>                        
            <li id="ham-button" onclick="openNav()">
            	<a href="javascript:void(0)"><img src="${root }/resources/images/menu_icon.png"/></a>
            </li>
            <li>
            	<div>
		            <a href="${root }/member/index"><img src="${root }/resources/images/MHB_icon.png"/></a>
            	</div>
            	<div>
		  			<a href="${root }/member/mypage"><img src="${root }/resources/images/myinfo_icon.png"/></a>        	
            	</div>
	  		</li>            
         </ul>
      </nav>
</header>


<script>
	
	window.addEventListener("load", function(event){
		/* var hamButton = document.querySelector("#ham-button");
		var aside = document.querySelector(".aside"); */
		var logo = document.querySelector(".day");

		/* hamButton.onclick = function(e){
			if(aside.classList.contains("show"))
				aside.classList.remove("show");
			else
				aside.classList.add("show");
			e.preventDefault();
		}; */
		
		// 여기 왜 안먹을까...
		logo.onclick = function(){
			window.location.href="${root}/day/main";
			
		};

	});

</script>