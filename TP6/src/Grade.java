
public class Grade {
	private static final int MAXIMUM_GRADE=20;
	 private final double value;
	 private final boolean isAbsent; 
	 

public Grade(double value, boolean isAbsent) {
	this.value=value;
	this.isAbsent=isAbsent;
}
public Grade() {
	this.value = 0;
	this.isAbsent = true;
	System.out.println("valeur ABS");
	
}
public Grade(double value) {
	this.value=value;
	this.isAbsent = true;
	
}

public boolean isAbsent() {
	
	if(value<0 && value >20) {
		return false;
	}return true;
}

public double getValue() {
	 return this.value;
}

public String toString() {
	if(value<0 && value >20) return "ABS";
	return +value+"/20";
}

public static final int getMaximumGrade() {
	return MAXIMUM_GRADE;
}
}

