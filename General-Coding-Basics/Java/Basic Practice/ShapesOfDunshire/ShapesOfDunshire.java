import java.util.Random;

public class ShapesOfDunshire{

   public static void main(String[] args){
   
      double finalVolume = 0;
      int numPieces = (int) (Math.random() * 10) + 10;
      
      System.out.printf("Creating Shapes of Dunshire game with %d pieces.\n", numPieces);
      
      for( int i = numPieces; i > 0; i--){
      
         int shapeType = (int) (Math.random() * 3) + 1;
         double volume;
         double radius;
         double height;  
         switch(shapeType){
            case 1:
               radius = Math.random() * 5 + 5;
               radius = Math.round(radius * 100.0)/100.0;
               volume = ((double)4/3) * Math.PI * Math.pow( radius , 3 );
               volume = Math.round(volume * 100.0)/100.0;
               finalVolume = finalVolume + volume;
               System.out.printf("Manufacturing shape of type: %d and volume: %.2f cm3. Dimensions: radius = %.2f cm.\n", shapeType, volume, radius);
               break;
               
            case 2:
               radius = Math.random() * 5 + 5;
               radius = Math.round(radius * 100.0)/100.0;
               height = Math.random() * 6 + 7;
               height = Math.round(height * 100.0)/100.0;
               volume = Math.PI * Math.pow( radius , 2 ) * height;
               volume = Math.round(volume * 100.0)/100.0;
               finalVolume = finalVolume + volume;
               System.out.printf("Manufacturing shape of type: %d and volume: %.2f cm3. Dimensions: radius = %.2f cm and height = %.2f cm.\n", shapeType, volume, radius, height);
               break;
               
            case 3:
               radius = Math.random() * 5 + 5;
               radius = Math.round(radius * 100.0)/100.0;
               height = Math.random() * 6 + 7;
               height = Math.round(height * 100.0)/100.0;
               volume = ((double)1/3) * Math.PI * Math.pow( radius , 2 ) * height;
               volume = Math.round(volume * 100.0)/100.0;
               finalVolume = finalVolume + volume;
               System.out.printf("Manufacturing shape of type: %d and volume: %.2f cm3. Dimensions: radius = %.2f cm and height = %.2f cm.\n", shapeType, volume, radius, height);
               break; 
         }  
      }
      
      double price;
      finalVolume = Math.round(finalVolume * 100.0)/100.0;
      price = finalVolume * 0.55;
      price = Math.round(price * 100.0)/100.0;
      System.out.printf("Total cost of manufacturing %d pieces, worth %.2f cm3 plastic, is $%.2f.\n", numPieces, finalVolume, price);
      
   }
}
