import java.util.Scanner;
/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This code prints out longest word that was typed by the user 
by using sentinel value. The program ifinifely repeats until the user put 
goodbye as a input. After user type goodbye, it will show length of 
greatest string that user had printed. 
***************************************************************************/
public class LongestStringSaver {
   public static void main (String[] args) {
      System.out.print("Welcome to LongStringSaver!");
      Scanner scan = new Scanner(System.in);
      System.out.print("Type a word (or \"goodbye\" to quit): ");
      String line  = scan.nextLine();
      
      int length = 0;
      int longestLength = 0;
      String longestString = "";
      
      while (!line.equals("goodbye")){
         length = line.length();
         if (length > longestLength){ 
               longestLength = length;
               longestString = line;
            }
            System.out.print("Type a word (or \"goodbye\" to quit): ");
            line = scan.nextLine();
      }
      System.out.println("The longest word you typed was \"" + longestString + "\" (" + longestLength + " letters)"); 
   }   
}
