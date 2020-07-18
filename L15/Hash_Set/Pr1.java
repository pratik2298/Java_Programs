import java.util.*;
class Employee {
int eid;
String ename;
double esalary;

Employee(int eid, String ename, double esalary ) {
this.eid = eid;
this.ename = ename;
this.esalary = esalary;
}

public String toString(){
return "eid  =  " + eid + " ename = " + ename + " esalary  = " + esalary;
}

public boolean equals(Object o) {
	Employee e = (Employee)o;
	return eid == e.eid;
}

public int hashCode() {
	return 4;
}
}

class Pr1 {
public static void main(String args[]) {
Employee e1 = new Employee(10, "Pratik", 60000);
Employee e2 = new Employee(40, "Mark", 430000);
Employee e3 = new Employee(20, "Ron", 60000);
Employee e4 = new Employee(30, "Sam", 10000);

HashSet<Employee> emp = new HashSet<>();
emp.add(e1);
emp.add(e2);
emp.add(e3);
emp.add(e4);

for(Employee e : emp)
	System.out.println(e);
}
}
