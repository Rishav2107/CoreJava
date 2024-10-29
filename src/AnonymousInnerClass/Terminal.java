package AnonymousInnerClass;

public class Terminal {
    public static void main(String[] args) {
     Country countryObj = new Country(){
         @Override
         public void print() {
             System.out.println("In India");
         }
     };
     countryObj.print();
    }
}
