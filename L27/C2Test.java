import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;
import java.io.*;

class C2 extends JFrame {
C2() {

DefaultCategoryDataset d1 = new DefaultCategoryDataset();
d1.addValue(78, "Brandon", "Physics");
d1.addValue(92, "Brandon", "Chemistry");
d1.addValue(85, "Brandon", "Maths");

d1.addValue(87, "Anushka", "Physics");
d1.addValue(82, "Anushka", "Chemistry");
d1.addValue(50, "Anushka", "Maths");


JFreeChart chart = ChartFactory.createBarChart("Dombivali Student MArks", "Subjects", "Marks", d1, PlotOrientation.VERTICAL, true, false, false);

ChartPanel cp = new ChartPanel(chart);
setContentPane(cp);

try
{
File marks = new File("Marks.jpeg");
ChartUtilities.saveChartAsJPEG(marks, chart, 500, 400);
}
catch(IOException e) { System.out.println(e); }
setTitle("Mark Sheet ");
setSize(500, 400);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class C2Test {
public static void main(String args[]) {
C2 c = new C2();
}
}