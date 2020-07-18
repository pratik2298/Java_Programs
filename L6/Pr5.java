/* wajp to read string & count lowercase,uppercase,digit and othet characters */

import java.io.Console;
class Pr5
{
public static void main(String args[])
{
Console c = System.console();
String str = c.readLine(" enter a string");
int lc=0, uc=0, dc=0, oc=0;

for(int i=0;i<str.length();i++)
{
char ch = str.charAt(i);
if (ch >= 'a' && ch <= 'z')
lc++;
else if (ch >= 'A' && ch <= 'Z')
uc++;
else if (ch >= '0' && ch <= '9')
dc++;
else
oc++;
}
System.out.println(lc + "" + uc + "" + dc + "" + oc);
}
}
