import java.io.*;
class Pr1.1
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

int highest, lowest;
highest = lowest = marks[0];
for(int m : marks)
{
if(m > highest)
highest = m;
if(m < lowest)
lowest = m;
}

System.out.println(" Highest " + highest + " lowest " + lowest);
}
}

