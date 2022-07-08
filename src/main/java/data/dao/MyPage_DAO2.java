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

import data.Integration_Score;
import data.Preparation_Level;
import data.vo.Career_test_VO;
import data.vo.Education_identity_test_VO;
import data.vo.Education_identity_test_score_VO;
import data.vo.Mypage_VO;
import data.vo.Professor_education_identity_test_VO;
import data.vo.Student_VO;

public class MyPage_DAO2 {

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

	// 평가한 평가지를 가지고 해당학생의 검사지를 초기화 해준다.
	public void insert_Education_Identity_Test(ArrayList<String> String, String sutudent) {

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		ArrayList<Education_identity_test_VO> list = new ArrayList<>();
		Map<String, Object> map = new HashMap();

		map.put("list", list);

		session.insert(sutudent, map);

	}

	// 진로개발준비도 검사를 삭제하고 다시 작성하게 함으로써 업데이트하게 함
	public void re_insert(ArrayList<String> list, String student) {
		List<Mypage_VO> data = null;

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		session.delete("mapper.mypage.delete_Career_Test", student);
		session.delete("mapper.mypage.delete_Capability_Matching_score", student);
		session.delete("mapper.mypage.delete_Integration_Score", student);
		session.delete("mapper.mypage.delete_Preparation_Level", student);

		List<Career_test_VO> Career_test_VO_list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			Career_test_VO_list.add(new Career_test_VO(student, i + 1, Integer.parseInt(list.get(i)), 1, "now()"));
		}

		for (int i = 5; i < 11; i++) {
			Career_test_VO_list.add(new Career_test_VO(student, i + 1, Integer.parseInt(list.get(i)), 2, "now()"));
		}

		for (int i = 11; i < 16; i++) {
			Career_test_VO_list.add(new Career_test_VO(student, i + 1, Integer.parseInt(list.get(i)), 3, "now()"));
		}

		for (int i = 16; i < 23; i++) {
			Career_test_VO_list.add(new Career_test_VO(student, i + 1, Integer.parseInt(list.get(i)), 4, "now()"));
		}

		for (int i = 23; i < 28; i++) {
			Career_test_VO_list.add(new Career_test_VO(student, i + 1, Integer.parseInt(list.get(i)), 5, "now()"));
		}
		for (int i = 28; i < 35; i++) {
			Career_test_VO_list.add(new Career_test_VO(student, i + 1, Integer.parseInt(list.get(i)), 6, "now()"));
		}

		Map<String, Object> map = new HashMap<>();
		map.put("list", Career_test_VO_list);

		session.insert("mapper.mypage.insert_Career_test", map);

		Integration_Score integration_Score = new Integration_Score(); // 매칭 결과 Integration_Score 값들 다시 작성한다
		Preparation_Level preparation_Level = new Preparation_Level();

		session.commit();
		integration_Score.InsertInto_Integration_Score(student); // 통합점수 저장
		preparation_Level.Leve(student);// 준비수준 결과 저장 및 매칭 계산 결과
		System.out.println("성공");
	}

	// 해당 학번 학생의 8가지 역량 분석 결과 출력
	public List<Mypage_VO> getStudent_Level(String university_number) {
		List<Mypage_VO> data = null;

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		data = session.selectList("mapper.mypage.selectOne", university_number);

		return data;
	}

	// 학생의 정보를 반환한다.
	public Student_VO getStudentInformation(String univer_number) {

		Student_VO data = null;
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		data = session.selectOne("mapper.student.selectAll", univer_number);

		return data;
	}

	// 진로정체감 검사지를 가져오는 함수이다.
	public ArrayList<Education_identity_test_VO> getEducation_identity_test(String univer_number) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<Education_identity_test_VO> list = new ArrayList<>();

		list = session.selectList("mapper.education.select_Education_identity_test", univer_number);

		return (ArrayList<Education_identity_test_VO>) list;
	}

	public ArrayList<Professor_education_identity_test_VO> getProfessor_education_identity_test_VO(
			String univer_number) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		List<Professor_education_identity_test_VO> list = new ArrayList();

		list = session.selectList("mapper.professor_education.select_professor_education_identity_test", univer_number);

		return (ArrayList<Professor_education_identity_test_VO>) list;
	}
	
	public void insertEducation_identity_test_score_VO(ArrayList<Education_identity_test_score_VO> list) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
	}
	
	
	
	
	
	

}
