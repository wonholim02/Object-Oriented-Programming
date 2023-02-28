/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program generates rocket drawing.
***************************************************************************/
public class DrawRocket{
   public static void main(String[] args){
      triangle();
      line();
      mid1();
      mid2();
      line();  
      triangle();
   }
   
   public static void triangle(){ //This prints very top and bottom triangular shape of the rocket
      final int SIZE = 3; 
      
      for (int lines = 1; lines <= (SIZE * 2 - 1); lines++) { //counting lines
	      
         System.out.print(" ");
         
         for (int blank = 1; blank <= (SIZE * 2 - 1) - lines; blank++){ //print blank
            System.out.print(" ");
         }
			
         for (int slash1 = 1; slash1 <= lines; slash1++) { //print slahes 
            System.out.print("/");
         }
         
         System.out.print("**");
         
         for (int slash2 = 1;  slash2<= lines; slash2++) { //printing other slashes
            System.out.print("\\");
         }
         
      System.out.println(""); //line change
      }
   }
	
   public static void mid1() { //this is the top half of the rocket body
      final int SIZE = 3;
		
      for (int lines = 1; lines <= SIZE; lines++) { //counts lines
			
         System.out.print("|");
			
         for (int count = 1; count <= 2; count++) { 
				
            for (int period1 = 1; period1 <= SIZE - lines; period1++) { //prints dots
               System.out.print(".");
            }
				
            for (int slash = 1; slash <= lines; slash++) { //print slahes
               System.out.print("/\\");
            }
				
            for (int period2 = 1; period2 <= SIZE - lines; period2++) {
               System.out.print(".");
            }
         }
         
         System.out.println("|");
      }
   }
	
   public static void mid2() { //This is bottom half part of the rocket body
      final int SIZE = 3;
      
      for (int lines = SIZE; lines >= 1; lines--) { //counts lines
			
         System.out.print("|");
			
         for (int count = 1; count <= 2; count++) { 
				
            for (int period1 = 1; period1 <= SIZE - lines; period1++) { //prints dots
               System.out.print(".");
            }
				
            for (int slash = 1; slash <= lines; slash++) { //prints slashes
               System.out.print("\\/");
            }
				
            for (int period2 = 1; period2 <= SIZE - lines; period2++) { //prints dots
               System.out.print(".");
            }
         }
         
         System.out.println("|");
         }  
   }

   public static void line() { //this prints line that divides triangle and mids
      final int SIZE = 3;
		
      System.out.print("+");
      
      for (int shape = 1; shape <= SIZE * 2; shape++) {
         System.out.print("=*");
      }
      
      System.out.println("+");
   }
}
