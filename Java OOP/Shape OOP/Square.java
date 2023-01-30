public class Square implements RegularPolygon{
   private int length;
   public Square(int y){
      length = y;
   }
   public int getNumSides(){
      return 4;
   }
   public int getSideLength(){
      return length;
   }
}