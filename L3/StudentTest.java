// wajp to class student

class Student
{
private int rno;         //----- Instance_Variable
private String name;     // -----Instance_Variable
private int marks;       // -----Instance_Variable

public void setData(int r, String n, int m)   //------Instance_Method
{
rno = r;     //----"r" is a local variable
name = n;    //----"n" is a local variable
marks = m;   //----"m" is a local variable
}

public void showData()   //------Instance_Method
{
System.out.println("rn0 =" +rno + "  " + "name =" + name + "   " + "marks =" +marks);
}
public void showGrade()  //------Instance_Method
{
if (marks > 70)
{
System.out.println("Grade a");
}
else
{
System.out.println("Grade B");
}
}
}

class StudentTest
{
public static void main(String args[])
{
Student s1 = new Student();  //-----Creating Object of Student
s1.showData();
// s1.setData(10, "amit", 40);
s1.setData(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2]));
s1.showData();
s1.showGrade();
}
}
