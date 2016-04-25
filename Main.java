public class Main {
   public static void main(String[] args){
       try {
        throw new JamesException("What an amazing Exception");
       } catch (NumberFormatException e){
           System.err.println("Caught custom exception");
       }
   }
}