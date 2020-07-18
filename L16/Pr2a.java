// wajp to write data into an existing file

import java.io.*;
class Pr2a {
public static void main(String args[]) throws Exception {
Console c = System.console();
String fileName = c.readLine("Enter a filename to write a data into ");
File f = new File(fileName);
if(f.exists())
	{
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		String data = c.readLine(" Enter the data ");
		bw.write(data);     //bw.append(data)
		bw.close();
	}
else  
	{
		System.out.println(fileName +" does not exist");
}
}
}