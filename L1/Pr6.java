/* wajp to find the area of circle - radius from CLA */
 
class Pr6
{
public static void main(String []args)
{
final double PI = 3.14159;     /* PI is a constant and every constant variable name should be written in upper case
                                  and it never changed once it define because of "final" keyword */

double radius = Double.parseDouble(args[0]);  // taking radius for calculating the area of circle
double area = PI * radius * radius;    // formula for calculating the area of circle
 
System.out.println("Area of circle is =" + area);
System.out.printf("area=%.3f\n", area);
}
}

