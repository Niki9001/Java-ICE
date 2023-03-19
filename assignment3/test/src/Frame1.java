import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JFrame {
    JButton button1;

    public Frame1(){
        init();
    }
    private void init(){
        button1 = new JButton("Button1");

        Container container = this.getContentPane();
        container.setLayout(null);
        //设置button1
        button1.setLocation(0,0);
        button1.setSize(200,100);
        container.add(button1);
        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released");

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }
}
