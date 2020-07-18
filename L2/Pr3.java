/* wajp to read day of the month and display the parking side
even --> right side odd --> left side */

class Pr3
{
public static void main(String args[])
{
int day = Integer.parseInt(args[0]);
if (day < 1 || day > 31)
	System.out.println("invalid day");
else
{
	if (day % 2 == 0)
		System.out.println("Right Side");
	else
		System.out.println("Left side");
}
}
}