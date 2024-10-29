package Abstract;

public abstract class Test {
    public abstract void method();
    public void method2(int x, int y, int... z){
       for(int values:z){
           System.out.println(values);
       }
    }

    public static void main(String[] args) {
        Test obj = new ChildClass();
        obj.method();
        obj.method2(1,2,3,4,5,6,7);
    }
}
