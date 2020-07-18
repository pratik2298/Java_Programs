// wajp to find area of circle and rectangle using method overloading

class ComputeDemo
{
double radius = 0.0, len = 0.0, width = 0.0;

public static void area(float radius)
{
this.radius = radius;
double areaCir = 0.0;
areaCir = 3.14 * radius * radius;
System.out.println(" Area of Circle is " + areaCir);
}

public static void area(double len, double width)
{
this.len = len;
this.width = width;
double areaRec = 0.0;
areaRec = len * width;
System.out.println(" Area of Rectangle is " + areaRec);
}

}
public static void main(String args[])
{

Compute.area(3.4);
Compute.area(4.5, 8.2);
}

}