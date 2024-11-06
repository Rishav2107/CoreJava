package Exception.practice;

public class Test {
    void display(){
        try{
        throw new MyCustomException();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
