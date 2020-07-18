import java.io.Console;
import java.util.Arrays;

class Pr10{
public static void main(String args[])
{
Console c = System.console();
String str = c.readLine(" enter the String ");
System.out.println(str + " ");

/* this line -->(char ch[] = str.toCharArray())
   covert each string into character array */ 

char ch[] = str.toCharArray();
Arrays.sort(ch);
str = new String(ch);
System.out.println(str + " ");
}
}

