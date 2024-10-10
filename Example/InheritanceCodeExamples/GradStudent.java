class GradStudent extends Student {
	private String degree;
	public GradStudent(String name, int birthYear, String program, String degree){
		super(name, birthYear, program);
		this.degree = degree;
	}
	
	public String toString(){
		return super.toString() + " " + this.degree;
	}
}