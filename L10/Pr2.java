/* create interface with abstract method void add(int a, int b) 
using lambda expression */

interface Compute{
void add(int a, int b);
}

class Pr2{
public static void main(String args[])
{
// lamba Expression
Compute c1 = (int a, int b) -> { System.out.println(a+b);};
c1.add(10, 20);

// lamba Expression
Compute c2 = (int a, int b) -> System.out.println(a+b);
c2.add(10, 20);

// lamba Expression
Compute c3 = (a, b) -> { System.out.println(a+b);};
c3.add(10, 20);

// lamba Expression
Compute c4 = (a, b) ->  System.out.println(a+b);
c4.add(10, 20);
}
}