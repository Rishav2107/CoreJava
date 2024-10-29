package Practice.Classes.NestedClasses.Static;

public class OuterClass {
    static int x = 10;
    private static class InnerClass {
        private InnerClass(){

        }
       public void display(){
           System.out.println(x);
       }
    }
    public void display(){
        new InnerClass().display();
    }
}
