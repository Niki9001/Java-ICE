import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomePage.setSize(600, 650);
        welcomePage.setTitle("DND Game");
        welcomePage.setVisible(true);

        /* check local font
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = ge.getAvailableFontFamilyNames();
        for(String font : fonts){
            System.out.println(font);
            if("汉仪雅酷黑 55W".equals(font)){
                System.out.println(font);
            }
        }

         */
    }
}
