/*wajp to find the sum of digit
i/p: 1742 o/p:14
i/p: 354 o/p: 12 hint use while loop*/


class Pr1
{
public static void main(String args[])
{
int num=0, sum=0, digit=0;
num = Integer.parseInt(args[0]);
if (num < 0)
System.out.println("b + ve");
else
{
while (num != 0)
{
digit = num % 10;
sum = sum + digit;
num = num / 10;
}
System.out.println("sum = " +sum);
}
}
}
