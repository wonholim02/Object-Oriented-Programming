import java.util.Scanner; 

/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program allows users to play game that one who connects
four indexes first wins.
***************************************************************************/ 
public class ConnectFour{
	public static void main(String[] args){
      		
		//basic setting
      GameBoard game = new GameBoard();
      Scanner in = new Scanner(System.in);
		GameBoard.State con1 = GameBoard.State.UNFINISHED; 
		GameBoard.State con2 = GameBoard.State.O_WON; 
		GameBoard.State con3 = GameBoard.State.X_WON; 
		GameBoard.State con4 = GameBoard.State.DRAW; 
		char turn = 'x'; 
            
      //first basic instructions and first round of game
      System.out.println("Welcome to the game of Connect Four! Player X will go first.");
      System.out.println("");
      game.print(); 
      System.out.println("");
   	System.out.println("Player X's turn:");
   	System.out.print("Enter column (1-7): \n\n");
   	int column = in.nextInt(); 
   	game.makeMove(column, turn);       
   	game.print(); 
        System.out.println("");
      
	while(game.getGameState() == con1){  //until the game ends
      if(turn == 'x'){ //if last turn was X
         turn = 'o';
			System.out.println("Player O's turn:");
			System.out.print("Enter column (1-7): ");
			column = in.nextInt(); 
			while(game.makeMove(column, turn) == false){ //if input is wrong
				System.out.println("Invalid move, try again \n");
				game.print();
				System.out.println("Player X's turn:");
				System.out.print("Enter column (1-7): "); 
				column = in.nextInt();
               			game.makeMove(column, turn);
			}
       	System.out.println("\n");
			game.print();
         System.out.println("\n");  
		} else{ //if last turn was o
           turn = 'x';
			  System.out.println("Player X's turn:");
			   System.out.print("Enter column (1-7): "); 
			   column = in.nextInt(); 
			   while(game.makeMove(column, turn) == false){ //if input is wrong
   				System.out.println("Invalid move, try again \n");
   				game.print();
   				System.out.println("Player X's turn:");
   				System.out.print("Enter column (1-7): ");
   				column = in.nextInt();
               game.makeMove(column, turn);
			}            
			System.out.println("\n");
			game.print();
         System.out.println("\n");
		}	
	}    
      //if X wins the game
      if(game.getGameState() == con2){
         System.out.println("GAME OVER:");
         System.out.println("Player O won!");
      }         
      //if O wins the game
      if(game.getGameState() == con3){
            System.out.println("GAME OVER:");
            System.out.println("Player X won!");
      }
      //if drew
      else if(game.getGameState() == con4){
         System.out.println("GAME OVER:");
         System.out.println("DREW!");
      }
   }
}
