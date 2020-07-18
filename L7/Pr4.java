// wajp to read sb and find if its pallindrome

import java.io.Console;
class Pr4
{
public static void main(String args[])
{
Console c = System.console();
String s = c.readLine("enter a string ");
StringBuffer sb = new StringBuffer(s);
sb.reverse();

if(s.equals(sb.toString()))
	System.out.println("yes it is");
else
	System.out.println("no it is");
}
}