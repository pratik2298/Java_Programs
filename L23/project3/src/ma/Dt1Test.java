package pa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
class Dt1 extends JFrame {
Container c;
JButton btnDate, btnTime;
Dt1() {
c = getContentPane();
c.setLayout(new FlowLayout());

btnDate = new JButton("Date");
btnTime = new JButton("Time");
c.add(btnDate);
c.add(btnTime);

ActionListener e1 = (ae) -> {
Date d = new Date();
DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
String s = df.format(d);
JOptionPane.showMessageDialog(c, s);
};
btnDate.addActionListener(e1);

setTitle("Date & Time App");
setSize(300, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}
class Dt1Test {
public static void main(String args[])
{
Dt1 d = new Dt1();
}
}
