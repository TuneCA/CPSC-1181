
public class TimeOfYear {
	public enum Season{winter, spring, summer, fall};
	public static void main(String[] args) {	
		Season good = Season.summer;
		Season bad = Season.winter;
	
		System.out.println(good);
		System.out.println(good.name());
		System.out.println(good.ordinal());
	}
}
