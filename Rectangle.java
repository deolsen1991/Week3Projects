// Rectangle.java
// Rectangle class as defined by UML diagram
// Dan Olsen
// 4/19/2017

public class Rectangle extends GeometricObject
{

   //private width and height
   private double width = 0.0;
   private double height = 0.0;
   
   //three constructors for all situations
   Rectangle()
   {
      super();
   }
   
   Rectangle(double width, double height)
   {
      super();
      this.width = width;
      this.height = height;
   }
   
   Rectangle(double width, double height, String color, boolean filled)
   {
      super(color, filled);
      this.width = width;
      this.height = height;
   }
   
   //accessors as required by the diagram
   public double getWidth()
   {
      return this.width;
   }
   
   public double getHeight()
   {
      return this.height;
   }
   
   //mutators as required by the diagram
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   public void setWidth(double width)
   {
      this.width = width;
   }
   
   //calculates the area of the rectangle
   public double getArea()
   {
      return this.width * this.height;
   }
   
   //calculates the perimeter of the rectangle
   public double getPerimeter()
   {
      return 2 * (this.width + this.height);
   }
    
   //returns the rectangle to a string
   public String toString()
   {
      return "Rectangle with width " + width + " and height " + height + " " + super.toString();
   }
   
}
