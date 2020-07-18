import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class W1 extends JFrame {
Container c;
JButton btnWelcome;

W1() {
c = getContentPane();
c.setLayout(new FlowLayout());
btnWelcome = new JButton(" Welcome ");
c.add(btnWelcome);

btnWelcome.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
JOptionPane.showMessageDialog(c, "Aap ka Swagat hain");
}
});

setTitle("My First GUI");
setSize(500, 300);
setLocation(400, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class Pr5 {
public static void main(String args[]) {
W1 w = new W1();
}
}