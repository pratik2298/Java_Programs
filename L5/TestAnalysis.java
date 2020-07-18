/* wajp to read marks of "n" students and find 1) avg
2) no of students who scored above 70 and 3) no of students below 40 */

import java.io.Console;
class TestAnalysis
{
public static void main(String args[])
{
Console c = System.console();
int marks[];
double sum = 0.00, avg = 0.00;

int n = Integer.parseInt(c.readLine("enter number of students"));
marks = new int[n];

for(int i = 0; i < marks.length; i++)
marks[i] = Integer.parseInt(c.readLine("enter the marks"));
 
for(int k:marks)
sum = sum + k;

avg = sum / n;
System.out.printf("Avg = %.2f",avg);

int c70 = 0, c40 = 0;
for(int j:marks)
{
if (j > 70)  c70++;
if (j < 40)  c40++;
}
System.out.println(" > 70 = " + c70 + "<40 = " +c40);
}
}