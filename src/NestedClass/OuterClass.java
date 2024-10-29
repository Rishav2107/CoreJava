package NestedClass;
//static nested class
public class OuterClass {
    static int classVariable=10;
    int instanceVariable=20;
    protected static class NestedClass{
        private static final int x = 10;
        public void print(){
            System.out.println(classVariable+x);
        }
    }
    public void display(){
        NestedClass nestedClassObj = new NestedClass();
        nestedClassObj.print();
    }
}
