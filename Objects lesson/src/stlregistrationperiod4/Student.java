package stlregistrationperiod4;

public class Student {
    private Personalinfo info;
    private String firstName, lastName, address;
    private int grade, age, hours;

    public Student() {
        firstName = "Zoe";
        lastName = "Gallant";
        address = "123 Joey Avenue";
        grade = 9;
        age = 14;
        hours = 15;
        info = new Personalinfo();
    }

    public Student(String firstName) {
        this.firstName = firstName;
        lastName = "Gallant";
        address = "123 Joey Avenue";
        grade = 9;
        age = 14;
        hours = 15;
    }

    public Student(String firstName, String lastName, String address, int grade, int age, int hours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.grade = grade;
        this.age = age;
        this.hours = hours;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getHours() {
        return hours;
    }

    public int getGrade() {
        return grade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Personalinfo getInfo() {
        return info;
    }
    
    
    

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + " Last Name: " + lastName + " Grade: " + grade;
    }
    
    
    
    
}
