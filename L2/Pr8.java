// wajp to read first 3 letters of month & display no of day


class Pr8
{
public static void main(String args[])
{
String month_name = args[0];
switch(month_name)
{
case "jan", "mar", "may", "jul", "aug", "oct", "dec"
-> System.out.println("31 days");
case "apr", "jun", "sep", "nov"
-> System.out.println("30 days");
case "feb"
-> System.out.println("28/29 days");
default -> System.out.println("Invalid month");
}
}
}
