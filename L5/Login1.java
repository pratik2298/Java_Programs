import java.io.*;		
class Login1
{
public static void main(String args[])
{
String username;
char[] password;
Console c = System.console();

username = c.readLine(" enter username");
password = c.readPassword("enter password");


if ( (username.equals("kamal") ) && (new String(password).equals("classes") ) )
System.out.println("_________SUCCESS___________");
else
System.out.println("_________FAILURE___________");
}
}
