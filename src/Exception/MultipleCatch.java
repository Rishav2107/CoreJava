package Exception;

public class MultipleCatch {
    public static void method2(boolean x) throws InterruptedException,ClassNotFoundException,ClassCastException{
      if(x) throw new InterruptedException();
      else throw new ClassNotFoundException();
    }

    public static void main(String[] args) {
        try{
            method2(true);
        } catch (ClassNotFoundException e) {

        } catch (InterruptedException | ClassCastException e) {

        }
        catch (Exception e){

        }
    }
}
