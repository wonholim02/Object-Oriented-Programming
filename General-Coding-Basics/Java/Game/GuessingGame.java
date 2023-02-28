import java.util.Scanner; 
/********************************************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program is a mini game which interacts with player. The program picks a random integer, 
asks the user guesses the number correctly. If the user gives incorrect value, the program shows whether 
guessed number is higher or lower. If the user gets the correct answer, the program asks user whether they 
want to keep playing or not. Finally, after the user stops, the program shows the overall result of games. 
********************************************************************************************************/
public class GuessingGame {
	public static void main(String[] args) {
		
      haiku();
		int trial=0;
		int totalGames = 1;
		int totalGuess = 0;
		int bestScore = 0;
      final int MAX = 100;
    	boolean check = true;
    	char smallY = 'y';
	  	char capitalY = 'Y';
      
      while(check == true) {
			trial = 0; //reset trial to 0 for a new game 
         int randomNumber = (int)(Math.random() * MAX) + 1; //picks a random number
       	System.out.println("I'm thinking of a number between 1 and " + MAX + "...");
         Scanner in = new Scanner(System.in);
			System.out.print("Your guess? "); //asks the answer
			int answer = in.nextInt();
			
         trial++; //add trial by 1 after guessing
         trial = asking(randomNumber, answer, trial);
			
         if(totalGames == 1) {
				bestScore = trial;
			}
			if(trial < bestScore) {
				bestScore = trial;
			}
     
			totalGuess = totalGuess + trial; //update total guesses
         
			if(trial == 1) { //if get the answer at once
				System.out.println("You got it right in " + trial + " guess!");
			} else {
				System.out.println("You got it right in " + trial + " guesses!");
			}
         
			System.out.print("Do you want to play again? "); //ask whether user wants to play again
			String checkString = in.next();
			System.out.println(); 
			char[] checkArray = checkString.toCharArray(); //change input to array with characters
			if(checkArray[0] == capitalY || checkArray[0] == smallY) { 
         	totalGames++;
			} else {
				check = false;
			}
			
		}
		result(totalGames, totalGuess, bestScore); //prints results of the game at last
	}
	
   //Introduction
   public static void haiku(){
     	System.out.println("Hello, new player!\n");
     	System.out.println("I want to see if you are good at guessing.\n");
     	System.out.println("Good Luck!\n");
	}
   
	//This is a method makes user to play game.
	public static int asking(int randomNumber, int answer, int trial) {
	   Scanner in = new Scanner(System.in);
	   while(answer != randomNumber) {
   	   //infinitely asks until get a correct answer
     		if(answer > randomNumber) {
            trial++;
   			System.out.println("It's lower."); 
   			System.out.print("Your guess? ");
   			answer = in.nextInt();
   		}  
         if(answer < randomNumber) {
            trial++;
   		   System.out.println("It's higher.");
   			System.out.print("Your guess? "); 
   			answer = in.nextInt();
   			}
   		}
		return trial;
	}
	
	//Shows overall result of games that player had
	public static void result(int totalGames, int totalGuess, int bestScore) {
		double guessOverGame = (double)totalGuess / totalGames;
		System.out.println("Overall results:"); 
		System.out.println("Total games   = " + totalGames);
		System.out.println("Total guesses = " + totalGuess);
		System.out.print("Guesses/game  = ");
		System.out.printf("%.1f", guessOverGame);
		System.out.println("\nBest game     = " + bestScore);
      }
}
