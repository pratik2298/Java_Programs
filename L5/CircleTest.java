import java.io.*;
class Circle{
private double radius;

public Circle(double radius)
{
this.radius = radius;
}

public void show(){
System.out.println("Radius" +radius);
}

public void area(){
double ans = Math.PI * Math.pow(radius,2);
System.out.printf("area = %10.2f \n",ans);
}

public void Circumference()
{
double ans = 2 * Math.PI * radius;
System.out.printf("Circumference is = %10.2f \n",ans);
}
}

class CircleTest
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("enter the Radius of Circle");
double radius = Double.parseDouble(br.readLine());

Circle C1 = new Circle(radius);
C1.show();
C1.area();
C1.Circumference();
}
}