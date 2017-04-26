// ShapeBucket.java
// Store geometric shapes in an ArrayList
// Modified by Dan Olsen
// 4/22/2017

import java.util.ArrayList;

public class ShapeBucket
{
    public static void main(String[] args)
    {
        ArrayList<GeometricObject> shapeList = new ArrayList<>();
        
        shapeList.add(new Circle(2, "green", false));
        shapeList.add(new Circle(3, "blue", true));
        
        //new Rectangle creation
        shapeList.add(new Rectangle(4, 5 , "red", false));
        shapeList.add(new Rectangle(5, 5, "purple", true));
        
        // iterate through each object and print properties plus area if circle
        for (GeometricObject g: shapeList)
        {
            if (g instanceof Circle)
            {
                System.out.println(g + "Area of circle is " + ((Circle)g).getArea());
            }
            
            //addition of rectangle printing
            if (g instanceof Rectangle)
            {
               System.out.println(g + "Perimeter of rectangle is " + ((Rectangle)g).getPerimeter());
            }
        }
    }
}