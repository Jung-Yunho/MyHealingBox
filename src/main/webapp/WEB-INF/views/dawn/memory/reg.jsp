<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<h1 class="hidden">새벽:메모리 글 등록페이지</h1>
	<section class="reg-box">
		<form method="post" enctype="multipart/form-data">
			<div class="reg-title-box">
				<input class="reg-title" type="text" name="title" placeholder="제목" required="required">
			</div>
			
			<div class="reg-file-box">
				<input type="file" name="file">
			</div>
			
			<div class="reg-content-box">
				<textarea class="reg-content" name="content" rows="20" cols="50" placeholder="내용을 입력해주세요"></textarea>
			</div>
			
			<div class="">
				<div class="btn-put">
					<input class="btn-submit" type="submit" value="작성완료" />
				</div>
				<div class="btn-put">
					<a href=""><input class="btn-submit" type="button" value="취소" /></a>
				</div>
			</div>
		</form>
	</section>
</main>
<script src="http://js.nicedit.com/nicEdit-latest.js" type="text/javascript"></script>
<script type="text/javascript">bkLib.onDomLoaded(nicEditors.allTextAreas);</script>