// Pr5:- i/p "20,30,40"
//         o/p 90
// by split() and scanner method

import java.io.Console;
class Pr5
{
public static void main(String args[])
{
Console c = System.console();
String s = c.readLine(" enter a string");
String data[] = s.split(",");

int sum = 0;
for(String d : data)
	sum = sum + Integer.parseInt(d);
System.out.println("sum = " + sum);
}
}
