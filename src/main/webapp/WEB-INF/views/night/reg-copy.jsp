<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
<!--장비넓이에 맞게 / 최소사이즈 / 줌 인,아웃  -->

   <main class="main">
      <section>
      <h1 class="hidden">노트 등록 폼</h1> 
      <form method="post" enctype="multipart/form-data">
         <table>
            <tr>
               <td>제목</td>
               <td><input type="text" value="" name="title"/></td>
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


<script>
		window.addEventListener("load", function(){
			var submitButton = document.querySelector("input[type='submit']");

			submitButton.onclick = function(e){

				var request = new XMLHttpRequest();
				request.onload = function(evt){
					alert(request.responseText);
				}
				request.open("GET","data"); /* data는 요청하기 위한 url */
				request.send();

				//e.preventDefault();
			};
		});
	</script>

<script src="http://js.nicedit.com/nicEdit-latest.js" type="text/javascript"></script>
<script type="text/javascript">bkLib.onDomLoaded(nicEditors.allTextAreas);</script>










