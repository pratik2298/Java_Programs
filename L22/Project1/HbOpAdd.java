import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class HbOpAdd {
public static void main(String args[]) 
{
Console c = System.console();
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sfact = cfg.buildSessionFactory();

Session session = null;
Transaction t = null;
try {
	session = sfact.openSession();
	System.out.println("Open");
	t = session.beginTransaction();
	
	int rno = Integer.parseInt(c.readLine("Enter rno"));
	String name = c.readLine("Enter the Name");
	Student s = new Student(rno, name);
	session.save(s);
	t.commit();
	System.out.println("Record Added");
}

catch(Exception e) {
	t.rollback();
	System.out.println(" issue " + e);
}
finally {
	session.close();
	System.out.println("close");
}
}
}