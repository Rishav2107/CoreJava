package NestedClass;
//static nested class
public class OuterClass {
    static int classVariable=10;
    int instanceVariable=20;
    protected static class NestedClass{
        NestedClass(){

        }
        private static final int x = 10;
        int y = 100;
        public void print(){
            System.out.println(classVariable+x+y);
        }
    }
    public void display(){
        NestedClass nestedClassObj = new NestedClass();
        nestedClassObj.print();
    }
}
