import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattlePage extends JFrame {
    JLabel bttd,pw,mg,pwi,mgi;
    JPanel jp1,jp2;
    JTextArea ja;
    JButton ba;
    public BattlePage(String characterName, String characterType, String weaponType) {
        init(characterName, characterType, weaponType);
    }
    private void init (String characterName, String characterType, String weaponType){
        Container container = this.getContentPane();
        container.setLayout(null);
        bttd = new JLabel("Battle To The Death!");
        bttd.setSize(500,100);
        bttd.setLocation(60,20);
        bttd.setFont(new Font("Old English Text MT",Font.BOLD,48));

        pw = new JLabel("Player: ");
        pw.setSize(160,40);
        pw.setLocation(120,120);
        pw.setFont(new Font("Times New Roma",Font.BOLD,20));

        mg = new JLabel("Monster: Gazer");
        mg.setSize(160,40);
        mg.setLocation(320,120);
        mg.setFont(new Font("Times New Roma",Font.BOLD,20));

        jp1 = new JPanel();
        jp1.setSize(50,100);
        jp1.setLocation(140,200);

        jp2 = new JPanel();
        mgi = new JLabel(new ImageIcon("monster.jpg"));
        jp2.add(mgi);
        jp2.setSize(150,120);
        jp2.setLocation(315,170);

        ja = new JTextArea();
        ja.setSize(450,250);
        ja.setLocation(60,300);
        ja.setFont(new Font("Times New Roma",Font.PLAIN,14));
        ja.setText("Player Name: " + characterName +"\n-----------------" + "\nClass: " + characterType +"\nWeapon: " + weaponType
        +"\n"+"\nMonster: Gazer \n"+"-----------------\n"+"HP: 50     Defense: 40    Agility: 50    Base Attack: 30");

        ba = new JButton("Battle Again");
        ba.setSize(150,25);
        ba.setLocation(200,555);
        ba.setFont(new Font("Old English Text MT",Font.BOLD,18));
        ba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BattlePage.this.dispose(); // 关闭当前窗口
                CharacterGen cg = new CharacterGen(); // 创建CharacterGen实例
                cg.setSize(600, 650);
                cg.setTitle("DND Game");
                cg.setLocationRelativeTo(null);
                cg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cg.setVisible(true); // 显示CharacterGen窗口
            }
        });
        container.add(bttd);
        container.add(pw);
        container.add(mg);
        container.add(jp1);
        container.add(jp2);
        container.add(ja);
        container.add(ba);

    }
}
