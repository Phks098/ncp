package data;

import java.util.ArrayList;

import data.dao.MyPage_DAO2;
import data.vo.Education_identity_test_VO;
import data.vo.Professor_education_identity_test_VO;

class main {

	public static void main(String[] args) throws Exception {
//		Test_DAO dao = new Test_DAO();
//		ArrayList<Test_VO> list = null;
//		list = (ArrayList<Test_VO>) dao.getTest();
//		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//		
//		dao.insert_test(1);
//		
//		
//		System.out.println("������");
//list = (ArrayList<Test_VO>) dao.getTest();
//		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//		list.add(new Test_VO(1,"��Ƽ�Է�1"));
//		list.add(new Test_VO(1,"��Ƽ�Է�2"));
//		list.add(new Test_VO(1,"��Ƽ�Է�3"));
//		list.add(new Test_VO(1,"��Ƽ�Է�4"));
//		list.add(new Test_VO(1,"��Ƽ�Է�5"));
//		list.add(new Test_VO(1,"��Ƽ�Է�6"));
//		
//System.out.println("���� ���� ���");
//		
//		list = (ArrayList<Test_VO>) dao.getTest();
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//		
//		
//		
//		Map<String,Object> map = new HashMap<>();
//		map.put("list", list);
//		
//		System.out.println(map.toString());
//		
//		dao.insert_test_ArrayList(list);
//		String student  = "201710648";
//		Integration_Score integration_Score = new Integration_Score(); //��Ī ��� Integration_Score ���� �ٽ� �ۼ��Ѵ�
//		Preparation_Level preparation_Level = new Preparation_Level();
//		
//
//		integration_Score.InsertInto_Integration_Score(student); //�������� ����		
//		preparation_Level.Leve(student);//�غ���� ��� ���� �� ��Ī ��� ���
//		System.out.println("����");
//		
//		
		ArrayList<Education_identity_test_VO> list = new ArrayList();
		MyPage_DAO2 dao = new MyPage_DAO2();
		
		String unver ="201910823";
		
		list = dao.getEducation_identity_test(unver);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		int recognition_sum = 0;
		int behavior_sum = 0;
		int emotion_sum = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTest_category() == 1) {
				recognition_sum += list.get(i).getTest_grade();//���� ����
			}
			if(list.get(i).getTest_category() == 2) {
				behavior_sum += list.get(i).getTest_grade();//���� ����
			}
			if(list.get(i).getTest_category() == 3) {
				emotion_sum += list.get(i).getTest_grade();// �ൿ ����
			}
			
		}
		
		// ���� ���� �ൿ ������ ��ü ��
		
		// ������ ��������
		//���� = 7
		//���� = 7
		//�ൿ = 5
		
		int recognition_count = 7;
		int behavior_sum_count = 7;
		int emotion_count = 5;
		
		
		System.out.println(recognition_sum);
		System.out.println(behavior_sum);
		System.out.println(emotion_sum);
		
		
		
		
		
		float recognition_average = recognition_sum/recognition_count;
		float behavior_average = behavior_sum/behavior_sum_count;
		float emotion_average = emotion_sum/emotion_count;
		
		System.out.println("���� ��� ����");
		
		System.out.println(recognition_average); //1
		System.out.println(behavior_average);//2
		System.out.println(emotion_average);//3
		
		
		
		
		
		
		
		float total_student_average = (recognition_average+behavior_average+emotion_average)/3;
		
		
		System.out.println("���� �� �������"+total_student_average);
		
//		university_number �� == �й�
//	    test_number int,  == ī�װ� ��ȣ
//	    category_everage float, == ī�װ� ���
//	    professor_category_everage float == ������ ����

		ArrayList<Professor_education_identity_test_VO> professor = new ArrayList<>();
		
		
		professor = dao.getProfessor_education_identity_test_VO(unver);
		float professor_recognition = 0; // ����
		float professor_behavior = 0;//����
		float professor_emotion = 0;//�ൿ
		
		
		
		
		
		for(int i = 0; i<professor.size(); i++) {
			System.out.println(professor.get(i).toString());
			if(professor.get(i).getTest_category() ==1) {
				professor_recognition = professor.get(i).getEvaluation_grade();
			}
			if(professor.get(i).getTest_category() ==2) {
				professor_behavior = professor.get(i).getEvaluation_grade();
			}
			if(professor.get(i).getTest_category() ==3) {
				professor_emotion = professor.get(i).getEvaluation_grade();
			}
			
		}
		int professor_total_average = (int) (professor_recognition+professor_behavior+professor_emotion)/3;
		
		int result = (int) (((total_student_average+professor_total_average)*10)/2);
		float real = result/10;
		
		System.out.println("���� �򰡿� �л� ���� ��ü�� ���� = "+real);
		
		
		
		
		
		
		
		
	}

}
