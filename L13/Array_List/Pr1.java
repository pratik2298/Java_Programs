// wajp to read list of marks from the user and print on the screen 

import java.util.ArrayList;
import java.io.Console;
class Pr1 {
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
}
}

