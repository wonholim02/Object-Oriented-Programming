/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program help user to get all substrings of the string that 
the user put .
***************************************************************************/ 
import java.util.ArrayList; //importing ArrayList

public class GenerateSubstrings{
   public static void generateSubstring(String word, ArrayList<String> list){ 
   
      for (int i = 0; i < word.length(); i++){
      
         for (int j = word.length(); j > i; j--){ //iterate from the end of string
         
            String subStr = word.substring(i, j);  //add substring to the list
             
            if (list.contains(subStr) == false){ //if does not exist
               list.add(subStr); //add substring
            }
                   
            for (int k = 1; k < subStr.length() - 1; k++){ 
               String adding = word.substring(0,k)+word.substring(k+1); //delete kth 

               if (list.contains(adding) == false){ //if it is not exist
                  generateSubstring(adding,list); //recursion
               }
            }
         } 
      } 
   } 
} 