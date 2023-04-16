import javax.swing.*;
import java.awt.*;

public class BattlePage extends JFrame {
    JLabel bttd,pw,mg;
    JPanel jp1,jp2;
    JTextArea ja;
    JButton ba;
    public BattlePage(){
        init();
    }
    private void init (){
        Container container = this.getContentPane();
        container.setLayout(null);
        bttd = new JLabel("Battle To The Death!");
        bttd.setSize(500,100);
        bttd.setLocation(60,20);
        bttd.setFont(new Font("Old English Text MT",Font.BOLD,48));

        pw = new JLabel("Player: Warrior");
        pw.setSize(160,40);
        pw.setLocation(120,120);
        pw.setFont(new Font("Times New Roma",Font.BOLD,16));

        mg = new JLabel("Monster: Gazer");
        mg.setSize(160,40);
        mg.setLocation(320,120);
        mg.setFont(new Font("Times New Roma",Font.BOLD,16));

        jp1 = new JPanel();
        jp1.setSize(50,100);
        jp1.setLocation(140,200);

        jp2 = new JPanel();
        jp2.setSize(50,100);
        jp2.setLocation(340,200);

        ja = new JTextArea();
        ja.setSize(450,250);
        ja.setLocation(60,300);

        ba = new JButton("Battle Again");
        ba.setSize(150,25);
        ba.setLocation(200,555);
        ba.setFont(new Font("Old English Text MT",Font.BOLD,18));
        ba.addActionListener(new ButtonClickListener(this, ButtonActionType.BATTLE_AGAIN));

        container.add(bttd);
        container.add(pw);
        container.add(mg);
        container.add(jp1);
        container.add(jp2);
        container.add(ja);
        container.add(ba);

    }
}
