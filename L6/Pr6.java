/* wajp to read string & count lowercase,uppercase,digit and othet characters */

import java.io.Console;
class Pr6
{
public static void main(String args[])
{
Console c = System.console();
String str = c.readLine(" enter a string");
int lc=0, uc=0, dc=0, oc=0;

for(int i=0;i<str.length();i++)
{
char ch = str.charAt(i);
if (Character.isLowerCase(ch))   lc++;
else if (Character.isUpperCase(ch))  uc++;
else if (Character.isDigit(ch))  dc++;
else
oc++;
}
System.out.println(lc + "  " + uc + "  " + dc + "  " + oc);
}
}
