/* wajp to read rating and give the feedback
5,4 ---> Excellent
3,2 ---> ok
1 ---> poor */

class Pr5
{
public static void main(String args[])
{
int rating = Integer.parseInt(args[0]);
switch(rating)
{
case 5: System.out.println("Excellent");  break;
case 4: System.out.println("Excellent");  break;
case 3: System.out.println("Ok");         break;
case 2: System.out.println("Ok");         break;
case 1: System.out.println("Poor");       break;
default: System.out.println("invalid rating");
}
}
}
		