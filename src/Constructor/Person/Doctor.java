package Constructor.Person;

public class Doctor {
    private Doctor() {
        System.out.println("Doctor Class Initialized");
    }

    public static Doctor getObject(){
        return new Doctor();
    }
}
