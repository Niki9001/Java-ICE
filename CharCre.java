import javax.swing.*;
import java.awt.*;

public class CharCre extends JFrame {

    JLabel cgLabel, enLabel, ctLabel, csLabel, im, im2, cs1, cs2, cs3, cs4,
            syw, ws, ws1, ws2,blk,blk1;
    JRadioButton ctr1, ctr2, ctr3, syw1, syw2, syw3;
    JButton rel, sb;
    ButtonGroup bg, bg2;
    JPanel jp1,jp2,jp3;
    JTextField JTN, cst1, cst2, cst3, cst4, Cintro, wst1, wst2, ftx;

    public CharCre() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx=1;
        constraints.weighty=1;

        // Initialize components
        blk = new JLabel();
        blk1 = new JLabel();

        JTN = new JTextField();

        jp1 = new JPanel(new GridLayout(3,1));
        jp2 = new JPanel(new GridLayout(4,1));
        jp3 = new JPanel(new GridLayout(4,1));

        cgLabel = new JLabel();
        cgLabel.setSize(400,50);
        cgLabel.setLocation(10,10);
        cgLabel.setText("Character Generator");
        cgLabel.setFont(new Font("Chalkboard",Font.BOLD,32));


        enLabel = new JLabel();
        enLabel.setSize(50,20);
        enLabel.setLocation(10,40);
        enLabel.setText("Enter Name");
        enLabel.setFont(new Font("Chalkboard",Font.BOLD,24));

        JTN = new JTextField();
        JTN.setSize(10,10);
        //JTN.setLocation(20,40);


        ctLabel = new JLabel();
        ctLabel.setSize(200,50);
        ctLabel.setLocation(10,70);
        ctLabel.setText("Character Type");
        ctLabel.setFont(new Font("Chalkboard",Font.BOLD,24));



        csLabel = new JLabel();
        csLabel.setSize(200,50);
        csLabel.setLocation(400,70);
        csLabel.setText("Character Stats");
        csLabel.setFont(new Font("Chalkboard",Font.BOLD,24));


        ctr1 = new JRadioButton("Warrior");
        ctr2 = new JRadioButton("Wizard");
        ctr3 = new JRadioButton("Cleric");
        im = new JLabel(new ImageIcon("fighter.png"));
        im.setSize(50,100);
        cs1 = new JLabel("Hit Points");
        cs2 = new JLabel("Defense");
        cs3 = new JLabel("Agility");
        cs4 = new JLabel("Base Attack");

        jp2.add(cs1);
        jp2.add(cs2);
        jp2.add(cs3);
        jp2.add(cs4);

        cst1 = new JTextField();
        cst2 = new JTextField();
        cst3 = new JTextField();
        cst4 = new JTextField();
        jp3.add(cst1);
        jp3.add(cst2);
        jp3.add(cst3);
        jp3.add(cst4);

        bg = new ButtonGroup();
        bg.add(ctr1);
        bg.add(ctr2);
        bg.add(ctr3);

        jp1.add(ctr1);
        jp1.add(ctr2);
        jp1.add(ctr3);

        Cintro = new JTextField();
        rel = new JButton("Reroll");



        syw = new JLabel("Select Your Weapon");
        syw.setSize(200,50);
        syw.setLocation(10,40);
        syw.setFont(new Font("Chalkboard",Font.BOLD,24));


        ws = new JLabel("Weapon Stats");
        ws.setSize(200,50);
        ws.setLocation(10,40);
        ws.setFont(new Font("Chalkboard",Font.BOLD,24));



        syw1 = new JRadioButton("Dagger");
        syw2 = new JRadioButton("Sword");
        syw3 = new JRadioButton("Hammer");

        bg2 = new ButtonGroup();
        bg2.add(syw1);
        bg2.add(syw2);
        bg2.add(syw3);
        im2 = new JLabel(new ImageIcon("sword.png"));

        ws1 = new JLabel("Attack Modifier");
        ws1.setSize(200,50);
        ws1.setLocation(10,40);
        ws1.setFont(new Font("Chalkboard",Font.PLAIN,14));
        ws2 = new JLabel("Weight");
        ws2.setSize(200,50);
        ws2.setLocation(10,40);
        ws2.setFont(new Font("Chalkboard",Font.PLAIN,14));

        wst1 = new JTextField();
        wst2 = new JTextField();


        ftx = new JTextField();
        sb = new JButton("Start Battle");


        // Add components to the layout with GridBagConstraints
        constraints.fill = GridBagConstraints.HORIZONTAL;

        // Character generator label
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx=0;
        constraints.weighty=0;
        constraints.gridwidth = 4;
        this.add(cgLabel, constraints);

        // Blank column
        constraints.weightx=5;
        constraints.weighty=0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        this.add(blk1,constraints);

        // Enter name and text field
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weightx=0;
        constraints.weighty=1;
        constraints.gridwidth = 1;
        this.add(enLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.weightx=1;
        constraints.weighty=1;
        //constraints.gridwidth = GridBagConstraints.REMAINDER;
        this.add(JTN, constraints);

        constraints.weightx=2;
        constraints.weighty=1;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        this.add(blk, constraints);


        // Character type and character stats label
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        this.add(ctLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        this.add(csLabel, constraints);

        constraints.weightx=0.5;
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 0;
        this.add(jp1, constraints);

        constraints.gridx = 1;
        constraints.weightx=0.5;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        this.add(im, constraints);

        constraints.gridx = 2;
        constraints.weightx=0.5;
        constraints.gridy = 3;
//        constraints.gridwidth = GridBagConstraints.REMAINDER;
        this.add(jp2, constraints);

        constraints.gridx = 3;
        constraints.gridy = 3;
        constraints.gridwidth = 3;
        this.add(jp3, constraints);

        // ...
        // Add the remaining components with appropriate constraints

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
