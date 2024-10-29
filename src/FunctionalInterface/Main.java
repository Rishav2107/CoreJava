package FunctionalInterface;

public class Main {
    public static void main(String[] args) {

        //using annonymous class to implement functional interface
        Vehicle vehicleObj1 = new Vehicle() {
            @Override
            public void playHorn(String value) {
                System.out.println("Poo Poo");
            }
        };
        vehicleObj1.playHorn("t");

        //using lambda expression to implement the Functional Interface
        Vehicle vehicleObj = (String value) -> {
            System.out.println("Blow horn " + value);
        };
        vehicleObj.playHorn("test");
        Vehicle.getColor();

        Consumer<Integer> consumerObj = (Integer val) -> {
            if(val>10)
                System.out.println("Logging");
        };
        consumerObj.accept(15);

        Supplier<String> supplierObj = () -> "Hello World";
        System.out.println(supplierObj.get());

        Predicate<Integer> predicateObj = (Integer value) -> {
            return value == 10;
        };
        System.out.println(predicateObj.check(10));

        Test test = new Test();
        test.accept2((String x) -> {
            System.out.println("value : "+ x);
        });
    }
}
