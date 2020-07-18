// wajp to read two integer n1 and n2 
// display them before exchange and
// display them after exchange 
// without using third variable
// n1=20 n2=10
// n1=10 n2=20

class Pr4
{
public static void main(String []args)
{
int n1,n2;
n1 = Integer.parseInt(args[0]);
n2 = Integer.parseInt(args[1]);
System.out.println("Before Swapping n1 = " + n1 + " n2 = " + n2);

//Swapping Logic without using third varaible

n1 = n1+n2;
n2 = n1-n2;
n1 = n1-n2;
 
System.out.println("After Swapping n1 = " + n1 + " n2 = " + n2);
}
}
