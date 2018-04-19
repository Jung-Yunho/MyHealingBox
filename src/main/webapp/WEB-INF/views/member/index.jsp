<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>


<main class="mhb-main">
	<div class="back-img">
	
		<div>
			<a href="${root}/night/category">밤</a>
		</div>
		
		<div>
			<a href="${root}/dawn/home/index">새벽</a>	
		</div>
		
		<div>
			<a href="${root}/night/category">아침</a>	
		</div>
		
		<div>
			<a href="${root}/day/main">낮</a>	
		</div>
	
	</div>
	<%-- <img style="width: 100%; height: 100%;" src="${root}/resources/images/daynight9.jpg"> --%>
	
</main>