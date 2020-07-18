import java.io.Console;
import java.util.Arrays;

class Pr11{
public static void main(String args[])
{
Console c = System.console();
String str1 = c.readLine(" enter the String ");
System.out.println(str1 + " ");

char ch1[] = str1.toCharArray();
Arrays.sort(ch1);
str1 = new String(ch1);
System.out.println(str1 + " ");

String str2 = c.readLine(" enter the String ");
System.out.println(str2 + " ");

char ch2[] = str2.toCharArray();
Arrays.sort(ch2);
str2 = new String(ch2);
System.out.println(str2 + " ");

if (str1.equals(str2))
	{
	  System.out.println(" yes ");
	}
else
	{
	  System.out.println(" no ");
	}
	  
}
}

