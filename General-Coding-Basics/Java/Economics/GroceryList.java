import java.util.ArrayList;
import java.util.Scanner;
/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program help user to add, remove, replace, display the 
items in grocery list as long as they want and then quit if they want to.
***************************************************************************/    
public class GroceryList{
   private ArrayList<String> list = new ArrayList<String>();
   Scanner scan = new Scanner(System.in);
      
   //introduction of the grocery list
   public void start() {
      int answer = 0;
      System.out.println("This program help user to add, remove, replace, display the grocery list \n");
      System.out.println("(making own grocery list)as long as they want and then quit if they want to. \n");
      
      System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
      answer = scan.nextInt(); //get the first answer before start the program
      
      while( answer != 5 ) { //until the user want to quit
         
         if( answer == 1 ){ //adding and asking again
            add();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 2 ){ //removing and asking again
            remove();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 3 ){ //replacing and asking again
            replace();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 4 ){ //displaying and asking again
            display();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.replace 4.display 5.quit) ");
            answer = scan.nextInt();
         }
      }
      System.out.println("Have a nice day!");//if the user put 5, end the program
   } 
   
   //adding
   public void add(){ 
      System.out.print("What do you want to add? ");//aksing and getting values
      String adding = scan.nextLine();
      adding = scan.nextLine();  
      list.add(adding);
   }
   
   //removing
   public void remove() {
      System.out.print("What do you want to remove? "); //aksing and getting values
      String removing = scan.nextLine();
      removing = scan.nextLine();
      if(list.contains(removing) == true) { //if exist
         list.remove(list.indexOf(removing));
      } else { //if it does not
         System.out.println("There is no such item!");
      }  
   }
   
   //replacing
   public void replace() {
      System.out.print("What do you want to replace? "); //asking and getting values
      String replacing = scan.nextLine();
      replacing = scan.nextLine();
      System.out.print("With what? ");
      String instead = scan.nextLine();
      if(list.contains(replacing) == false) { //if it does not
         System.out.println("There is no such item!");
      } 
      if(list.contains(replacing) == true) { //if it is exist
         list.set(list.indexOf(replacing),instead); 
      } 
   }
   
   //displaying
   public void display() {
      for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i));
      }
      System.out.println("There are " + list.size() + " items in your list.");
   }
}
