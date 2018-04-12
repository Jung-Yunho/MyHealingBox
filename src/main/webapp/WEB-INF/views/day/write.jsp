<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<div class="body">
		<div style="display: flex; justify-content: flex-start;">
			<form>
				<select name="categoryCheckbox" >나의 박스
					<option value="default-category" selected="selected"> 기본 카테고리 </option>
					<option value=""> 디비에서 카테고리 받아오기 </option>
				</select>
			</form>
			<img id="writeImage" src="${root}/resources/images/day/write_icon.png">
		</div>
		<div class="write-box">
			<h3>| 제목</h3>
			<input type="text" required="required" size="5">
			<h3>| 내용</h3>
			<textarea rows="15" cols="50" ></textarea>
			<input type="file">
		</div>
	
	</div>


</main>