import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    public MyFrame2(){
        init();
    }
    private void init(){
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        button3 = new JButton("Button3");
        button4 = new JButton("Button4");
        button5 = new JButton("Button5");

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,2));

        container.add(button1,BorderLayout.EAST);
        container.add(button2,BorderLayout.WEST);
        container.add(button3,BorderLayout.SOUTH);
        container.add(button4,BorderLayout.NORTH);
        container.add(button5,BorderLayout.CENTER);

    }

}
