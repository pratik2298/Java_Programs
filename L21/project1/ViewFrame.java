import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ViewFrame extends JFrame {
Container c;
JTextArea taData;
JButton btnBack;

ViewFrame() {
c = getContentPane();
c.setLayout(new FlowLayout());
taData = new JTextArea(10, 30);
btnBack = new JButton("back");

c.add(taData);
c.add(btnBack);

ActionListener e1 = (ae) -> {
MainFrame a = new MainFrame();
dispose();
};
btnBack.addActionListener(e1);

DbHandler db = new DbHandler();
String data = db.getStudent();
taData.setText(data);

setTitle("View Student");
setSize(300, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}