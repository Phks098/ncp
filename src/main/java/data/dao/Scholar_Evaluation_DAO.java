package data.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import data.vo.Student_VO;

public class Scholar_Evaluation_DAO {

	private Connection getConnection() throws Exception {

		String url = "jdbc:mysql://localhost:3306/ncp";
		String id = "root";
		String pw = "1234";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, id, pw);
		return con;

	}

	public void SetEvaluation(ArrayList list, String univertion_number) {

		String sql = null;

		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			for (int i = 0; i < list.size(); i++) {
				sql = "update Professor_Career_Evaluation set " + "evaluation_grade = " + list.get(i)
						+ " where test_category = " + (i + 1) + " and university_number = '" + univertion_number + "'";
				stmt.executeUpdate(sql);
			}

			stmt.close();
			con.close();

		} catch (Exception e) {

		}
	}

	public ArrayList<Student_VO> getStuduent_AllList(String professor) {
		String sql = "select s.university_number,s.name,major.category_name,grade.category_name, p.Professor_name,sex.category_name from student as s "
				+ " join major_information as major  on s.major_number = major.code "
				+ " join student_grade as grade on grade.code = s.grade "
				+ " join student_sex as sex on sex.code = s.sex "
				+ " join professor as p on p.Professor_number =  s.Professor_number where s.Professor_number = "
				+ professor;
		ArrayList<Student_VO> list = new ArrayList();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				list.add(new Student_VO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}

			stmt.close();
			con.close();

		} catch (Exception e) {

		}

		return list;

	}
	

	

}
