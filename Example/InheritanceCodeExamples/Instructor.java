
public class Instructor extends Person {
	private double salary;
	
	public Instructor(String name, int birthYear, double salary){
		super(name, birthYear);
		this.salary = salary;
	}
	public String complain() {
		return "I didn't mark your midterm low enough!";
	}
	public String toString(){
		return super.toString() + " " + this.salary;
	}
}