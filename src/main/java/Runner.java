import java.time.LocalTime;
import java.util.Scanner;
import java.util.UUID;

import static java.lang.System.exit;

public class Runner {
    public static void main(String[] args) {

        Flight flightOne;
        Flight flightTwo;
        Flight flightFour;
        Passenger passengerOne;
        Passenger passengerTwo;

        // TODO
        // Add a new flight
        // Display all available flights
        // Add a new passenger
        // Book a passenger onto a flight
        // Cancel a flight

        // initialise airport with flights and passengers
        Airport airport = new Airport("Heathrow");

        flightOne = new Flight("BA123", "Rome", LocalTime.of(13, 30));
        flightTwo = new Flight("FR456", "Barcelona", LocalTime.of(10, 49));
        flightFour = new Flight("VM246", "Rome", LocalTime.of(9, 10));


        airport.addFlight(flightOne);
        airport.addFlight(flightTwo);
        airport.addFlight(flightFour);


        passengerOne = new Passenger("John Smith", "07239135820", "JohnSmith@gmail.com", UUID.randomUUID());
        passengerTwo = new Passenger("Jane Doe", "07964222112", "JaneDoe@gmail.com", UUID.randomUUID());

        flightOne.addPassenger(passengerOne);
        flightOne.addPassenger(passengerTwo);


        Scanner scanner = new Scanner(System.in);
        // Display user options
        System.out.println(String.format("Welcome to %s", airport.getAirportName()));

        while (true) {
            System.out.println("-----------------");
            System.out.println("Option 1: Add a new flight");
            System.out.println("Option 2: Display all available flights");
            System.out.println("Option 3: Book a passenger onto a flight");
            System.out.println("Option 4: Cancel a flight");
            System.out.println("Option 5: Search flights based on destination");
            System.out.println("Option 6: Exit");

            System.out.println("Select an option number from the menu. ");
            String user_input = scanner.nextLine();
            try {
                if (Integer.parseInt(user_input) == 1) {
                    System.out.println("Enter flight ID");
                    String flightID = scanner.nextLine();

                    System.out.println("Enter flight destination");
                    String destination = scanner.nextLine();

                    System.out.println("Enter departure time");
                    String departure_time = scanner.nextLine();
                    LocalTime flight_time = LocalTime.parse(departure_time);

                    Flight flightThree = new Flight(flightID, destination, flight_time);
                    airport.addFlight(flightThree);
                    // System.out.println(airport.getNumberOfFlights()); <- checking it's been added
                } else if (Integer.parseInt(user_input) == 2) {
                    airport.displayFlights();
                } else if (Integer.parseInt(user_input) == 3) {
                    System.out.println("Enter passenger name.");
                    String name = scanner.nextLine();

                    System.out.println("Enter passenger phone number");
                    String phoneNumber = scanner.nextLine();

                    System.out.println("Enter passenger email address");
                    String email = scanner.nextLine();

                    //            System.out.println("Enter passenger ID");
                    //            String passenger_ID = scanner.nextLine();

                    Passenger passengerThree = new Passenger(name, phoneNumber, email, UUID.randomUUID());

                    System.out.println("Enter flight_ID ");
                    String flight_ID = scanner.nextLine();

                    airport.addPassengerToFlight(flight_ID, passengerThree);
                    System.out.println(String.format("%s has been booked onto this flight.", passengerThree.getName()));
                } else if (Integer.parseInt(user_input) == 4) {
                    System.out.println("Enter the flight ID to cancel");
                    String flight_ID = scanner.nextLine();
                    airport.cancelFlight(flight_ID);
                    System.out.println("This flight has now been cancelled.");
                } else if (Integer.parseInt(user_input) == 5) {
                    System.out.println("Where you like to go?");
                    String destination = scanner.nextLine();
                    airport.searchForFlight(destination);
                } else if (Integer.parseInt(user_input) == 6) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

        } catch(Exception e){
            System.out.println("Something went wrong! Give me a number!");

        }
    }


// TO DO:
// Add search functionality, e.g. let the user search for flights going to a particular destination - DONE
//Have the application handle the creation of the unique id for flights and passengers - DONE
//Throw exceptions where appropriate, e.g. when attempting to book a passenger onto a flight which doesn't exist



    }
}
