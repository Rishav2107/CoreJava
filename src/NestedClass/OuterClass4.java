package NestedClass;
//nonstatic member inner class
public class OuterClass4 {

    public class InnerClass1{
       int x= 10;
    }
    public class InnerClass2 extends InnerClass1{
        public void display(){
            int y=15;
            System.out.println("x,y "+x+","+y);
        }
    }
}
