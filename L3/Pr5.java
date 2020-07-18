/* wajp to generate the program
A
B B
C C C
D D D D
*/

class Pr5
{
public static void main(String args[])
{
int n;
n = Integer.parseInt(args[0]);
if (n < 0)
{
System.out.println("b + ve");
}

else
{
char ch = 'A';
for (int i = 1; i <= n; i++)
{
for (int j = 1; j <= i; j++)
System.out.print(ch + "\t");
System.out.println();
ch++;
}
}
}
}
