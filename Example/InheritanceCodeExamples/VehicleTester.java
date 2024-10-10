
public class VehicleTester {
	public static void main(String[] args) {
		Vehicle tractor = new Vehicle("John Deere", "3025E", 2018, 24.7);
		System.out.println(tractor.toString());
		Truck f150 = new Truck("Ford", "F150", 2001, 231);
		System.out.println(f150.drive());
		Automobile fit = new Automobile("Honda", "Fit", 2013, 117.0, 5, false);
		System.out.println(fit.toString());

		Automobile tesla = new Automobile("Tesla", "Model S", 2018, 691.0, 5, false);
		Vehicle aVehicle = tesla;
		System.out.println(aVehicle.toString());

		Object anObject = tesla;
		System.out.println(tesla.isSUV());
		System.out.println(((Automobile) anObject).isSUV());

		Automobile car = new Automobile("Honda", "Fit", 2013, 119, 5, false);
		Vehicle vCar = (Vehicle) car;
		System.out.println(vCar);
		System.out.println(vCar instanceof Automobile);
		if (tractor instanceof Automobile) {
			Automobile aCar = (Automobile) tractor; // Only attempt to cast if it's safe
			System.out.println(aCar.isSUV());
			System.out.println(aCar);
		} else {
			System.out.println("tractor is not an Automobile, cannot cast.");
		}

	}
}
