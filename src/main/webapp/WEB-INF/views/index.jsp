<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link href="resources/css/style.css" type="text/css" rel="stylesheet" />
</head>
<header class="header">
      <h1>로고자리</h1>
      <nav class="main-menu">
         <h1 class="hidden">메인메뉴</h1>
         <ul>
            <li id="sle-button"><a href=""><img src="resources/images/menu_icon.png"/></a></li>
            <li><a href=""><img src="resources/images/MHB_icon.png"/></a></li>
  			<li><a href=""><img src="resources/images/myinfo_icon.png"/></a></li>
            
         </ul>
      </nav>
</header>

<body>
 잘 보이니 ?
</body>
</html>

<script>
var btn = $('.dot-nav');
btn.click(function() {
  $('.nav-view').toggleClass('active');
});
</script>