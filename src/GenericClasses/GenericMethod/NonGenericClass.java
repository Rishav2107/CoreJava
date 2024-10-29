package GenericClasses.GenericMethod;

import GenericClasses.Car;

//Generic METHOD
public class NonGenericClass {

    public <T> void method(T value){
        System.out.println(value);
    }



    public static void main(String[] args) {
        NonGenericClass obj = new NonGenericClass();
        obj.method(1);
        obj.method(new Car());
    }
}
