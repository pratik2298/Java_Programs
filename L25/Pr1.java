class T1 extends Thread {
public void run() 
{
System.out.println("writing work started");
for(int i = 0; i <= 10; i++)
	System.out.println("i am Writing assignment " + i);
System.out.println("Writing work over");
}
}

class T2 extends Thread {
public void run() {
System.out.println("Music started");
for(int i = 0; i <= 20; i++)
	System.out.println("song" + i);
System.out.println("Music over");
}
}

class Pr1 {
public static void main(String args[])
{
T1 a = new T1();
a.start();
T2 b = new T2();
b.start();

try
{
a.join();
b.join();
}
catch(InterruptedException ie) {
System.out.println(ie);
}
System.out.println("Main thread Over");
}
}