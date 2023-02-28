/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program investigates the income and expense of user,
calculates the difference, and classify the user.
***************************************************************************/  
import java.util.Scanner; 

public class Budgeter { 
   public static void main(String[] args) {
       intro();
       result();
   }

   //prints introduction
   public static void intro() {
      System.out.println("This program asks for your monthly income and");
      System.out.println("expenses, then tells you your net monthly income. \n");
   }   
   
   //scan and save the input
   public static double scan() {
      Scanner in = new Scanner(System.in);
      double number;
      number = in.nextDouble(); 
      return number; 
   }
   
   //gets the income information
   public static double income() {
      double totalIncome = 0;
      double incomeCategories = 0;
      double income;
      
      //asking how many categories we user have and save it
      System.out.print("How many categories of income? ");
      incomeCategories = scan(); 
      
      while(incomeCategories != 0){ //until income categories become zero, repeat asking and saving.
         System.out.print("    Next income amount? $"); 
         income = scan(); 
         totalIncome = totalIncome + income; 
         incomeCategories--; 
         }
      //return the total income at last    
      return totalIncome;
   }
   
   public static double spend(){
   
      double totalExpense = 0.00;
      double expenseCategories = 0;
      double expense;
      
      System.out.print("\n How many categories of expense? "); //asking user the number of categories
      expenseCategories = scan(); 
      
      while(expenseCategories > 0){ //until expense categories become zero, keep asking
         System.out.print("    Next expense amount? $"); 
         expense = scan(); 
         totalExpense = totalExpense + expense; 
         expenseCategories--;  
      }
      return totalExpense;
   }
   
   //asking user if the total expense is daily expense or montly expense  
   public static int daycount2(){
      int days2 = 1;
      double response2;      
      System.out.println("");
      System.out.print("Enter 1) monthly or 2) daily expenses? "); //asking
      response2 = scan(); 
      if (response2 == 1){
         days2 = 31; //one month is 31 days so days is 31
      }
      if (response2 == 2){
         days2 = 1; //daily is just one day so days is 1
      }
      return days2; 
   }
   
   //showing final result
   public static void result(){
      final int DAY = 31; 
      double totalIncome = income();
      int days2 = daycount2();
      double totalExpense = spend();
      
      //if it is daily expense, we should muliply by 31 to get a monthly(total) value
      if(days2 == 1){
         totalExpense = totalExpense*DAY;
      }
      
      //to get a daily values, devide total income and expense by DAY
      double incomePerDay = totalIncome / DAY;
      double expensePerDay = totalExpense / DAY;
      
      //show total income
      System.out.print("\n Total income = $");
      System.out.printf("%.2f", totalIncome); //round up to second decimal
      System.out.print(" ($");
      System.out.printf("%.2f", incomePerDay); //round up to second decimal
      System.out.println("/day)");
      
      //show total expenses
      System.out.print("Total expenses = $");
      System.out.printf("%.2f", totalExpense); //round up to second decimal
      System.out.print(" ($");
      System.out.printf("%.2f", expensePerDay); //round up to second decimal
      System.out.println("/day) \n");
      
      //show what type of person the user is due to expense and income value and give custom messege 
      
      //if total income is bigger than total expense but the gap is samller than 250, consider as a saver
      if(totalIncome>totalExpense && (totalIncome-totalExpense) < 250){
         System.out.print("You earned $"); 
         System.out.printf("%.2f", totalIncome-totalExpense); //round up to second decimal
         System.out.println(" more than you spent this month.");
         System.out.println("You're a saver.");
         System.out.println("Good! Please Keep that good spending habit!"); //my own custom line 
      }
      
      //if total income is bigger than total expense and gap is bigger than 250, consider as a big saver
      if(totalIncome>totalExpense && (totalIncome-totalExpense) > 250){
         System.out.print("You earned $");
         System.out.printf("%.2f", totalIncome-totalExpense); 
         System.out.println(" more than you spent this month.");
         System.out.println("You're a big saver.");
         System.out.println("Your habit is respectable, but sometimes you should use some money for yourself.");
      }
      
      //if total expense is bigger than total income and gap is smaller than 250, consider as a spender
      if(totalIncome<totalExpense && (totalExpense-totalIncome) < 250){
         System.out.print("You spent $");
         System.out.printf("%.2f", totalExpense-totalIncome); 
         System.out.println(" more than you earned this month.");
         System.out.println("You're a spender.");
         System.out.println("It will be better if you save more money.");
      }
      
      //if total expense is bigger than total income and gap is bigger than 250, consider as big spender
      if(totalIncome<totalExpense && (totalExpense-totalIncome) > 250){
         System.out.print("You spent $"); 
         System.out.printf("%.2f", totalExpense-totalIncome);  
         System.out.println(" more than you earned this month.");
         System.out.println("You're a big spender.");
         System.out.println("You are spending too much money!"); 
      }
      
      //if total expense and income is equal, consider as spender
      if(totalIncome == totalExpense){
         System.out.print("You spent $"); 
         System.out.printf("%.2f", totalExpense-totalIncome); 
         System.out.println(" more than you earned this month.");
         System.out.println("You're a spender.");
         System.out.println("It will be better if you save more money.");  
      }
   }
}
