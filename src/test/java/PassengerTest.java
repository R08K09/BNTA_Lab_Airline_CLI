import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class PassengerTest {

    Passenger passengerOne;

    @BeforeEach
    public void setUp(){
        passengerOne = new Passenger("John Smith", "07239135820", "JohnSmith@gmail.com", UUID.randomUUID());
    }

    @Test
    public void canGetName(){
        assertThat(passengerOne.getName()).isEqualTo("John Smith");
    }

    @Test
    public void canSetName(){
        passengerOne.setName("Jane Doe");
        assertThat(passengerOne.getName()).isEqualTo("Jane Doe");
    }

    @Test
    public void canGetPhoneNumber(){
        assertThat(passengerOne.getPhoneNumber()).isEqualTo("07239135820");
    }

    @Test
    public void canSetPhoneNumber(){
        passengerOne.setPhoneNumber("07964222112");
        assertThat(passengerOne.getPhoneNumber()).isEqualTo("07964222112");
    }

    @Test
    public void canGetEmailAddress(){
        assertThat(passengerOne.getEmail()).isEqualTo("JohnSmith@gmail.com");
    }

    @Test
    public void canSetEmailAddress(){
        passengerOne.setEmail("JaneDoe@gmail.com");
        assertThat(passengerOne.getEmail()).isEqualTo("JaneDoe@gmail.com");
    }

//    @Test
//    public void canGetPassengerID(){
//        assertThat(passengerOne.getPassenger_ID()).isEqualTo("JS12345");
//    }

//    @Test
//    public void canSetPassengerID(){
//        passengerOne.setPassenger_ID(UUID.randomUUID());
//        assertThat(passengerOne.getPassenger_ID()).isEqualTo("JD98765");
//    }
}
