public class Calculator {
    static int value=5;
    public int sum(int ...variable){
        int output =0;
       for(int var:variable){
           output += var;
       }
       return output;
    }
}
