package GenericClasses;

public class Print <T>{
    T value;

    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value=value;
    }

    public static void main(String[] args) {
        Print<String> print = new Print<>();

        //Raw type
        Print printObj = new Print<>();
        printObj.setPrintValue(new Car());
        printObj.setPrintValue(1);
    }

}
