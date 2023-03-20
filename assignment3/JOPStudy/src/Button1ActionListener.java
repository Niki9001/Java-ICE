import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button1ActionListener implements ActionListener {
    MyFrame1 myFrame1;
    int counter = 0;
    Button1ActionListener(MyFrame1 myFrame1){
        this.myFrame1 = myFrame1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        myFrame1.button2.setText("Button clicked "+counter+" times.");
    }
}
