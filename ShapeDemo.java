import java.util.*;
import Shape2d.*;
import Shape3d.*;

public class ShapeDemo
{
public static void main(String...arg)
{
Square s = new Square(4);
Rectangle r = new Rectangle(2,3);
Circle c = new Circle(4.5);
Cube cb = new Cube(2);
Cuboid cid = new Cuboid(4.5,6,7);
Sphere sp = new Sphere(3.7);
System.out.println("Area of Square "+s.area());
System.out.println("Perimeter of Square "+s.perimeter());
System.out.println("Area of Rectangle "+r.area());
System.out.println("Perimeter of Rectangle "+r.perimeter());
System.out.println("Area of Circle "+c.area());
System.out.println("Perimeter of Circle "+c.perimeter());
System.out.println("volume of Cube "+cb.volume());
System.out.println("surfaceArea of Cube "+cb.surfaceArea());
System.out.println("volume of Cuboid "+cid.volume());
System.out.println("surfaceArea of  Cuboid "+cid.surfaceArea());
System.out.println("volume of Sphere "+sp.volume());
System.out.println("surfaceArea of Sphere "+sp.surfaceArea());

}
}