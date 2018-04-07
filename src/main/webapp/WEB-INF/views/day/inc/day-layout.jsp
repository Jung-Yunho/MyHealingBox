<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="root" value="${pageContext.request.contextPath}"/> 
<!DOCTYPE html>


<head>

	<meta charset="utf-8"/>
	<meta name="viewport"  content="width=device-width, initial-scale=1"
       minimum-scale="1"
       user-scalable="1"  >
       
   <title>나의 힐링 박스 - 낮(Day)</title>
   <link href="${root }/resources/css/style.css" type="text/css" rel="stylesheet" />
   <link href="${root }/resources/css/day-style.css" type="text/css" rel="stylesheet" />
   
</head>

<body>

   <!-- header -->
   
   <tiles:insertAttribute name="header" />
   
    <!-- header -->
   
   <tiles:insertAttribute name="aside" />
   
   <!-- main -->
   
   <tiles:insertAttribute name="main" />
   
   <!-- footer -->
   
   <tiles:insertAttribute name="footer" />

</body>
</html>