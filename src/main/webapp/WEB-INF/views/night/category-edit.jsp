<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/> 
<main class="main-box">
	<section>
		<h1 class="hidden">카테고리</h1>
		<ul style="
    padding-bottom:  20px;
">
			<li><div class="category-list">자주보는영상</div></li>
			
			<li>
				<div class="category-list"><input type="checkbox"/>폴더1
				<div class="category-edit-list">
						<img class="edit-icon" src="${root }/resources/images/night/ic_create_black_24dp_1x.png">
						<img class="edit-icon" src="${root }/resources/images/night/ic_clear_black_24dp_1x.png">
						</div>
				</div>
			</li>
			
			<li>
				<div class="category-list"><input type="checkbox"/>폴더2
				<div class="category-edit-list">
						<img class="edit-icon" src="${root }/resources/images/night/ic_create_black_24dp_1x.png">
						<img class="edit-icon" src="${root }/resources/images/night/ic_clear_black_24dp_1x.png">
						</div>
				</div>
			</li>
			
			<li>
				<div class="category-list"><input type="checkbox"/>폴더3
				<div class="category-edit-list">
						<img class="edit-icon" src="${root }/resources/images/night/ic_create_black_24dp_1x.png">
						<img class="edit-icon" src="${root }/resources/images/night/ic_clear_black_24dp_1x.png">
						</div>
				</div>
			</li>
		</ul>
		
			<div class="category-button category-edit-button">
            <input type="submit" value="추가"/>
            <input type="submit" value="완료"/>
         </div>
	</section>
</main>