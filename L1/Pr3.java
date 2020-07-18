// wajp to read two integer n1 and n2 
// display them before exchange and
// display them after exchange
// n1=20 n2=10
// n1=10 n2=20

class Pr3
{
public static void main(String []args)
{
int n1,n2,n3;
n1 = Integer.parseInt(args[0]);
n2 = Integer.parseInt(args[1]);
System.out.println("Before Exchange n1=" + n1 + " n2=" +n2); // Numbers before swapping
// Swapping Logic
n3 = n1; // assigning n1 value into n3 and n3 is used as temp variable  
n1 = n2; // since n1 is empty now n2 stores it value into n1
n2 = n3; // now n2 is empty so n3 stores it value into n2

System.out.println("After Exchange=" + n1  + " n2=" +n2); //Numbers after swapping
}
}