//Conncetion and Disconnection

import java.sql.*;
class Pr2 {
public static void main(String args[]) 
{
try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("Connected");

conn.close();
System.out.println("DisConnected");
}
catch(SQLException se) {
System.out.println("sql issue "  + se);
}
}
}