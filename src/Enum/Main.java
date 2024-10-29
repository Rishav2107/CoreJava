package Enum;

public class Main {
    public static void main(String[] args) {
        Enum<test> friday = test.valueOf("MONDAY");
        System.out.println(friday.name());

      Day day = Day.MONDAY;
      System.out.println("value : " + day.getValue());
      System.out.println("comments : " + day.getComments());
      day.display();
      day.convertString();
    }
}
