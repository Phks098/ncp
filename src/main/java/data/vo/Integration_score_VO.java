package data.vo;

public class Integration_score_VO {
	String university_number;
	int test_category;
	float category_everage;
	float integrated_score;
	
	public String getUniversity_number() {
		return university_number;
	}
	public void setUniversity_number(String university_number) {
		this.university_number = university_number;
	}
	public int getTest_category() {
		return test_category;
	}
	public void setTest_category(int test_category) {
		this.test_category = test_category;
	}
	public float getCategory_everage() {
		return category_everage;
	}
	public void setCategory_everage(float category_everage) {
		this.category_everage = category_everage;
	}
	public float getIntegrated_score() {
		return integrated_score;
	}
	public void setIntegrated_score(float integrated_score) {
		this.integrated_score = integrated_score;
	}
}
