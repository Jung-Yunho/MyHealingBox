<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<div class="day-detail">	
		<div>
			<h4>영화</h4>
			<h1>디즈니 애니메이션 정주행</h1>
		</div>	
		<hr/>
		
		<div class="box-detail">
			<p>인사이드 아웃, 미녀와 야수, 인어공주 1~3, 코코, 모아나, 빅 히어로, 메리다와 마법의 숲, 팅커벨 시리즈, 라푼젤, 공주와 개구리, 크리스마스 캐롤, 알라딘 시리즈</p>
			<img class="img-attached-file" alt="여기는 첨부 이미지"
					src="${root}/resources/images/day/test.jpg">
		</div>
		<hr/>
	
	
		<div class="list-bottom">
			<p><fmt:formatDate pattern="yyyy-MM-dd a HH:mm" value="${wantToDo.regDate}" /></p>
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