package Constructor.Person;

// Constructor chaining using this keyword
public class Manager {

    String name;
    int EmpId;

    public Manager(){
        this(10);
    }

    public Manager(int EmpId){
        this (EmpId,"rishav");
    }
    public Manager(int EmpId,String name){
        this.EmpId = EmpId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", EmpId=" + EmpId +
                '}';
    }
}
