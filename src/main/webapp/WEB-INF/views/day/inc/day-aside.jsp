<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath }"/>


<nav class="aside">

	<h1 class="hidden">메뉴</h1>
	<ul>
		<li><a href="${root}/member/index">나의 힐링 박스</a></li>
		<li><a href="${root}/member/mypage">나의 정보</a></li>	
		<li><a href="${root}/day/categoryList">나의 박스</a></li>	
	</ul>

</nav>

