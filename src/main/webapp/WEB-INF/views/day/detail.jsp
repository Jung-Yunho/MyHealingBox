<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<div class="day-detail">	
		<div>
			<h4>카테고리명</h4>
			<h1>운동하자</h1>
		</div>	
		<hr/>
		
		<div class="box-detail">
			<p>오늘 배우진씨가 내 헤더를 반딧불이라고 놀렸다..... 오늘부터 운동을 배워서 크게 혼쭐내줘야지.</p>
			<img class="img-attached-file" alt="여기는 첨부 이미지"
					src="${root}/resources/images/day/test.jpg">
		</div>
		<hr/>
	
	
		<div class="list-bottom">
			<p>여기는 작성 날짜와 시간</p>
			<div>
				<img alt="새벽으로 보내기" src="${root}/resources/images/day/send_icon.png">
				<img alt="하고싶은일 삭제"
					src="${root}/resources/images/day/listDel_icon.png">
			</div>
		</div>
	
		<div class="btn-put">
			<input class="btn-submit" type="submit" value="수정하기" />
		</div>
		
	</div>
</main>