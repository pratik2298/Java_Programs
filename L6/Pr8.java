import java.io.Console;
import java.util.Scanner;

class Pr8{
public static void main(String args[])
{
Console c = System.console();
String s = c.readLine("enter the string");
Scanner scan = new Scanner(s);
scan.useDelimiter(",");

while(scan.hasNext())
  {
    String what = scan.next();
    int howmany = scan.nextInt();
    for(int j=1; j<=howmany; j++)
      System.out.println(what + "\t");
    System.out.println();
  }
}
}