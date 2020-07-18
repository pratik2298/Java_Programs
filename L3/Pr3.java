/* wajp to read two ranges from user r1(lower) r2(higher) if number
is multiple of 3 then output should be "modi"
if number
is multiple of 5 then output should be "Amit" */

class Pr3
{
public static void main(String args[])
{
int r1=0, r2=0;
r1 = Integer.parseInt(args[0]);
r2 = Integer.parseInt(args[1]);
if(r1 < 0 || r2 < 0)
System.out.println("b + ve");

else if (r1 > r2)
System.out.println("invalid range");
else
{
for(; r1<r2;r1++)
{
if (r1%3==0)
System.out.println(r1+ "Modi");
if (r2%5==0)
System.out.println(r2+ "Amit");
}
}
}
}
