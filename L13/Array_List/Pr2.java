// wajp to find sum and avg of marks

import java.util.ArrayList;
import java.io.Console;
class Pr2{
public static void main(String args[]) {
Console c = System.console();
ArrayList<Integer> marks = new ArrayList<Integer>();

String reply = c.readLine("do u want to add some more marks in the list y/n");
while(reply.equals("y")) {
int m = Integer.parseInt(c.readLine("Enter the Marks"));

marks.add(m);  //AutoBoxing take place
// beacuse marks is Integer(Wrapper) and m is int(primitive)
reply = c.readLine("do u want to add some more marks in the list y/n");
}
System.out.println(marks);

int sum = 0;
for(Integer m : marks)
	sum+=m;
double avg = sum * 1.0 / marks.size();
System.out.println("Sum = "  + sum);
System.out.println("Avg = " + avg);
}
}


