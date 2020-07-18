import java.lang.*;
import java.io.*;

class Account{
private int ano;
private String name;
private double balance;

public Account(int ano, String name, double balance)
{
this.ano = ano;
this.name = name;
this.balance = balance;
}

public void showData()
{
System.out.println(ano +"  "+ name +" "+ balance);
}
}


class AccountTest
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("enter the Account Number");
int ano = Integer.parseInt(br.readLine());

System.out.println("enter the Name");
String name = br.readLine();

System.out.println("enter the Balance");
double balance = Double.parseDouble(br.readLine());

Account a1 = new Account(ano,name,balance);
a1.showData();
}
}


