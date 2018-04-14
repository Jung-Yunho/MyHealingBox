<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>


<main class="main">
	<form method="post" style="margin-left: 10px; margin-top: 40px;">
		<div style="display: flex; justify-content: flex-start;">
			<select name="category">나의 박스
				<option value="default-category" selected="selected">기본 카테고리</option>
				<option value="">디비에서 카테고리 받아오기</option>
			</select>
			<a href="write">
				<img id="writeImage" src="${root}/resources/images/day/write_icon.png">
			</a>	
		</div>
		
		<div class="write-box">
			<h3>| 제목</h3>
			<input type="text" required="required" size="5">
			<h3>| 내용</h3>
			<textarea rows="15" cols="50"></textarea>
			<input type="file">
		</div>
		<div class="btn-put">
			<input class="btn-submit" type="submit" value="작성완료" />
		</div>
	</form>
</main>