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

import data.vo.Mypage_VO;
import data.vo.Student_VO;

public class MyPage_DAO {
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
	
	
	public ArrayList<Mypage_VO> getStudent_Level(String university_number) {// 해당 학번 학생의 8가지 역량 분석 결과 출력
		List<Mypage_VO> data = null;
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		data = session.selectList("mapper.mypage.selectOne",university_number);
		
		return  (ArrayList<Mypage_VO>) data;
	}
	
	
	
	public Student_VO getStudentInformation(String univer_number) {
		
		Student_VO data = null;
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		data = session.selectOne("mapper.student.selectAll",univer_number);
		
		return data;
	}
	
	


	
	
	


}
