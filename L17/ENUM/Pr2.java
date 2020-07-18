enum Icecream {
PLAIN(1), SUGAR(2), WAFFLE(3);


// enum Constructor
int nos;
Icecream(int nos) {
this.nos = nos;
}
}

class Pr2 {
public static void main(String args[]) {
Icecream c1 = Icecream.PLAIN;
Icecream c2 = Icecream.SUGAR;
Icecream c3 = Icecream.WAFFLE;

System.out.println(c1 + " --> " + c1.nos);
System.out.println(c2 + " --> " + c2.nos);
System.out.println(c3 + " --> " + c3.nos);
}}
