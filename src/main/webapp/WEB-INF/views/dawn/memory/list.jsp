<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>

<main class="main">
	<h1 class="hidden">새벽: 메모리 글 리스트페이지</h1>
	<section class="top-box">
		<form>
			<ul>
				<li>
					영화
				</li>
				
				<li>
					<select name="filter">
						<option value="최신순">최신순▼</option>
						<option value="과거순">최신순▲</option>
					</select>
				</li>
			</ul>
		</form>
	</section>
	
	<section>
		<c:forEach var="i" begin="0" end="4">
		<div class="mid-box">
			<div class="surmmary">
				<ul>
					<li class="title-box"><a href="">Title</a></li>
					
					<li class="content-box">
						<a href="">Content</a>
					</li>
					
					<li class="regDate-box"><span>RegDate</span></li>
				</ul>
			</div>
			
			<div>
				<a href=""><img class="img-box" src="${root }/resources/images/dawn/aboutTime.jpg"/></a>
			</div>
			
			<div>
				<a href=""><img class="icon" src="${root }/resources/images/dawn/ic_cancel_black_24dp_1x.png"/></a>
			</div>
			
			<div>
				<a href=""><img class="icon" src="${root }/resources/images/dawn/ic_mode_edit_black_24dp_1x.png"/></a>
			</div>
		</div>
		</c:forEach>
	</section>
	
	<nav class="btn-write-go">
		<ul>
			<li>
				<a href="reg"><img src="${root}/resources/images/dawn/writeGo_button_img.png"></a>
			</li>
		</ul>
	</nav>
</main>