package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Integration_Score {
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	String Driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost/ncp?serverTimezone=UTC";
	String id = "root";
	String password = "1234";
	
	
	String university_number;    //�й�
	int test_category;           //�з���ȣ 1.����,2.
	float category_everage;  // �ش� �з� ��ȣ�� ���
	float integrated_score;  // ��������
	
	// �ش� �����ϴ� �������� ���μ��� ������ �����ͼ� ����ġ���� �����ؼ� ������ش�.
	
	public Integration_Score(){
		       
	}
	
	Integration_Score(String university_number,int test_category,float category_everage, float integrated_score){
		this.university_number = university_number;
		this.test_category =test_category;
		this.category_everage = category_everage;
		this.integrated_score = integrated_score; 
	}
	
	public void InsertInto_Integration_Score(String university_number){
		// �Ű� ���� == ���� ������ ������� �л��� �й�
		
		float[] professor_weight = new float[6];
		float[] avg_test_grade = new float[6];
		float[] integrated_score_all = new float[6];
		
		try {
			con = DriverManager.getConnection(url,id,password);
			stmt = con.createStatement();
			
			rs = stmt.executeQuery("select w.weight from Professor_Career_Evaluation as p "
					+ "inner join professor_weight as w "
					+ "on p.evaluation_grade = w.evaluation_grade where university_number ='"+university_number+"'"); 
			
			//1~6�� ������ ��米�� ����ġ���� professor_weight �迭�� ���� �ִ´�.
			
			int count = 0;
			
			while(rs.next()) {
				professor_weight[count] = rs.getFloat(1);
				count++;
			}
			
			
			
			rs = stmt.executeQuery("select s.name, f.university_number, t.category_name, avg(test_grade) "
					+ "from Career_Test as f "
					+ "inner join  student as s on s.university_number = f.university_number "
					+ "inner join test_category as t on t.category_number = f.test_category  "
					+ "group by test_category,university_number having (university_number) = '"+university_number+"' order by university_number  "); 
			count = 0;
			while(rs.next()) {
				avg_test_grade[count] = (float) (Math.round(rs.getFloat(4)*10)/10.0);
				System.out.println(rs.getFloat(4));
				count++;
			}
			
			
			// ���� ���� = ���� ��� ���� + ������ ��� ����* ����ġ��/2
			// ������ ��� ������ �����;��Ѵ�.
			
			for(int i = 0; i<avg_test_grade.length; i++) {
				integrated_score_all[i] = (float) (Math.round(((avg_test_grade[i]+(avg_test_grade[i]*professor_weight[i]))/2)*10)/10.0) ;
				
			}
			System.out.println("�������� ������~~");
			String sql = "insert into Integration_Score values "
					+ "('"+university_number+"', 1,"+avg_test_grade[0]+","+integrated_score_all[0]+"),"
					+ "('"+university_number+"', 2,"+avg_test_grade[1]+","+integrated_score_all[1]+"),"
					+ "('"+university_number+"', 3,"+avg_test_grade[2]+","+integrated_score_all[2]+"),"
					+ "('"+university_number+"', 4,"+avg_test_grade[3]+","+integrated_score_all[3]+"),"
					+ "('"+university_number+"', 5,"+avg_test_grade[4]+","+integrated_score_all[4]+"),"
					+ "('"+university_number+"', 6,"+avg_test_grade[5]+","+integrated_score_all[5]+");";
			System.out.println(sql);
			stmt.execute(sql);
			System.out.println("sucees");
			rs.close();
			stmt.close();
			con.close();
			// 1.�ڱ�����, 2.������������, 3.���ΰ���, 4.�ǻ����, 5.���� Ȱ���ڽŰ�, 6.�����غ�
			
			System.out.println("�й�:"+university_number+"| ���� ����: �ڱ�����     | ���� ���: "+avg_test_grade[0]+" | ���� ���� ����: "+integrated_score_all[0]);
			System.out.println("�й�:"+university_number+"| ���� ����: ������������  | ���� ���: "+avg_test_grade[1]+" | ���� ���� ����: "+integrated_score_all[1]);
			System.out.println("�й�:"+university_number+"| ���� ����: ���ΰ���     | ���� ���: "+avg_test_grade[2]+" | ���� ���� ����: "+integrated_score_all[2]);
			System.out.println("�й�:"+university_number+"| ���� ����: �ǻ����     | ���� ���: "+avg_test_grade[3]+" | ���� ���� ����: "+integrated_score_all[3]);
			System.out.println("�й�:"+university_number+"| ���� ����: Ȱ���ڽŰ�   | ���� ���: "+avg_test_grade[4]+" | ���� ���� ����: "+integrated_score_all[4]);
			System.out.println("�й�:"+university_number+"| ���� ����: �����غ�   | ���� ���: "+avg_test_grade[5]+" | ���� ���� ����: "+integrated_score_all[5]);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}