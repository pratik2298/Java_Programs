// inserting record from user

import java.sql.*;
import java.io.*;
class Pr4 {
public static void main(String args[]) {
try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("connected");

String sql = "insert into student5june2020 values(?, ?)";
PreparedStatement pstmt = con.prepareStatement(sql);
Console c = System.console();
int rno = Integer.parseInt(c.readLine("Enter Roll no : "));
String name = c.readLine("Enter Name : "); 
pstmt.setInt(1, rno);
pstmt.setString(2, name);
pstmt.executeUpdate();
System.out.println("Record Added");

con.close();
System.out.println("disconnected");
}
catch(SQLException se) {
System.out.println("Record failed to insert"   + se);
}
}}
