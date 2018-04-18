<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">

	<section class="memory-list">
		<h1 class="hidden">메모리 리스트</h1>
		<ul>
			<li class="memory-title-box">
				<div class="memory-title">영화</div>
				<div>
					<select name="filter">
						<option value="최신순▼">최신순▼</option>
						<option value="최신순▲">최신순▲</option>
					</select>
				</div>
			</li>
		</ul>
		
		<c:forEach var="i" begin="0" end="9">
			<ul class="memory-content-ul">
					<li class="memory-content-box">
							<div><a href="">타이틀</a></div>
							<div><a href="">컨텐츠</a></div>
					</li>
					
					<li class="memory-img-box">
						<div><a href=""><img class="memory-img" src="${root}/resources/images/dawn/aboutTime.jpg"></a></div>
					</li>
					
					<li class="memory-edit-box">
						<div><a href=""><img src="${root}/resources/images/dawn/ic_mode_edit_black_24dp_1x.png"></a></div>
						<div><a href=""><img src="${root}/resources/images/dawn/ic_cancel_black_24dp_1x.png"></a></div>
					</li>
			</ul>
			</c:forEach>
	</section>
	
	<nav class="memory-button-box">
		<h1 class="hidden">버튼 목록</h1>
		<ul>
			<li><a href=""><img class="memory-button-img" src="${root}/resources/images/dawn/add-anchor-point.png"></a></li>
		</ul>
	</nav>
</main>