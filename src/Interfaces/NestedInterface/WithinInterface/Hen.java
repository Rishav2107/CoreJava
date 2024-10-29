package Interfaces.NestedInterface.WithinInterface;

public class Hen implements Bird.NonFlyingBird{
    @Override
    public void canRun() {
        System.out.println("run...");
    }
}
