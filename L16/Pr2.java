// wajp to write data into an existing file

import java.io.*;
class Pr2 {
public static void main(String args[]) throws Exception {
Console c = System.console();
String fileName = c.readLine("Enter a filename to write a data into ");
File f = new File(fileName);
if(f.exists())
	{
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		String data = c.readLine(" Enter the data ");
		pw.println(data);
		pw.close();
	}
else  
	{
		System.out.println(fileName +" does not exist");
}
}
}