/* wajp to read marks and display grade
m >= 70 Distinction
m >= 60 First class
m >= 50 Second class
m >= 40 Pass class
else    Fail */


class Pr4
{
public static void main(String args[])
{
int marks = Integer.parseInt(args[0]);
String grade = "";

if (marks >= 70)
grade = "Distinction";
else if (marks >= 60)
grade = "First Class";
else if (marks >= 50)
grade = "Second Class";
else if (marks >= 40)
grade = "Pass";
else
grade = "Fail";

System.out.println("Marks=" + marks + Grade=" + grade);
}
}
