package Shape2d;
import Shape2d.twod;

public class Square implements twod
{
public double a;
public Square(double a)
{
this.a = a;
}

public double area()
{
return a*a;
}
public double perimeter()
{
return 4*a;
}
}