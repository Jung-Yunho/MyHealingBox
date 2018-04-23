<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
<!--장비넓이에 맞게 / 최소사이즈 / 줌 인,아웃  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main id="kakaoContent">
      <div id="cMain">
        <!-- 팝업창영역 -->
        <div class="dimmed_layer" style="height: 667px; width: 375px;"></div>
        <!-- // 팝업창영역 -->
        <article id="mArticle">

          <!-- // 로그인 -->
          <h2 id="kakaoBody" class="screen_out">마이힐링박스 로그인</h2>
          <div class="info_etc">
                <img alt="Kakao_accounts_banner" class="img_etc" height="402" src="/assets/ko/weblogin/kakao_accounts_banner-e20bbd4d330e24a3ea8463f49ffd2778.png" width="540">
          </div>
          <div class="cont_login">
            <h3 class="tit_kakao">
              <img alt="MHB" class="img_kakao" height="20" src="${root }/resources/images/MHB_icon.png" width="64">
            </h3>
            <form method="post" id="login-form" data-error-target=".desc_error">
  <fieldset style="border:none;">
    <legend class="screen_out">마이힐링박스 로그인 폼</legend>
    <input type="hidden" name="type" value="w">
      <input type="hidden" name="continue" value="">

  

    <!-- id field -->
    <div class="login_inp" id="loginEmailField">
      <label for="loginEmail" class="screen_out">아이디</label><!-- 2018-02-13 수정 --><!-- 2018-03-30 수정 -->
      <input id="loginEmail" type="text" class="inp_login inp_email" name="email" value="" autocomplete="off" placeholder="아이디를 입력하세요" validator="email_or_phone" data-error-empty="아이디를 입력해주세요." data-error-invlid="아이디 형식이 올바르지 않습니다.">
     
    </div>

    <!-- password -->
    <div class="login_inp">
      <label for="loginPw" class="screen_out">비밀번호</label>
      <input type="password" id="loginPw" class="inp_login" name="password" autocomplete="off" placeholder="비밀번호(4~16자리)" validator="password" data-error-empty="마이힐링박스 비밀번호를 입력해주세요." data-error-invlid="비밀번호가 올바르지 않습니다.">
    </div>
    <div class="set_login ">
      <input type="checkbox" id="loginRemember" name="remember_me" value="true" class="inp_check">
      <label class="lab_check" for="loginRemember">로그인 상태 유지<span class="ico_login ico_check"></span></label>
      <button type="button" class="btn_emailaccount login_by_email hide" style="display: none;">이메일 주소로 로그인</button>
    </div>
    <div class="wrap_captcha" style="display:none;">
      <div id="recaptcha"></div>
    </div>
    <p class="desc_error" style="display:none;"></p>

   

    <button type="submit" class="btn_login submit btn_disabled">로그인</button>
    <div class="info_user">
      <div class="join_user">
        <a href="${root }/member/join" id="signUp">회원가입</a>
      </div>
      
    </div>
  </fieldset>
</form>


          </div>

        </article>
      </div>
    </main>
