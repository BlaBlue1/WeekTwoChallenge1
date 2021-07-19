package src;

public class Patient {

    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String city;
    private String state;



    public Patient(String name, String emailAddress,String phoneNumber, String city, String state){
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber ;
        this.city = city;
        this.state = state;

    }
    public void setName(String name) {
        this.name = "";
    }
    public String getName() {
        return name;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setState() {
        this.state = state;


    }






}
