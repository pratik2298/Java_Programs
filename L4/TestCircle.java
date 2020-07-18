/* waoojp for class Circle:	IV: radius
				IM: setData(), showData(), area(), circumference()
*/

class Circle
{
	private double radius;

	public void setData(double radius)
	{
		this.radius = radius;
	}

	public void showData()
	{
		System.out.println(" Radius " + radius);
	}

	public double area()
	{	
		double areaCir = 0.0;
		areaCir = 3.14 * radius * radius;
		return areaCir;
	}

	public double circumference()
	{
 		double circum = 0.0;
		circum = 2 * 3.14 * radius;
		return circum;
	}

}

class TestCircle
{
public static void main(String args[])
{
Circle c = new Circle();
c.setData(Double.parseDouble(args[0]));
c.showData();
double a1 = c.area();	
System.out.println("area = " + a1);

double a2 = c.circumference();
System.out.println("circum = " + a2);

}
}









