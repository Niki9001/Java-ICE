import javax.swing.*;
import java.awt.*;

public class MyFrame1 extends JFrame {
    JButton button1;
    JButton button2;
    public MyFrame1(){
        init();
    }
    private void init(){
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");

        button1.setLocation(0,0);
        button1.setSize(200,100);
        button2.setBounds(100,150,200,100);
        button1.addActionListener(new Button1ActionListener(this));
        button2.addActionListener(new Button1ActionListener(this));
//        JPanel jp = new JPanel();
//        jp.add(button1);

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(button1);
        container.add(button2);
    }
}
