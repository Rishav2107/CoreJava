package NestedClass;
//nonstatic member inner class
public class OuterClass2 {
    int instanceVariable = 10;
    static int classVariable = 15;
    public class InnerClass{
        public void print(){
            System.out.println(instanceVariable + classVariable);
        }
    }
}
