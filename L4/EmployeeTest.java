/* create calss employee with full specification 
static variable:- count = 0 //---private 
instance varaible:- eid,ename,esalary //---private 

static method:- showCount() //---public
Instant method:- setData(eid,ename,esalary)  //---public
Instant method:- showData()  //---public
*/

class Employee
{
static int count = 0;
private int eid;
private String ename;
private int esalary;

static void showCount()
{
System.out.println(" the count is " +count);
}

public Employee(int eid, String ename, int esalary)
{
this.eid = eid;
this.ename = ename;
this. esalary = esalary;
count++;
}

/*void setData(int eid, String ename, int esalary)
{
this.eid = eid;
this.ename = ename;
this. esalary = esalary;
count++;
}
*/

void showData()
{
System.out.println(eid + " " + ename + " " + esalary);
}
}

class EmployeeTest
{
public static void main(String args[])
{
Employee e1 = new Employee(101, "pratik", 50000);
e1.showData();
Employee e2 = new Employee(102, "Ron", 70000);
e2.showData();
Employee e3 = new Employee(103, "jim", 90000);
e3.showData();

Employee.showCount();
}
}