package Shape3d;
import Shape2d.Square;
import Shape3d.threed;

public class Cube extends Square implements threed
{
public Cube(double a)
{
super(a);
}
public double volume()
{
return area()*a;
}
public double surfaceArea()
{
return (3/2)*perimeter();
}
}