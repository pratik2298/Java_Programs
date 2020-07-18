class Pr7
{
public static void main(String args[])
{
int rating = Integer.parseInt(args[0]);
switch(rating)
{
case 5, 4 -> System.out.println("Excellent");
case 3, 2 -> System.out.println("ok");
case 1 -> System.out.println("Excellent");
default -> System.out.println("Invalid Rating");
}
}
}



