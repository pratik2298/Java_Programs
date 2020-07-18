import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class E1 extends JFrame {
	Container c;
	JLabel lblNumber;
	JTextField txtNumber;
	JButton btnFind;
	
	E1() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		lblNumber = new JLabel(" Enter the Number ");
		
		txtNumber = new JTextField(15);
		txtNumber.setToolTipText(" Number ");
		btnFind = new JButton("Find");

		c.add(lblNumber);
		c.add(txtNumber);
		c.add(btnFind);

		btnFind.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
			try
			{
				String str = txtNumber.getText();
				int number = Integer.parseInt(str);
				String res = "";
				if(number % 2 == 0)  res = "Even";
				else                 res = "Odd";
				JOptionPane.showMessageDialog(c, res);
			}
			catch(NumberFormatException ne)
			{
				JOptionPane.showMessageDialog(c, "you need to enter integers");
				txtNumber.setText("");
				txtNumber.requestFocus();
			}
		}
		});

		setTitle("Even Odd Calculator");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class Pr6 {
public static void main(String args[]) {
	E1 e = new E1();
}
}			
