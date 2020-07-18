package pa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class C1 extends JFrame {
Container c;
JLabel lblAmount;
JTextField txtAmount;
JButton btnConvert;

C1() {
c = getContentPane();
c.setLayout(new FlowLayout());
lblAmount = new JLabel("Enter the amount in $$");
txtAmount = new JTextField(15);
btnConvert = new JButton("Convert");

c.add(lblAmount);
c.add(txtAmount);
c.add(btnConvert);

ActionListener e1 = (ae) -> {
double amount_in_dollars = Double.parseDouble(txtAmount.getText());
double amount_in_rupees =  amount_in_dollars * 75.45;
String msg = " $ " + amount_in_dollars +  "-->"  + "Rs " + amount_in_rupees;
JOptionPane.showMessageDialog(c, msg);
};
btnConvert.addActionListener(e1);

setTitle("Currency Converter");
setSize(320, 200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class C1Test {
public static void main(String args[]) {
C1 w  =  new C1();
}
}
