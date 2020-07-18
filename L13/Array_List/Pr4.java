// wajp to find even & odd data

import java.util.*;
import java.io.Console;
class Pr4 {
public static void main(String args[]) {
Console c = System.console();
ArrayList<Integer> data = new ArrayList<Integer>();
ArrayList<Integer> even_data = new ArrayList<Integer>();
ArrayList<Integer> odd_data = new ArrayList<Integer>();

String reply = c.readLine("do u want to add some more marks in the list y/n");
while(reply.equals("y")) {
int m = Integer.parseInt(c.readLine("Enter the Marks"));

 //AutoBoxing take place
data.add(m); 
// beacuse marks is Integer(Wrapper) and m is int(primitive)

reply = c.readLine("do u want to add some more marks in the list y/n");
}

for(Integer d : data)
{
	if(d % 2 == 0)
		even_data.add(d);
	else
		odd_data.add(d);
}
Collections.sort(even_data);
System.out.println("Even Data  "  + even_data);
Collections.sort(odd_data, Collections.reverseOrder());
System.out.println("Odd Data  "  + odd_data);
}
}




