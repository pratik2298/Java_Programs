/* wajp to read a string & find if its pallindrome */

import java.io.Console;
class Pr7 
{
public static void main(String args[])
{
Console c = System.console();
String str = c.readLine("enter a string");

String nstr = "";
for(int i = 0; i<str.length();i++)   
{
char ch = str.charAt(i);

 /* the (nstr = ch + nstr) line reverse the string 
    for eg:- str = LOOP then its reverse
    will be POOL which will be stored in nstr */

nstr = ch + nstr;                  
}
// System.out.println(nstr + "  ");
if (str.equals(nstr))
System.out.println("yes");
else
System.out.println("no");
}
}