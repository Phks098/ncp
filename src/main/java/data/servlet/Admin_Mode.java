package data.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.Admin_Mode_DAO;
import data.vo.Diagnosis_criteria_VO;
import data.vo.Matching_criteria_VO;
import data.vo.Professor_weight_VO;

@WebServlet("/Admin_Mode")
public class Admin_Mode extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String url = "jdbc:mysql://localhost:3306/systemtable";
	String id = "root";
	String pw = "1234";

	public Admin_Mode() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Admin_Mode_DAO dao1 = new Admin_Mode_DAO();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getParameter("action");
		String nextPage = "";
		

		if (action == null) {

		} else if (action.equals("Login")) {

			String[] value = request.getParameterValues("setWeight");

			Professor_weight_VO weight_VO = new Professor_weight_VO();

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, id, pw);
				Statement stmt = con.createStatement();
				
				for(int i = value.length; i>0; i--) {
					System.out.println("update professor_weight set weight = " +Float.parseFloat(value[i-1])+ " where evaluation_grade = " +i);
				} 
				
				stmt.executeUpdate("update professor_weight set weight = " +10.1+ " where evaluation_grade = " +1);
				
			} catch (Exception e) {
			}
			
		}
		List<Matching_criteria_VO> data1 = dao1.getAll_Capability_category();
		List<Professor_weight_VO> weight = dao1.getAll_Professor_weight();
		List<Diagnosis_criteria_VO> level = dao1.getAll_Level();
		request.setAttribute("weight", weight);
		request.setAttribute("data1", data1);
		request.setAttribute("level", level);
		nextPage = "Admin_mode.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
