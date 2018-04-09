<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/> 
<main class="main">
	<section class="box">
		<h1 class="hidden">카테고리</h1>
		<ul>
			<li><div class="category-list">자주보는영상</div></li>
			
			<li>
				<div class="category-list category-edit-list"><input type="checkbox"/>폴더1
				<div>
						<img class="edit-icon" src="${root }/resources/images/menu_icon.png">
						<img class="edit-icon" src="${root }/resources/images/myinfo_icon.png">
						</div>
				</div>
			</li>
			
			<li>
				<div class="category-list category-edit-list"><input type="checkbox"/>폴더1
				<div>
						<img class="edit-icon" src="${root }/resources/images/menu_icon.png">
						<img class="edit-icon" src="${root }/resources/images/myinfo_icon.png">
						</div>
				</div>
			</li>
			
			<li>
				<div class="category-list category-edit-list"><input type="checkbox"/>폴더1
				<div>
						<img class="edit-icon" src="${root }/resources/images/menu_icon.png">
						<img class="edit-icon" src="${root }/resources/images/myinfo_icon.png">
						</div>
				</div>
			</li>
		</ul>
		
			<div class="category-button category-edit-button">
            <input type="submit" value="추가"/>
            <input type="submit" value="편집"/>
         </div>
	</section>
</main>