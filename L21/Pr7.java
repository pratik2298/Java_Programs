// update record 

import java.sql.*;
import java.io.*;
class Pr7 {
public static void main(String args[]) {
try 
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("connected");

String sql = "update student5june2020 set name = ? where rno = ?";
PreparedStatement pstmt = con.prepareStatement(sql);
Console c = System.console();
int rno = Integer.parseInt(c.readLine("Enter the Roll no : "));
String name = c.readLine("Enter the Name : ");
pstmt.setString(1, name);
pstmt.setInt(2, rno);
long row = pstmt.executeUpdate();
System.out.println(row + "Record Updated");
con.close();
System.out.println("disconnect");
}

catch(SQLException se) {
System.out.println("record update issue " + se);
}
}}