// Point3D.java
// Defines and implements a 3D point and implements a check for the methods. 
// Dan Olsen
// 4/19/2017

public class Point3D {

    public static void main(String[] args)
    {
        // create various Point3D objects

        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(2, 3, 4);
        
        // Test the methods of Point3D
        System.out.println("p1 toString = " + p1.toString());
        System.out.println("p2 accessors = " +
                p2.getX() + "," + p2.getY() + "," + p2.getZ()); 
        p1.setCoords(10, 20, 30);
        System.out.println("p1 setCoords = " + p1.toString());
        p2.setX(50);
        p2.setY(60);
        p2.setZ(70);
        System.out.println("p2 toString = " + p2.toString());
        System.out.println("equals for p1 and p2 = " +
                            p1.equals(p2));
    }
    
    //the three points representing x y and z
    private int x;
    private int y;
    private int z;
    
    //first constructor to set all to 0 if nothing is entered
    public Point3D()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    //sets the three points to the user inputted points
    public Point3D(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //the next 3 methods are the accessors for the three points
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public int getZ()
    {
        return this.z;
    }
    
    //the three mutators for x y and z.
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public void setZ(int z)
    {
        this.z = z;
    }
    
    //sets the coordinates of a point as inputted by the user
    public void setCoords(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    //comppares two points to see if they are equal
    public boolean equals(Point3D point)
    {
        if(point.getX() == x && point.getY() == y && point.getZ() == z)
            return true;
        else
            return false;
    }
    
    //returns a point converted to a string
    public String toString()
    {
        String s = x + "," + y + "," + z;
        return s;
    }
}