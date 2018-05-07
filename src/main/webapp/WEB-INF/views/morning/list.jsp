<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<c:set var="root" value="${pageContext.request.contextPath }" />

<main class=main>
<section class="body">
	<section class="morning-list">
		<form>
			<select name="categoryCheckList">
				<option value="default-category" selected="selected">ToDo</option>
				<option value="">집안일</option>
				<option value="">회사일</option>
			</select>
		</form>
	</section>
	<div>
		<form>
			<fieldset class="addtodo">
				<legend>할일추가</legend>
				<input type="text" placeholder="할일을 입력해주세요">
				<input type="button" value="등록"><br>
			</fieldset>
		</form>
	</div>
	<div>
		<form>
			<fieldset class="todolist">
				<legend>할일목록</legend>
				<c:forEach var="i" begin="0" end="4">
					<div class="todolist-detail">
						<div>
							<input class="checkBox" type="checkbox"> <span
								class="todolist-title"> <a href="detail">제목부분</a>
							</span>
						</div>
						<span> <input class="checkBox" type="checkbox">
						</span>
					</div>
				</c:forEach>
			</fieldset>
		</form>
		<div class="todolist-downButton">
			<img alt="한일로이동" src="${root}/resources/images/morning/arrowDownButton.png" style="width: 48px; height: 48px;">
		</div>
	</div>
	<div>
		<form>
			<fieldset class="donelist">
				<legend>한일목록</legend>
				<c:forEach var="i" begin="0" end="1">
					<div class="donelist-detail">
						<div>
							<input class="checkBox" type="checkbox"> <span
								class="donelist-title"> <a href="detail">한일제목들</a>
							</span>
						</div>
						</span>
					</div>
				</c:forEach>
			</fieldset>
		</form>
		<div class="donelist-delButton">
			<img alt="카테고리삭제" src="${root}/resources/images/morning/clearButton.png" style="width: 48px; height: 48px;">
		</div>
	</div>
</section>
</main>