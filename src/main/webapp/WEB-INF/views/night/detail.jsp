<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>  

<main class="box" style="
    padding-top: 82px;
">

	<div>
		<div>폴더1</div>
		
			<div class="detail-title">
				<div>
					제목 : 어쩌고 저쩌고
				</div>
			
				<div>
					조회수 : 200
				</div>
			
		</div>
	</div>
		<div>
			<div class="detail-thm">
				<img src="${root }/resources/images/night/fff.PNG">
			</div>
			<div class="detail-textarea"><span>삘릴리개굴개굴yaho</span></div>
		</div>
	<div>
		
	</div>
   
   
   <nav class="btn-list">
      <h1 class="hidden">버튼목록</h1>
      <ul>
         <li> <span id="sel-button">선택</span> </li>
         <li id="edit-button"> <a href="" >수정</a> </li>
         <li id="del-button"> <a href="" >삭제</a> </li>
      </ul>
   </nav>
      
</main>

<script>
	window.addEventListener("load", function() {
		var selButton = document.querySelector("#sel-button");
		var editButton = document.querySelector("#edit-button");
		var delButton = document.querySelector("#del-button");

		selButton.onclick = function() {
			if (editButton.classList.contains("show")) {
				//editButton.style.bottom = ?;
				editButton.classList.remove("show");
				delButton.classList.remove("show");
				//editButton.classList.remove("?");
			} else {
				editButton.classList.add("show");
				delButton.classList.add("show");

			}
		};
	});
</script>