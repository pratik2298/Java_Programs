// Select records

import java.sql.*;
import java.io.*;

class Pr5 {
public static void main(String args[]) {
try {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
	System.out.println("connected");
	
	String sql = "select * from student5june2020";
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(sql);
	while(rs.next()) {
		System.out.println(" RollNo : " + rs.getInt(1)   +   "     "   +  " Name :   "  +  rs.getString(2));
	}
	
	rs.close();
	con.close();
	System.out.println("disconnect");
}
catch(SQLException se) {
	System.out.println("Displaying issue "  + se);
}

}}
