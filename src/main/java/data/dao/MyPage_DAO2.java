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

	// ���� ������ ������ �ش��л��� �˻����� �ʱ�ȭ ���ش�.
	public void insert_Education_Identity_Test(ArrayList<String> String, String sutudent) {

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		ArrayList<Education_identity_test_VO> list = new ArrayList<>();
		Map<String, Object> map = new HashMap();

		map.put("list", list);

		session.insert(sutudent, map);

	}

	// ���ΰ����غ� �˻縦 �����ϰ� �ٽ� �ۼ��ϰ� �����ν� ������Ʈ�ϰ� ��
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

		Integration_Score integration_Score = new Integration_Score(); // ��Ī ��� Integration_Score ���� �ٽ� �ۼ��Ѵ�
		Preparation_Level preparation_Level = new Preparation_Level();

		session.commit();
		integration_Score.InsertInto_Integration_Score(student); // �������� ����
		preparation_Level.Leve(student);// �غ���� ��� ���� �� ��Ī ��� ���
		System.out.println("����");
	}

	// �ش� �й� �л��� 8���� ���� �м� ��� ���
	public List<Mypage_VO> getStudent_Level(String university_number) {
		List<Mypage_VO> data = null;

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		data = session.selectList("mapper.mypage.selectOne", university_number);

		return data;
	}

	// �л��� ������ ��ȯ�Ѵ�.
	public Student_VO getStudentInformation(String univer_number) {

		Student_VO data = null;
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		data = session.selectOne("mapper.student.selectAll", univer_number);

		return data;
	}

	// ������ü�� �˻����� �������� �Լ��̴�.
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
