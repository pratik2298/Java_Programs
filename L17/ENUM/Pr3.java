enum Icecream {
PLAIN(1), SUGAR(2), WAFFLE(3);
int nos;

// enum Constructor is by default private
Icecream(int nos) {
this.nos = nos;
}
}

class Pr3 {
public static void main(String args[]) {
Icecream c1 = Icecream.WAFFLE;

switch(c1) {
	case PLAIN : System.out.println("ok quantity of sugar");
		break;
	case SUGAR : System.out.println("too much sugar");
		break;
	case WAFFLE : System.out.println("extreme sugar");
		break;
}
for(Icecream m : Icecream.values())
	System.out.println(m + "  " + m.name() + "  " + m.ordinal() + "  " + m.nos);
}
}

