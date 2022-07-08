<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">

.page_toparea {
    padding-top: 195px; 
    padding-top: 224px;
}

.subpage .page_toparea {
    padding-bottom: 150px;
    background: #e7f0fc;
}
.grid_content {
    width: 1280px;
    margin: 0 auto;
}

.header_top {
    position: relative;
    margin-bottom: 10px;
    padding: 28px 0;
    height: 90px;
    font-size: 0;
    line-height: 0;
    text-align: right;
}

.page_wrap {
    position: relative;
    z-index: 1;
    width: 100%;
    min-height: 100%;
    background: #fff;
    -webkit-transition: padding 0.3s;
    -moz-transition: padding 0.3s;
    -o-transition: padding 0.3s;
    transition: padding 0.3s;
    overflow: hidden;
}

.header_logo {
    position: absolute;
    top: 50%;
    left: 50%;
    /* width: 167px; */
    height: 50px;
    -webkit-transform: translate(-50%,-50%);
    -moz-transform: translate(-50%,-50%);
    -o-transform: translate(-50%,-50%);
    transform: translate(-50%,-50%);
}

h1, h2, h3, h4, h5, h6 {
    font-weight: normal;
}

img {
    border: 0;
    vertical-align: middle;
}

html, body, div, span, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, abbr, address, cite, code, del, dfn, em, img, ins, kbd, q, samp, small, strong, sub, sup, var, b, i, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, figcaption, figure, footer, header, hgroup, menu, nav, section, summary, time, mark, audio, video {
    border: 0;
    outline: 0;
    line-height: 1.5em;
    vertical-align: middle;
    letter-spacing: -0.02em;
}

.tbl table {
    width: 100%;
    padding: 8px;
    text-align: center;
    font-size: 1.5rem;
    background-color: #fff;
    border-bottom: 1px solid #d0d2d4;
}

.match table {
    width: 100%;
    padding: 8px;
    text-align: center;
    font-size: 1.1rem;
    background-color: #fff;
    border-bottom: 1px solid #d0d2d4;
}


.tbl table tbody td, .match table tbody td {
    padding: 8px;
    text-align: center;
}

.mainsection_tit {
    margin-bottom: 20px;
    color: #1e1e1e;
    font-family: GyeonggiTitle, sans-serif;
    font-size: 2.6rem;
    font-weight: 600;
    letter-spacing: -0.05em;
    line-height: 1;
   
}


.subpage .contents_wrap  .grid_content {
    padding: 25px 20px 5%;
    min-height: calc( 100vh - 350px );
    background: #fff;
    border: 1px solid #e1e1e1;
}

.tbl_row tbody tr td, .match_row tbody tr td{
    text-align: center;
    border: 1px solid #d0d2d4;
}



.section_marea {
    position: relative;
    margin-bottom: 4%;
}



.section_tit_lg {
    margin-bottom: 0.5em;
    padding: 5px 0 5px 26px;
    color: #3a3a3a;
    font-family: GyeonggiTitle, sans-serif;
    font-size: 2.4rem;
    font-weight: 600;
    letter-spacing: -0.05em;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: auto;
    -webkit-transform: skew(-0.03deg);
    -moz-transform: skew(-0.03deg);
    -o-transform: skew(-0.03deg);
    transform: skew(-0.03deg);
    background: url(https://semsplus.seowon.ac.kr/contents/images/client/sub/icon_tit_lg.png) left 14px no-repeat;
}

.tbl_fixed table {
    table-layout: fixed;
    word-break: break-all;
}




.tbl_row tbody tr th, .match_row tbody tr th  {
    font-weight: 500;
    background-color: #f0f3f7;
    border: 1px solid #d0d2d4;
}



.subpage .contents_wrap > .grid_content {
    padding: 25px 20px 5%;
    min-height: calc( 100vh - 350px );
    background: #fff;
    border: 1px solid #e1e1e1; #�ڵ� �ٹٲ�
}





.tbl_row input{
   width:250px;
   height:20px;
   font-size:20px;
   text-align:center;
}
.match_row input{
   width:100px;
   height:20px;
   font-size:20px;
   text-align:center;
}
   .level_exitBtn{
   padding: 5px;
   width: 120px;;
   font-size: 18px;
   background-color: #ff4040;
   
    }
    
    .level_saveBtn{
      padding: 5px;
      width: 120px;
      font-size: 18px;
      background-color: #0081cc;
      float:center;
    }


</style>

<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
<div class = "page_wrap subpage subpage9">

	<div class="page_toparea">
	
	</div>
	
	<div class ="grid_content">
	<section class ="section_marea">
	
		<h3 class="section_tit_lg">�л� ���ΰ����غ� ��</h3>
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
					<th scope="row">�ܰ�����</th>
					<td>�̵�����մ���</td>
					<th>�Ҽ�</th>
					<td>����Ʈ�����к� (��ǻ�Ͱ��а�)</td>
					</tr>

					<tr>
					<th scope="row">��/����/����/��������</th>
					<td></td>
					<th>�г�</th>
					<td>3�г�</td>
					</tr>

					<tr>
					<th scope="row">����ó</th>
					<td>010-3099-6707</td>
					<th>�̸�</th>
					<td>���ּ� (����)</td>
					</tr>

					<tr>
					<th scope="row">�ּ�</th>
					<td colspan="3">��û�ϵ� û�ֽ� ����� ���Ϸ� 108���� 44</td>
					</tr>
					
				
					
				</tbody>
		</table>		
		</div>
		<div class="match tbl_fixed match_row">
			<table>
			<colgroup>
					<col style="width: 15%;">
					<col style="width: 35%;">
					<col style="width: 10%;">
					<col style="width: 10%;">
					<col style="width: 10%;">
					<col style="width: 10%;">
					<col style="width: 10%;">
				</colgroup>
				<tr>
					<td colspan="7">[�������� ���ΰ����غ� ����]</td>
				</tr>
				<tr>
					<th rowspan="2">���� ����</th><th rowspan="2">�ൿ��ǥ</th><th colspan="5">�������� ���� ô��</th>
				</tr>
				<tr>
					<th>�ſ� �׷���</th><th>�׷���</th><th>����</th><th>�׷��� �ʴ�</th><th>�ſ� �׷��� �ʴ�</th>
				</tr>
				<tr>
					<th>�ڱ�����</th>
					<td>�л��� ������ �����ϰ�, �� �� �� ������, �� �߿���ϴ� �Ϳ� ���� ���� �� �˰� �ִ�.</td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<th>������������</th>
					<td>�л��� �����ִ� ������ ������ ���� ���� �� �˰� �ִ�.</td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<th>���ΰ���Ȯ�ŵ�</th>
					<td>�л��� ���� �ڽ��� ������ ���ο� ���� Ȯ�Ű� ������ ���� ���� ���̴�.</td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<th>�ǻ�����ڽŰ�</th>
					<td>�л��� �ǻ������ ���� �ڽŰ��� ���� ���� ���̴�.</td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<th>����Ȱ���ڽŰ�</th>
					<td>�л��� �ϻ��Ȱ�̳� ����� ���õ� ������ ��ȸ�� ������ ��� ���� ���� ������ ���踦 �������� Ȱ���ϴ� ���̴�.</td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
				<tr>
					<th>�����غ�</th>
					<td>�л��� ����� ���� ��ü������ ��û�Ǵ� ���׵鿡 ���� �ڽŰ��� �־� �غ� ���� ���̴�.</td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
					<td><input type="checkbox"></td>
				</tr>
				
				
			</table>
		</div>
		
	</section>
	</div>
	
	


</div>
</body>
</html>