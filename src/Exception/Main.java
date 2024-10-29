package Exception;

public class Main {
    public static void main(String[] args) {
        /* Object x = 10;
        System.out.println((String) x);  //ClassCastException
        String s = "abc";
        System.out.println(Integer.parseInt(s)); //NumberFormatException
        */
        try{
            method1();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        AnotherClass anotherClassObj = new AnotherClass();
        anotherClassObj.method1();


    }
    public static void method1() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
