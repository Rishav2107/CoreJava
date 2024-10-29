package Annotations;

import java.lang.annotation.Annotation;

//@SuppressWarnings("all")
@MyCustomAnnotation(id="123",animal = Animal.Lion)
public class Demo {
    public static void divide(){
        int n=10;
        Class<?> demoClass = Demo.class;
        MyCustomAnnotation myCustomAnnotation = demoClass.getAnnotation(MyCustomAnnotation.class);

        // Now you can access the elements of MyCustomAnnotation
        System.out.println(myCustomAnnotation.animal());
        System.out.println(n);
    }

    public static void main(String[] args) {
        divide();
    }
}
