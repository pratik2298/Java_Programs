import java.sql.*;
class Pr11 {
public static void main(String args[])
{
try 
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("Connected");

String sql = "{ call p2(?, ?) }";
CallableStatement cstmt = con.prepareCall(sql);
cstmt.setInt(1, 56);
cstmt.registerOutParameter(2, Types.VARCHAR);
cstmt.execute();
String name = cstmt.getString(2);
System.out.println(name);
con.close();
System.out.println("Disconnected");
}
catch(SQLException se)
{
System.out.println("Selection issue " + se);
}
}}