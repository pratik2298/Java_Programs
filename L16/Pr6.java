import java.io.*;
import java.util.*;

class Student implements Serializable {
private int rno;
private String name;

public Student(int rno, String name) {
	this.rno = rno;
	this.name = name;
}

public String toString() {
	return "Roll no :  " + rno    + "Name   :  "  + name;
}
}

class Pr6 {
public static void main(String args[]) throws Exception {
	Console c = System.console();
	ArrayList<Student> stu = new ArrayList<Student>();
	String fileName = "Student_ka_data.txt";
	
File f1 = new File(fileName);
if(f1.exists())
	{
		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		stu = (ArrayList<Student>)ois.readObject();
		ois.close();
}

while(true) {
	int op = Integer.parseInt(c.readLine("1.add  2.view  3.exit"));
	if(op == 1)
		{
			int rno = Integer.parseInt(c.readLine("Enter the roll no "));
			String name = c.readLine("Enter the name");
			Student s = new Student(rno, name);
			stu.add(s);
		}
	else if(op == 2)
		{
			for(Student m : stu)
				System.out.println(m);
		}
	else if(op == 3)
		{
			File f = new File(fileName);
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(stu);
			oos.close();
			break;
		}
	else
		System.out.println(" Invalid Option");
		
}
}
}