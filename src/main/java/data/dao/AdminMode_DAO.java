package data.dao;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import data.vo.Diagnosis_criteria_VO;
import data.vo.Matching_criteria_VO;
import data.vo.Professor_weight_VO;

public class AdminMode_DAO {// 직원 전용 페이지중 일부

	
	
	
	
	
	
	private static SqlSessionFactory sqlMapper = null;

	private static SqlSessionFactory getInstance() {

		if (sqlMapper == null) {
			try {
				String resource = "data/mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	
	
	
	
	private Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/ncp";
		String id = "root";
		String pw = "1234";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, id, pw);
		return con;
	}

	public ArrayList<Matching_criteria_VO> getAll_Matching_criteria_VO() {// 전체 매칭 비율 출력
		
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		List<Matching_criteria_VO> list = new ArrayList();
		Matching_criteria_VO match = new Matching_criteria_VO();


		
		list= session.selectList("mapper.admin.select_matching_criteria");
		
		
		return (ArrayList<Matching_criteria_VO>) list;
	}

	public ArrayList<Professor_weight_VO> getAll_Professor_weight_VO() { // 가중치를 가져온다

		ArrayList<Professor_weight_VO> list = new ArrayList<Professor_weight_VO>();
		Professor_weight_VO weight = new Professor_weight_VO();

		String sql = "select * from  professor_weight";
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				weight.setEvaluation_grade(rs.getInt(1));
				weight.setWeight(rs.getFloat(2));
				list.add(new Professor_weight_VO(rs.getInt(1), rs.getFloat(2)));
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {

		}

		return list;

	}

	public ArrayList<Diagnosis_criteria_VO> getAll_Diagnosis_criteria_VO() { // 준비 수준을 전부 가져온다.
		ArrayList<Diagnosis_criteria_VO> list = new ArrayList();

		String sql = "select * from  Diagnosis_criteria";
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				list.add(new Diagnosis_criteria_VO(rs.getInt(1), rs.getFloat(2), rs.getFloat(3), rs.getFloat(4),
						rs.getFloat(5), rs.getFloat(6), rs.getFloat(7)));
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (Exception e) {

		}

		return list;

	}
	
	public void Update_Professor_weight_VO(String weight, int i ) {// 가중치 업데이트
		
		float f = Float.parseFloat(weight.trim());
		String sql = "Update professor_weight set weight = "+f+"  where evaluation_grade = "+i;
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(sql);

		
			stmt.close();
			con.close();

		} catch (Exception e) {

		}
	}
	
	public void Update_Matching(String[] match) {
	
		String sql = null;
		int count =0;
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			for(int i=1; i<=8; i++) {
				for(int j = 1; j<=6; j++) {
					
					float f = Float.parseFloat(match[count]); 
					sql = "Update matching_criteria set Matching_rate = "+match[count]+"  where capability_number = "+i+" and category_number ="+j;
					stmt.executeUpdate(sql);
					count++;
				}
				
			}
			

		
			stmt.close();
			con.close();

		} catch (Exception e) {

		}
	}
	
	public void Update_Leve(String[] level) {
		Diagnosis_criteria_VO levelset= new Diagnosis_criteria_VO();
		String sql = null;
		int count =0;
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			for(int j = 1; j<=8; j++) {
		
			for(int i =0; i<level.length; i++) {
				if(6%i == 0) {	
					levelset.setHigh_max(Float.parseFloat(level[i]));
				}
				if(6%i == 1) {	
					levelset.setHigh_min(Float.parseFloat(level[i]));
				}
				
				if(6%i == 2) {	
					levelset.setNormal_max(Float.parseFloat(level[i]));
				}
				if(6%i == 3) {	
					levelset.setNormal_min(Float.parseFloat(level[i]));
				}
				if(6%i == 4) {	
					levelset.setLow_max(Float.parseFloat(level[i]));
				}
				if(6%i == 5) {	
					levelset.setLow_min(Float.parseFloat(level[i]));
				}
				
					levelset.setCapability_category(count+1);
					
//					 sql ="update diagnosis_criteria set "
//					 		+ ",high_max   = "+level[i]
//					 		+ ",high_min   ="+level[i]
//					 		+ ",normal_max ="+level[i]
//					 		+ ",normal_min = "+level[i]
//					 		+ ",low_max ="+level[i]
//					 		+ ",low_min ="+level[i]
//					 		+ "where capability_category =1";
				}
			
			}
		
			stmt.close();
			con.close();

		} catch (Exception e) {

		}
	}
	
	

}
