package pa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class W1 extends JFrame {
Container c;
JButton btnWelcome;

W1() {
c = getContentPane();
c.setLayout(new FlowLayout());
btnWelcome = new JButton("Welcome");
c.add(btnWelcome);

ActionListener e1 = (ae) -> {
JOptionPane.showMessageDialog(c, "Welcome to my App");
};
btnWelcome.addActionListener(e1);

setTitle("My First App");
setSize(300, 200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class W1Test {
public static void main(String args[]) {
W1 w = new W1();
}}