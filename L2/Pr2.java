// wajp to read the number of tshirts purchased 
// if not(no of tshirts) >= 10 then u get 2 free tshirts
// if not >= 5 then u get 1 free tshirt else nothing


class Pr2
{
public static void main(String args[])
{
int not = Integer.parseInt(args[0]);
if (not >= 10)
	not = not + 2;
else if (not >= 5)
	not = not + 1;
System.out.println("Total number of tshirts" + not);
}
}