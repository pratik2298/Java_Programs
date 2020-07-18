import java.sql.*;
class Pr1 {
public static void main(String args[]) 
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("Connected");

conn.close();
System.out.println("DisConnected");
}

catch(ClassNotFoundException ce) {
System.out.println(" ce issue " + ce);
}

catch(SQLException se) {
System.out.println("sql issue "  + se);
}
}
}