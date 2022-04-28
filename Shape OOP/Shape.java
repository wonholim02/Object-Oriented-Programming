public abstract class Shape{
   private int numSides;
   
   public Shape(int side){
      numSides = side;
   }
   
   public void twice(){
      numSides = numSides * 2;
   }
   
   public abstract double getArea();
   
   public abstract double getPerimeter();
}