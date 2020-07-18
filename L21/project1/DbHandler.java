import javax.swing.*;
import java.sql.*;
class DbHandler {
public static void addStudent(int rno, String name)
{
try {
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");

String sql = "insert into student1 values(?, ?)";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setInt(1, rno);
pstmt.setString(2, name);
pstmt.executeUpdate();
JOptionPane.showMessageDialog(new JDialog(), "record Inserted");
con.close();
}
catch(SQLException se) {
JOptionPane.showMessageDialog(new JDialog(), "record issue " + "rno already Exists \n"  + se);
}
}

public static String getStudent() {
String data = "";
try 
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");

String sql = "select * from student1";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);
while(rs.next())
{
data = data + " rno " + rs.getInt(1)   +  "  name  "  +  rs.getString(2) + "\n";
}
con.close();
}
catch(SQLException se)
{
JOptionPane.showMessageDialog(new JDialog(), "Select Issue " + se);
}
return data;
}
}