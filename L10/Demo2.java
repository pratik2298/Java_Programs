interface T1 {
public void m1(String s);
}

class Demo2 {
public static void main(String args[]) {
T1 a1 = (s) -> { System.out.println(s.toUpperCase());};

a1.m1("pratik");
}
}+