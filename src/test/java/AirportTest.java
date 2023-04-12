import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirportTest {

    Airport airport;
    LocalTime localTimeOne;
    LocalTime localTimeTwo;
    Flight flightOne;
    Flight flightTwo;

    @BeforeEach
    public void setUp(){
        localTimeOne = LocalTime.of(13, 30);
        localTimeTwo = LocalTime.of(10, 49);
        airport = new Airport("Heathrow");
        flightOne = new Flight("BA123", "Rome", localTimeOne);
        flightTwo = new Flight("FR456", "Barcelona", localTimeTwo);
        airport.addFlight(flightOne);
        airport.addFlight(flightTwo);
    }

    @Test
    public void getAirportName(){
        assertThat(airport.getAirportName()).isEqualTo("Heathrow");
    }

    @Test
    public void setAirportName(){
        airport.setAirportName("Gatwick");
        assertThat(airport.getAirportName()).isEqualTo("Gatwick");
    }

    @Test
    public void canAddFlight(){
        Flight flightThree = new Flight("VM456", "New York", LocalTime.of(15,30));
        airport.addFlight(flightThree);
        assertThat(airport.getNumberOfFlights()).isEqualTo(3);
    }

    @Test
    public void canCancelFlight(){
        airport.cancelFlight("BA123");
        assertThat(airport.getNumberOfFlights()).isEqualTo(1);
    }


}


