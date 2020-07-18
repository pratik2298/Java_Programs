import java.io.Console;
class PostivieNeagtive
{
public static void main(String args[])
{
Console c = System.console();
int n = Integer.parseInt(c.readLine("Enter the Number of Elements"));
int [] num = new int[n];
for(int i = 0; i < n; i++)
num[i] = Integer.parseInt(c.readLine("Enter the Number "));

int np = 0, nn = 0, nz = 0;

for(int i = 0; i < n; i++)
{
if(num[i] > 0)
np++;
else if(num[i] < 0)
nn++;
else
nz++;
}

System.out.println("Positive : " +   np  +  " Negative  : " + nn + " Zero  : " + nz);
}
}
