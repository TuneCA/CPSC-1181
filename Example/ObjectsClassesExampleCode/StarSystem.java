import java.util.Arrays;

public class StarSystem {
	private String star;
	private Planet[] planetList;
	private static int numberOfSystems = 0;

	
	public StarSystem(String star, Planet[] planetList) {
		this.star = star;
		this.planetList = Arrays.copyOf(planetList, planetList.length);
		numberOfSystems++;
	}

	
	public static int getNumberOfSystems() {
		return numberOfSystems;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public Planet[] getPlanetList() {
		return Arrays.copyOf(planetList, planetList.length);
	}

	public void setPlanetList(Planet[] planetList) {
		this.planetList = Arrays.copyOf(planetList,planetList.length);
	}

	public void addPlanet(Planet p) {
		if (p != null) {
			Planet[] temp = new Planet[planetList.length + 1];
			for (int i = 0; i < planetList.length; i++) {
				temp[i] = planetList[i];
			}
			temp[planetList.length] = p;
			this.planetList = temp;
		}
	}

	public void removePlanet(Planet p) {
		Planet[] temp = new Planet[planetList.length - 1];
		if (p != null) {
			int i = 0, j =0;
			while (i < planetList.length) {
				if (planetList[i] != p) {
					temp[j] = planetList[i];
					i++;
					j++;
				}else i++;
			}
		}
		this.planetList = temp;
	}
	
	public String toString(){
		String result = "~~~~~Star System: " + this.star + "~~~~~\n";
		for(int i=0; i < planetList.length; i++){
			result += planetList[i].toString();
		}
		return result + "\n";
	}
}
