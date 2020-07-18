import java.util.*;
import java.io.Console;

class Pr5 {
public static void main(String args[]) {
Console c = System.console();
LinkedHashSet<String> team_name = new LinkedHashSet<String>();

while(true) {
	int op = Integer.parseInt(c.readLine("1. add team,  2. view team,  3.  remove team,  4. exit  "));
	if(op == 1)
		{
			String name = c.readLine("Enter Team Name");
			boolean b = team_name.add(name);
			if(b)
			System.out.println(name + " added ");
			else
			System.out.println(name + " already exists ");
		}

	else if(op == 2) 
		{
			for(String j : team_name)
				System.out.println(j);
		}

	else if(op == 3)
		{
			String name = c.readLine("Enter Team Name to remove");
			boolean b = team_name.remove(name);
			if(b)
			System.out.println(name + " removed ");
			else
			System.out.println(name + " does not exists ");
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
			
			