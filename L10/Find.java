/* create interface method find with abstract method
int sub(int a, int b) */


interface Find {
void sub(int a, int b);
}

class Find
{
public static void main(String args[])
{
Find f1 = (int a, int b) -> { return a - b; };
System.out.println(f1.sub(50, 40));

/* Find f2 = (a, b) -> { return a - b; };
System.out.println(f2.sub(50, 40));

Find f3 = (a, b) -> a - b;
System.out.println(f3.sub(50, 40)); */

}};



