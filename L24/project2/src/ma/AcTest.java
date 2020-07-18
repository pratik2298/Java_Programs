package pa;
import java.awt.*;
import javax.swing.*;
import java.time.*;
import java.time.format.*;

class Ac extends JFrame {
Container c;
JLabel lblAge;
JTextField txtAge;
JButton btnCalculate;

Ac() {
c = getContentPane();
c.setLayout(new FlowLayout());
lblAge = new JLabel("enter dob dd/mm/yyyy");
txtAge = new JTextField(15);
btnCalculate = new JButton("Calculate");


btnCalculate.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
try {
String s = txtAge.getText();
String data[] = s.split("/");
LocalDate dob = LocalDate.of(Integer.parseInt(data[2]), Integer.parseInt(data[1], Integer.parseInt(data[0]));
LocalDate today = LocalDate.now();
Period p = Period.between(dob, today);
String msg = "years" + p.getYears() +  " months " + p.getMonths() + " days " + p.getDays();
JOptionPane.showMessageDialog(c, msg);
}
catch(Exception e) {
JOptionPane.showMessageDialog(c, "invalid age " + "\n" + e);
}
}
});

c.add(lblAge);
c.add(txtAge);
c.add(btnCalculate);

setTitle("Age Calculator");
setSize(280, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class AcTest {
public static void main(String args[])
{
Ac a = new Ac();
}
}