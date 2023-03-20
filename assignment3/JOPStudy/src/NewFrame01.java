import javax.swing.*;
import java.awt.*;

public class NewFrame01 extends JFrame{
    JLabel label1;
    JLabel label2;
    public NewFrame01(){
        init();
    }
    private void init(){
        Container container = this.getContentPane();
        container.setLayout(null);

        label1=new JLabel("Hello");
        label1.setSize(200,100);
        label1.setLocation(0,0);
        label1.setFont(new Font("Times New Roman",Font.BOLD,25));

        label2=new JLabel("Hello2");
        label2.setSize(200,100);
        label2.setLocation(0,0);
        label2.setIcon(new ImageIcon(
                "C:\\Users\\w0470221\\Desktop\\Demos\\test2\\study\\smiley3.JPG"));
        label2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label2.setToolTipText("Test");
        container.add(label2);
    }
}
