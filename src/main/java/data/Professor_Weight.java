package data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Professor_Weight {
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	String Driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost/systemtable?serverTimezone=UTC";
	String id = "root";
	String password = "1234";
	
	int evaluation_grade; // ����
	float weight;// �ش� �� ������ ���� ����ġ�� 
	
	Professor_Weight(){}
	
	public float getWeight(int evaluation_grade) {
		float weight = 0;
		
		try {
			con = DriverManager.getConnection(url,id,password);
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select * from Professor_Weight where evaluation_grade = "+evaluation_grade);
			rs.next();
			weight = rs.getFloat(2);
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return weight;
	}
	
	
}