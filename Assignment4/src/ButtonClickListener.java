import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    private JFrame previousPage;
    private ButtonActionType actionType;

    public ButtonClickListener(JFrame previousPage, ButtonActionType actionType) {
        this.previousPage = previousPage;
        this.actionType = actionType;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (actionType) {
            case BUILD_CHARACTER:
                handleBuildCharacterButtonClick();
                break;
            case START_BATTLE:
                handleStartBattleButtonClick();
                break;
            case BATTLE_AGAIN:
                handleBattleAgainButtonClick();
                break;
        }
    }

    private void handleBuildCharacterButtonClick() {
        previousPage.dispose();
        CharacterGen characterGen = new CharacterGen();
        characterGen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        characterGen.setSize(600, 650);
        characterGen.setVisible(true);
        characterGen.setTitle("DND Game");
    }

    private void handleStartBattleButtonClick() {
        previousPage.dispose();
        BattlePage battlePage = new BattlePage();
        battlePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battlePage.setSize(600, 650);
        battlePage.setVisible(true);
        battlePage.setTitle("DND Game");
    }

    private void handleBattleAgainButtonClick() {
        previousPage.dispose();
        CharacterGen characterGen = new CharacterGen();
        characterGen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        characterGen.setSize(600, 650);
        characterGen.setVisible(true);
        characterGen.setTitle("DND Game");
    }
}

enum ButtonActionType {
    BUILD_CHARACTER,
    START_BATTLE,
    BATTLE_AGAIN
}

