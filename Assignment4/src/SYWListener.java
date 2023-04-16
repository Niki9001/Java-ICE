import javax.swing.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;


enum WaponType {
    DAGGER, SWORD, HAMMER
}
public class SYWListener implements ItemListener {
    private WaponType waponType;
    private JLabel im2;
    private JTextArea wst1,wst2,ftx;
    public  SYWListener(WaponType waponType, JLabel im2, JTextArea wst1, JTextArea wst2,JTextArea ftx) {
        this.waponType = waponType;
        this.im2 = im2;
        this.wst1 = wst1;
        this.wst2 = wst2;
        this.ftx = ftx;

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            updatewaponStats(waponType);
        }
    }

    private void updatewaponStats(WaponType waponType) {
        switch (waponType) {
            case SWORD:
                im2.setIcon(new ImageIcon("sword.png"));
                wst1.setText("+5");
                wst2.setText("10");
                ftx.setText("A sword is a good all-round weapon. It is not too heavy and inflicts a lot of damage");
                break;
            case DAGGER:
                im2.setIcon(new ImageIcon("dagger.png"));
                wst1.setText("+1");
                wst2.setText("2");;
                ftx.setText("A dagger is a light weapon. It is light and inflicts a small damage");
                break;
            case HAMMER:
                im2.setIcon(new ImageIcon("hammer.png"));
                wst1.setText("+10");
                wst2.setText("20");;
                ftx.setText("A hammer is a heavy weapon. It is heavy and inflicts a huge damage");
                break;
        }
    }
}

