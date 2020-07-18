// wajp to delete  directory -- directory name would be provided by the user

import java.io.*;
class Pr9
{
public static void main(String args[]) {
	Console c = System.console();
	String dirname = c.readLine("Enter the dirname to create ");
	File f = new File(dirname);
	if(f.exists())

{
		f.delete();
		System.out.println(dirname  +  "deleted");
}
 		else{
		System.out.println(dirname + "does not exists");
}
}
}	