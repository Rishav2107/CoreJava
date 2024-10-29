package Practice.Classes.NestedClasses.Nonstatic.Member;

//nonstatic member inner class
public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 15;
    public class InnerClass{
        public void print(){
            System.out.println(instanceVariable + classVariable);
        }
    }

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass obj2 = obj.new InnerClass();
        obj2.print();
    }
}
