package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{
        Class eagleClass = Eagle.class;
        System.out.println(eagleClass.getName());
        System.out.println(eagleClass.getModifiers());

        //reflection of Methods
        Method[] methods = eagleClass.getMethods();
        for(Method m : methods){
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(m.getDeclaringClass());
            System.out.println("***********");
        }

        for(Method m1: eagleClass.getDeclaredMethods()){
            System.out.println(m1.getName());
        }

        //invoking methods using Reflection
        Constructor[] constructorList =  eagleClass.getDeclaredConstructors();
        for(Constructor eagleConstructor: constructorList){
            System.out.println("Constructor");
            eagleConstructor.setAccessible(true);
            Eagle eagleObject = (Eagle)eagleConstructor.newInstance();
            eagleObject.fly(10);
//            Method flyMethod = eagleClass.getMethod("fly",int.class);
//            flyMethod.invoke(eagleObject,1);
        }


        //reflection of fields
        for (Field field: eagleClass.getDeclaredFields()){
            System.out.println("field " + field.getName());
            System.out.println(field.accessFlags());
            System.out.println("***********");
        }

        //setting the value of public fields
        Eagle eagleObj = new Eagle();
        Field breedField = eagleClass.getDeclaredField("breed");
        breedField.set(eagleObj,"EagleBreed");
        System.out.println(eagleObj.breed);

        Field canSwimField = eagleClass.getDeclaredField("canSwim");
        //making the field to public
        canSwimField.setAccessible(true);
        canSwimField.set(eagleObj,true);

    }
}
