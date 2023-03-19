import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame5 extends JFrame {
    private JButton button1;
    private JButton button2;
    public MyFrame5(){
        init();
    }
    private void init(){
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");

        Container container = this.getContentPane();
        container.setLayout(null);

        button1.setLocation(0,0);
        button1.setSize(200,100);
        //TODO:匿名内部类
        button1.addActionListener(new ActionListener() {
            int counter=0; //TODO:要放在外面，否则每次点击都会被初始化
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = counter + 1;
                button2.setText("button pressed"+counter);
            }
        });
        button2.setBounds(100,150,200,100);

        container.add(button1);
        container.add(button2);
    }
}
