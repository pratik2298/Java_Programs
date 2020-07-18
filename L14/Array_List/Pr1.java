/* wajp to read list of names and create a neww
 list containing only unique names */

import java.util.*;
import java.io.Console;
class Pr1 {
public static void main(String args[]) {
Console c = System.console();
ArrayList<String> org_names = new ArrayList<>(); 
ArrayList<String> new_names = new ArrayList<>();

String r = c.readLine("Do u want add some name in list  y / n  :");
while(r.equals("y")) {
	String name = c.readLine("Enter the names");
	org_names.add(name);
	r = c.readLine("Do u want add some name in list  y / n  :");
}

for(String d : org_names)
{
	if(! new_names.contains(d))
		new_names.add(d);
}
System.out.println(org_names);
System.out.println(new_names);
}
}
