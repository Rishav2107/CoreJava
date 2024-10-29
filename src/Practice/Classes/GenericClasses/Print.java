package Practice.Classes.GenericClasses;

public class Print <T> {
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }

    public static void main(String[] args) {
        Print<Integer> print = new Print<>();
        print.setPrintValue(1);
        int ans = print.getPrintValue();
        System.out.println(ans);
    }
}
