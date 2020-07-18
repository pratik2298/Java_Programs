import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import java.io.*;
import java.sql.*;

class Sms extends JFrame {
Sms() {
DefaultCategoryDataset d1 = new DefaultCategoryDataset();

try
{
DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "abc123");

String sql = "select * from Student";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);
while(rs.next())
{
	d1.addValue(rs.getInt(3), rs.getString(2), "Phy");
	d1.addValue(rs.getInt(4), rs.getString(2), "Chem");
	d1.addValue(rs.getInt(5), rs.getString(2), "Maths");
}
rs.close();
stmt.close();
con.close();
JFreeChart chart = ChartFactory.createBarChart("Dombivili Student Marks", "Subject", "Marks", d1, PlotOrientation.VERTICAL, true, false, false);
ChartPanel cp = new ChartPanel(chart);
setContentPane(cp);

try
{
File marks = new File("Marks.jpeg");
ChartUtilities.saveChartAsJPEG(marks, chart, 500, 400);
}
catch(IOException e)
{
System.out.println(e);
}
setTitle("Student marks");
setSize(500, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
catch(SQLException se)
{
JOptionPane.showMessageDialog(new JDialog(), "se " + se);
}
catch(Exception e)
{
JOptionPane.showMessageDialog(new JDialog(), "e" + e);
}
}
}

class SmsTest {
public static void main(String args[])
{
Sms c  = new Sms();
}
}