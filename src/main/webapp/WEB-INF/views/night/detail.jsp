<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<main class="main">
   <article>
      <header>
         <h1>${video.title }</h1>
         <h2>컴퓨터 프로그래밍</h2>
      </header>
      <footer>
         <span>${video.writerId }</span>
         <span> <fmt:formatDate pattern = "yyyy-MM-dd hh:mm" value="${video.regDate }"/> </span>
      </footer>
      
      <div>
         ${video.content }
      </div>
   </article>                <!-- article, nav 같은 계층(?) 이니까 맞춰 -->
   
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