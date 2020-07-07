import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private final String firstName;
	private final String lastName;
	private final List<TeachingUnitResult> results;
	
	Student(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		this.results = new ArrayList<>();
	}
	
	public void addResult(String teachingUnitName, Grade grade) {
		results.add(new TeachingUnitResult());
	}
	
	
}
