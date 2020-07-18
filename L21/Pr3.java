// Insert records

import java.sql.*;
class Pr3 {
public static void main(String args[]) {
try
{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
	System.out.println("Connected");

	String sql = "insert into student5june2020 values(89, 'Jon')";
	Statement stmt = conn.createStatement();
	stmt.execute(sql);
	System.out.println("Record added");
	conn.close();
	System.out.println("Connection closed");
}
catch(SQLException se) {
	System.out.println("record addition issue " + se);
}
}
}	