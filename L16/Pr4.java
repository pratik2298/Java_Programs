// wajp to copy an existing text file

import java.io.*;
class Pr4 {
public static void main(String args[]) throws Exception {
File src_file = new File("Pratik.txt");
FileReader fr = new FileReader(src_file);
BufferedReader br  = new BufferedReader(fr);


File dest_file = new File("Pratik_copy.txt");
FileWriter fw = new FileWriter(dest_file);
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter pw = new PrintWriter(bw);

String line = "";
while((line = br.readLine()) != null)
	pw.println(line);
br.close();
pw.close();
}
}