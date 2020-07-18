/* waoojp for class Student:	IV: rno, name, marks
				SV: college_name
				IM: setData()
				    showData()
				    findGrade()  -> m >70 --> A else B
				SM: showCollege()
*/

class Student
{
	private int rno=0;
	private String name = "";
	private int marks = 0;
	private static String college_name="IIT Mumbai";

	public void setData(int r, String n, int m)
	{
		rno = r;
		name = n;
		marks = m;
	}

	public void showData()
	{
		System.out.println("Roll No : " + rno + " Name  : " + name + " Marks : " + marks);
	
 	}
	public void findGrade()
	{
		if(marks > 70)
			System.out.println(" Grade A ");
		else
			System.out.println(" Grade B ");
	}
	
	public static void showCollege()
	{
		System.out.println("college name = " + Student.college_name);
	}
}


class StudentTest
{
public static void main(String args[])
{
Student s1 = new Student();
s1.setData(10, "Amit", 99);
s1.showData();
s1.findGrade();
s1.showCollege();


}

}









