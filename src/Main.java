import GenericClasses.BlackPrint;
import GenericClasses.Pair;
import GenericClasses.Print;
import NestedClass.OuterClass;
import NestedClass.OuterClass2;
import NestedClass.OuterClass3;
import NestedClass.OuterClass4;
import Constructor.Person.Doctor;
import Constructor.Person.Manager;
import Constructor.Person.Painter;
import Constructor.Person.Person;
import StaticDemo.Calc;
import Vehicle.Car;
import Vehicle.LuxuryCar;
import Wildcard.Cars;
import Wildcard.Display;
import Wildcard.Vehicles;
import Enum.test;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2,3,4,5));
       // Doctor doctorObj = new Doctor();
        Doctor docObject = Doctor.getObject();
        Manager managerObj = new Manager();
        System.out.println(managerObj.toString());

        Person painterObj = new Painter(1,"rishav");

        Car carObj = new LuxuryCar(13);
        carObj.pressBreak();
        carObj.pressHorn();

        Object common = new LuxuryCar(14);
        System.out.println(common.getClass());

        Calc.a=30;
        int res=Calc.addSum();
        System.out.println("Static Method response : "+res);
        System.out.println("public Static variable : "+Calc.a);

        // 1. static nested class
//        OuterClass.NestedClass nestedObj = new OuterClass.NestedClass();
//        nestedObj.print();

        OuterClass outerClassObj = new OuterClass();
        outerClassObj.display();

        // 2. NonStatic Nested Member inner class
        OuterClass2 outerClass2Obj = new OuterClass2();
        OuterClass2.InnerClass innerClassObj =  outerClass2Obj.new InnerClass();
        innerClassObj.print();

        //3. NonStatic Local inner class
        OuterClass3 outerClass3Obj = new OuterClass3();
        outerClass3Obj.display();

        // Inheritance is also possible in nested classes
        OuterClass4 outerClass4Obj = new OuterClass4();
        OuterClass4.InnerClass2 innerClass2Obj = outerClass4Obj.new InnerClass2();
        innerClass2Obj.display();
        //4. Anonymous inner class
        Person driverObj = new Person("rk") {
        @Override
        public void test(){
            System.out.println("I am driver");
        }
        };
        driverObj.test();


        //Generic classes
        Print<Integer> printObj = new Print<Integer>();
        printObj.setPrintValue(1);
        System.out.println(printObj.getPrintValue());

        //Generic Inheritance
        BlackPrint<Integer> printObj2 = new BlackPrint<>();
        printObj2.setPrintValue(11);
        System.out.println(printObj2.getPrintValue());

        //Generic (more than one)
        Pair<Integer,String> pairObj = new Pair<>(1,"Rishav");
        System.out.println(pairObj.getKey()+" "+pairObj.getValue());


        //Raw type
        Print printObj3 = new Print();
        printObj3.setPrintValue(1);
        System.out.println(printObj3.getPrintValue());
        printObj3.setPrintValue("hey");
        System.out.println(printObj3.getPrintValue());

        //Wildcard
        List<Vehicles> vehicleList = new ArrayList<>();
        List<Cars> carList = new ArrayList<>();
        Display display = new Display();
        display.printObject(vehicleList);
        display.printObject(carList);
        //Generic method
        display.printObject2(vehicleList);
        display.printObject2(carList);

        //ENUM
        /* Common Functions
        values()
        ordinal()
        name()
        valueOf()
         */
        for(test t : test.values()){
            System.out.println(t.ordinal());
        }
        test enumVariable = test.valueOf("FRIDAY");
        System.out.println(enumVariable.name());

    }
}