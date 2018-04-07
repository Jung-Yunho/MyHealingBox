<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<div class="day-main">
		<div>
			<img src="${root}/resources/images/day/day_main_logo.png" />
		</div>	
		<div class="nav-box">오늘은 무엇을 하고 싶었나요?</div>
		<div class="nav-box">오늘은 무엇을 해볼까요?</div>
	</div>
</main>