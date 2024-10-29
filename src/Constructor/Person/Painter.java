package Constructor.Person;

public class Painter extends Person {
    int empId;
    public Painter(int empId,String gender) {
        //super(); //it's by default added
        super(gender);
        this.empId = empId;
        System.out.println("Inside Painter class "+empId);
    }

    @Override
    public void test() {
        print();
    }
}
