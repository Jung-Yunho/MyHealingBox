<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>     
<main class="list-main">

<section>

   <div>
        <h3 class="list-title">
        
			<span>자주 보는 영상</span>
			
        </h3>
    </div>
            <div class="division_line"></div>

<div class="smr_allitem">
   

        <div class="inven_cont">
            <ul class="list_horizontal ">




  <c:forEach var="video" items="${favorite}">

    <li data-cliplink-id="384597175">
        <div class="link_contents">
            <a href="${video.id}" class="thumb_box">
                    <img src="${root }/resources/images/night/KakaoTalk_20180328_233238324.png" class="thumb_img" >
               
            </a>
            <span class="item_info">
                <strong class="tit_item">${video.title}</strong>
                <span class="info_append">
                    <span class="ico_kakaotv ico_play">조회수 : ${video.hit}</span>
                    
                </span>
            </span>
        </div>
    </li>
    </c:forEach>
   

    
            </ul>
            <a href="" class="link_more"><span class="ico_kakaotv"><img class="more-img" src="${root }/resources/images/night/ic_keyboard_arrow_down_black_36dp_2x.png"></span></a>
        </div>
    </div>
    <div class="u_bt_top" style="position: fixed; bottom: 0px; right: 0px; display: block; opacity: 1;">
    <a href="#"><img src="/myhealingbox/resources/images/night/ic_arrow_upward_black_24dp_1x.png" style="border-radius: 50px;"></a>
</div>



        </section>
    </main>



