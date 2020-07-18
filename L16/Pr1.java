// wajp to create a directory and file inside a directory

import java.io.*;
class Pr1 {
public static void main(String args[]) throws Exception {
	Console c = System.console();
	String dirName = c.readLine("Enter a directory name to create");
	File dir = new File(dirName);
	if(dir.exists())
		System.out.println(dirName + "already exists");
	else
		{
		dir.mkdir();
		System.out.println(dirName + "Created");
		}

	String fileName = c.readLine("Enter a File name to create");
	File file = new File(dir, fileName);
	if(file.exists())
		System.out.println(fileName + "already exists");
	else
		{
		file.createNewFile();
		System.out.println(fileName + "Created");
		}
}
}

