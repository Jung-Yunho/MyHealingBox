<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<div>
		<form>
			<select name="categoryCheckbox" >나의 박스
				<option value="default-category" selected="selected"> 기본 카테고리 </option>
				<option value=""> db에서 카테고리 받아오기 </option>
			</select>
		</form>
		<img id="writeImage" src="${root}/resources/images/day/write_icon.png">
	</div>
	<div>
		<input type="text" required="required" size="20">
		<textarea rows="10" cols="50" ></textarea>
		<input type="file">
	</div>

</main>