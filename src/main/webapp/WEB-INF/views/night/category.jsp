<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
<!--장비넓이에 맞게 / 최소사이즈 / 줌 인,아웃  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/> 
<main class="main-box" style="height:570px;">
	<section style="margin-top: 80px;">
		<h1 class="hidden">카테고리</h1>
	
		<ul class="category-box">
			 <li class="category-list"><div><a href="${root }/night/video/favorite">자주보는영상</a></div></li>
		<c:forEach var="category" items="${category}">
			<li class="category-list"><div><a href="${videos.nightCategoryId} ">${category.title }</a></div></li>
			<!-- <li class="category-list"><div><input class="input-text" "text" value="폴더1"/></div></li>
			<li class="category-list"><div>폴더2</div></li>
			<li class="category-list"><div>폴더3</div></li> -->
			</c:forEach>
			
		</ul>	
		
	
	</section>
		<div class="button-box" style="
    display:  flex;
    justify-content:  flex-end;
">
			<a href="${root }/night/category-edit">
            	<input class="btn-default" type="submit" value="편집"/>
         	</a>
         </div>
         
     
</main>
