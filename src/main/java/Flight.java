import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {

    private String flight_ID;
    private String destination;
    private LocalTime flight_time;
    private ArrayList<Passenger> passengers;
    private ArrayList<Flight> flights;

    public Flight(String flight_ID, String destination, LocalTime flight_time, ArrayList<Passenger> passengers, ArrayList<Flight> flights){
        this.flight_ID = flight_ID;
        this.destination = destination;
        this.flight_time = flight_time;
        this.passengers = passengers;
        this.flights = flights;
    }

    // getters
    public String getFlight_ID(){
        return this.flight_ID;
    }

    public String getDestination(){
        return this.destination;
    }

    public LocalTime getFlight_time(){
        return this.flight_time;
    }

    public ArrayList<Passenger> getPassengers(){
        return this.passengers;
    }

    public ArrayList<Flight> getFlights(){
        return this.flights;
    }

    // setters
    public void setFlight_ID(String flight_ID){
        this.flight_ID = flight_ID;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setFlight_time(LocalTime flight_time){
        this.flight_time = flight_time;
    }


    // methods
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void cancelFlight(Flight flight){
        flights.remove(flight);
    }
    
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void displayFlights(){
        for(Flight flight : flights){
            System.out.println(flight);
        }
    }

}
