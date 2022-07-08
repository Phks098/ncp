package data.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.Scholar_Evaluation_DAO;
import data.vo.Student_VO;

@WebServlet("/Scholar_Evaluation")

// 지도교수전용 진로개발준비도 평가 수행 서블릿
public class Scholar_Evaluation_Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Scholar_Evaluation_Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextPage = "Scholar_Evaluation.jsp";
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");
		String student = request.getParameter("student");
		
		
		
		Scholar_Evaluation_DAO dao = new Scholar_Evaluation_DAO();

		if (action == null) {//

		} else if (action.equals("Evelment")) {// 유저가 선택한 검사지 결과를 받아온다.
			ArrayList value = new ArrayList();

			for (int i = 0; i < 6; i++) {
				value.add(request.getParameter("check_" + (i + 1)));
				System.out.println(value.get(i));
			}

			
			System.out.println(request.getParameter("student"));
//			dao.SetEvaluation(value,"201910823");
			nextPage="Professor_Search_Student.jsp";
			
			
			
			
			
			
			
			

		}else if(action.equals("Request_Student")) {// 외부에서 접속을 요청한다면 해당학생의 정보를 가지고와서 
			System.out.println(student); // 해당학번을 보내주면서 페이지르리 펴준다. 201710648
		
		}

		
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
