class Pr3 {
public static void main(String args[]) {

//Anonymous class
Runnable r1 = new Runnable() {
public void run() {
System.out.println("Writing work started");
for(int i = 0; i <= 10; i++)
	System.out.println("i am writing Assignment no "  + i);
System.out.println("Writing work over");
}
};
Thread t1 = new Thread(r1);

//Lambda Expression
Runnable r2 = () -> {
System.out.println("Music Started");
for(int i = 1; i <= 20; i++)
	System.out.println("song" + i);
};
Thread t2  = new Thread(r2);

t1.start();
t2.start();

try
{
t1.join();
t2.join();
}
catch(InterruptedException ie) {
 System.out.println(ie);
}
System.out.println("main thread over ");
}
} 