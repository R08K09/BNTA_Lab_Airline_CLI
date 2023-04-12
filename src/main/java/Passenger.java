public class Passenger {

    private String name;
    private int phoneNumber;
    private String email;
    private String passenger_ID;


    public Passenger(String name, int phoneNumber, String email, String passenger_ID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passenger_ID = passenger_ID;
    }


    // getters
    public String getName(){
        return this.name;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassenger_ID(){
        return this.passenger_ID;
    }


    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassenger_ID(String passenger_ID){
        this.passenger_ID = passenger_ID;
    }


}
