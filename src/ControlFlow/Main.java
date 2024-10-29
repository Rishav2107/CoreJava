package ControlFlow;

public class Main {
    public static void main(String[] args) {

        final int a=1,b=2,c=3;
        byte x=1;
        switch (x){
            case a:
                System.out.println("1");
                break;
            case b:
                System.out.println("2");
                // return statement not allowed in switch
                //  return "2";
                break;
            case c:
                System.out.println("3");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        //switch with return using case N ->
        String test = switch (1){
            case 1 -> "One"; //No break statement required because it returns from here
            case 2 -> {
                //some code logic here
                yield "Two";
            }
            default -> "None";
        };
        System.out.println(test);
    }
}
