import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
class HbOpView {
public static void main(String args[]) {
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sfact = cfg.buildSessionFactory();

Session session = null;
try
{
	session = sfact.openSession();
	System.out.println("Open");
	List<Student> stu = new ArrayList<>(); 
	stu = session.createQuery("from Student").list();
	for(Student s : stu)
		System.out.println("rno " + s.getRno()  +  "  name " +  s.getName() );
}
catch(Exception e)  {
	System.out.println("issues" + e);
}
finally {
	session.close();
	System.out.println("Close");
}
}
}