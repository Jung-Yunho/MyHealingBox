<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>     

<main class="main">

<section>

        <h1 class="hidden">
       		 각 폴더에 대한 리스트
        </h1>
 
    <div class="form">
    	<select onchange="">
			<option value="${root}/night/video/favorit">자주 보는 영상</option>
			<option value="폴더1" selected="selected">폴더1</option>
			<option value="폴더2">폴더2</option>
			<option value="폴더3">폴더3</option>
		</select>
		
		<div class="search">
			<input class="search-box" type="text" name="q" style="width: 130px;"/>
			<input class="hidden" type="submit" value="검색" />
			<img id="search-button" class="search-img" src="${root }/resources/images/night/ic_search_black_48dp_1x.png">
	</div>
					
    </div>
    
    
            <div class="division_line"></div>

<div class="smr_allitem">
   

        <div class="inven_cont">
            <ul class="list_horizontal ">




    <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                    <img src="${root }/resources/images/night/KakaoTalk_20180328_233238324.png" class="thumb_img" >
               
            </span>
            <span class="item_info">
                <strong class="tit_item">삘릴리개굴개굴</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 230</span>
                    
                </span>
            </span>
        </div>
    </li>
    
      <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                    <img src="${root }/resources/images/night/t23.PNG" class="thumb_img" >
                
            </span>
            <span class="item_info">
                <strong class="tit_item">정수오빠가 좋아하는 소라게</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 32</span>
                    
                </span>
            </span>
        </div>
    </li>
    
      <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                    <img src="${root }/resources/images/night/fff.PNG" class="thumb_img" >
                	
            </span>
            <span class="item_info">
                <strong class="tit_item">뿌에엥</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 10</span>
                    
                </span>
            </span>
        </div>
    </li>
    
      <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                    <img src="${root }/resources/images/night/gsdf.PNG" class="thumb_img" >
              
            </span>
            <span class="item_info">
                <strong class="tit_item">폴킴 노래 좋아요 들어보세요 제발</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 22</span>
                    
                </span>
            </span>
        </div>
    </li>
      <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                   <img src="${root }/resources/images/night/fsf.PNG" class="thumb_img" >
                
            </span>
            <span class="item_info">
                <strong class="tit_item">바쿄신짱짱맨</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 18</span>
                    
                </span>
            </span>
        </div>
    </li>
    
      <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                    <img src="${root }/resources/images/night/gsf.PNG" class="thumb_img" >
               
            </span>
            <span class="item_info">
                <strong class="tit_item">도원겨엉</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 37</span>
                    
                </span>
            </span>
        </div>
        
    </li>
      <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                    <img src="${root }/resources/images/night/fsfsff.PNG" class="thumb_img" >
               
            </span>
            <span class="item_info">
                <strong class="tit_item">정승환 비가온다</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 80</span>
                    
                </span>
            </span>
        </div>
    </li>
    
      <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                    <img src="${root }/resources/images/night/aaa.PNG" class="thumb_img" >
                
            </span>
            <span class="item_info">
                <strong class="tit_item">개굴개굴</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 26</span>
                    
                </span>
            </span>
        </div>
    </li>
      <li data-cliplink-id="384597175">
        <div class="link_contents">
            <span class="thumb_box">
                    <img src="${root }/resources/images/night/adfas.PNG" class="thumb_img" >
            </span>
            <span class="item_info">
                <strong class="tit_item">바악효오시인</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : 74</span>
                    
                </span>
            </span>
        </div>
    </li>
    
    
            </ul>
            
            <a href="" class="link_more"><span class="ico_kakaotv"><img class="more-img" src="${root }/resources/images/night/ic_keyboard_arrow_down_black_36dp_2x.png"></span></a>
        </div>
    </div>

   
   <nav class="btn-list">
		<h1 class="hidden">버튼목록</h1>
		<ul>
			<li id="add-button"> <a href="reg" >추가</a></li>
		</ul>
	</nav>

        </section>
    </main>

<script>

	window.addEventListener("load", function(event){
		var searchButton = document.querySelector("#search-button");
		var searchBox = document.querySelector(".search-box");

		searchButton.onclick = function(e){
			if(searchBox.classList.contains("show"))
				searchBox.classList.remove("show");
			else
				searchBox.classList.add("show");
			e.preventDefault();
		};
		
		

	});

</script>


