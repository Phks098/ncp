package data.vo;

public class Diagnosis_criteria_VO {
	
	int capability_category;
	float high_max;
	float high_min;
	float normal_max;
	float normal_min;
	float low_max;
	float low_min;
	
	
	
	public Diagnosis_criteria_VO() {
		super();
	}
	public Diagnosis_criteria_VO(int capability_category, float high_max, float high_min, float normal_max,
		float normal_min, float low_max, float low_min) {
		super();
		this.capability_category = capability_category;
		this.high_max = high_max;
		this.high_min = high_min;
		this.normal_max = normal_max;
		this.normal_min = normal_min;
		this.low_max = low_max;
		this.low_min = low_min;
	}
	public int getCapability_category() {
		return capability_category;
	}
	public void setCapability_category(int capability_category) {
		this.capability_category = capability_category;
	}
	public float getHigh_max() {
		return high_max;
	}
	public void setHigh_max(float high_max) {
		this.high_max = high_max;
	}
	public float getHigh_min() {
		return high_min;
	}
	public void setHigh_min(float high_min) {
		this.high_min = high_min;
	}
	public float getNormal_max() {
		return normal_max;
	}
	public void setNormal_max(float normal_max) {
		this.normal_max = normal_max;
	}
	public float getNormal_min() {
		return normal_min;
	}
	public void setNormal_min(float normal_min) {
		this.normal_min = normal_min;
	}
	public float getLow_max() {
		return low_max;
	}
	public void setLow_max(float low_max) {
		this.low_max = low_max;
	}
	public float getLow_min() {
		return low_min;
	}
	public void setLow_min(float low_min) {
		this.low_min = low_min;
	}
	@Override
	public String toString() {
		return "Diagnosis_criteria_VO [capability_category=" + capability_category + ", high_max=" + high_max
				+ ", high_min=" + high_min + ", normal_max=" + normal_max + ", normal_min=" + normal_min + ", low_max="
				+ low_max + ", low_min=" + low_min + "]";
	}
	
}
