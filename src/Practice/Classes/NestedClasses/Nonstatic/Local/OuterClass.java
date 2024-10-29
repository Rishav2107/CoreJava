package Practice.Classes.NestedClasses.Nonstatic.Local;

public class OuterClass {
    int y=10;
    public void method(){
        class LocalInnerClass{
            int x=10;
            void display(){
                System.out.println("Local Inner Class " +x*y);
            }
        }
        new LocalInnerClass().display();
    }

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.method();
    }
}
