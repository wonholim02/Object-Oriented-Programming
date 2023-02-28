import java.util.Arrays;
/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program prints 20 random values, between 0 and 99, and
prints it again after sorting.
***************************************************************************/
public class SortingNumbers {
   public static void main(String[] args) {
      int[] number = new int[20];                  // the array length is 20
      
      System.out.println("Array Content: ");
     for( int i = 0; i<number.length; i++) {       // assign a random value between 1 and 99 in the array and print the values 
         number[i] = (int)(Math.random() * 100);
         System.out.print(number[i] + " ");
      }
      
      System.out.println("");
      
      Arrays.sort(number);                        // sorts the array
      
      System.out.println("Array Content after sorting: ");
      
      for(int i : number) {                        // prints the array
         System.out.print( i+" ");
      }
      
   }
}
