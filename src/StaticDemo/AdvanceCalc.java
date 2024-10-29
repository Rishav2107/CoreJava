package StaticDemo;

//It inherits all the methods and variable from parent class
//For static methods it cannot be override but can be hidden
public class AdvanceCalc extends Calc{

  // Static methods cannot be annotated with @Override
  // @Override
    public static int addSum(){
        return 20;
    }

}
