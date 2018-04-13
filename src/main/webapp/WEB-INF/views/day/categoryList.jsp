<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<div class="day-list">
		<h1> 나의 박스 </h1>
		<hr/>
		
		<c:forEach var="i" begin="0" end="4">
			<div class="category-list">
				<h2>| 카테고리1</h2>
				<div>
					<img alt="카테고리명 수정" src="${root}/resources/images/day/categoryEdit_icon.png">
					<img alt="카테고리 삭제" src="${root}/resources/images/day/categoryDel_icon.png">
				</div>
			</div>
		</c:forEach>
		
		<hr/>
		<div style="display: flex; justify-content: center;">
			<img alt="카테고리 추가" src="${root}/resources/images/day/categoryPlus_icon.png" style="width: 48px; height: 48px;">
		</div>
	</div>
</main>