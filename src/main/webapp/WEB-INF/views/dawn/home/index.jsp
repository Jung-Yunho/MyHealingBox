<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<h1 class="hidden">새벽 : 인덱스 페이지</h1>
	<section class="index">
		<c:forEach var="categoryList" items="${categoryList}">
			<div class="list">
				<div>
					<ul>
						<li class="title"><a href="${categoryList.id }">${categoryList.title}</a></li>
						<li class="regDate"><a href="${categoryList.id }">${categoryList.regDate}</a></li>
					</ul>
				</div>
			</div>
		</c:forEach>
		
		<!-- <div class="list">
			<div class="">
				<ul>
					<li class="title"><a href="">Title1</a></li>
					<li class="regDate"><a href="">RegDate1</a></li>
				</ul>
			</div>
		</div>
		
		<div class="list">
			<div class="">
				<ul>
					<li class="title"><a href="">Title2</a></li>
					<li class="regDate"><a href="">RegDate3</a></li>
				</ul>
			</div>
		</div>
		
		<div class="list">
			<div class="">
				<ul>
					<li class="title"><a href="">Title3</a></li>
					<li class="regDate"><a href="">RegDate3</a></li>
				</ul>
			</div>
		</div>
		
		<div class="list">
			<div class="">
				<ul>
					<li class="title"><a href="">Title4</a></li>
					<li class="regDate"><a href="">RegDate4</a></li>
				</ul>
			</div>
		</div>
		
		<div class="list">
			<div class="">
				<ul>
					<li class="title"><a href="">Title5</a></li>
					<li class="regDate"><a href="">RegDate5</a></li>
				</ul>
			</div>
		</div>-->
	</section>
	
	<nav class="btn-write-go">
		<ul>
			<li>
				<a href="edit"><img src="${root}/resources/images/dawn/writeGo_button_img.png"></a>
			</li>
		</ul>
	</nav>
</main>