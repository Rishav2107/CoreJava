package Interfaces.NestedInterface.WithinClass;

public class Bird {
    private interface NonFlyingBird{
        public void canRun();
    }
    //member inner nested class
    public class Hen implements NonFlyingBird{

        @Override
        public void canRun() {
            System.out.println("Run Run Run");
        }
    }
}
