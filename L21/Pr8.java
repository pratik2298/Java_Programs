// delete record by user

import java.io.*;
import java.sql.*;
class Pr8 {
public static void main(String args[]) {
try{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("Connected");

String sql = "delete from student5june2020 where rno = ?";
PreparedStatement pstmt = con.prepareStatement(sql);
Console c = System.console();
int rno = Integer.parseInt(c.readLine("Enter the Roll No "));
pstmt.setInt(1, rno);
int row  = pstmt.executeUpdate();
System.out.println(row + " record deleted ");
con.close();
System.out.println("Disconnected");
}
catch(SQLException se) {
System.out.println("failed to Delete records " + se);
}
}}