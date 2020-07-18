//wajp to read user name and password


import java.io.*;

class Login
{
public static void main(String args[]) throws IOException
{
String username = ""; 
String password = " ";
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("enter username" );
username = br.readLine();

System.out.println(" enter password ");
password = br.readLine();

if( (username.equals("kamal") ) && password.equals("classes") ) 
System.out.println("Success");
else
System.out.println("Failure");
}
}