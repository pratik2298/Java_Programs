class T1 implements Runnable {
public void run() 
{
System.out.println("writing work started");
for(int i = 0; i <= 10; i++)
	System.out.println("i am Writing assignment " + i);
System.out.println("Writing work over");
}
}

class T2 implements Runnable{
public void run() {
System.out.println("Music started");
for(int i = 0; i <= 20; i++)
	System.out.println("song" + i);
System.out.println("Music over");
}
}

class Pr2 {
public static void main(String args[])
{
T1 a = new T1();
Thread t1 = new Thread(a);
t1.start();

T2 b = new T2();
Thread t2 = new Thread(b);
t2.start();

try
{
t1.join();
t2.join();
}
catch(InterruptedException ie) {
System.out.println(ie);
}
System.out.println("Main thread Over");
}
}