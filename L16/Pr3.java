// wajp to read data into an existing file

import java.io.*;
class Pr3 {
public static void main(String args[]) throws Exception {
Console c = System.console();
String fileName = c.readLine("Enter a filename to write a data into ");
File f = new File(fileName);
if(f.exists())
	{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = " ";
		while( ( line = br.readLine()) != null)
			System.out.println(line);
		br.close();
	}
else  
	{
		System.out.println(fileName +" does not exist");
}
}
}