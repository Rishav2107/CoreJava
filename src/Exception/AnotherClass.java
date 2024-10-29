package Exception;

public class AnotherClass {
    public void method1(){
       try {
           throw new ClassNotFoundException();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
}
