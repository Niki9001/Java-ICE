import javax.swing.*;

public class Demo01 {
    public static void main(String[] args){
        NewFrame01 newFrame01 = new NewFrame01();
        newFrame01.setSize(600,400);
        newFrame01.setLocationRelativeTo(null);
        newFrame01.setTitle("Add new panel");
        newFrame01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame01.setVisible(true);
    }
}
