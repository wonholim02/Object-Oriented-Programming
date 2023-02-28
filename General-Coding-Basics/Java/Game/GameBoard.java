/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program contains methods that can be used as a game board
and a processor for ConnectFour class.
***************************************************************************/  
public class GameBoard {
	
   private static char[][] table;
   private static State gameState;
   
   //enum class for gameState
   public enum State{
      UNFINISHED, O_WON, X_WON, DRAW
   }
   
   //constructor
   public GameBoard(){
      table = new char[6][7];
      for(int i = 0; i < 6; i++){
         for(int j = 0; j < 7; j++){
            table[i][j] = '.';
         }
      }
      gameState = State.UNFINISHED;
   }
   
   //updates the move of the user(if invalid, it does not)
   public static boolean makeMove(int column, char turn){
		int in = 0;
      if (column == - 1) {
			return false; 
		} else{
			boolean result = false;
			for (int row = 5; row >= 0; row--){
				if(result == false){
					if(table[row][column - 1] == '.'){
						table[row][column - 1] = turn; 
						result = true;
						in = row;
					}
				}
			}
			updateGameState(in, column - 1); 
			return true;
		}
	}  
      
   //checks if four are connected
   public static void updateGameState(int arow, int acol){
      boolean horizontal = horizontal();
      boolean vertical = vertical();
      boolean d1 = diagonal1();
      boolean d2 = diagonal2();
      boolean full = all();
      //if one of the full
      if(horizontal == true || vertical == true || d1 == true || d2 == true){
         gameState = winner(arow, acol);
      } else if(full == true) { //if full, draw
         gameState =  State.DRAW;
      } else gameState = State.UNFINISHED; //if it is nothing, unfinished
   }

   //returns who is winner
   public static State winner(int row, int col){
      if(table[row][col] == 'x'){
         return State.X_WON;
      } else return State.O_WON;
   }

   //checks horizontal line        
   public static boolean horizontal(){
      int count = 0;
      for(int row = 0; row < table.length; row++){
         for(int col = 0; col < table[row].length - 3; col++){
            if(table[row][col] != '.' && table[row][col] == table[row][col + 1] &&
            table[row][col] == table[row][col + 2] && table[row][col] == table[row][col + 3]){
               count++;
            }
         }
      }
      if(count != 0){ //if exists 
         return true;
      } else return false; //if does not
   }
   
   //checks vertical line
   public static boolean vertical(){ 
      int count = 0;     
      for(int col = 0; col < table[0].length; col++){
         for(int row = 0; row < table.length - 3; row++){
            if(table[row][col] != '.' && table[row][col] == table[row + 1][col] &&
            table[row][col] == table[row + 2][col] && table[row][col] == table[row + 3][col]){
               count++;
            }
         }
      }
      if(count != 0){
         return true;
      } else return false;
   }
   
   //check one diagonal case 
   public static boolean diagonal1(){
      int count = 0;
      for (int row = 0; row < table.length - 3; row++){  
         for (int col = 0; col < table[row].length - 3; col++){
            if (table[row][col] != '.' && table[row][col] == table[row+1][col+1] &&
            table[row][col] == table[row + 2][col + 2] && table[row][col] == table[row + 3][col + 3]){
               count++;
            }
         }
      }
      if (count != 0){
         return true;
      } else return false;    
   }
   
   //check another diagonal
   public static boolean diagonal2(){
      int count = 0;
      for (int row = 0; row < table.length - 3; row++){
         for (int col = 3; col < table[row].length; col++){
            if (table[row][col] != '.' && table[row][col] == table[row+1][col - 1] && table[row][col] == 
            table[row + 2][col - 2] && table[row][col] == table[row + 3][col - 3]){
               count++;
            }
         }
      }
      if(count != 0){
         return true;
      } else return false;
   }
   
   //checks if the table is full
   public static boolean all(){
      int count = 0;
      for(int i = 0; i < 6; i++){
         for(int j = 0; j < 7; j++){
            if(table[i][j] == '.'){
               count++;
            }
         }
      }
      if(count == 0){
         return true;
      } else return false;
   }
   
   //getter for gameState
   public static State getGameState(){
      return gameState;
   }
   
   //print the board
   public static void print(){
      for(int i = 0; i < 6; i++){
         for(int j = 0; j < 7; j++){
            System.out.print(table[i][j]);
         }
         System.out.println();
      }
   }
}
