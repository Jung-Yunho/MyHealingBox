<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>     
<main class="main">
	<section class="box">
		<h1 class="hidden">자주 보는 영상</h1>
		<ul>
			<li>
				<div class="folder-list">
					<div>
						<select class="select-list">
							<option value="favorit" selected="selected">자주 보는 영상</option>
							<option value="folder1">폴더1</option>
							<option value="folder2">폴더2</option>
							<option value="folder3">폴더3</option>
						</select> 
					</div>
					
					<div class="search">
					<input type="text" value="" name="search"/>
					<input id = "submit-button"type="submit" value="검색" />
					</div>
				</div>
			</li>
		
			<li>
			
					<div class="video-list">
						<p class="thm">
							<img class="htm-img" src="${root }/resources/images/night/KakaoTalk_20180328_233238324.png">
						</p>
						
						<div class="video-info">
							<div>제목:어쩌고저쩌고</div>
							<div>조회수:250</div>
							</div>
						</div>
		
			</li>
		
			<li>
			
					<div class="video-list">
						<p class="thm">
							<img class="htm-img" src="${root }/resources/images/night/KakaoTalk_20180328_233238324.png">
						</p>
						
						<div class="video-info">
							<div>제목:어쩌고저쩌고</div>
							<div>조회수:250</div>
							</div>
						</div>
		
			</li>
			
			
			<li>
			
					<div class="video-list">
						<p class="thm">
							<img class="htm-img" src="${root }/resources/images/night/KakaoTalk_20180328_233238324.png">
						</p>
						
						<div class="video-info">
							<div>제목:어쩌고저쩌고</div>
							<div>조회수:250</div>
							</div>
						</div>
		
			</li>
			
			
			<!-- <li><div class="category-edit"></div></li> -->
		</ul>	
		<%-- <div class="more-button">
            <img class="edit-icon" src="${root }/resources/images/night/ic_keyboard_arrow_down_black_36dp_2x.png">
         </div> --%>
         
	</section>
	
	 <nav class="btn-list">
        <h1 class="hidden">리스트페이지버튼</h1>
        <ul>
           <li id="sel-button"> <a href="reg" ><img class="reg-button" src="${root }/resources/images/night/KakaoTalk_20180410_173420697.jpg"></a> </li>
        </ul>
     </nav>
     
</main>



