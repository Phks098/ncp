package data.vo;

public class Education_identity_test_VO {
	String university_number;
	int test_number;
	int test_grade;
	int test_category;
	String test_date;
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
	public int getTest_grade() {
		return test_grade;
	}
	public void setTest_grade(int test_grade) {
		this.test_grade = test_grade;
	}
	public int getTest_category() {
		return test_category;
	}
	public void setTest_category(int test_category) {
		this.test_category = test_category;
	}
	public String getTest_date() {
		return test_date;
	}
	public void setTest_date(String test_date) {
		this.test_date = test_date;
	}
	@Override
	public String toString() {
		return "Education_identity_test_VO [university_number=" + university_number + ", test_number=" + test_number
				+ ", test_grade=" + test_grade + ", test_category=" + test_category + ", test_date=" + test_date + "]";
	}
	
	
}
