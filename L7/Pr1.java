// wajp to read a StringBuffer from user
// and print on the screen


import java.io.Console;
class Pr1
{
public static void main(String args[])
{
Console c = System.console();
String s = c.readLine("enter a string ");
StringBuffer sb = new StringBuffer(s);

System.out.println(sb);   // method 1

for(int i=0; i<sb.length();i++)     // method 2
	System.out.print(sb.charAt(i));
System.out.println();

}
}