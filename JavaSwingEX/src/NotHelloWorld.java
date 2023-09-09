import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class NotHelloWorldPanel extends JPanel{    //Panel Class
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Not a Hello, World program", 75, 100);
    }
}
class NotHelloWorldFrame extends JFrame{
    NotHelloWorldFrame(){
        setTitle("NotHelloWorld");
        setSize(300,200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(){
                System.exit(0);
            }
        });
        Container contentPane = getContentPane();
        contentPane.add(new NotHelloWorldPanel());
    }
}
public class NotHelloWorld {
    public static void main(String[] args) {
        JFrame frame = new NotHelloWorldFrame();
        frame.setVisible(true);
    }
}
