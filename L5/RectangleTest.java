/* waoojp for class Rectangle
    IV: length and width
    PC: for length and width 
    IM: show()
        area()  */

import java.io.*;
class Rectangle
{
private double length;
private double width;

public Rectangle(double le, double wi)
{
this.length = le;
this.width = wi;
}

public void show()
{
System.out.println(length +" "+ width);
}

public void area()
{
double ans = length * width;
System.out.println("area = " + ans);
System.out.printf("area = %.2f",ans);
}
}

class RectangleTest
{
public static void main(String args[]) throws IOException
{
double le = 0.00, wi = 0.00;
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println(" enter length");
le = Double.parseDouble(br.readLine());
System.out.println("enter width");
wi = Double.parseDouble(br.readLine());

Rectangle r1 = new Rectangle(le,wi);
r1.show();
r1.area();
}
}