import java.util.*;
import java.io.*;
class Student implements Comparable<Student>
{
	int rno;
	String name;
	
	Student(int rno, String name) {
		this.rno = rno;
		this.name = name;
}
	public String toString() {
		return "rno = " + rno + "name = " + name;
}

public int compareTo(Student s) {
		return rno - s.rno;
}
}

class Pr3 {
public static void main(String args[]) {
Console c  = System.console();
ArrayList<Student> stu = new ArrayList<>();
Student s1 = new Student(10, "amit");
stu.add(s1); 
Student s2 = new Student(40, "ruit");
stu.add(s2); 
Student s3 = new Student(20, "lumit");
stu.add(s3); 
Student s4 = new Student(30, "bumit");
stu.add(s4); 

System.out.println("Original");
for(Student k : stu)
System.out.println(k);

Collections.sort(stu);
System.out.println("Modified");
for(Student k : stu)
System.out.println(k);
}
}
