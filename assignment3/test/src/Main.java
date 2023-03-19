import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame1 fm1 = new Frame1();
        fm1.setLocationRelativeTo(null);
        fm1.setSize(600,400);//设置窗体大小
        fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm1.setVisible(true);

    }
}