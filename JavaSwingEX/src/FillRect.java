import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FillRectPanel extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(10,10,80,30);
        g.fillRect(10, 10, 80, 30);

        g.drawOval(10,100, 80, 30);
        g.fillOval(10, 100, 80, 30);

        int r = 40;
        int cx = 150;
        int cy = 100;
        Polygon p = new Polygon();
        for (int i = 0; i < 5; i++) {
            p.addPoint(
                    (int)(cx + r*Math.cos(i*2*Math.PI/5)),
                    (int)(cx + r*Math.sin(i*2*Math.PI/5))
            );
        }
        g.fillPolygon(p);
    }
}
class FillRectFrame extends JFrame{
    FillRectFrame(){
        setTitle("FillRect");
        setSize(300,200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Container contentPane = getContentPane();
        contentPane.add(new FillRectPanel());
    }
}
public class FillRect {
    public static void main(String[] args) {
        JFrame frame = new FillRectFrame();
        frame.setVisible(true);
    }
}
