package Constructor.Person;

public abstract class Person {
    public Person(String gender) {
        System.out.println("this is a person class with gender " + gender);
    }

    protected void print(){
        System.out.println("I am a person");
    }

    public abstract void test();
}
