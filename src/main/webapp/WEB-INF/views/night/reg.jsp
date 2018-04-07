<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
<!--장비넓이에 맞게 / 최소사이즈 / 줌 인,아웃  -->
<title>노트 등록 폼</title>
</head>
<body>
   <main>
      <section>
      <h1>노트 등록 폼</h1> <!-- 문서에 대한 제목ㄴㄴ 문서'들'에 대한 제목 -->
      <form method="post" enctype="multipart/form-data">
         <table>
            <tr>
               <td>제목</td>
               <td><input type="text" value="" name="title"/></td>
            </tr>
            <tr>
               <td>첨부파일</td>
               <td><input type="file" name="file"/></td>
            </tr>
            <tr>
               <td>내용</td>
            </tr>
            <tr>
               <td>
                  <textarea rows="10" cols="40" name="content"></textarea>
               </td>
            </tr>
         </table>
         <div>
            <input type="submit" value="등록"/>
         </div>
      </form>
      
      </section>
   </main>
</body>
</html>

<script>
    window.addEventListener("load", function(){
        var submitButton = document.querySelector("input[type='submit']");

        submitButton.onclick = function(e){
            var request = new XMLHttpRequest();

            request.onload = function(evt){
                alert(request.responseText)
            };
            request.open("GET","data") /*url과 연결하기 위해*/
            request.send();
        };
    });
</script>












