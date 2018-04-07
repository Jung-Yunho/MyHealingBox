<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main>
   <section>
      <h1>회원가입 폼</h1>
         <form action="${root}/login" method="post">
            <fieldset>
               <legend>회원정보</legend>
               <table>
                  <tr>
                     <th>아이디 : </th>
                     <td ><input type="text" name="id" placeholder="6~12자 이내의 영문 또는 숫자"/> </td> <!-- username 스프링에서 지정한 이름 -->
                  </tr>
                  
                  <tr>
                     <th>비밀번호 : </th>
                     <td> <input type="password" name="pwd"/> </td>         <!-- password 스프링에서 지정한 이름 -->         
                  </tr>
                  
                  <tr>
                     <th>이름 : </th>
                     <td> <input type="text" name="name"/> </td>
                  </tr>
                  
                  <tr>
                     <th>사진 : </th>
                     <td> <input type="file"/> </td> 
                  </tr>
                  
                  <tr>
                     <td colspan="2">
                     <input type="submit" value="가입"/>
                     </td>               
                  </tr>
                  
               </table>
            </fieldset>
         </form>
      
   </section>
</main>