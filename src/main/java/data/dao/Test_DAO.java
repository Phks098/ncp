package data.dao;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import data.vo.Test_VO;

public class Test_DAO {
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
	
	public List<Test_VO> getTest() {// 해당 학번 학생의 8가지 역량 분석 결과 출력
		List<Test_VO> data = null;
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		data = session.selectList("mapper.test.select_Test");
		
		return  data;
	}
	
	public int insert_test(int t) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		int result = session.insert("mapper.test.insert_All",t);
		
		session.commit();
		return result;
	}
	
	public int insert_test_ArrayList(List<Test_VO> t) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int count = 0;
		
		Map<String,Object> map = new HashMap<>();
		map.put("list", t);
		
		count += session.insert("mapper.test.insert_Multi_All",map);
		
		session.commit();
		return count;
	}
	
	public int delet_Test() {
		int result = 0 ;
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		result = session.delete("mapper.test.delete_test");
		session.commit();
		return result;
	}
	
}
