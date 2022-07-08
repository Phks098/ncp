<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="page_toparea">
	<header class="header_wrap">
		<div class="header_top">
			<div class="btn_login">
				<div>
					<i class="fa-solid fa-lock"></i>
					<p>LOGIN</p>
				</div>
			</div>
			<div class="seowon_logo">
				<a href="/Project_NCP/MainPage.jsp"><img src="https://semsplus.seowon.ac.kr/contents/images/client/common/header_logo.svg"/></a>
			</div>
			<div class="btn_sitemap">
				<i class="fa-solid fa-bars"></i>
			</div>
		</div>
		<div class="header_bottom">
			<ul class="menu_list">
				<li><a class="top_menu">SEMS+ 안내</a></li>
				<li><a class="top_menu">역량기반교과</a></li>
				<li><a class="top_menu">CUKI비교과</a></li>
				<li><a class="top_menu">상담</a></li>
				<li><a class="top_menu">진로/취업</a></li>
				<li><a class="top_menu">설문/진단</a></li>
				<li><a class="top_menu">인증</a></li>
				<li><a class="top_menu">커뮤니티</a></li>
				<li><a class="top_menu" href="/Project_NCP/prototypeMypage.jsp">마이페이지</a></li>
			</ul>
		</div>
		<div class="visual_area">
			<div class="visual_wrapper">
				<div class="visual_text">
					<strong>서원 교육·진로·상담 통합관리시스템</strong> <img src="https://semsplus.seowon.ac.kr/contents/images/client/main/img_sems.svg" />
					<p>Seowon Educational quality Management System</p>
					
				</div>

				<div class="visual_image">
					<!--  
					<img src="https://semsplus.seowon.ac.kr/contents/images/client/main/img_mainvisual.png" />
					-->
					<img src="${param.visual_image}" />
				</div>
			</div>
		</div>
	</header>
</div>