public class RightTriangle extends Triangle{
   private double width;
   private double height;
   
   public RightTriangle(double wide, double high){
      super();
      width = wide;
      height = high;
   }
   
   public double getArea(){
      return 0.5 * width * height;
   }
   
   public double getPerimeter(){
      return width + height + (Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));
   } 
}
