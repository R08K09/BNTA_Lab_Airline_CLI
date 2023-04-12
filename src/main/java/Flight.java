import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {

    private String flight_ID;
    private String destination;
    private LocalTime flight_time;
    private ArrayList<Passenger> passengers;

    public Flight(String flight_ID, String destination, LocalTime flight_time){
        this.flight_ID = flight_ID;
        this.destination = destination;
        this.flight_time = flight_time;
        this.passengers = new ArrayList<>();

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
    
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }


    public int getPassengerSize(){
        return this.passengers.size();
    }

}
