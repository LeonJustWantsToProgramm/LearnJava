package methodenUndObjekte;

public class ThetoStringMethod {
	
	int StudentID;
	String StudentName;
	
	ThetoStringMethod (int StudentID, String StudentName) {
		this.StudentID = StudentID;
		this.StudentName = StudentName;
	}
	
	public String toString() {
		return StudentID + " | " + StudentName;
	}

}
