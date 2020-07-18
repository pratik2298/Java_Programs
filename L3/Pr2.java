// wajp to reverse the number 

class Pr2
{
public static void main(String args[])
{
int num=0, rev=0, digit=0;
num = Integer.parseInt(args[0]);
if (num < 0)
{
System.out.println("b + ve");
}
else
{
do 
{
digit = num % 10;
rev = rev * 10 + digit;
num = num / 10;
}
while (num > 0);
System.out.println("rev = " +rev);
}
}
}