public class EquilateralTriangle implements RegularPolygon{
   private int length;
   public EquilateralTriangle(int x){
      length = x;
   }
   public int getNumSides(){
      return 3;
   }
   public int getSideLength(){
      return length;
   }
}
