import java.io.Console;
import java.util.Scanner;
class Pr6
{
public static void main(String args[])
{
Console c = System.console();
String s = c.readLine(" enter a string");
Scanner scan = new Scanner(s);
scan.useDelimiter(",");

int sum = 0;
while(scan.hasNext())
	sum = sum + scan.nextInt();
System.out.println("sum = " + sum);
}
}
