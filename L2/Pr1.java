// wajp to read amount and if the amount is > 150 then give 10% discount elso no discount print the final amount


class Pr1
{
public static void main(String args[])
{

double amount, final_amount;
amount = Double.parseDouble(args[0]);
final_amount = amount;
if (amount > 150)
final_amount = amount * 0.90;
System.out.println("amount to be paid" +final_amount);
}
}