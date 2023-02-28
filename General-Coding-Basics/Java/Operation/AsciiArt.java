/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program prints the totem.
***************************************************************************/
public class AsciiArt{
   public static void main(String[] args){
      head();
      body();
      leg();
   }

   public static void head(){ //This prints head part of the totem
      System.out.println("    \\I'm totem!/");   
      System.out.println("        /=\\");
      System.out.println("       |>.<|");
      System.out.println("        [.]");
   }

   public static void body(){ //This prints body part of the totem and includes one for loop
      System.out.print("  (");
      for(int i = 0; i < 13; i++){
         System.out.print("-");
      }
      System.out.println(")");
      System.out.println("  (----|||||----)");
      System.out.println("      \\|||||/");
      System.out.println("      /|||||\\");
   }

   public static void leg(){ //This prints leg and ground part of the totem
      System.out.println("      // | \\\\");         
      System.out.println("      /__|__\\");        
      System.out.println("      | / \\ |");
      System.out.println("      () | ()");
      System.out.println("      || | ||");
      System.out.println("______{}_|_{}_____");
   }
}