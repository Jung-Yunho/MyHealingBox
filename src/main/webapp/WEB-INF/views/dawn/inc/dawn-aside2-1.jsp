<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<nav class="aside2">
	<h1 class="hidden">내 힐링 박스</h1>
	<ul>
		<li><a href="${root }/member/index">메인</a></li>
		<li><a href="${root }/dawn/home/index">새벽</a></li>
		<li><a href="${root }/day/main">아침</a></li>
		<li><a href="${root }/night/index">낮</a></li>
		<li><a href="${root }/morning/list">밤</a></li>
	</ul>
</nav>