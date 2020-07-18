import java.io.Console;
class Pr3
{
public static void main(String args[])
{
Console c = System.console();

int n = Integer.parseInt(c.readLine("enter number of elements"));
int data[] = new int[n];

for(int i = 0; i<data.length;i++)
data[i] = Integer.parseInt(c.readLine("enter the element"));
 
int pc = 0,nc = 0,zc = 0;
for(int d : data)
{
if(d > 0)
pc++;
else if(d < 0)
nc++;
else
zc++;
}
System.out.println(pc + "  " + nc + " " + zc);
}
}