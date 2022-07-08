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

// ������������ ���ΰ����غ� �� ���� ����
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

		} else if (action.equals("Evelment")) {// ������ ������ �˻��� ����� �޾ƿ´�.
			ArrayList value = new ArrayList();

			for (int i = 0; i < 6; i++) {
				value.add(request.getParameter("check_" + (i + 1)));
				System.out.println(value.get(i));
			}

			
			System.out.println(request.getParameter("student"));
//			dao.SetEvaluation(value,"201910823");
			nextPage="Professor_Search_Student.jsp";
			
			
			
			
			
			
			
			

		}else if(action.equals("Request_Student")) {// �ܺο��� ������ ��û�Ѵٸ� �ش��л��� ������ ������ͼ� 
			System.out.println(student); // �ش��й��� �����ָ鼭 ���������� ���ش�. 201710648
		
		}

		
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
