
public class Grade {
	private static final int MAXIMUM_GRADE=20;
	 private final double value;
	 private final boolean isAbsent; 
	 

public Grade(double value, boolean isAbsent) throws IllegalArgumentException {
	
	if(value<0 || value>20) {
		throw new IllegalArgumentException("WESH MAIS ON T'AS DIT ENTRE 0 ET 20 !!!");
	} else {
		this.value = value;
	}

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

@SuppressWarnings("unused")
public boolean isAbsent() {
	
	Double newValue = value;
	
	if(newValue == null) {
		return true;
	} else {
		System.out.println("Not ABS");
		return false;
	}

}

public double getValue() {
	 return this.value;
}

public String toString() {
	
	Double newValue = value;
	
	if(newValue == null) {
		return "ABS";
	} else {
		return +value+"/20";
	}
	
}

public static final int getMaximumGrade() {
	return MAXIMUM_GRADE;
}
}

