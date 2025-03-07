<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="functions" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html class="wide wow-animation" lang="en"> 
  <head>
<!-- Site Title-->
<title>SIST RENTCAR</title>
<!--     <meta name="format-detection" content="telephone=no"> -->
    <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0">
<!--     <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    <meta charset="utf-8">
 <!-- Stylesheets -->
    <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Oswald:200,400%7CLato:300,400,300italic,700%7CMontserrat:900">
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/fonts.css">
	<link href="https://fonts.googleapis.c
	om/css2?family=Nanum+Gothic+Coding&display=swap" rel="stylesheet">
	
	
	
	
<!------------------ 20.05.21스크립트 추가 서현 ------------------->
<script type="text/javascript" src=" https://code.jquery.com/jquery-3.5.0.min.js"></script>
<script>
	$(function(){
		$("input#loginbtn").click(function(){
			if($("#userId").val().length==0||$("input#userpassword").val().length==0){
				alert('ID or PASSWORD CHECK');
				$("input#userId").val('');
				$("input#userpassword").val('');
				return false;
			}
			$("loginFrm").submit();
		});
});
</script>




	<style type="text/css">
	
	label{
	width: 100px;
	height: 10px;
	font-size: medium;
	}
	
	form{
	padding-left: 40px;
	}

 html {
		height: 100%;
	}
	
	body {
	    width:100%;
	    height:100%;
	    margin: 0;
  		padding-top: 0px;
  		padding-bottom: 40px;
  		font-family: "Nanum Gothic", arial, helvetica, sans-serif;
  		background-repeat: no-repeat;
  		background:gray;
	}
	
    .card {
         margin: 0 auto; /* Added */
        float: none; /* Added */
        margin-bottom: 10px; /* Added */
        box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        padding-top: 10px;
        margin-top: 100px; 
	}
	
	.form-signin .form-control {
  		position: relative;
  		height: auto;
  		-webkit-box-sizing: border-box;
     	-moz-box-sizing: border-box;
        	 box-sizing: border-box;
  		padding: 10px;
  		font-size: 16px;
	}
form input#loginbtn{
margin-left: -20px;
}
	
 
</style>
	
	
</head>
  <body>
    <!------------------ .page=전체 영역 ------------------->
    <div class="page" id="page">
      <!------------------ Header ------------------->
      <header class="section page-header">
        <div class="rd-navbar-wrap rd-navbar-corporate">
          <!----- 메뉴바 --------->
          <nav class="rd-navbar"  id="menu">
            <div class="rd-navbar-inner">
              <!-- 모바일 var - 메뉴토글-->
              <div class="rd-navbar-panel">
                <button class="rd-navbar-toggle" data-rd-navbar-toggle=".rd-navbar-nav-wrap"><span></span></button>
                <!-- logo -->
                <div class="rd-navbar-brand"><a class="brand-name" href="../index.jsp"><img class="logo-default" src="../images/logo.png" alt="" width="208" height="46"/><img class="logo-inverse" src="../images/logo-inverse-208x46.png" alt="" width="208" height="46"/></a></div>
              </div>
              <!-- 웹 var. 메뉴바 -->
              <div class="rd-navbar-aside-center">
                <div class="rd-navbar-nav-wrap">
                  <ul class="rd-navbar-nav">
                    <li><a href="../index.jsp">HOME</a>
                    </li>
                    <li><a href="../index.jsp">예약하기</a>
                    </li>
                    <li><a href="community.jsp">커뮤니티</a>
                    </li>
                    <li><a href="review.jsp">이용후기</a>
                    </li>
                  </ul>
                </div>
              </div>
              <div class="rd-navbar-aside-right">
              	<a class="button button-sm button-secondary button-nina" href="login.jsp">Login</a>
              	<a class="button button-sm button-secondary button-nina" href="join.jsp">Join</a>
              </div>
            </div>
          </nav>
        </div>
      </header>
	<!----------------- 추가내용 ------------------->
	  <section>						
								
	<div class="card align-middle" style="width:20rem; border-radius:20px;">
		<div class="card-title" style="margin-top:20px;">
			<h2 class="card-title text-center" style="color:#113366;">LOGIN</h2>
		</div>
		<div class="card-body">
		
		
		
 	<form id="loginFrm"  class="form" action="loginPro.jsp"  name="loginFrm" method="post">
        <h5 class="form-signin-heading">로그인 정보를 입력하세요</h5> <br>
        
       <label>아이디</label>
      	 <input type="text" id="userId" name="userId" placeholder="아이디 입력" maxlength="50" autocomplete="off" class="ui-autocomplete-input">   <br>  
	  <label>비밀번호</label>
	     <input type="password" id="userpassword" name="userpassword" maxlength="50" autocomplete="off">
       
         <div class="wrap-check">
										<!--클릭시 label에 selected 클래스 추가-->
										<label class="i-check"><input type="checkbox" name="idSave" id="idSave">아이디 저장</label>
										 
									</div>
        <input type="submit" id="loginbtn" name="loginbtn" class="btn btn-lg btn-primary btn-block" value="로그인"/> 
      </form>
      
		</div>
	</div>

	<div class="modal">
	</div>
	</div><!--page전체  -->
	 </section>
	 
  <!-------------------------- Footer ---------------------->
      <footer class="section page-footer page-footer-minimal novi-background bg-cover text-center bg-gray-darker">
        <div class="container container-wide">
          <div class="row row-fix justify-content-sm-center align-items-md-center row-30">
            <div class="col-md-10 col-lg-7 col-xl-4 text-xl-left"><a href="../index."><img class="inverse-logo" src="../images/logo-inverse-208x46.png" alt="" width="208" height="46"/></a></div>
            <div class="col-md-10 col-lg-7 col-xl-4">
              <p class="right">가시안이며 비상업적 취업지원 포트폴리오 용도로만 사용됩니다.<br/>오른쪽 이니셜 클릭시 개별 email로 연결됩니다.</p>
            </div>
            <div class="col-md-10 col-lg-7 col-xl-4 text-xl-right">
              <ul class="group-xs group-middle"> 
                <li><a class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi" href="#">CHJ</a></li>
                <li><a class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi" href="#">PIC</a></li>
                <li><a class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi" href="#">YMM</a></li>
                <li><a class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi" href="#">CSH</a></li>
                <li><a class="icon novi-icon icon-md-middle icon-circle icon-secondary-5-filled mdi" href="#">LHJ</a></li>
              </ul>
            </div>
            
            
          </div>
        </div>
        
      </footer>
    </div>
    <!-- Global Mailform Output-->
    <div class="snackbars" id="form-output-global"> </div>
    <!-- Javascript-->
    <script src="../js/core.min.js"></script>
    <script src="../js/script.js"></script>
    <!-- coded by barber-->
  </body>
</html>