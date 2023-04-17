import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

enum CharacterType {
    WARRIOR, WIZARD, CLERIC
}

public class CharacterTypeItemListener implements ItemListener {
    private CharacterType characterType;
    private JLabel im;
    private JTextArea Cintro,cst1, cst2, cst3, cst4;


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            updateCharacterStats(characterType);
            String characterTypeString = "";
            String imagePath = "";
            switch (characterType) {
                case WARRIOR:
                    characterTypeString = "Warrior";
                    imagePath = "fighter.png";
                    break;
                case WIZARD:
                    characterTypeString = "Wizard";
                    imagePath = "wizard.png";
                    break;
                case CLERIC:
                    characterTypeString = "Cleric";
                    imagePath = "dwarf.png";
                    break;
            }
            playerCharacterListener.onPlayerCharacterSelected(characterTypeString, imagePath);
        }
    }

    private CharacterGen.PlayerCharacterListener playerCharacterListener;

    public CharacterTypeItemListener(CharacterType characterType, JLabel im, JTextArea cst1, JTextArea cst2, JTextArea cst3, JTextArea cst4, JTextArea Cintro, CharacterGen.PlayerCharacterListener playerCharacterListener) {
        this.characterType = characterType;
        this.im = im;
        this.cst1 = cst1;
        this.cst2 = cst2;
        this.cst3 = cst3;
        this.cst4 = cst4;
        this.Cintro = Cintro;
        this.playerCharacterListener = playerCharacterListener;
    }

    private void updateCharacterStats(CharacterType characterType) {
        switch (characterType) {
            case WARRIOR:
                im.setIcon(new ImageIcon("fighter.png"));
                cst1.setText("100");
                cst2.setText("60");
                cst3.setText("40");
                cst4.setText("20");
                Cintro.setText("Fighters are often human. Have higher HP and defense but low agility.");
                break;
            case WIZARD:
                im.setIcon(new ImageIcon("wizard.png"));
                cst1.setText("20");
                cst2.setText("60");
                cst3.setText("100");
                cst4.setText("40");
                Cintro.setText("Wizards are often characters in fantasy stories. Have high agility, but low HP.");
                break;
            case CLERIC:
                im.setIcon(new ImageIcon("dwarf.png"));
                cst1.setText("40");
                cst2.setText("100");
                cst3.setText("20");
                cst4.setText("60");
                Cintro.setText("Clerics are often powerful healers. Have high defense, but low agility.");
                break;
        }
    }
}
