import org.hibernate.*;
import org.hibernate.cfg.*;

class HbOp {
public static void main(String args[]) {
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sfact = cfg.buildSessionFactory();

Session session = null;
try {
	session = sfact.openSession();
	System.out.println("Open");
}
catch(Exception e) {
	System.out.println(" issue " + e);
}
finally {
	session.close();
	System.out.println("close");
}
}
}