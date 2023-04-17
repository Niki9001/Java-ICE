import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterGen extends JFrame {
    JLabel cgLabel, enLabel, ctLabel, csLabel, im, im2, cs1, cs2, cs3, cs4,
            syw, ws, ws1, ws2;
    JRadioButton ctr1, ctr2, ctr3, syw1, syw2, syw3;
    JButton rel, sb;
    ButtonGroup bg, bg2;
    JPanel jp1,jp2,jp3,jp4,jp5,jp6;
    JTextField JTN;
    JTextArea Cintro,wst1,wst2,ftx, cst1, cst2, cst3, cst4;
    private String characterType;
    private String characterImagePath;

    public CharacterGen(){
        init();
    }
    public interface PlayerCharacterListener {
        void onPlayerCharacterSelected(String characterType, String imagePath);
    }
    private void init() {
        Container container = this.getContentPane();
        container.setLayout(null);
        Color lightBlue = new Color(136, 148, 212);
        container.setBackground(lightBlue);
        //Character generator
        cgLabel = new JLabel("Character Generator");
        cgLabel.setSize(300,40);
        cgLabel.setLocation(40,10);
        cgLabel.setFont(new Font("Old English Text MT",Font.BOLD,28));

        enLabel = new JLabel("Enter Name");
        enLabel.setSize(180,40);
        enLabel.setLocation(40,50);
        enLabel.setFont(new Font("Old English Text MT",Font.BOLD,22));

        JTN = new JTextField();
        JTN.setSize(140,20);
        JTN.setLocation(170,62);

        ctLabel = new JLabel("Character Type");
        ctLabel.setSize(180,40);
        ctLabel.setLocation(40,90);
        ctLabel.setFont(new Font("Old English Text MT",Font.BOLD,22));

        csLabel = new JLabel("Character Stats");
        csLabel.setSize(180,40);
        csLabel.setLocation(360,90);
        csLabel.setFont(new Font("Old English Text MT",Font.BOLD,22));

        im = new JLabel(new ImageIcon());
        im.setSize(100,120);
        im.setLocation(180,130);

        cst1 = new JTextArea();
        cst2 = new JTextArea();
        cst3 = new JTextArea();
        cst4 = new JTextArea();
        jp3 = new JPanel(new GridLayout(4,1,0,8));
        jp3.add(cst1);
        jp3.add(cst2);
        jp3.add(cst3);
        jp3.add(cst4);
        jp3.setSize(40,120);
        jp3.setLocation(470,130);
        jp3.setBackground(lightBlue);

        Cintro = new JTextArea(2,40);
        Cintro.setSize(325,60);
        Cintro.setLocation(40,250);
        Cintro.setLineWrap(true); // 设置自动换行
        Cintro.setWrapStyleWord(true); // 设置单词换行
        Cintro.setEditable(false);

        ctr1 = new JRadioButton("Warrior");
        ctr1.setBackground(lightBlue);
        //ctr1.addItemListener(new CharacterTypeItemListener(CharacterType.WARRIOR, im, cst1, cst2, cst3, cst4, Cintro));
        ctr2 = new JRadioButton("Wizard");
        ctr2.setBackground(lightBlue);
        //ctr2.addItemListener(new CharacterTypeItemListener(CharacterType.WIZARD, im, cst1, cst2, cst3, cst4, Cintro));
        ctr3 = new JRadioButton("Cleric");
        ctr3.setBackground(lightBlue);
        //ctr3.addItemListener(new CharacterTypeItemListener(CharacterType.CLERIC, im, cst1, cst2, cst3, cst4, Cintro));
        // add listener
        PlayerCharacterListener playerCharacterListener = new PlayerCharacterListener() {
            @Override
            public void onPlayerCharacterSelected(String characterType, String imagePath) {
                CharacterGen.this.characterType = characterType;
                CharacterGen.this.characterImagePath = imagePath;
            }
        };


        ctr1.addItemListener(new CharacterTypeItemListener(CharacterType.WARRIOR, im, cst1, cst2, cst3, cst4, Cintro, playerCharacterListener));
        ctr2.addItemListener(new CharacterTypeItemListener(CharacterType.WIZARD, im, cst1, cst2, cst3, cst4, Cintro, playerCharacterListener));
        ctr3.addItemListener(new CharacterTypeItemListener(CharacterType.CLERIC, im, cst1, cst2, cst3, cst4, Cintro, playerCharacterListener));
        jp1 = new JPanel(new GridLayout(3,1));
        jp1.setSize(100,120);
        jp1.setLocation(40,130);
        jp1.setBackground(lightBlue);
        bg = new ButtonGroup();
        bg.add(ctr1);
        bg.add(ctr2);
        bg.add(ctr3);
        jp1.add(ctr1);
        jp1.add(ctr2);
        jp1.add(ctr3);


        cs1 = new JLabel("Hit Points");
        cs2 = new JLabel("Defense");
        cs3 = new JLabel("Agility");
        cs4 = new JLabel("Base Attack");
        jp2 = new JPanel(new GridLayout(4,1));
        jp2.add(cs1);
        jp2.add(cs2);
        jp2.add(cs3);
        jp2.add(cs4);
        jp2.setSize(100,120);
        jp2.setLocation(370,130);
        jp2.setBackground(lightBlue);



        rel = new JButton("Reroll");
        rel.setSize(100,20);
        rel.setLocation(395,260);
        rel.setFont(new Font("Old English Text MT",Font.BOLD,16));

        syw = new JLabel("Select Your Weapon");
        syw.setSize(235,40);
        syw.setLocation(40,310);
        syw.setFont(new Font("Old English Text MT",Font.BOLD,22));

        ws = new JLabel("Weapon Stats");
        ws.setSize(240,40);
        ws.setLocation(360,310);
        ws.setFont(new Font("Old English Text MT",Font.BOLD,22));

        im2 = new JLabel(new ImageIcon());
        im2.setSize(120,120);
        im2.setLocation(180,350);

        ws1 = new JLabel("Attack Modifier");
        ws2 = new JLabel("Weight");
        jp5 = new JPanel(new GridLayout(2,1));
        jp5.add(ws1);
        jp5.add(ws2);
        jp5.setSize(100,60);
        jp5.setLocation(360,350);
        jp5.setBackground(lightBlue);

        wst1 = new JTextArea();
        wst2 = new JTextArea();
        jp6 = new JPanel(new GridLayout(4,1,0,8));
        jp6.add(wst1);
        jp6.add(wst2);
        jp6.setSize(40,120);
        jp6.setLocation(470,355);
        jp6.setBackground(lightBlue);

        ftx = new JTextArea();
        ftx.setSize(325,80);
        ftx.setLocation(40,470);
        ftx.setLineWrap(true); // 设置自动换行
        ftx.setWrapStyleWord(true); // 设置单词换行
        ftx.setEditable(false);

        syw1 = new JRadioButton("Dagger");
        syw1.addItemListener(new SYWListener(WaponType.DAGGER, im2, wst1, wst2,ftx));
        syw1.setBackground(lightBlue);
        syw2 = new JRadioButton("Sword");
        syw2.addItemListener(new SYWListener(WaponType.SWORD, im2, wst1, wst2,ftx));
        syw2.setBackground(lightBlue);
        syw3 = new JRadioButton("Hammer");
        syw3.addItemListener(new SYWListener(WaponType.HAMMER, im2, wst1, wst2,ftx));
        syw3.setBackground(lightBlue);
        bg2 = new ButtonGroup();
        bg2.add(syw1);
        bg2.add(syw2);
        bg2.add(syw3);
        jp4 = new JPanel(new GridLayout(3,1));
        jp4.add(syw1);
        jp4.add(syw2);
        jp4.add(syw3);
        jp4.setSize(100,120);
        jp4.setLocation(40,350);
        jp4.setBackground(lightBlue);



        sb = new JButton("Start Battle");
        sb.setSize(120,20);
        sb.setLocation(380,500);
        sb.setFont(new Font("Old English Text MT",Font.BOLD,16));

        // Listener
        sb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String characterName = JTN.getText();
                String characterType = "";
                String characterType1 = "";
                if (ctr1.isSelected()) {
                    characterType = "Warrior \nHP: 100    Defense: 60    Agility: 40    Base Attack: 20";
                    characterType1 = "Warrior";

                } else if (ctr2.isSelected()) {
                    characterType = "Wizard  \nHP: 20     Defense: 60    Agility: 100    Base Attack: 40";
                    characterType1 = "Wizard";
                } else if (ctr3.isSelected()) {
                    characterType = "Cleric  \nHP: 40     Defense: 100    Agility: 20    Base Attack: 60" ;
                    characterType1 = "Cleric";
                }

                String weaponType = "";
                if (syw1.isSelected()) {
                    weaponType = "Dagger \tWeight: 2    Attack Mod: 1";
                } else if (syw2.isSelected()) {
                    weaponType = "Sword \tWeight: 10    Attack Mod: 5";
                } else if (syw3.isSelected()) {
                    weaponType = "Hammer \tWeight: 20    Attack Mod: 10";
                }


                BattlePage bp = new BattlePage(characterName, characterType,characterType1, weaponType,characterImagePath);
                bp.setSize(600, 650);
                bp.setTitle("DND Game");
                bp.setLocationRelativeTo(null);
                bp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                bp.setVisible(true);

                CharacterGen.this.dispose();
            }
        });


        container.add(cgLabel);
        container.add(enLabel);
        container.add(JTN);
        container.add(ctLabel);
        container.add(csLabel);
        container.add(jp1);
        container.add(im);
        container.add(jp2);
        container.add(jp3);
        container.add(Cintro);
        container.add(rel);
        container.add(syw);
        container.add(ws);
        container.add(jp4);
        container.add(im2);
        container.add(jp5);
        container.add(jp6);
        container.add(ftx);
        container.add(sb);
    }
}