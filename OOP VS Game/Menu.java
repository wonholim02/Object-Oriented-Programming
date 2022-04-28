/******************************************************************************
Coder: Wonho Lim
Class: Advanced Computer Science
Date: 2020.11.20
Description: Menu is a class that allows user to pick two characters and fight.
After user picks two character, the two characters attack and defend each other
in order. After one dies, it shows the result and ask if the user wants to
play again. If user wants to play again, it sets up new game. If it is not,
it ends the program.
******************************************************************************/

import java.util.*;

class Menu{
   public static Character player1;
   public static Character player2;
   //main method that runs everything
   public static void main(String[] args){
      //beautiful intro
      System.out.println("=======================================================================================");
      System.out.println("===============================WELCOME TO FANTASY's RIFT===============================");
      System.out.println("=======================================================================================");
      //run program once and run until user does not want it to be.
      int go;
      do {
         game();
         go = play(player1, player2);
      }while (go == 1);
      //beautiful outro
      System.out.println("=======================================================================================");
      System.out.println("==================================Thanks for playing!==================================");
      System.out.println("=======================================================================================");
   }
   
   //allowing user to pick two characters.
   public static void game() {
      System.out.println("---------------------------------------------------------------------------------------");
      Scanner scan = new Scanner(System.in);
      System.out.println("Character list | Vampire(1) Barbarian(2) BlueMen(3) medusa(4) HarryPotter(5) Joshua(6) |");
      System.out.print("Choose Player 1: ");
      player1 = select(scan.nextInt());
      System.out.print("Choose Player 2: ");
      player2 = select(scan.nextInt());
   }
   
   //setting up the characters. based on user's information.
   public static Character select(int a) {
      if(a == 1){
         return new Vampire();
      }
      else if(a == 2){
         return new Barbarian();
      }
      else if(a == 3){
         return new BlueMen();
      }
      else if(a == 4){
         return new Medusa();
      }
      else if(a == 5){
         return new HarryPotter();
      }
      else{
         return new Joshua();
      }
   }

   //make two characters to fight and defend in an order until one dies.
   public static int play(Character char1, Character char2) {
      int roundnum = 1;  
      while (char1.getSP() > 0 && char2.getSP() > 0) {
         //1 round = 1 attack for each character unless one of them is dead.
         System.out.println("=======================================================================================");
         System.out.println("Attacker: " + char1.name + "1");   
         System.out.println("Defender: " + char2.name + "2");   
         char1.attack(char2);
         if (char2.getSP() > 0) {
            System.out.println("--------------------------------------ROUND" + roundnum + "--------------------------------------");
            System.out.println("Attacker: " + char2.name + "2");  
            System.out.println("Defender: " + char1.name + "1");  
            char2.attack(char1);
         }
         roundnum++;
         System.out.println("=======================================================================================");
      }
      
      //showing result
      System.out.println("---------------------------------------------------------------------------------------");
      if (char1.getSP() <= 0) {
          System.out.println("Result: " + char2.name + "2" +  " win");
      } else {
          System.out.println("Result: "+ char1.name + "1" + " win");
      }
      System.out.println("---------------------------------------------------------------------------------------");
      
      //ask if user wants to play again
      System.out.print("Type 1 to Play Again / Type 2 to Exit the Game: ");
      Scanner scanning = new Scanner(System.in);
      int choice = scanning.nextInt();
      while (!(choice == 1 || choice == 2)) {
          System.out.println("Error : Invalid, Try Again.");
          choice = scanning.nextInt();
      }
      return choice;
   }
}