
public class Laundry {

	public static void main(String[] args) {
		TShirt tee = new TShirt("purple", ShirtSize.LARGE);
		System.out.println(tee);
		tee.shrinkShirt();
		System.out.println(tee);
		tee.stretchShirt();
		tee.stretchShirt();
		System.out.println(tee);

	}

}
