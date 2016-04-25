import java.util.LinkedList;

public class Main {
   public static void main(String[] args){
       LinkedList<NumberFormatException> errors = new LinkedList<>();

       errors.add(new JamesException("JamesException"));
       errors.add(new NumberFormatException("NumberFormatException"));

       for(NumberFormatException err : errors){
           try {
               throw err;
           } catch (NumberFormatException e){
               System.err.println("Caught Exception "+e.toString());
           }
       }
   }
}