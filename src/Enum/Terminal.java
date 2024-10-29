package Enum;

public class Terminal {
    public static void main(String[] args) {
        Day enumVariable = Day.MONDAY;
        System.out.println(enumVariable.getComments());
        enumVariable.display();
        enumVariable.convertString();
        enumVariable.anotherMethod();

        Day enumVariable2 = Day.TUESDAY;
        enumVariable2.display();
    }
}
