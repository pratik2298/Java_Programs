/* wajp to generate the pattern 
  *
  * *
  * * *
  * * * *
  * * * * *
*/

class Pr4
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
for (int i = 1; i <= n; i++)
{
for (int j = 1; j <= i; j++)
System.out.print("*" + "\t");
System.out.println();
}
}
}
}
