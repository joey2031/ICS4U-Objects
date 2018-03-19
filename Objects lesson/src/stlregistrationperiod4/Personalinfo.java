package stlregistrationperiod4;

public class Personalinfo {
    private String firstName, lastName, adress, email, phonenumber;

    public Personalinfo() {
    }

    public Personalinfo(String firstName, String lastName, String adress, String email, String phonenumber) {
        this.firstName = "Eric";
        this.lastName = "Assal";
        this.adress = "123 back pack";
        this.email = "123@b.ca";
        this.phonenumber = "123-456-7890";
    }
    // control space

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAdress() {
        return adress;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
    
    
    
    
}
