package data;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;




public class Professor_Career_Evaluation {//�������� ���ΰ��� �غ� �� ����
	 Connection con;
	 Statement stmt;
	 ResultSet rs;

	String Driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost/systemtable?serverTimezone=UTC";
	String id = "root";
	String password = "1234";
	
	
	String university_number; // �й� �л� 
	int test_category;        // ���� ���� 
	float evaluation_grade;    // �򰡼���
	String Professor_number; //���� ���� ��ȣ
	
	public float getEvaluation_grade(int category) {
		//�Ű�����
		
		
		return (float)1.2;
		
	}
	
}