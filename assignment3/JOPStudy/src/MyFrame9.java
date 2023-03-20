import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame2 extends JFrame {
    JButton button1;
    JButton button2;
    public MyFrame2(){
        init();
    }
    private void init(){
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");

        button1.setLocation(0,0);
        button1.setSize(200,100);
        button1.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Blue");
                button2.setBackground(new Color(0,0,255));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Purple");
                button2.setBackground(new Color(255,0,255));
            }


        });
        button2.setBounds(100,150,200,100);


        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(button1);
        container.add(button2);
    }
}
