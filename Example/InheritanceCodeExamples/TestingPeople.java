
public class TestingPeople {
	public static void main(String[] args){
		
		GradStudent gs = new GradStudent("Amir", 1991, "Big Data", "Bioinformatics");
		System.out.println(gs.complain());
		
		Student s = new Student("Samir", 1985, "Computer Security");
		System.out.println(s.complain());
		
		Instructor i = new Instructor("Ryan", 1989, 50000.00);
		System.out.println(i.complain());
		
		Person p = new Instructor("Salvatore", 1951, 65000.00);
		System.out.println(p.complain());
		
		Person[] people = new Person[4];
		people[0] = gs;
		people[1] = s;
		people[2] = i;
		people[3] = p;
		for(Person ppl: people)
			System.out.println(ppl.toString());
	}
}
