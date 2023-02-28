/**************************************************************************
Name: Wonho Lim 
TYPE: Bugil Academy
Description: This program gets height, width, and length by parameter and 
calculates sum of area,sufrace, and voulme of the box. 
***************************************************************************/ 
public class Box {
   //fields
   private double height;
   private double width; 
   private double length; 
   
   //constructor with basic values
   public Box() {
      height = 1;
      width = 1;
      length = 1; 
   }
   
   //constructor with parameter
   public Box (double height2, double width2, double length2) {
      height = height2;
      width = width2; 
      length = length2; 
   }
   
   //height setter
   public void setHeight(double up) {
      height = up; 
   }
   
   //width setter
   public void setWidth(double left) {
      width = left;
   }
   
   //length setter
   public void setLength(double right) {
      length = right;
   }
   
   //volume calculator
   public double calcVolume() {
      double volume = height * width * length; 
      return volume;
   } 
   
   //surface area calculator
   public double calcSurfaceArea() {
      double surfaceArea = 2*height*width + 2*height*length + 2*width*length; 
      return surfaceArea;  
   }
}
