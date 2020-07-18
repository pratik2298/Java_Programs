//Callable Statement
import java.sql.*;
class Pr10
{
public static void main(String args[]) {
try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");
System.out.println("Connected");

String sql = "{ call p1(?) }";
CallableStatement cstmt = con.prepareCall(sql);
cstmt.registerOutParameter(1, Types.INTEGER);
cstmt.execute();
int count = cstmt.getInt(1);
System.out.println(count);

con.close();
System.out.println("Disconnected");
}
catch(SQLException se)
{
System.out.println("Selection issue" + se);
}
}}