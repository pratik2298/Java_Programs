interface MyMath
{
double squareRoot(double d);
}

class Pr4
{
public static void main(String args[])
{
MyMath m1 = (double d) -> { return Math.sqrt(d); };
System.out.println(m1.squareRoot(49));

MyMath m2 = (d) -> { return Math.sqrt(d); };
System.out.println(m2.squareRoot(49));

MyMath m3 = (d) -> Math.sqrt(d); 
System.out.println(m3.squareRoot(49));

MyMath m4 = d -> Math.sqrt(d); 
System.out.println(m4.squareRoot(49));
}
};







