// wajp to read a StringBuffer 
// and count no of vowels & consonants


import java.io.Console;
class Pr2
{
public static void main(String args[])
{
Console c = System.console();
String s = c.readLine("enter a string ");
StringBuffer sb = new StringBuffer(s);
int vc = 0,cc = 0;
for(int i = 0;i < sb.length();i++)
{
	char ch = sb.charAt(i);
	if (Character.isLetter(ch))
	{
	switch(ch)
	{
	case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> vc++;
	default -> cc++;
	}
	}
}  // end of for()
System.out.println(vc + " " +cc);
} // end of main()
} // end of class

