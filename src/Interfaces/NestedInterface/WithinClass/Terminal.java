package Interfaces.NestedInterface.WithinClass;

public class Terminal {
    public static void main(String[] args) {
//       Bird.NonFlyingBird birdObject = new Eagle();
//       birdObject.canRun();

        Bird birdObj = new Bird();
        Bird.Hen anotherObj = birdObj.new Hen();
        anotherObj.canRun();
    }
}
