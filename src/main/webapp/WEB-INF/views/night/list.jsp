<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>     

<main class="list-main"> 

<!-- <script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>

$(function() {
	
	var iframe = $(".thumb_img");
	var iframe_src = iframe.attr('src');
	var youtube_video_id = iframe_src.match(
			/youtube\.com.*(\?v=|\/embed\/)(.{11})/).pop();

	if (youtube_video_id.length == 11) {
		var video_thumbnail = $('<img src="//img.youtube.com/vi/'+youtube_video_id+'/mqdefault.jpg">');
		$(body).append(video_thumbnail);
	}
});
</script> -->

<section>

        <h1 class="hidden">
       		 각 폴더에 대한 리스트
        </h1>
 
    <div class="form">
    	<select id="select-box" onchange="location.href=this.value">
			<option value="${root }/night/video/favorite">자주 보는 영상</option>
			<option value="폴더1" selected="selected">폴더1</option>
			<option value="폴더2">폴더2</option>
			<option value="폴더3">폴더3</option>
		</select>
		
		<div >
			<%-- <input class="search-box" type="text" name="q" style="width: 130px;"/>
			<input class="hidden" type="submit" value="검색" />
			<img id="search-button" class="search-img" src="${root }/resources/images/night/ic_search_black_48dp_1x.png"> --%>
			<form>
  <input class="search" type="text" name="search" placeholder="Search..">
</form>
	</div>
					
    </div>
    
    
            <div class="division_line"></div>

<div class="smr_allitem">
   

        <div class="inven_cont">
            <ul class="list_horizontal ">


	<c:forEach var="video" items="${videos}">

    <li data-cliplink-id="384597175">
    	<a href="${video.id }">
        <div class="link_contents">
            <span class="thumb_box">
            
            <img src="https://img.youtube.com/vi/${video.urlPath }/mqdefault.jpg" class="thumb_img"/>
                    <%-- <img src="${root }/resources/images/night/KakaoTalk_20180328_233238324.png" class="thumb_img" > --%>
               
            </span>
            <span class="item_info">
                <strong class="tit_item">${video.title}</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : ${video.hit}</span>
                    
                </span>
            </span>
        </div>
        </a>
    </li>
    </c:forEach>
     
    
    
            </ul>
            
            <a href="" class="link_more"><span class="ico_kakaotv"><img class="more-img" src="${root }/resources/images/night/ic_keyboard_arrow_down_black_36dp_2x.png"></span></a>
        </div>
    </div>

   
   <nav class="btn-list">
		<h1 class="hidden">버튼목록</h1>
		<ul>
         <li> <span id="sel-button"> <a href="${root }/night/video/reg" >
         <img src="/myhealingbox/resources/images/night/plus2.png" style="width: 50px; height: 50px;border-radius: 50px;"></a></span> </li>
         
      </ul>
	</nav>

        </section>
    </main>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	

</script>














