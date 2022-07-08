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
//		System.out.println("변경후");
//list = (ArrayList<Test_VO>) dao.getTest();
//		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//		list.add(new Test_VO(1,"멀티입력1"));
//		list.add(new Test_VO(1,"멀티입력2"));
//		list.add(new Test_VO(1,"멀티입력3"));
//		list.add(new Test_VO(1,"멀티입력4"));
//		list.add(new Test_VO(1,"멀티입력5"));
//		list.add(new Test_VO(1,"멀티입력6"));
//		
//System.out.println("삭제 이후 출력");
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
//		Integration_Score integration_Score = new Integration_Score(); //매칭 결과 Integration_Score 값들 다시 작성한다
//		Preparation_Level preparation_Level = new Preparation_Level();
//		
//
//		integration_Score.InsertInto_Integration_Score(student); //통합점수 저장		
//		preparation_Level.Leve(student);//준비수준 결과 저장 및 매칭 계산 결과
//		System.out.println("성공");
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
				recognition_sum += list.get(i).getTest_grade();//인지 총합
			}
			if(list.get(i).getTest_category() == 2) {
				behavior_sum += list.get(i).getTest_grade();//정서 총합
			}
			if(list.get(i).getTest_category() == 3) {
				emotion_sum += list.get(i).getTest_grade();// 행동 총합
			}
			
		}
		
		// 인지 정서 행동 순서로 전체 합
		
		// 영역별 문제개수
		//인지 = 7
		//정소 = 7
		//행동 = 5
		
		int recognition_count = 7;
		int behavior_sum_count = 7;
		int emotion_count = 5;
		
		
		System.out.println(recognition_sum);
		System.out.println(behavior_sum);
		System.out.println(emotion_sum);
		
		
		
		
		
		float recognition_average = recognition_sum/recognition_count;
		float behavior_average = behavior_sum/behavior_sum_count;
		float emotion_average = emotion_sum/emotion_count;
		
		System.out.println("역량 평균 점수");
		
		System.out.println(recognition_average); //1
		System.out.println(behavior_average);//2
		System.out.println(emotion_average);//3
		
		
		
		
		
		
		
		float total_student_average = (recognition_average+behavior_average+emotion_average)/3;
		
		
		System.out.println("역량 총 평균점수"+total_student_average);
		
//		university_number ㅡ == 학번
//	    test_number int,  == 카테고리 번호
//	    category_everage float, == 카테고리 평균
//	    professor_category_everage float == 교수님 점수

		ArrayList<Professor_education_identity_test_VO> professor = new ArrayList<>();
		
		
		professor = dao.getProfessor_education_identity_test_VO(unver);
		float professor_recognition = 0; // 인지
		float professor_behavior = 0;//정서
		float professor_emotion = 0;//행동
		
		
		
		
		
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
		
		System.out.println("교수 평가와 학생 점수 정체감 점수 = "+real);
		
		
		
		
		
		
		
		
	}

}
