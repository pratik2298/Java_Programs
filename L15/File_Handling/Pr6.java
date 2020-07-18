// wajp to create a file -- file name would be provided by the user

import java.io.*;
class Pr6
{
public static void main(String args[]) {
	Console c = System.console();
	String filename = c.readLine("Enter the file name to create ");
	File f = new File(filename);
	if(f.exists())
		System.out.println(filename  +  "already exists");
	else
		try {
		
		f.createNewFile();
		System.out.println(filename  +  "created");
}
 		catch(Exception e) {
		System.out.println("Issue " + e);
}
}
}	