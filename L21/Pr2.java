// create table  (Database --> Tables --> col and row for storing records)

import java.sql.*;
class Pr2 
{
public static void main(String args[])
{
try {
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver()); 
// for Connection  we have to pass url, username and password
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("connected");

// creating table
String sql = "create table student5june2020(rno int primary key, name varchar(30) )";
Statement stmt = con.createStatement();
stmt.executeUpdate(sql);
System.out.println("Table Created");

//closing Connection
con.close();
System.out.println("disconnected");
}
catch(SQLException se) {
	System.out.println(" table creation issue "   + se);
}
}
}