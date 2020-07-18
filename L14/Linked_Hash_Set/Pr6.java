import java.io.Console;
import java.util.*;
class Student {
int rollno;
String name;

Student(int rollno, String name) {
	this.rollno = rollno;
	this.name = name;
}

public String toString() {
	return " rno =  "  + rollno + "  name =  "  + name;
}

public boolean equals(Object o)
{
	Student s = (Student)o;
	return rollno == s.rollno;
}
public int hashCode()
{
	return 10;
}
}

class Pr6 {
public static void main(String args[]) {
	Console c = System.console();
	LinkedHashSet<Student> stu = new LinkedHashSet<>();
	
while(true) {
		int op = Integer.parseInt(c.readLine("1. add student,  2. view student,  3. remove student,  4. exit  "));
		if(op == 1)
		{
			int rollno = Integer.parseInt(c.readLine("Enter the rollno  "));
			String name = c.readLine("Enter the Name");
			Student s = new Student(rollno, name);
			boolean b = stu.add(s);
			if(b) System.out.println(rollno + "added");
			else
			System.out.println(rollno + "already exists");
		}
		else if(op == 2) 
		{
			for(Student j : stu)
				System.out.println(j);
		}
		else if(op == 3)
		{
		
			int rollno = Integer.parseInt(c.readLine("Enter the rollno  "));
			String name = c.readLine("Enter the Name");
			Student s = new Student(rollno, name);
			boolean b = stu.remove(s);
			if(b) System.out.println(rollno + "deleted");
			else
			System.out.println(rollno + "does not exists");
		}
		else if(op == 4)
		{
			break;
		}
		else
		{
			System.out.println("Invalid Option");
		}
}
}
}
			