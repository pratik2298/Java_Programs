import java.io.Console;
import java.util.*;
class Pr7 {
public static void main(String args[]) {
	Console c = System.console();
	TreeMap<String, Integer> corona_counter = new TreeMap<String, Integer>();
	
while(true) {
		int op = Integer.parseInt(c.readLine("1. add station,  2. view station,  3. remove station,  4. exit  "));
		if(op == 1)
		{
			Integer count = Integer.parseInt(c.readLine("Enter the count  "));
			String name = c.readLine("Enter the Station Name");
			corona_counter.put(name, count);
		}
		else if(op == 2) 
		{
		
				System.out.println(corona_counter);
		}
		else if(op == 3)
		{
		
			Integer count = Integer.parseInt(c.readLine("Enter the count  "));
			String name = c.readLine("Enter the Station Name");
			corona_counter.remove(name, count);
		}
		else if(op == 4)
		{
			break;
		}
		else
		{
			System.out.println("Invalid Option");
		}
}
}
}
			