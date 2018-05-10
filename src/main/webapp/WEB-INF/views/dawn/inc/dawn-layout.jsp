<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
<link href="${root}/resources/css/style.css" type ="text/css" rel ="stylesheet" />
<link href="${root}/resources/css/dawn-style.css" type ="text/css" rel ="stylesheet" />
<title>새벽</title>
</head>
<body>
	<!-- header -->
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	<!-- aside -->
		<tiles:insertAttribute name="aside"></tiles:insertAttribute>
		<tiles:insertAttribute name="aside2"></tiles:insertAttribute>
	<!-- main -->
		<tiles:insertAttribute name="main"></tiles:insertAttribute>
	<!-- footer -->
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
</body>
</html>