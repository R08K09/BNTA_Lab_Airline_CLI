import java.util.ArrayList;

public class Airport {
    private String airportName;
    private ArrayList<Flight> flights;

    public Airport(String airportName){
        this.airportName = airportName;
        this.flights = new ArrayList<>();
    }
//getters and setters:
    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

//    methods:
public void displayFlights() {
    for (Flight flight : flights) {
        System.out.println(flight);
    }
}
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void cancelFlight(Flight flight){
        flights.remove(flight);
    }

}
