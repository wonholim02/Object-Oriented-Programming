/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program prints the lyrics.
***************************************************************************/
public class Song {
   public static void main(String[] args) {
      flyVerse();       //This prints first verse
      spiderVerse();    //This prints second verse
      birdVerse();      //This prints third verse
      catVerse();       //This prints fourth verse
      dogVerse();       //This prints fifth verse
      humanVerse();     //This prints sixth verse
      finalVerse();     //This prints seventh verse
   }
   
   /**********************************************************************
   flyVerse()
   This method prints out the first verse. By using flyRepeat, we can
   print out common repeated lines on first verse to sixth verse.
   **********************************************************************/
   public static void flyVerse() {
      System.out.println("There was an old woman who swallowed a fly.");
      flyRepeat();
      System.out.println();
   }
   
   /**********************************************************************
   spiderlyVerse()
   This method prints out the second verse. By using spiderRepeat, we can
   print out common repeated lines on second verse to sixth verse.
   **********************************************************************/
   public static void spiderVerse() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      spiderRepeat();
      System.out.println();
   }
   
   /**********************************************************************
   birdVerse()
   This method prints out the third verse. By using flyRepeat, we can
   print out common repeated lines on third verse to sixth verse.
   **********************************************************************/
   public static void birdVerse() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      birdRepeat();
      System.out.println();
   }
   
   /**********************************************************************
   catVerse()
   This method prints out the fourth verse. By using catRepeat, we can
   print out common repeated lines on fourth verse to sixth verse.
   **********************************************************************/
   public static void catVerse() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catRepeat();
      System.out.println();
   }
   
   /**********************************************************************
   dogVerse()
   This method prints out the fifth verse. By using flyRepeat, we can
   print out common repeated lines on fifth verse to sixth verse.
   **********************************************************************/
   public static void dogVerse() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      dogRepeat();
      System.out.println();
   }
   
   /**********************************************************************
   humanVerse()
   This method prints out the sixth verse of the song. Cowrepeat prints
   out the third to ninth lines of the sixth verse.
   **********************************************************************/
   public static void humanVerse() {
      System.out.println("There was an old woman who swallowed a human,");
      System.out.println("What a demon to swallow a human.");
      humanRepeat();
      System.out.println();
   }
   
   //This method prints out last verse of the song
   public static void finalVerse() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
   
   //This prints out the common lines on second to sixth verses
   public static void flyRepeat() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
   }
   
   //This prints out the common lines on second to sixth verses
   public static void spiderRepeat() {
      System.out.println("She swallowed the spider to catch the fly,");
      flyRepeat();
   }

   //This prints out the common lines on second to sixth verses
   public static void birdRepeat() {
      System.out.println("She swallowed the bird to catch the spider,");
      spiderRepeat();
   }
   
   //This prints out the common lines on second to sixth verses
   public static void catRepeat() {
      System.out.println("She swallowed the cat to catch the bird,");
      birdRepeat();
   }
   
   //This prints out the common lines on second to sixth verses
   public static void dogRepeat() {
      System.out.println("She swallowed the dog to catch the cat,");
      catRepeat();
   }
   
   //This prints out the common lines on second to sixth verses
   public static void humanRepeat() {
      System.out.println("She swallowed the human to catch the dog,");
      dogRepeat();
   }
}