import java.time.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

class Wish {
public static void main(String args[])
{
Console c = System.console();
String lang = c.readLine("en/ fr/ de : ");
Locale loc = new Locale(lang);
ResourceBundle rb = ResourceBundle.getBundle("W1", loc);

LocalTime t = LocalTime.now();
int h = t.getHour();
String msg = "";
if(h >= 6 && h < 12)   msg = rb.getString("gm");
else if(h >= 12 && h < 16)   msg = rb.getString("ga");
else     msg = rb.getString("ge");
System.out.println(msg);
JOptionPane.showMessageDialog(new JDialog(), msg);
}
}