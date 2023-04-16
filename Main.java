import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Welcome page
        Welcome_page wg = new Welcome_page();
        wg.setLocationRelativeTo(null);
        wg.setSize(800,600);
        wg.setTitle("DND Game");
        wg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wg.setVisible(true);
        //CharCreatation page
        CharCre cc = new CharCre();
        cc.setLocationRelativeTo(null);
        cc.setSize(800,600);
        cc.setTitle("DND Game");
//        cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc.setVisible(true);

    }
}