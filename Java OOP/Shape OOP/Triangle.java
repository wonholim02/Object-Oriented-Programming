public abstract class Triangle extends Shape{
   private double width;
   private double height;
   
   public Triangle(){
      super(3);
   }
   
   public abstract double getArea();
   
   public abstract double getPerimeter();
}