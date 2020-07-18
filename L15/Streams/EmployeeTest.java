import java.util.*;
import java.util.stream.*;

class Employee implements Comparable<Employee> {
int eid;
String ename;
double esalary;
String elocation;

Employee(int eid, String ename, double esalary, String elocation) {
this.eid = eid;
this.ename = ename;
this.esalary = esalary;
this.elocation = elocation;
}

public String toString() {
	String msg = eid + " " + ename + " " + esalary + " " + elocation;
	return msg;
}

public int compareTo(Employee e) {
	return eid - e.eid;
}
}

class EmployeeTest {
public static void main(String args[]) {
Employee e1 = new Employee(10, "Amit", 5000, "Mumbai");
Employee e2 = new Employee(20, "Mark", 5000, "Thane");
Employee e3 = new Employee(50, "Ron", 5000, "Mumbai");
Employee e4 = new Employee(70, "Kevin", 5000, "Thane");
Employee e5 = new Employee(30, "Tom", 5000, "Mumbai");
Employee e6 = new Employee(40, "Pam", 5000, "Mumbai");
Employee e7 = new Employee(60, "Andy", 5000, "Thane");
Employee e8 = new Employee(90, "Ryan", 5000, "Mumbai");
Employee e9 = new Employee(80, "Darryl", 5000, "Mumbai");
Employee e10 = new Employee(100, "Creed", 5000, "Thane");

ArrayList<Employee> emp = new ArrayList<>();
emp.add(e1);
emp.add(e2);
emp.add(e3);
emp.add(e4);
emp.add(e5);
emp.add(e6);
emp.add(e7);
emp.add(e8);
emp.add(e9);
emp.add(e10);

System.out.println("-------------------------------------------------------");
System.out.println("1st Output");
System.out.println("-------------------------------------------------------");
Stream<Employee> s1 = emp.stream();
s1.forEach(e -> System.out.println(e));


System.out.println("-------------------------------------------------------");
System.out.println("2nd Output");
System.out.println("-------------------------------------------------------");
Stream<Employee> s2 = emp.stream();
s2.sorted().forEach(e -> System.out.println(e));


System.out.println("-------------------------------------------------------");
System.out.println("3rd Output");
System.out.println("-------------------------------------------------------");
Stream<Employee> s3 = emp.stream();
s3.filter(v -> v.elocation.equals("mumbai")).forEach(e->System.out.println(e));


System.out.println("-------------------------------------------------------");
System.out.println("4th Output");
System.out.println("-------------------------------------------------------");
Stream<Employee> s4 = emp.stream();
s4.filter(v -> v.esalary > 4000).forEach(e->System.out.println(e)); 


System.out.println("-------------------------------------------------------");
System.out.println("5th Output");
System.out.println("-------------------------------------------------------");
Stream<Employee> s5 = emp.stream();
s5.filter(v -> v.elocation.equals("Mumbai")).filter(w -> w.esalary > 4000).forEach(e -> System.out.println(e));


System.out.println("-------------------------------------------------------");
System.out.println("6th Output");
System.out.println("-------------------------------------------------------");
Stream<Employee> s6 = emp.stream();
double salary = s6.map(e -> e.esalary).reduce(0.0, (a, b) -> a + b);
System.out.println(salary);
}
}













