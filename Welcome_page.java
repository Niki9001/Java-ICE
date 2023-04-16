import javax.swing.*;
import java.awt.*;

public class Welcome_page extends JFrame {
    JButton jButton1;
    JLabel jLabel1;
    JLabel jLabel2;
    public Welcome_page(){
        init();
    }
    private void init(){
        Container container = this.getContentPane();
        container.setLayout(null);
        //jPanel1= new JPanel();
        //button
        jButton1 = new JButton("Build a character");
        jButton1.setSize(150,50);
        jButton1.setLocation(320,500);
        jButton1.setFont(new Font("Chalkboard",Font.BOLD,15));
        //text
        jLabel1 = new JLabel();
        jLabel1.setSize(400,50);
        jLabel1.setLocation(225,50);
        jLabel1.setText("Dragons and Dungeons");
        jLabel1.setFont(new Font("Chalkboard",Font.BOLD,32));
        //image
        jLabel2 = new JLabel(new ImageIcon("/Users/RedStone/IdeaProjects/Assignment4/dd_1400x.jpg"));
        jLabel2.setSize(400,400);
        jLabel2.setLocation(200,100);



        container.add(jButton1);
        container.add(jLabel1);
        container.add(jLabel2);

    }
}
