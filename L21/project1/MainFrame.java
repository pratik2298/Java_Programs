import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MainFrame extends JFrame {
Container c;
JButton btnAdd, btnView;

MainFrame() {
c = getContentPane();
c.setLayout(new FlowLayout());
btnAdd = new JButton("Add");
btnView = new JButton("View");

c.add(btnAdd);
c.add(btnView);

ActionListener e1 = (ae) -> {
AddFrame a = new AddFrame();
dispose();
};
btnAdd.addActionListener(e1);

ActionListener e2 = (ae) -> {
ViewFrame a = new ViewFrame();
dispose();
};
btnView.addActionListener(e2);

setTitle("Home");
setSize(300, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}
 
