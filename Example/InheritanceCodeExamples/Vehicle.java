

public class Vehicle {
	private String make, model;
	private int year;
	private double horsepower;
	private int mileage;
	private String plateNumber;
	private int numWheels; 
	
	public Vehicle(String make, String model, int year, double horsepower) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.horsepower = horsepower;
	}
	public Vehicle(String make, String model, int year, double horsepower, int miles, String plate, int wheels) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.horsepower = horsepower;
		this.numWheels = wheels;
		this.plateNumber = plate;
		this.mileage = miles;
	}
	public String toString() {
		return this.make + " " + this.model + " made in " + this.year + " has " +this.horsepower+ "hp.";
	}
	public String drive() {
		return this.model + " goes VROOOM!";
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(double horsepower) {
		this.horsepower = horsepower;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public int getNumWheels() {
		return numWheels;
	}
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
}
