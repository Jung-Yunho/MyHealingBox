<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
   
<main class="main">
   <section class="note-list">
      <h1 class="hidden">노트목록</h1>
      <ul>
         <c:forEach var="video" items="${videos}">
         <li>
            <div><a href="${video.id }">${video.title}</a></div>
            <div class="text ellipsis">
               <span class="text-concat">${video.content}</span>
            </div>
            <div><span>분류</span><span><fmt:formatDate pattern = "yyyy-MM-dd hh:mm" value="${video.regDate }"/> </span></div>
         </li>         
         </c:forEach>
      </ul>
   </section>

   <nav class="btn-list">
        <h1 class="hidden">리스트페이지버튼</h1>
        <ul>
           <li id="sel-button"> <a href="reg" >추가</a> </li>
        </ul>
     </nav>

</main>