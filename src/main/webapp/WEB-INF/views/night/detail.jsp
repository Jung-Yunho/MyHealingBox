<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>  
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">

<main class="box" style="
    padding-top: 82px;
">

	<div>
		<div>${videos.title }</div>
		
			<div class="detail-title">
				<div>
					제목 : ${video.title }
				</div>
			
				<div>
					조회수 : ${video.hit }
				</div>
			
		</div>
	</div>
		<div>
			<div class="detail-thm">
				<img src="${root }/resources/images/night/fff.PNG">
			</div>
			<div class="detail-textarea"><span>${video.content }</span></div>
		</div>
	<%-- <div class="list-button">
		<a href="${root }/night/video/list">
		<input class="list-button" type="submit" value="목록"/>
		</a>
	</div> --%>
   
   
   <nav class="btn-list">
      <h1 class="hidden">버튼목록</h1>
      <ul>
         <li> <span id="sel-button">
         <img src="/myhealingbox/resources/images/night/plus.png" style="width: 50px; height: 50px;border-radius: 50px;"></span> </li>
         <li id="edit-button"> <a href="${root }/night/video/reg-edit" ><img src="${root }/resources/images/night/ic_create_black_24dp_2x.png"></a> </li>
         <li id="del-button"> <a href="" ><img src="${root }/resources/images/night/ic_delete_black_24dp_2x.png"></a> </li>
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
				editButton.classList.remove("show");
				delButton.classList.remove("show");
			}
			else {
				editButton.classList.add("show");
				delButton.classList.add("show");

			}
		};
	});
</script>