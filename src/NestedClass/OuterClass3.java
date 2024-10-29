package NestedClass;
//nonstatic local inner class
//local inner class is always defined within block
public class OuterClass3 {
    int instanceVariable = 10;
    static int classVariable = 15;
    public void display() {
        int a = 10;
        class LocalInnerClass {
            public void print() {
                System.out.println("LocalInnerClass " + (instanceVariable + classVariable));
            }
        }
        LocalInnerClass localInnerClassObj = new LocalInnerClass();
        localInnerClassObj.print();
    }
}
