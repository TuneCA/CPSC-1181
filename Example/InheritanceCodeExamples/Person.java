
public abstract class Person  {
	private int birthYear;
	private String name;
	
	public Person (String name, int birthYear){
		this.birthYear = birthYear;
		this.name = name;
	}
	public String complain() {
		return "FML";
	}
	public String toString(){
		return this.name + " " + this.birthYear;
	}
}
