// wajp to find positive number, negative number, and zeros from the list

import java.util.ArrayList;
import java.io.Console;
class Pr5 {
public static void main(String args[]) {
Console c = System.console();
ArrayList<Integer> data = new ArrayList<Integer>();
String reply = c.readLine("Enter the data ?  y/n  =  ");
while(reply.equals("y"))
{
int d = Integer.parseInt(c.readLine("Enter the Marks :"));
data.add(d);
reply = c.readLine("Do u want to Enter more data ?  y/n  =  ");
}

int pc = 0, nc = 0, zn = 0;
for(Integer x : data)
	{
		if(x < 0)	
			nc++;
		else if(x > 0)
			pc++;
		else
			zn++;
	}
System.out.print("Positive : "  + pc   + "  Negative  :  "  + nc  + " Zeros   : "  + zn);
}
}





