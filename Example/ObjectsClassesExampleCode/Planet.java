public class Planet {
	public enum Composition {
		gaseous, rocky
	};

	private String name;

	private double mass, diameter;
	private int numMoons;
	private boolean hasRings;
	private Composition planetType;

	public Planet(String name, double mass, double diameter, int numMoons,
			boolean hasRings, Composition planetType) {
		this.name = name;
		this.mass = mass;
		this.diameter = diameter;
		this.numMoons = numMoons;
		this.hasRings = hasRings;
		this.planetType = planetType;
	}

	/**
	 * A copy constructor for planet objects
	 * 
	 * @param p
	 *            a planet object to copy
	 */
	public Planet(Planet p) {
		this(p.getName(), p.getMass(), p.getDiameter(), p.getNumMoons(), p
				.hasRings(), p.getPlanetType());
	}

	/**
	 * A method for creating a deep copy of a planet object
	 * 
	 * @param p
	 * @return
	 */
	public  Planet makeCopy() {
		return new Planet(this.getName(), this.getMass(), this.getDiameter(),
				this.getNumMoons(), this.hasRings(), this.getPlanetType());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public int getNumMoons() {
		return numMoons;
	}

	public void setNumMoons(int numMoons) {
		this.numMoons = numMoons;
	}

	public boolean hasRings() {
		return hasRings;
	}

	public void setRings(boolean hasRings) {
		this.hasRings = hasRings;
	}

	public Composition getPlanetType() {
		return planetType;
	}

	public void setPlanetType(Composition planetType) {
		this.planetType = planetType;
	}

	public String toString() {
		String result = "*******Planet: " + this.name + "*******";
		result += "\nMass: " + this.mass;
		result += "\nDiameter: " + this.diameter;
		result += "\nMoons: " + this.numMoons;
		result += "\nHas rings? " + this.hasRings;
		result += "\nIs type: " + this.planetType;
		return result + "\n";
	}

}
