package Practice.Classes.NestedClasses.Inheritance;

public class SomeOtherClass extends OuterClass.NestedClass {
    SomeOtherClass(){
        new OuterClass().super();
    }
    public void display1(){
        display();
    }

    public static void main(String[] args) {
        new SomeOtherClass().display1();
    }
}
