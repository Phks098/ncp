package data.vo;

public class Professor_weight_VO {
	
	int evaluation_grade;
	float weight;
	
	public int getEvaluation_grade() {
		return evaluation_grade;
	}
	public void setEvaluation_grade(int evaluation_grade) {
		this.evaluation_grade = evaluation_grade;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Professor_weight_VO(int evaluation_grade, float weight) {
		super();
		this.evaluation_grade = evaluation_grade;
		this.weight = weight;
	}
	public Professor_weight_VO() {
		super();
	}
	
	
}
