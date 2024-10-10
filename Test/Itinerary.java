import java.util.ArrayList;

class Itinerary{
	private String travelerName;
	private ArrayList<String> citiesByDay;
	
	public Itinerary(String n, ArrayList<String> cities){
		this.travelerName= n;
		this.citiesByDay = cities;
	}
	public Itinerary(String n){
		this.travelerName = n;
        this.citiesByDay = new ArrayList<>();  // Initialize the empty ArrayList here
	}
	public String getName(){
		return travelerName;
	}
	public ArrayList<String> getCitiesByDay(){
		return new ArrayList<>(citiesByDay);
	}
	public ArrayList<String> citiesVisited(){
		ArrayList<String> uniqueCities = new ArrayList<>();
		for(String city : citiesByDay){
			if(!uniqueCities.contains(city)){
				uniqueCities.add(city);
			}
		}
		return uniqueCities;
	}
	public int numberOfCitiesVisited(){
		return citiesVisited().size();
	}
	public int numberOfDays(){
		return citiesByDay.size();
	}
	public void addNextCity(String city){
		if(city == null || city.isEmpty()){
			throw new IllegalArgumentException("city cant be null or empty");
		}
		citiesByDay.add(city);
	}
	public void resetItinerary(){
		citiesByDay.clear();
	}
	@Override
	public String toString(){
		return "Traveler: " + travelerName + ", Cities by Day: " + citiesByDay.toString();
	}
	public static int daysTogether(Itinerary i1, Itinerary i2){
		int dayTogerther =0;
		int min = Math.min(i1.numberOfDays(),i2.numberOfDays());
		for(int i = 0; i < min ; i++){
			if(i1.citiesByDay.get(i).equals(i2.citiesByDay.get(i))){
				dayTogerther++;
			}
		}
		return dayTogerther;
	}
    public static void main(String[] args) {
        ArrayList<String> cities1 = new ArrayList<>();
        cities1.add("Vancouver");
        cities1.add("Vancouver");
        cities1.add("Victoria");

        // Create an Itinerary for Traveler1
        Itinerary itinerary1 = new Itinerary("Traveler1", cities1);

        // Create an Itinerary for Traveler2
        Itinerary itinerary2 = new Itinerary("Traveler2");
        itinerary2.addNextCity("Nanaimo");
        itinerary2.addNextCity("Vancouver");
        itinerary2.addNextCity("Vancouver");
        itinerary2.addNextCity("Victoria");

        // Output both itineraries
        System.out.println(itinerary1.toString());
        System.out.println(itinerary2.toString());

        // Output number of unique cities visited for both travelers
        System.out.println("Traveler1 visited " + itinerary1.numberOfCitiesVisited() + " unique cities.");
        System.out.println("Traveler2 visited " + itinerary2.numberOfCitiesVisited() + " unique cities.");

        // Output the number of days in each itinerary
        System.out.println("Traveler1 has an itinerary of " + itinerary1.numberOfDays() + " days.");
        System.out.println("Traveler2 has an itinerary of " + itinerary2.numberOfDays() + " days.");

        // Output the list of unique cities visited by Traveler1
        System.out.println("Traveler1 unique cities: " + itinerary1.citiesVisited());

        // Output the number of days both travelers were in the same city
        int daysTogether = Itinerary.daysTogether(itinerary1, itinerary2);
        System.out.println("Traveler1 and Traveler2 spent " + daysTogether + " day(s) in the same city.");
    }

    
}