/* wajp to read length and width and find the display area of rect*/


class Pr5
{
public static void main(String args[])
{
double length,width,area;
length = Double.parseDouble(args[0]);
width = Double.parseDouble(args[1]);
area = length*width;
System.out.println("area=" + area);
System.out.printf("area=%.2f",area);
}
}