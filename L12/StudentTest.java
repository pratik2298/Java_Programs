class Student {
int rno;
String name;

Student(int rno, String name)
{
this.rno = rno;
this.name = name;
}

public String toString()
{
return "rno = " + rno + " name " + name;
}


// Deleting the unreachable object which is qualify for garbage collection
public void finalize()
{
System.out.println("Deleted");
}
}

class StudentTest {
public static void main(String args[])
{
Student s1 = new Student(10, "Amit"); 
System.out.println(s1);
Student s2 = new Student(20, "Rumit");
System.out.println(s2);
Student s3 = new Student(30, "Mumit");
System.out.println(s3);

s2 = s1;
s3 = s1;

// requesting for garbage collection
System.gc();
}
}