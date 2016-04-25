import java.util.LinkedList;

// Output:
// ----
// Your input 1 is valid
// Your input 10 is valid
// Caught Exception JamesException: Negative input is not permitted
// Caught Exception java.lang.NumberFormatException: For input string: "a"

public class Main {
   public static void main(String[] args){

       System.out.println("\n----");

       LinkedList<String> inputs = new LinkedList<>();

       inputs.add("1");
       inputs.add("10");
       inputs.add("");
       inputs.add("-1");
       inputs.add("a");

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