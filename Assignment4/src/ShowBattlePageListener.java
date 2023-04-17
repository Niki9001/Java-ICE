/*
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ShowBattlePageListener implements ActionListener {
    private JTextField JTN;
    private JRadioButton ctr1, ctr2, ctr3;
    private JRadioButton syw1, syw2, syw3;

    public ShowBattlePageListener(JTextField JTN, JRadioButton ctr1, JRadioButton ctr2, JRadioButton ctr3, JRadioButton syw1, JRadioButton syw2, JRadioButton syw3) {
        this.JTN = JTN;
        this.ctr1 = ctr1;
        this.ctr2 = ctr2;
        this.ctr3 = ctr3;
        this.syw1 = syw1;
        this.syw2 = syw2;
        this.syw3 = syw3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取JTN文本
        String playerName = JTN.getText();

        // 获取选择的角色类型
        CharacterType selectedCharacterType = null;
        if (ctr1.isSelected()) {
            selectedCharacterType = CharacterType.WARRIOR;
        } else if (ctr2.isSelected()) {
            selectedCharacterType = CharacterType.WIZARD;
        } else if (ctr3.isSelected()) {
            selectedCharacterType = CharacterType.CLERIC;
        }

        // 获取选择的武器类型
        WaponType selectedWaponType = null;
        if (syw1.isSelected()) {
            selectedWaponType = WaponType.DAGGER;
        } else if (syw2.isSelected()) {
            selectedWaponType = WaponType.SWORD;
        } else if (syw3.isSelected()) {
            selectedWaponType = WaponType.HAMMER;
        }

        // 打开 BattlePage
        BattlePage battlePage = new BattlePage(playerName, selectedCharacterType, selectedWaponType);
        battlePage.updateJaText(playerName, selectedCharacterType, selectedWaponType);
        battlePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battlePage.setSize(600, 650);
        battlePage.setTitle("Battle Page");
        battlePage.setVisible(true);
    }
}
*/