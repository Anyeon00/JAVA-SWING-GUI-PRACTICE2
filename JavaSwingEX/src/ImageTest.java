import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ImagePanel extends JPanel{
    private Image image = null;     //Image객체 레퍼런스 생성
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        java.net.URL iURL = this.getClass().getResource("");    //parameter에 파일이름입력
        image = new javax.swing.ImageIcon(iURL).getImage();     //이미지가 로드되는 딜레이 (싱크로노스) 처리를 위한 사용법

        g.drawImage(image, 0, 0, this);     //drawImage() , this:그려지는 화면
    }
}
class ImageFrame extends JFrame{
    ImageFrame(){
        setTitle("Image");
        setSize(300,200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Container contentPane = getContentPane();
        contentPane.add(new ImagePanel());
    }
}
public class ImageTest {
    public static void main(String[] args) {
        JFrame frame = new ImageFrame();
        frame.setVisible(true);
    }
}
