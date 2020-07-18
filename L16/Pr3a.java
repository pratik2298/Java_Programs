// wajp to read data into an existing file

import java.io.*;
class Pr3a {
public static void main(String args[]) throws Exception {
Console c = System.console();
String fileName = c.readLine("Enter a filename to write a data into ");
File f = new File(fileName);
if(f.exists())
	{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = " ";
		line = br.readLine();
		while( line  != null){
			System.out.println(line);
			line = br.readLine();
		}
			br.close();
			
	}
else  
	{
		System.out.println(fileName +" does not exist");
}
}
}