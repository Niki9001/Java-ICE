import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private int counter = 0;
    private int counter1 = 0;
    public MyFrame(){
        init();
    }
    private void init(){
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");

        button1.setLocation(0,0);
        button1.setSize(200,100);
        button1.addActionListener(this);
        button2.setBounds(100,150,200,100);
        button2.addActionListener(this);

        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(button1);
        container.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
        counter++;
        button2.setText("Button 1 clicked " + counter);

    }
        else if (e.getSource()==button2) {
            counter1++;
            button2.setText("Button 2 clicked " + counter1);
        }
    }
}
