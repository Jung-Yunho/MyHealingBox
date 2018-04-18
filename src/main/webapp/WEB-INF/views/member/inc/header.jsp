<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>

<header class="header">
	<div class="member-nav">
	 	<a href="${root }/member/login">로그인</a>
	 	<a href="${root }/member/join">회원가입</a>
	</div>
</header>

