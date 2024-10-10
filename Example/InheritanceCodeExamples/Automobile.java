

public class Automobile extends Vehicle{
	private int numSeats;
	private boolean isSUV;
	
	public Automobile(String make, String model, int year, double hp, int numSeats, boolean isSUV){
		super(make, model, year, hp);
		this.numSeats = numSeats;
		this.isSUV = isSUV;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public boolean isSUV() {
		return isSUV;
	}

	public String toString(){
		String str = super.toString();
		str += " has " + this.numSeats + " seats and is a SUV: ";
		str += this.isSUV;
		return str;
	}

	
}
