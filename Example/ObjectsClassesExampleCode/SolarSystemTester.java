
public class SolarSystemTester {
	
	public static void main(String[] args) {
	
		System.out.println(StarSystem.getNumberOfSystems());
		
		
		
		Planet earth = new Planet("Earth", 5.972e24, 12742, 1, false, Planet.Composition.rocky);
		Planet mars = new Planet("Mars", 6.39e23, 6779, 2, false, Planet.Composition.rocky);
		
		Planet jupiter = new Planet("Jupiter", 1.898e27, 139822, 69, true, Planet.Composition.gaseous);
		Planet saturn = new Planet("Saturn", 5.683e26, 116464, 62, true, Planet.Composition.gaseous);
	
		

		
		StarSystem theSolarSystem = new StarSystem("Sol", new Planet[]{earth,mars,jupiter,saturn});
		System.out.println(theSolarSystem.toString());
		
	
	
/*
		theSolarSystem.removePlanet(saturn);
		System.out.println(theSolarSystem.toString());
		Planet pluto = new Planet("Pluto", 1.309e22 , 2377, 5, false, Planet.Type.rocky);
		theSolarSystem.addPlanet(pluto);
		System.out.println(theSolarSystem.toString());
		
		System.out.println(StarSystem.getNumberOfSystems());
		
		Planet proximab = new Planet("Proxima B", 7.584e24 , 14016, 5, false, Planet.Type.rocky);
	
		StarSystem centauri = new StarSystem("Alpha Centauri A", new Planet[]{proximab});
		
		System.out.println(StarSystem.getNumberOfSystems());
		System.out.println(centauri.toString());
		
		Planet mars2 = Planet.makeCopy(mars);
		System.out.println(mars2);
		Planet earth2 = new Planet(earth);
		earth2.setName("Second Earth");
		System.out.println(earth2.toString());
		*/
	}

}
