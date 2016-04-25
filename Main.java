import java.util.LinkedList;

public class Main {
   public static void main(String[] args){

       System.out.println("\n----");

       LinkedList<String> inputs = new LinkedList<>();

       inputs.add("1");
       inputs.add("10");
       inputs.add("");
       inputs.add("-1");

       for(String input : inputs){
           try {
               if(input != ""){
                if( Integer.parseInt(input) < 0){
                    throw new JamesException("Negative input is not permitted");
                }
                System.out.printf("Your input %s is valid\n", input);
               }
           } catch (NumberFormatException e){
               System.err.println("Caught Exception "+e.toString());
           }
       }
   }
}