import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddFrame extends JFrame {
Container c;
JLabel lblRno, lblName;
JTextField txtRno, txtName;
JButton btnSave, btnBack;

AddFrame() {
c = getContentPane();
c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));


lblRno  = new JLabel("Enter Roll No ");
txtRno  = new JTextField(10);
lblName = new JLabel("Enter Name ");
txtName = new JTextField(10);
btnSave = new JButton("save");
btnBack = new JButton("back");

c.add(lblRno);
c.add(txtRno);
c.add(lblName);
c.add(txtName);
c.add(btnSave);
c.add(btnBack);

ActionListener e1 = (ae) -> {
MainFrame a = new MainFrame();
dispose();
};
btnBack.addActionListener(e1);

ActionListener e2 = (ae) -> {
int rno = Integer.parseInt(txtRno.getText());
String name = txtName.getText();
DbHandler db = new DbHandler();
db.addStudent(rno, name);
};
btnSave.addActionListener(e2);




setTitle("Add Student");
setSize(300, 300);

setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}
}

