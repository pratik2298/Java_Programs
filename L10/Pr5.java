// wajp to read a double number from CLA and find the sqaure root

class Pr5 {
public static void main(String args[])
{
System.out.println("welcome to my app");
// try block

try
{
double num = Double.parseDouble(args[0]);
if (num < 0)
	throw new Exception(" -ve number not allowed");
double res = Math.sqrt(num);
System.out.println("res = " + res);
}


// catch block

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(" u need to pass atleast one argument");
}

catch(NumberFormatException e)
{
System.out.println(" u need to pass number");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Good Bye");
}

/* multicatch block

catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
System.out.println(" u need to pass atleast one number");
}  
*/

}


