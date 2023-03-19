import javax.swing.*;
import java.awt.*;

public class MyFrame3 extends JFrame {
    JButton button1;
    JButton button2;
    public MyFrame3(){
        init();
    }
    private void init(){
        button1 = new JButton("Button1");
        button1.setLocation(0,0);
        button1.setSize(200,100);
        button2 = new JButton("Button2");
        button2.setBounds(100,150,200,100);
        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(button1);
        container.add(button2);
    }
}
