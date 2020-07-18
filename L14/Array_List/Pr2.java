// wajp to create a ArrayList of Student

import java.util.*;
import java.io.Console;

class Student {
	int rno;
	String name;
	
	public Student() {
	this.rno = rno;
	this.name = name;
}
	public String toString() {
	return " rno = " + rno + " name = " + name;
}
}

class Pr2 {
public static void main(String args[]) {
Console c = System.console();

ArrayList<Student> stu = new ArrayList<>();
String r = c.readLine(" Do u want to enter a Student Object  y / n  :  ");

while(r.equals("y")) {
int rno = Integer.parseInt(c.readLine("Enter the rno : "));
String name = c.readLine("Enter the Name : ");

Student s = new Student(rno, name);
stu.add(s);
r = c.readLine(" Do u want to enter a Student Object  y / n  :  ");
}

for(Student k : stu)
	System.out.println(k);
}
}
