public class Rectangle extends Shape{
   private double width;
   private double height;
   
   public Rectangle(double wide, double high){
      super(4);
      width = wide;
      height = high;
   }
   
   public double getArea(){
      return width * height;
   }
   
   public double getPerimeter(){
      return width * 2 + height * 2;
   } 
}
