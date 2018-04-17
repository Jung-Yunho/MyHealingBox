<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	
	<form method="post" style="margin-left: 10px; margin-top: 40px;">
		<div>
			<select name="category">나의 박스
				<option value="default-category" selected="selected">기본 카테고리</option>
				<option value="">디비에서 카테고리 받아오기</option>
			</select>	

			<h1>여기는 제목</h1>
		</div>
		<hr />
	
		<div>
			<p>여기는 추가 내용</p>
			<input type="file">
		</div>
		<hr />	

		<p>여기는 현재 날짜와 시간</p>
		
		<div class="btn-put">
			<input class="btn-submit" type="submit" value="수정완료" />
		</div>
	</form>
</main>