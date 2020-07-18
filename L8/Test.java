class Employee{
private int id;
private String name;
private double salary;

public Employee(int id, String name, double salary)
{
this.id = id;
this.name = name;
this.salary = salary;
}
class SalesPerson extends Employee
{
private double comm;
public SalesPerson(int id, String name, double salary,double comm)
{
super(id, name, salary);
this.comm = comm;
}
}
public void showData()
{
// super.showData();
System.out.println("comm = " + comm);
}
}

class Test
{
public static void main(String args[])
{
SalesPerson sp = new SalesPerson(10,"Amit",5000,9000);
sp.showData();
}
}

