import java.util.ArrayList;


public class Names {
	public static void main(String[] args){
		ArrayList<String> students= new ArrayList<String>();
		students.add("Harman");
		students.add("Ishan");
		students.add("Jamie");
		students.add("Jon");
		students.add("Kate");

		System.out.println(students.remove("Harman")); 
		System.out.println(students);
		
	}
}
