/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program generates receipt.
***************************************************************************/ 
public class Receipt{
   public static void main (String[] args) {
      
      //Calculate total owed, assuming 8% tax / 15% tip
      int Subtotal = 38+40+30;
      double Tax = Subtotal * .08;
      double Tip = Subtotal * .15;
      double Total = Subtotal + Tax + Tip;
      
      //print the all values
      System.out.println("Subtotal:" + Subtotal);
      System.out.println("Tax:" + Tax);
      System.out.println("Tip:" + Tip);
      System.out.println("Total:" + Total);
   }
}
