package data.vo;

public class Education_identity_test_score_VO {
	String university_number;
	int test_number;
	float category_everage;
	float professor_category_everage;

	public String getUniversity_number() {
		return university_number;
	}

	public void setUniversity_number(String university_number) {
		this.university_number = university_number;
	}

	public int getTest_number() {
		return test_number;
	}

	public void setTest_number(int test_number) {
		this.test_number = test_number;
	}

	public float getCategory_everage() {
		return category_everage;
	}

	public void setCategory_everage(float category_everage) {
		this.category_everage = category_everage;
	}

	public float getProfessor_category_everage() {
		return professor_category_everage;
	}

	public void setProfessor_category_everage(float professor_category_everage) {
		this.professor_category_everage = professor_category_everage;
	}

	@Override
	public String toString() {
		return "Education_identity_test_score_VO [university_number=" + university_number + ", test_number="
				+ test_number + ", category_everage=" + category_everage + ", professor_category_everage="
				+ professor_category_everage + "]";
	}

	public Education_identity_test_score_VO(String university_number, int test_number, float category_everage,
			float professor_category_everage) {
		super();
		this.university_number = university_number;
		this.test_number = test_number;
		this.category_everage = category_everage;
		this.professor_category_everage = professor_category_everage;
	}

	public Education_identity_test_score_VO() {
		super();
	}
	

}
