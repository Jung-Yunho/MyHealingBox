<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<div id="mySidenav" class="sidenav">
<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="${root }/member/login">로그인</a>
         <a href="${root }/logout">로그아웃</a>
         <a href="${root }/member/join">회원가입</a><br><br>
         
         <a href="${root}/member/index">나의 힐링 박스</a>
         <a href="${root}/member/mypage">나의 정보</a>
		<a href="${root}/day/categoryList">나의 박스</a>
</div>

<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script>