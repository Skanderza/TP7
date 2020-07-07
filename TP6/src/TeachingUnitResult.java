
public class TeachingUnitResult {

	private final String teachingUnitName;
	private final Grade grade;
	
	public TeachingUnitResult(String teachingUnitName, Grade grade) {
		this.teachingUnitName = teachingUnitName;
		this.grade = grade;
	}
	
	
	public Grade getGrade() {
		return grade;
	}
	
	
	public String toString () {
		return teachingUnitName+" : "+grade.toString();
	}
	
}
