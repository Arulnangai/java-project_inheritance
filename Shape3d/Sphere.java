package Shape3d;
import Shape2d.Circle;
import Shape3d.threed;

public class Sphere extends Circle implements threed
{
public Sphere(double radius)
{
super(radius);
}
public double volume()
{
return (4/3)*area()*radius;
}
public double surfaceArea()
{
return perimeter()*radius/3;
}
}