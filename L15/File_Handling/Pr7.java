// wajp to delete  a file -- file name would be provided by the user

import java.io.*;
class Pr7
{
public static void main(String args[]) {
	Console c = System.console();
	String filename = c.readLine("Enter the file name to create ");
	File f = new File(filename);
	if(f.exists())

{
		f.delete();
		System.out.println(filename  +  "deleted");
}
 		else{
		System.out.println(filename + "does not exists");
}
}
}	