import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame4 extends JFrame{
    JButton button1;
    JButton button2;
    JTextArea textArea1;
    JButton button3;
    public MyFrame4(){
        init();
    }
    private void init(){
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        textArea1=new JTextArea();
        button3 = new JButton("Button3");
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
        //设置button2
        button2.setBounds(100,150,200,100);
        container.add(button2);
        button2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        textArea1.setBounds(150,250,200,100);
        container.add(textArea1);
        textArea1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        button3.setBounds(300,350,100,50);
        container.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("action performed");
            }
        });
    }
}
