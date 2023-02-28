/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program get the location of taxi first, get the moved 
distance by parameter, and then update total distance.
***************************************************************************/ 
public class Taxicab {
   private int x;
   private int y;
   private int total;
   
   //constructor
   public Taxicab() {
      x = 0; 
      y = 0; 
      total = 0; 
   }
   
   //constructor with parameters
   public Taxicab(int xgo, int ygo) {
      x = xgo;
      y = ygo;
      total = 0;
   }
   
   //xCoord getter
   public int getXCoord() {
      return x; 
   }
   
   //yCoord getter
   public int getYCoord() {
      return y; 
   }
   
   //getter of Total
   public int getDistanceTraveled() {
      return total; 
   }
   
   //get value from parameter and update fields
   public void moveX(int horizontal) {
      x = x + horizontal; //add distance
      total = total + Math.abs(horizontal); //update total
   }
   
   //get value from parameter and update fields
   public void moveY(int vertical) { 
      y = y + vertical; //add distance
      total = total + Math.abs(vertical); //update total
   }
}
