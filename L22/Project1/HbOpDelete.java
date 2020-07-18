import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;
class HbOpDelete {
public static void main(String args[]) {
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sfact = cfg.buildSessionFactory();
Session session = null;
Transaction t = null;

try {
	session = sfact.openSession();
	System.out.println("open");
	t = session.beginTransaction();
	Console c = System.console();
	int rno = Integer.parseInt(c.readLine("Enter the Roll No : "));
	Student s = (Student)session.get(Student.class, rno);
	if(s != null)
	{
		session.delete(s);
		 t.commit();
		 System.out.println("Record Updated");
	}
	else
		System.out.println(rno + "does not exist");
}
catch(Exception e)  {
	t.rollback();
	System.out.println("issues" + e);
}
finally {
		System.out.println("close");
}
}
}

	
	