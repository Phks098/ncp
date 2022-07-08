package data.dao;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import data.vo.Diagnosis_criteria_VO;
import data.vo.Matching_criteria_VO;
import data.vo.Professor_weight_VO;

public class Admin_Mode_DAO {

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

	public List<Matching_criteria_VO> getAll_Capability_category() {

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<Matching_criteria_VO> list = new ArrayList();
		list = session.selectList("mapper.admin.selectAll");
		return list;

	}

	public List<Professor_weight_VO> getAll_Professor_weight() {

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<Professor_weight_VO> list2 = new ArrayList();
		list2 = session.selectList("mapper.admin.weight_selectAll");
		return list2;
	}

	public List<Diagnosis_criteria_VO> getAll_Level() {

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<Diagnosis_criteria_VO> list = new ArrayList();
		list = session.selectList("mapper.admin.level_selectAll");
		return list;
	}

	public void Update_Weight(Professor_weight_VO weight) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = session.update("mapper.admin.Weight_Update", weight);
		session.commit();

	}

}
