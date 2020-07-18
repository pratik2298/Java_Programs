import java.io.*;
class Student {
private int rno;
private String name;

public Student(int rno, String name) {
this.rno = rno;
this.name = name;
}

public void talk() {
System.out.println("my rno is " + rno);
System.out.println("my name is " + name);
}
}

class StudentTest {
public static void main(String args[])
{
Console c = System.console();
int num = Integer.parseInt(c.readLine("Enter the number of student"));
Student[] stu = new Student[num];
for(int i = 0; i < stu.length; i++)
{
int rno = Integer.parseInt(c.readLine("enter the roll no"));
String name = c.readLine("enter the name");
stu[i] = new Student(rno, name);
}
for(Student s : stu)
s.talk();
}
}