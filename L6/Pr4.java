import java.io.Console;
class Pr4
{
public static void main(String args[])
{
Console c = System.console();
String str = c.readLine("enter the String ");

System.out.println(str);

for(int i=0; i<str.length();i++)
System.out.println(i + " " + str.charAt(i));
}
}