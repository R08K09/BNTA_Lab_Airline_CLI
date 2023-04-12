import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


import java.time.LocalTime;
import java.util.ArrayList;

public class FlightTest {

    Flight flightOne;
    LocalTime localTimeOne;
    Passenger passengerOne;
    Passenger passengerTwo;
    @BeforeEach
    public void setUp(){
        localTimeOne = LocalTime.of(13, 30);
        flightOne = new Flight("BA123", "Rome", localTimeOne);
        passengerOne = new Passenger("John Smith", "07239135820", "JohnSmith@gmail.com", "JS12345");
        passengerTwo = new Passenger("Jane Doe", "07964222112", "JaneDoe@gmail.com", "JD98765");
        flightOne.addPassenger(passengerOne);
        flightOne.addPassenger(passengerTwo);


    }

    @Test
    public void getFlightID(){
        assertThat(flightOne.getFlight_ID()).isEqualTo("BA123");
    }

    @Test
    public void setFlightID(){
        flightOne.setFlight_ID("VM456");
        assertThat(flightOne.getFlight_ID()).isEqualTo("VM456");
    }

    @Test
    public void getDestination(){
        assertThat(flightOne.getDestination()).isEqualTo("Rome");
    }

    @Test
    public void setDestination(){
        flightOne.setDestination("New York");
        assertThat(flightOne.getDestination()).isEqualTo("New York");
    }

    @Test
    public void canGetFlightTime(){
        assertThat(flightOne.getFlight_time()).isEqualTo(LocalTime.of(13, 30));
    }

    @Test
    public void canSetFlightTime(){
        flightOne.setFlight_time(LocalTime.of(15,30));
        assertThat(flightOne.getFlight_time()).isEqualTo(LocalTime.of(15,30));
    }

    @Test
    public void canAddPassengers(){
        Passenger passengerThree = new Passenger("Anna Phillips", "07827373737", "AnnaPh@gmail.com", "AP2468");
        flightOne.addPassenger(passengerThree);
        assertThat(flightOne.getPassengerSize()).isEqualTo(3);
    }
}
