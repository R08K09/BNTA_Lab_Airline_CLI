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
//        for (Flight flight : flights) {
//            System.out.println(flight);
//        }
        for (int i = 0; i < flights.size(); i++){
            System.out.println(flights.get(i));
        }
    }
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void cancelFlight(String flight_ID){
        for(Flight flight : flights) {
            if(flight.getFlight_ID().equals(flight_ID)){
                flights.remove(flight);
                break;
            }
        }
    }

    public int getNumberOfFlights(){
        return this.flights.size();
    }

    public void addPassengerToFlight(String flight_ID, Passenger passenger){
        for(Flight flight : flights) {
            if(flight.getFlight_ID().equals(flight_ID)){
                flight.addPassenger(passenger);
                break;
            }
        }
    }

    public void searchForFlight(String destination){
        for(Flight flight: flights){
            if(flight.getDestination().equals(destination)){
                System.out.println(flight);
            }
        }
    }

}
