package Interfaces;

public abstract class FlyingAnimal implements Animal{
    public FlyingAnimal(){

    }
    @Override
    public void fly() {
        System.out.println("They can fly");
        System.out.println(Animal.canJump());
    }

    protected abstract void speed();
}
