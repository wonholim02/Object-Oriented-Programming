/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program calculate age standard deviation of the group
***************************************************************************/
public class Deviation {

   //calculates standard deviation with given array
   public double stdDev(Person[] ageArray, int size){
      
      double standardDeviation;
      double total = 0;
      double average = 0;
      double differenceTotal = 0;
      
      //calculation
      for(int i = 0; i < size; i++){ //get the sum of ages
         total = total + ageArray[i].getAge();
      }
      
      average = total / size; //get average
      for(int i = 0; i < size; i++){ //get the differece square total
         differenceTotal = differenceTotal + Math.pow(ageArray[i].getAge() - average , 2);
      }
      
      standardDeviation = Math.sqrt(differenceTotal / total); //final calculation of deviation
      
      return standardDeviation; //returning the standard deviation
   }
}