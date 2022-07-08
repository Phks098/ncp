<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="data.dao.*"%>
<%@ page import="data.vo.*"%>
<%@ page import="java.util.ArrayList"%>

<%
System.out.println("페이지 직접 전달함" + request.getParameter("student"));
MyPage_DAO dao = new MyPage_DAO();
Student_VO student = dao.getStudentInformation("201710648");
%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>서원대학교</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" type="text/css" href="css/Main.css" />
<link rel="stylesheet" type="text/css" href="css/MyPage2.css" />
<link rel="stylesheet" type="text/css" href="css/LoginPopup.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"
	integrity="sha512-rqQltXRuHxtPWhktpAZxLHUVJ3Eombn3hvk9PHjV/N5DMUYnzKPC1i3ub0mEXgFzsaZNeJcoE0YHq0j/GFsdGg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://kit.fontawesome.com/46fda0e82e.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<jsp:include page="TopArea.jsp" />
	<main class="main_contents">
		<div class="contents">
			<section class="nav-contents">
				<div div class="contents-info show">
					<div class="tbl tbl_fixed tbl_row">
						<table>
							<colgroup>
								<col style="width: 20%;">
								<col style="width: 30%;">
								<col style="width: 20%;">
								<col style="width: 30%;">
							</colgroup>

							<tbody>
								<tr>
									<th>소속</th>
									<td><%=student.getMajor()%></td>
									<th scope="row">지도교수</th>
									<td><%=student.getPossfer() %></td>

								</tr>

								<tr>
									<th scope="row">부/복수/연계/융합전공</th>
									<td></td>
									<th>학년</th>
									<td><%=student.getGrade()%></td>
								</tr>

								<tr>
									<th scope="row">학번</th>
									<td><%=student.getUniversity_number()%></td>
									<th>이름</th>
									<td><%=student.getName()%>(<%=student.getSex()%>)</td>
								</tr>

								<tr>
									<th scope="row">주소</th>
									<td colspan="3"></td>
								</tr>
							</tbody>
						</table>
					</div>
					<%
					String action = "/Project_NCP/Scholar_Evaluation?action=Evelment&student="+student.getUniversity_number();
					System.out.println(action);
					%>
					
					<form action= <%=action%>
						method="post">
						<div class="match tbl_fixed match_row">
							<table>
								<colgroup>
									<col style="width: 40%;">
									<col style="width: 10%;">
									<col style="width: 10%;">
									<col style="width: 10%;">
									<col style="width: 10%;">
									<col style="width: 10%;">
								</colgroup>
								<tr>
									<td colspan="7">[교수전용 진로개발준비도 평가지]</td>
								</tr>
								<tr>
									<th rowspan="2">진단 영역</th>
									<th colspan="5">지도교수 진단 척도</th>
								</tr>
								<tr>
									<th>매우 그렇다</th>
									<th>그렇다</th>
									<th>보통</th>
									<th>그렇지 않다</th>
									<th>매우 그렇지 않다</th>
								</tr>
								<tr>
									<th>인지</th>
									<%for(int i = 1; i<6; i++){ %>
									<td><label><input class="Scolar_Evauation" name="check_1"
										value=<%=i %> type="radio" onclick="checkOnly(this,this.name)"></label></td>
									<%} %>
								</tr>

									<tr>
									<th>정서</th>
									<%for(int i = 1; i<6; i++){ %>
									<td><label><input class="Scolar_Evauation" name="check_2"
										value=<%=i %> type="radio" onclick="checkOnly(this,this.name)"></label></td>
									<%} %>
								</tr>

									<tr>
									<th>행동</th>
									<%for(int i = 1; i<6; i++){ %>
									<td><label><input class="Scolar_Evauation" name="check_3"
										value=<%=i %> type="radio" onclick="checkOnly(this,this.name)"></label></td>
									<%} %>
								</tr>

							

							</table>

						</div>
						<div class="setBtnDiv">
							<input type="submit" class="level_saveBtn" value="저장""> <input
								type="submit" class="level_saveBtn" value="최소">
						</div>
					</form>
				</div>
			</section>
		</div>
	</main>


	<jsp:include page="SitemapPopup.jsp" />
	<jsp:include page="LoginPopup.jsp" />
	<script src="js/SitemapPopup.js"></script>
	<script src="js/LoginPopup.js"></script>
	<script src="js/MyPage.js"></script>
	<script src="js/Scholar_Evaluation.js"></script>
</body>
</html>