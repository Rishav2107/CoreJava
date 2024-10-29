package Interfaces.NestedInterface.WithinInterface;

public class Terminal {
    public static void main(String[] args) {
       Bird.NonFlyingBird birdObject = new Hen();
       birdObject.canRun();
    }
}
