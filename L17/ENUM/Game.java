import java.io.*;
import java.nio.file.*;

enum Selection  {
ROCK, PAPER, SCISSOR;
}

class Game {
public static void main(String args[]) {
Console c = System.console();
Selection comp, user;
int nt = 0, nu = 0, nc = 0, ng=0, count=1;

ng = Integer.parseInt(c.readLine("enter number of games in the tournament "));

while (count++ <= ng)
{
int r = (int)(Math.random() * 3);
if (r == 0)		comp = Selection.ROCK;
else if (r == 1)	comp = Selection.PAPER;
else			comp = Selection.SCISSOR;

int op = Integer.parseInt(c.readLine("1 ROCK, 2 PAPER and 3 SCISSOR "));
if (op == 1)		user = Selection.ROCK;
else if (op == 2)	user = Selection.PAPER;
else			user = Selection.SCISSOR;	

System.out.println(comp + "     "  + user);

if (user==Selection.ROCK && comp==Selection.ROCK)		nt++;
else if (user==Selection.PAPER && comp==Selection.PAPER)	nt++;
else if (user==Selection.SCISSOR && comp==Selection.SCISSOR)	nt++;
else if (user==Selection.ROCK && comp==Selection.SCISSOR)		nu++;
else if (user==Selection.PAPER && comp==Selection.ROCK)		nu++;
else if (user==Selection.SCISSOR && comp==Selection.PAPER)		nu++;
else if (comp==Selection.ROCK && user==Selection.SCISSOR)		nc++;
else if (comp==Selection.PAPER && user==Selection.ROCK)		nc++;
else if (comp==Selection.SCISSOR && user==Selection.PAPER)		nc++;

} // end of while loop

System.out.println("ties " + nt + " user " + nu + " comp " + nc);

// write code to write the score in a files called "gamescore.txt"

String content = new java.util.Date() + " Ties "  +  nt  + " User " +  " Comp " +  nc + "\n";
Path p = Paths.get("gamescore.txt");
try {
Files.writeString(p, content, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
}
catch(IOException e) {
	System.out.println(" issues "  + e);
}
}
} 
















