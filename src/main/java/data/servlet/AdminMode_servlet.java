package data.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.AdminMode_DAO;
import data.vo.Diagnosis_criteria_VO;
import data.vo.Matching_criteria_VO;
import data.vo.Professor_weight_VO;

@WebServlet("/AdminMode")
public class AdminMode_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminMode_servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminMode_DAO dao = new AdminMode_DAO();

		String nextPage = null;
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");
		

		if (action == null) {

		} else if (action.equals("weightSet")) {
			String[] weightset = request.getParameterValues("setweight");
			
			for(int i = 0; i<weightset.length/2; i++) {
				String temp = weightset[i];
				weightset[i] = weightset[weightset.length-i-1];
				weightset[weightset.length-i-1] =temp;
			}
				
			for (int i = 0; i < weightset.length; i++) {
				if (!weightset[i].equals("")) {
					dao.Update_Professor_weight_VO(weightset[i], i + 1);
				}

			}
		}
		else if(action.equals("matchSet")) {
			String[] matchset = request.getParameterValues("setMatch");
			dao.Update_Matching(matchset);
		}
		else if(action.equals("setLevel")) {
			String[] level = request.getParameterValues("setLevel");
			dao.Update_Leve(level);
		}
		
		nextPage = "Admin_mode.jsp";
		ArrayList<Matching_criteria_VO> match = dao.getAll_Matching_criteria_VO(); // ��ü ��Ī ������ �����´�
		ArrayList<Professor_weight_VO> weight = dao.getAll_Professor_weight_VO(); // ��ü ����ġ�� �����´�
		ArrayList<Diagnosis_criteria_VO> level = dao.getAll_Diagnosis_criteria_VO(); // ��ü �غ� ������ �����´�

		request.setAttribute("weight", weight);
		request.setAttribute("match", match);
		request.setAttribute("level", level);

		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
