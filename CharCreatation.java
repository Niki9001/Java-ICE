import javax.swing.*;
import java.awt.*;

public class CharCreatation extends JFrame {

    JLabel cgLabel, enLabel, ctLabel,csLabel,im,im2
    ,cs1,cs2,cs3,cs4,syw,ws,ws1,ws2;
    JRadioButton ctr1,ctr2,ctr3,syw1,syw2,syw3;
    JButton rel,sb;
    ButtonGroup bg,bg2;
    JTextField JTN,cst1,cst2,cst3,cst4,Cintro,wst1,wst2,ftx;
    public CharCreatation(){
        init();
    }
    private void init(){
        //JFrame frame = new JFrame("DND Game");
        //this.setLayout(new GridLayout(8,3));
        GridLayout layout = new GridLayout(3, 2);
        JPanel panel = new JPanel();
        panel.setLayout(layout);

        JPanel JP1 = new JPanel(new GridLayout(1,1));
        JPanel JP2 = new JPanel(new GridLayout(1,4));
        JPanel JP3 = new JPanel(new GridLayout(1,2));
        JPanel JP4 = new JPanel(new GridLayout(4,4));
        JPanel JP5 = new JPanel(new GridLayout(1,2));
        JPanel JP6 = new JPanel(new GridLayout(1,2));
        JPanel JP7 = new JPanel(new GridLayout(3,4));
        JPanel JP8 = new JPanel(new GridLayout(1,2));

        JP4.setSize(800,100);
        JTN = new JTextField();

        //Container container = this.getContentPane();
        //container.setLayout(null);

        cgLabel = new JLabel();
        cgLabel.setSize(400,50);
        cgLabel.setLocation(10,10);
        cgLabel.setText("Character Generator");
        cgLabel.setFont(new Font("Chalkboard",Font.BOLD,32));
        JP1.add(cgLabel);

        enLabel = new JLabel();
        enLabel.setSize(200,50);
        enLabel.setLocation(10,40);
        enLabel.setText("Enter Name");
        enLabel.setFont(new Font("Chalkboard",Font.BOLD,24));

        JTN = new JTextField();
        JTN.setSize(10,10);
        //JTN.setLocation(20,40);
        JP2.add(enLabel);
        JP2.add(JTN);

        ctLabel = new JLabel();
        ctLabel.setSize(200,50);
        ctLabel.setLocation(10,70);
        ctLabel.setText("Character Type");
        ctLabel.setFont(new Font("Chalkboard",Font.BOLD,24));
        JP3.add(ctLabel);


        csLabel = new JLabel();
        csLabel.setSize(200,50);
        csLabel.setLocation(400,70);
        csLabel.setText("Character Stats");
        csLabel.setFont(new Font("Chalkboard",Font.BOLD,24));
        JP3.add(csLabel);

        ctr1 = new JRadioButton("Warrior");
        ctr2 = new JRadioButton("Wizard");
        ctr3 = new JRadioButton("Cleric");
        im = new JLabel(new ImageIcon("fighter.png"));
        im.setSize(50,100);
        cs1 = new JLabel("Hit Points");
        cs2 = new JLabel("Defense");
        cs3 = new JLabel("Agility");
        cs4 = new JLabel("Base Attack");
        cst1 = new JTextField();
        cst2 = new JTextField();
        cst3 = new JTextField();
        cst4 = new JTextField();
//        GroupLayout.ParallelGroup v1 = layout.createParallelGroup().
//                addComponent(ctr1).addComponent(ctr2).addComponent(ctr3);
//        GroupLayout.ParallelGroup v2 = layout.createParallelGroup().
//                addComponent(im);
//        GroupLayout.ParallelGroup v3 = layout.createParallelGroup().
//                addComponent(cs1).addComponent(cs2).addComponent(cs3).addComponent(cs4);
//        GroupLayout.ParallelGroup v4 = layout.createParallelGroup().
//                addComponent(cst1).addComponent(cst2).addComponent(cst3).
//                addComponent(cst4);
//        GroupLayout.SequentialGroup vsq = layout.createSequentialGroup().addGroup(v1).
//                addGroup(v2).addGroup(v3).addGroup(v4);
//        layout.setVerticalGroup(vsq);




        JP4.add(ctr1);
        JP4.add(ctr2);
        JP4.add(ctr3);
        JP4.add(im);
        JP4.add(cs1);
        JP4.add(cs2);
        JP4.add(cs3);
        JP4.add(cs4);
        JP4.add(cst1);
        JP4.add(cst2);
        JP4.add(cst3);
        JP4.add(cst4);

        bg = new ButtonGroup();
        bg.add(ctr1);
        bg.add(ctr2);
        bg.add(ctr3);

        Cintro = new JTextField();
        rel = new JButton("Reroll");
        JP5.add(Cintro);
        JP5.add(rel);


        syw = new JLabel("Select Your Weapon");
        syw.setSize(200,50);
        syw.setLocation(10,40);
        syw.setFont(new Font("Chalkboard",Font.BOLD,24));


        ws = new JLabel("Weapon Stats");
        ws.setSize(200,50);
        ws.setLocation(10,40);
        ws.setFont(new Font("Chalkboard",Font.BOLD,24));

        JP6.add(syw);
        JP6.add(ws);

        syw1 = new JRadioButton("Dagger");
        syw2 = new JRadioButton("Sword");
        syw3 = new JRadioButton("Hammer");
        JP7.add(syw1);
        JP7.add(syw2);
        JP7.add(syw3);
        bg2 = new ButtonGroup();
        bg2.add(syw1);
        bg2.add(syw2);
        bg2.add(syw3);
        im2 = new JLabel(new ImageIcon("sword.png"));
        JP7.add(im2);
        ws1 = new JLabel("Attack Modifier");
        ws1.setSize(200,50);
        ws1.setLocation(10,40);
        ws1.setFont(new Font("Chalkboard",Font.PLAIN,14));
        ws2 = new JLabel("Weight");
        ws2.setSize(200,50);
        ws2.setLocation(10,40);
        ws2.setFont(new Font("Chalkboard",Font.PLAIN,14));
        JP7.add(ws1);
        JP7.add(ws2);
        wst1 = new JTextField();
        wst2 = new JTextField();
        JP7.add(wst1);
        JP7.add(wst2);

        ftx = new JTextField();
        sb = new JButton("Start Battle");
        JP8.add(ftx);
        JP8.add(sb);

        //JP4.setSize(10,100);

        //frame.setLayout(new GridLayout(13,3));

        this.setVisible(true);
        this.add(JP1);
        this.add(JP2);
        this.add(JP3);
        this.add(JP4);
        this.add(JP5);
        this.add(JP6);
        this.add(JP7);
        this.add(JP8);

        //container.add(csLabel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }
}
