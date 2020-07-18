import java.io.*;
class Pr1
{
public static void main(String args[])
{
Console c = System.console();
int sum = 0, n;
double avg = 0.0;
n = Integer.parseInt(c.readLine("Enter the Number of Students"));
int [] marks = new int[n];

for(int i = 0; i < n; i++)
marks[i] = Integer.parseInt(c.readLine("Enter the Marks"));

for(int j : marks)
System.out.print(j + "  ");

for(int i = 0; i < n; i++)
{
sum += marks[i];
}
System.out.println("sum " + sum);

avg = sum / n;
System.out.println( " Average " + avg);
}
}


