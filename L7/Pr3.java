// wajp to read a StringBuffer & remove vowels from it
// ip:- kamal classes
// op:- kml clsss


import java.io.Console;
class Pr3
{
public static void main(String args[])
{
Console c = System.console();
String s = c.readLine("enter a string ");
StringBuffer sb = new StringBuffer(s);
System.out.println(sb);
for(int i = 0;i < sb.length();i++)
{
	char ch = sb.charAt(i);
	if (Character.isLetter(ch))
	{
	switch(ch)
	{
	case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> sb.replace(i,i+1,"");
	
	}
	}
}  // end of for()
System.out.println(sb);
} // end of main()
} // end of class

