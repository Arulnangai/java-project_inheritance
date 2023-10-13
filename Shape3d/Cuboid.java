package Shape3d;
import Shape2d.Rectangle;
import Shape3d.threed;

public class Cuboid extends Rectangle implements threed
{
public double height;
public Cuboid(double length,double breadth,double height)
{
super(length,breadth);
this.height = height;
}
public double volume()
{
return area()*height;
}
public double surfaceArea()
{
return perimeter()+2*height;
}
}