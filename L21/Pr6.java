// select record with rno and name
import java.sql.*;
class Pr6 {
public static void main(String args[]) {
try {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
	System.out.println("connected");
	
	String sql = "select rno, name from student5june2020";
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()) {
		System.out.println("Roll No :    " + rs.getInt("rno") + "    " + "Name :  " + rs.getString("name"));
	}
		
	
	rs.close();
	con.close();
		
	System.out.println("disconnected");
}
catch(SQLException se) {
	System.out.println("Displaying issue"  + se);
}
}}