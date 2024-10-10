import java.util.ArrayList;

public class ArrayListFun {
	public static void main(String[] args) {
		String[] list = new String[0];
		System.out.println(list[0]);
		
		
		
	}

	public static int product(ArrayList<Integer> values) {
		int product = 1;
		for(int num: values) {
			product *= num;
		}
		return product;
	}
	
	public static void removeShortNames(ArrayList<String> names, int length) {
		int i = 0;
		while( i < names.size()) {
			if(names.get(i).length() <= length) 
				names.remove(i);
			else i++;
		}
	}
}
