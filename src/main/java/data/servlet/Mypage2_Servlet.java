package data.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.MyPage_DAO2;


//일반 대학생 전용 페이지 처리 컨트롤러이다.
@WebServlet("/Mypage2")
public class Mypage2_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Mypage2_Servlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		MyPage_DAO2 dao2 = new MyPage_DAO2();
		System.out.println("Mypage2_action="+action);
		String page = null;
		
		
		//Education_Test_Set
		
		if(action== null) {
			page = "MyPage.jsp";
		}
		
		// 커리어넷 검사 제출s시 다시 결과를 계산해서 산출해준다.
		else if(action.equals("reTest")) {
			ArrayList<String> value = new ArrayList();
			String student = request.getParameter("student");
			System.out.println(student);
			for (int i = 0; i < 35; i++) {
				value.add(request.getParameter("check_" + (i + 1)));
			}
			dao2.re_insert(value, student);
			page = "MyPage.jsp";
		}
		
		
		//사범대 전용 검사한 내용을 저장할  DAO 선언한다
		else if(action.equals("Education_Test_Set")) {
			
			System.out.println("Education_Test_Set_start");
			ArrayList<String> value = new ArrayList();
			
			String student = request.getParameter("student");
			
			System.out.println(student);
			for (int i = 0; i < 19; i++) {
				value.add(request.getParameter("check_" + (i + 1)));
			}
			
			System.out.println(student);
			for(int i = 0; i<value.size(); i++) {
				System.out.println(value.get(i));
			}
			
			
			
			page = "MyPage.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
