<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>나의 힐링 박스</title>
	<link href="resources/css/style.css" type="text/css" rel="stylesheet" />
</head>

<header class="header">
      <h1>로고자리</h1>
      <nav class="main-menu">
         <h1 class="hidden">메인메뉴</h1>
         <ul>
            <li id="ham-button"><a href=""><img src="resources/images/menu_icon.png"/></a></li>
            <li>
            	<div>
		            <a href=""><img src="resources/images/MHB_icon.png"/></a>
            	</div>
            	<div>
		  			<a href=""><img src="resources/images/myinfo_icon.png"/></a>        	
            	</div>
	  		</li>            
         </ul>
      </nav>
</header>

<nav class="aside">

	<h1 class="hidden">메뉴</h1>
	<ul>
		<li><a href="">나의 힐링 박스</a></li>
		<li><a href="">나의 정보</a></li>	
		<li><a href="">나의 박스</a></li>	
	</ul>

</nav>

<body>
 잘 보이니 ?
</body>
</html>

<script>

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