import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;

class C1 extends JFrame {
C1() {

DefaultCategoryDataset d1 = new DefaultCategoryDataset();
d1.addValue(78, "Brandon", "Physics");
d1.addValue(92, "Brandon", "Chemistry");
d1.addValue(85, "Brandon", "Maths");

JFreeChart chart = ChartFactory.createBarChart("Brandons Marks", "Subjects", "Marks", d1, PlotOrientation.VERTICAL, true, false, false);

ChartPanel cp = new ChartPanel(chart);
setContentPane(cp);

setTitle("Mark Sheet of Mr. Brandon");
setSize(500, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class C1Test {
public static void main(String args[]) {
C1 c = new C1();
}
}