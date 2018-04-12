<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class=main>
	<section class="body">
		<section class="morning-list">
			<form>
				<select name="categoryCheckList">
					<option value="default-category" selected="selected"> ToDo </option>
					<option value=""> 집안일 </option>
					<option value=""> 회사일 </option>
				</select>
			</form>
		</section>
		<div>
			<form>
				<fieldset class="addtodo">
					<legend>할일추가</legend>
					<input type="text"><input type="button" value="등록"><br> 
				</fieldset>
			</form>
		</div>
		<div>
			<form>
				<fieldset class="todolist">
					<legend>할일목록</legend>
				</fieldset>
			</form>
		</div>
		<div>
			<form>
				<fieldset class="donelist">
					<legend>한일목록</legend>
				</fieldset>
			</form>
		</div>
	</section>
</main>