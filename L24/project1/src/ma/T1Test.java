package pa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
class T1 extends JFrame {
Container c;
JButton btnDate, btnTime;

T1() {
c = getContentPane();
c.setLayout(new FlowLayout());

btnDate = new JButton("Date");
btnTime = new JButton("Time");

c.add(btnDate);
c.add(btnTime);

btnDate.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
LocalDate d = LocalDate.now();
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String s = dtf.format(d);
JOptionPane.showMessageDialog(c, s);
}
});

btnTime.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
LocalTime d = LocalTime.now();
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
String s = dtf.format(d);
JOptionPane.showMessageDialog(c, s);
}
});
 
setTitle("Date and Time App");
setSize(400, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}
class T1Test {
public static void main(String args[]) {
T1 t = new T1();
}
}