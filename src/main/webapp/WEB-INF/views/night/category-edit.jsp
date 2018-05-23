<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
<!--장비넓이에 맞게 / 최소사이즈 / 줌 인,아웃  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/> 
<main class="main-box" style="height:570px;">
	<section>
		<h1 class="hidden">카테고리</h1>
		<ul style="
    padding-bottom:  30px;
">
			<li><div class="category-list">자주보는영상</div></li>
			
			<li>
				<div class="category-list"><input type="checkbox"/>
				<input class="input-text-edit" type="text" value="폴더1"/>
				<div>
						<img class="edit-icon" src="${root }/resources/images/night/ic_create_black_24dp_1x.png" style="padding-right: 15px;">
						<img class="edit-icon" src="${root }/resources/images/night/ic_clear_black_24dp_1x.png">
						</div>
				</div>
			</li>
			
			<li>
				<div class="category-list"><input type="checkbox"/>
				<input class="input-text-edit" type="text" value="폴더2"/>
				<div>
						<img class="edit-icon" src="${root }/resources/images/night/ic_create_black_24dp_1x.png" style="padding-right: 15px;">
						<img class="edit-icon" src="${root }/resources/images/night/ic_clear_black_24dp_1x.png">
						</div>
				</div>
			</li>
			
			<li>
				<div class="category-list"><input type="checkbox"/>
				<input class="input-text-edit" type="text" value="폴더3"/>
				<div>
						<img class="edit-icon" src="${root }/resources/images/night/ic_create_black_24dp_1x.png" style="padding-right: 15px;">
						<img class="edit-icon" src="${root }/resources/images/night/ic_clear_black_24dp_1x.png">
						</div>
				</div>
			</li>
			
			<li id="field">
			</li>
			
		</ul>
		
			<div>
            <input class="btn-default" id="btn-add" type="button" value="추가" onclick="add_item()"/><br>
            <a href="${root }/night/video/category">
           		<input class="btn-default" type="submit" value="완료"/>
            </a>
         </div>
         
	</section>
	
	<div id="pre_set" style="display: none" class="category-list">
	<input type="checkbox" /> <input class="input-text-edit" type="text"
		name="" value="">
	<div>
		<img class="edit-icon"
			src="${root }/resources/images/night/ic_create_black_24dp_1x.png"
			style="padding-right: 15px;"> <img class="edit-icon"
			src="${root }/resources/images/night/ic_clear_black_24dp_1x.png">
	</div>
	<input type="button" value="삭제" onclick="remove_item(this)"
		style="display: none;">
</div>
</main>

<script>

    function add_item(){
        // pre_set 에 있는 내용을 읽어와서 처리..
        var div = document.createElement('div');
        div.innerHTML = document.getElementById('pre_set').innerHTML;
        document.getElementById('field').appendChild(div);
    }
 
    function remove_item(obj){
        // obj.parentNode 를 이용하여 삭제
        document.getElementById('field').removeChild(obj.parentNode);
    }
</script>















