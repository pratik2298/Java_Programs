/* create class circle with following specs:-
1) IV : radius
2) PC : for radius
3) IM : area()   ---> returns area of circle
        circum() ---> returns area of circle
 Do write test case also */

class Circle
{
private double radius;

public Circle(double radius)
{
this.radius = radius;
}

public double area()
{
return 3.14 * radius * radius;
}

public double circum()
{
return 2 * 3.14 * radius;
}
}


class CircleTest
{
public static void main(String args[])
{
Circle c = new Circle(2.76);
double a1 = c1.area();  
System.out.println("area=" + a1);
double a2 = c1.area();  
System.out.println("circum=" + a2);
}
}

