// wajp to create a directory -- directory name would be provided by the user

import java.io.*;
class Pr8
{
public static void main(String args[]) {
	Console c = System.console();
	String dirname = c.readLine("Enter the directory to create ");
	File f = new File(dirname);
	if(f.exists())
		System.out.println(dirname  +  "already exists");
	else
		{
		f.mkdir();
		System.out.println(dirname + "created");

}
}
}	