<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="data.dao.*"%>
<%@ page import="data.vo.*"%>
<%@ page import="java.util.ArrayList"%>

<%
MyPage_DAO dao = new MyPage_DAO();
String unver = "201710648";
Student_VO student = dao.getStudentInformation(unver);
ArrayList<Mypage_VO> data = dao.getStudent_Level(unver);
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
<link rel="stylesheet" type="text/css" href="css/MyPage.css" />
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
				<div class="nav-inner">
					<ul class="nav-list">
						<li class="l-info select-list73913"><a class="btnInfo">정보</a></li>

						<li class="l-setting"><a class="btnSetting">진로개발준비도검사</a></li>
				</div>

				<div class="contents-info show">
					<section class="section_marea">
						<div class="info_text_area">
							<img
								src="https://semsplus.seowon.ac.kr/contents/images/client/sub/icon_tit_lg.png" />
							<h3 class="info_text">기본 정보</h3>
						</div>
						<div class="base_info_table">
							<table>
								<tbody>
								<colgroup>
									<col style="width: 30%;">
									<col style="width: 20%;">
									<col style="width: 30%;">
									<col style="width: 20%;">
								<tr>
									<th>단과대학</th>
									<td>사범대학</td>
									<th>소속</th>
									<td><%=student.getMajor()%></td>
								</tr>
								<tr>
									<th>부/복수/연계/융합전공</th>
									<td></td>
									<th>학년</th>
									<td><%=student.getGrade()%></td>
								</tr>
								<tr>
									<th>학번</th>
									<td><%=student.getUniversity_number()%></td>
									<th>이름</th>
									<td><%=student.getName()%>(<%=student.getSex()%>)</td>
								</tr>
								</tbody>
							</table>
						</div>

						<div class="recommendation_result">
							<table>
								<tr>
									<th colspan="5">진단 결과</th>
								</tr>
								<tr>
									<th>진단역량</th>
									<th>역량별 진단 점수</th>
									<th>백분율</th>
									<th>준비수준</th>
									<th>순위</th>
								</tr>
								<tr>
									<th><%=data.get(0).getCategory_name()%></th>
									<td><%=data.get(0).getCategory_score()%></td>
									<td><%=data.get(0).getPreparation_degree()%>%</td>
									<td><%=data.get(0).getPrearation_level()%></td>
									<td><%=data.get(0).getPreparation_rank()%></td>
								</tr>
								<tr>
									<th><%=data.get(1).getCategory_name()%></th>
									<td><%=data.get(1).getCategory_score()%></td>
									<td><%=data.get(1).getPreparation_degree()%>%</td>
									<td><%=data.get(1).getPrearation_level()%></td>
									<td><%=data.get(1).getPreparation_rank()%></td>
								</tr>
								<tr>
									<th><%=data.get(2).getCategory_name()%></th>
									<td><%=data.get(2).getCategory_score()%></td>
									<td><%=data.get(2).getPreparation_degree()%>%</td>
									<td><%=data.get(2).getPrearation_level()%></td>
									<td><%=data.get(2).getPreparation_rank()%></td>
								</tr>
								<tr>
									<th><%=data.get(3).getCategory_name()%></th>
									<td><%=data.get(3).getCategory_score()%></td>
									<td><%=data.get(3).getPreparation_degree()%>%</td>
									<td><%=data.get(3).getPrearation_level()%></td>
									<td><%=data.get(3).getPreparation_rank()%></td>
								</tr>
								<tr>
									<th><%=data.get(4).getCategory_name()%></th>
									<td><%=data.get(4).getCategory_score()%></td>
									<td><%=data.get(4).getPreparation_degree()%>%</td>
									<td><%=data.get(4).getPrearation_level()%></td>
									<td><%=data.get(4).getPreparation_rank()%></td>
								</tr>
								<tr>
									<th><%=data.get(5).getCategory_name()%></th>
									<td><%=data.get(5).getCategory_score()%></td>
									<td><%=data.get(5).getPreparation_degree()%>%</td>
									<td><%=data.get(5).getPrearation_level()%></td>
									<td><%=data.get(5).getPreparation_rank()%></td>
								</tr>
								<tr>
									<th><%=data.get(6).getCategory_name()%></th>
									<td><%=data.get(6).getCategory_score()%></td>
									<td><%=data.get(6).getPreparation_degree()%>%</td>
									<td><%=data.get(6).getPrearation_level()%></td>
									<td><%=data.get(6).getPreparation_rank()%></td>
								</tr>
								<tr>
									<th><%=data.get(7).getCategory_name()%></th>
									<td><%=data.get(7).getCategory_score()%></td>
									<td><%=data.get(7).getPreparation_degree()%>%</td>
									<td><%=data.get(7).getPrearation_level()%></td>
									<td><%=data.get(7).getPreparation_rank()%></td>
								</tr>
							</table>
						</div>
				</div>


				<div class="contents-setting">
					<%
					String action = "Mypage2?action=reTest&student=" + student.getUniversity_number();
					System.out.println(action);
					%>

					<form action=<%=action%> method="post">
						
							<div class="match tbl_fixed match_row">
								<table>
									<colgroup>
										<col style="width: 10%;">
										<col style="width: 40%;">
										<col style="width: 10%;">
										<col style="width: 10%;">
										<col style="width: 10%;">
										<col style="width: 10%;">
										<col style="width: 10%;">
									</colgroup>
									<tr>
										<td colspan="7">[커리어넷 진로개발 준비도 검사]</td>
									</tr>
									<tr>
										<th rowspan="2">하위 영역</th>
										<th rowspan="2">문항내용</th>
										<th colspan="5">자가진단 진단 척도(실행 수준)</th>
									</tr>

									<tr>
										<th>매우 그렇지 않다</th>
										<th>그렇지 않다</th>
										<th>보통</th>
										<th>그렇다</th>
										<th>매우 그렇다</th>
									</tr>
									<tr>
										<th rowspan="5">1.자기이해</th>
										<td>나는 내가 어떤 일을 좋아하는지 안다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_1"
											value=<%=i%> type="radio"
											></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 내 자신에 대해 잘 알고 있다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_2"
											value=<%=i%> type="radio"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 내가 무엇을 잘 하는지 안다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_3"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 내가 소중하게 생각하는 가치가 무엇인지 안다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_4"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 내가 즐겁게 할 수 있는 일이 무엇인지 안다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_5"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>




									<tr>
										<th rowspan="6">2.전공직업지식</th>
										<th>나는 내가 관심 있는 직업에서 하는 일과 필요한 능력에 대해 안다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_6"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 내가 선택한 전공(학과)에 대해 잘 알고 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_7"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 내가 관심 있는 직업의 향후 전망에 대해 안다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_8"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>

									</tr>
									<tr>
										<td>나는 내가 관심 있는 직업에 대해 잘 알고 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_9"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 나의 전공에 관련된 직업에 대하여 상세히 설명해 줄 수 있다</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_10"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 내가 관심 있는 직업의 임금수준과 근무환경에 대해 안다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_11"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>






									<tr>
										<th rowspan="5">3.진로결정</th>
										<td>나는 나의 진로를 결정했다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_12"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 내가 결정한 진로에 대하여 당분간은 바꿀 생각이 없다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_13"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 내가 결정한 진로에 대해 만족한다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_14"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 타인들에게 내가 결정한 진로에 대해 말할 수 있다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_15"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>

									<tr>
										<td>나는 내가 결정한 진로와 관련하여 구체적인 계획을 갖고 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_16"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>

									<tr>
										<th rowspan="6">4.의사결정</th>
										<td>나는 나의 진로를 결정했다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_17"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 내가 결정한 진로에 대하여 당분간은 바꿀 생각이 없다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_18"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 내가 결정한 진로에 대해 만족한다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_19"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 타인들에게 내가 결정한 진로에 대해 말할 수 있다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_20"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>

									<tr>
										<td>나는 내가 결정한 진로와 관련하여 구체적인 계획을 갖고 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_21"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 내가 결정한 진로에 대하여 당분간은 바꿀 생각이 없다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_22"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>




									<tr>
										<th rowspan="6">5.관계활용</th>
										<td>나는 진로를 결정하는 과정에서 주변 사람들에게 도움을 달라고 요청할 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_23"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 관심 갖고 있는 기업에 대한 정보를 대학의 취업관련 기관에 방문하여 알아 볼 수 있다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_24"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 취업 기회에 대한 정보를 주변 사람들에게 요청하여 얻을 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_25"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 채용과 관련된 의문이 있을 때 인사담당자에게 직접 문의할 수 있다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_26"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>

									<tr>
										<td>나는 내가 어려움에 처했을 때 도와줄 수 있는 사람을 찾아 도움을 요청할 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_27"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 취업을 위해 주변 사람들에게 도움을 요청할 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_28"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>


									<tr>
										<th rowspan="7">6.구직준비도</th>
										<td>나는 진로를 결정하는 과정에서 주변 사람들에게 도움을 달라고 요청할 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_29"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 관심 갖고 있는 기업에 대한 정보를 대학의 취업관련 기관에 방문하여 알아 볼 수 있다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_30"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 취업 기회에 대한 정보를 주변 사람들에게 요청하여 얻을 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_31"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<th>나는 채용과 관련된 의문이 있을 때 인사담당자에게 직접 문의할 수 있다.</th>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_32"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>

									<tr>
										<td>나는 내가 어려움에 처했을 때 도와줄 수 있는 사람을 찾아 도움을 요청할 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_33"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 취업을 위해 주변 사람들에게 도움을 요청할 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_34"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
									<tr>
										<td>나는 나의 이력서를 잘 작성할 수 있다.</td>
										<%
										for (int i = 1; i < 6; i++) {
										%>
										<td><input class="Scolar_Evauation" name="check_35"
											value=<%=i%> type="radio"
											onclick="checkOnly(this,this.name)"></td>
										<%
										}
										%>
									</tr>
								</table>

							</div>
							<div class="setBtnDiv">
							<input type="submit" class="level_saveBtn" value="저장"> <input
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
	<script src="js/MyPage2.js"></script>
	<script src="js/Scholar_Evaluation.js"></script>
</body>
</html>