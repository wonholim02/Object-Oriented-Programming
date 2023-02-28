import java.util.Arrays;

/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program sorts and finds the median of the array.
***************************************************************************/ 
public class FindMedian {
  
  public double FindMedian(int[] newArray, int arraySize){ 
     
     Arrays.sort(newArray); 
     
     double median;
     
     if(arraySize % 2 == 0){  
     
        median = ( newArray [ arraySize / 2 - 1 ] + newArray [ arraySize / 2 ] ) / 2.0; //calculation
        
        return median;
     }
     
     median = newArray [ arraySize / 2 ]; 
        
     return median; 
  }
}
