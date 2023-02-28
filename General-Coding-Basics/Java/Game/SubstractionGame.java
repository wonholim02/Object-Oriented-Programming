/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program is a mini substraction game that provides several 
games and highest score at last. 3~6 six random numbers are given to players 
and players should calculate them properly to earn a point.  
***************************************************************************/
import java.util.Scanner; 
public class SubstractionGame {

	public static void main(String[] args) {
      int number;
      int point = 0;
      int answer = 0;
      int respond = 1;
		int bestScore = 0;
		boolean again = true; 
		Scanner in = new Scanner(System.in); 
      
		do {
			String question = ""; //initialize string for question 
			number = (int)(Math.random() * 18) - 5; 
			answer = number;
			question = String.valueOf(number); //change the form of random number to string
			
         //to make an equation with 3~6 numbers, used two for loops
         for(int i = 0; i < 2; i++) {
				number = (int)(Math.random() * 18) - 5; 
				answer = answer - number; 
				question = question + " - " + number; 
			}
			for(int i = 0; i < (int)(Math.random() * 4); i++) {
				number = (int)(Math.random() * 18) - 5;
				answer = answer - number; 
				question = question + " - " + number;
			}
         
			System.out.print(question + " = "); 
			int response = in.nextInt(); //get the answer from the player
         
			if(response == answer) { //if the answer is correct
           	point++; //add a point
				again = true; 
			} else { //if the answer is not correct
				again = false; 
            if(point > bestScore) { //update the highest score if needed
					bestScore = point;
			}
            
			System.out.println("Wrong! The answer was " + answer); //show the correct answer for loser
			System.out.print("Try again? (1 for yes, 2 for no) "); //ask whether the player wants to play again
			respond = in.nextInt(); 
			System.out.println();
         if(respond == 1) {
            point = 0; //reset the point
				again = true; 
			}
		}
	} 
   while(again == true); //until the user gets wrong, the loop infinitely repeated
      System.out.println("Your highest score was " + bestScore + "."); //print the highest score at last
   }
}
