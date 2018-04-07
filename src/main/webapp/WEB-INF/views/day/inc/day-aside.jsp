<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 


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


<script>
var btn = $('.dot-nav');
btn.click(function() {
  $('.nav-view').toggleClass('active');
});
</script>