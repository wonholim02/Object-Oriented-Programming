public class Collatz {
   public static void main(String[] args) {
      //initializing variables
      int collatzNum = 9;
      int numSteps = 0;
      int highestNumReached = collatzNum;
      int initValue = collatzNum;
      
      System.out.println(collatzNum);
      
      //while loop that performs the Collatz Conjecture
      while(collatzNum != 1) {
         if(collatzNum % 2 == 0) {
            collatzNum = collatzNum/2;
         }
         else{
            collatzNum = collatzNum * 3 + 1;
         }
         if(collatzNum > highestNumReached) {
            highestNumReached = collatzNum;
         }
         System.out.println(collatzNum);
         numSteps++;
      }
      
      //prints out the final information
      System.out.println("Initial Value: " + initValue);
      System.out.println("Number of steps: " + numSteps);
      System.out.println("Highest number reached: " + highestNumReached);
      
      //prints out how many steps were required
      switch(numSteps){
         case 0:
            System.out.println("No steps required");
            break;
         case 1:
            System.out.println("Only took one step!");
            break;
         case 2:
            System.out.println("Two steps");
            break;
         case 3:
            System.out.println("Three steps");
            break;
         case 4:
            System.out.println("Four steps");
            break;
         default:
            System.out.println("Wow, " + numSteps + " steps was a lot of steps!");
      }
   }
}