package data.vo;

public class Matching_criteria_VO {
	int capability_number;
	int category_number;
	float matching_rate;
	
	
	public Matching_criteria_VO(int int1, int int2, float float1) {
		this.capability_number =int1;
		this.category_number = int2;
		this.matching_rate =float1;
		
		// TODO Auto-generated constructor stub
	}
	
	public Matching_criteria_VO() {}
	
	public int getCapability_number() {
		return capability_number;
	}
	
	public void setCapability_number(int capability_number) {
		this.capability_number = capability_number;
	}
	
	public int getCategory_number() {
		return category_number;
	}
	
	public void setCategory_number(int category_number) {
		this.category_number = category_number;
	}
	
	public float getMatching_rate() {
		return matching_rate;
	}
	
	public void setMatching_rate(float matching_rate) {
		matching_rate = matching_rate;
	}

	
	
}
