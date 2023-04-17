import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {
    JButton jButton1;
    JLabel jLabel1;
    JLabel jLabel2;
    public WelcomePage(){
        init();
    }
    private void init(){
        Container container = this.getContentPane();
        container.setLayout(null);
        //jPanel1= new JPanel();
        //button
        jButton1 = new JButton("Build a character");
        jButton1.setSize(150,50);
        jButton1.setLocation(220,500);
        jButton1.setFont(new Font("Old English Text MT",Font.BOLD,15));


        //text
        jLabel1 = new JLabel();
        jLabel1.setSize(400,50);
        jLabel1.setLocation(125,50);
        jLabel1.setText("Dragons and Dungeons");
        jLabel1.setFont(new Font("Old English Text MT",Font.BOLD,32));
        //image
        jLabel2 = new JLabel(new ImageIcon("dd_1400x.jpg"));
        jLabel2.setSize(400,400);
        jLabel2.setLocation(100,100);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomePage.this.dispose(); // 关闭当前窗口
                CharacterGen cg = new CharacterGen(); // 创建CharacterGen实例
                cg.setSize(600, 650);
                cg.setTitle("DND Game");
                cg.setLocationRelativeTo(null);
                cg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cg.setVisible(true); // 显示CharacterGen窗口
            }
        });


        container.add(jButton1);
        container.add(jLabel1);
        container.add(jLabel2);

    }
}
