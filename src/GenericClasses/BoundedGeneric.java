package GenericClasses;

public class BoundedGeneric <T extends Number>{
    T value;
    void setValue(T value){
        this.value=value;
    }
    void printValue(){
        System.out.println(value);
    }

    public static void main(String[] args) {
        BoundedGeneric<Double> doubleObj = new BoundedGeneric<>();
        doubleObj.setValue(1.5);
        doubleObj.printValue();

        BoundedGeneric<Byte> byteObj = new BoundedGeneric<>();
        byteObj.setValue((byte)1);
        byteObj.printValue();

        //error
        //BoundedGeneric<String> stringObj = new BoundedGeneric<>();

    }
}
