public class Student extends Person {
	private String program;
	public Student(String name, int birthYear, String program){
		super(name, birthYear);
		this.program = program;
	}
	public String complain() {
		return "You marked my midterm too low!";
	}
	public String toString(){
		return super.toString() + " " + this.program;
	}

}