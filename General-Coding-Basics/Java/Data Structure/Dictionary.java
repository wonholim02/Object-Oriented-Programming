import java.util.ArrayList;
import java.util.Scanner;
/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program allows user to add, remove, change, get, display 
the word and its definition in dictionary as long as they want and then 
quit if they want to.
***************************************************************************/ 

public class Dictionary{
   private ArrayList<String> listWor = new ArrayList<String>(); //add arraylist fields
   private ArrayList<String> listDef = new ArrayList<String>();
   Scanner scan = new Scanner(System.in); //add scanner objects
   Scanner in = new Scanner(System.in);
   
   public void start(){ //start method and ask user what they want to do
      int answer = 0;
      System.out.println("This program help user to add, remove, change, get, display the word and its");
      System.out.println("definition in dictionary(make own dictionary) as long as they want and quit if they want to.");
      
      System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.change 4.get 5.display 6.quit) ");
      answer = scan.nextInt(); //get the basic answer before start the program
      
      while( answer != 6) { //until the user want to quit
         
         if( answer == 1 ){ //adding 
            add();         
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.change 4.get 5.display 6.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 2 ){ //removing
            remove();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.change 4.get 5.display 6.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 3 ){ //changing
            change();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.change 4.get 5.display 6.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 4 ){ //getting
            get();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.change 4.get 5.display 6.quit) ");
            answer = scan.nextInt();
         }
         
         if( answer == 5 ){ //displaying
            display();
            System.out.print("What do you want to do? Type numbers (1.add 2.remove 3.change 4.get 5.display 6.quit) ");
            answer = scan.nextInt();
         }
      }
      System.out.println("QUIT"); //if the user put 6, end the program 
   } 
   
   public void add(){ //adding 1(word)
      System.out.print("Type word: ");
      String word = scan.nextLine(); //aksing and getting values
      word = scan.nextLine();
           
      listWor.add(word);
  
      System.out.print("Type definition: ");
      String definition = in.nextLine(); //aksing and getting values
      
      listDef.add(definition);
   }
   
   public void remove(){ //removing the word
      System.out.print("Which word(definition) do you want to remove? ");
      String removing = scan.nextLine(); //asking and getting value
      removing = scan.nextLine();
      
      if(listWor.contains(removing) == false) { //if does not
         System.out.println("There is no such item!"); //say there is no
      }  
      if(listWor.contains(removing) == true) { //if exist
         int removeIndex = listWor.indexOf(removing);
         listDef.remove(removeIndex);
         listWor.remove(removeIndex);
         
      } 
   }   
   
   public void change(){ //changing method
      System.out.print("Which word's definition do you want to change? "); //aksing and getting values
      String cWord = scan.nextLine();
      cWord = scan.nextLine();
      
      if(listWor.contains(cWord) == false) { //if does not
         System.out.println("There is no such item!"); //say there is no
      }  
      if(listWor.contains(cWord) == true) { //if exist
         System.out.print("As what? "); //aksing and getting values
         String cDef = in.nextLine();
      
         listDef.set(listWor.indexOf(cWord),cDef);
         
      }    
   }
   
   public void get(){ //getting method
      System.out.print("Which word's definition do you want to get? Type word. ");
      String getDef = in.nextLine(); //aksing and getting values
      
      if(listWor.contains(getDef) == false) { //if does not
         System.out.println("There is no such item!"); //say there is no
      }  
      if(listWor.contains(getDef) == true) { //if exist  
         String defin = listDef.get(listWor.indexOf(getDef));
         System.out.println(defin); //print
      }
   }
   
   public void display(){ //displaying
      for(int i = 0; i < listWor.size(); i++){ //getting and displaying all the index one by one
         System.out.println(listWor.get(i));
      }
      System.out.println("There are " + listWor.size() + " items in your list."); //total
   }
}
