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
			<h1>여기는 제목</h1>
		</div>	
		<hr/>
		
		<div style="display: flex; justify-content: center;">
			<p>지금은 5시 40분이고 배가 너무 아프고 정신이 하나도 없고 종료까지 10분 남았고 오드빅스는 20분 남았는데 멘탈이가 나갔고 너무 정신없고 나 오늘 뭐했지...휴ㅠ</p>
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