// dropping a  table

import java.sql.*;
class Pr9 {
public static void main(String args[]) {
try{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("Connected");

String sql = "drop table student5june2020";
Statement stmt = con.createStatement();
stmt.executeUpdate(sql);
System.out.println("Table Dropped");

con.close();
System.out.println("Disconnected");
}
catch(SQLException se) {
System.out.println("Unable to Drop a Table" + se);
}
}
}