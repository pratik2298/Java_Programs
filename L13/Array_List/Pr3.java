// wajp to read list of marks from user and print the min and max marks

import java.util.ArrayList;
import java.util.Collections;
import java.io.Console;
class Pr3 {
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

Collections.sort(marks);
int max = marks.get(marks.size() - 1);
int min = marks.get(0);

System.out.println("Minimum  "  + min);
System.out.println("Maximun  "  + max);  
}
}
