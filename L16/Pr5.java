// wajp to copy an existing pdf

import java.io.*;
class Pr5 {
public static void main(String args[]) throws Exception {
File src_file = new File("JS_ Accessors");
FileInputStream fis = new FileInputStream(src_file);
BufferedInputStream bis = new BufferedInputStream(fis);

File dest_file = new File("JS_ Accessors_copy");
FileOutputStream fos = new FileOutputStream(dest_file, true);
BufferedOutputStream bos = new BufferedOutputStream(fos);

int i = 0;
while(( i = bis.read()) != -1)
		bos.write(i);
bis.close();
bos.close();
}
}

