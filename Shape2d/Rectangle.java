package Shape2d;
import Shape2d.twod;

public class Rectangle implements twod
{
public double length,breadth;
public Rectangle(double length, double breadth)
{
this.length = length;
this.breadth = breadth;
}

public double area()
{
return length*breadth;
}
public double perimeter()
{
return 2*(length+breadth);
}
}