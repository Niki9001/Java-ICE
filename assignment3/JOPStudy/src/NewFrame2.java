import javax.swing.*;
import java.awt.*;

public class NewFrame2 extends JFrame {
    JLabel lblUserName;
    JLabel lblPassword;
    JTextField txtUserName;
    JPasswordField pwdPassword;
    JButton btnLogin;
    JButton btnCancel;
    public NewFrame2(){
        init();
    }
    private void init(){
        Container container = this.getContentPane();
        container.setLayout(null);
        lblUserName = new JLabel("user name");
        lblPassword = new JLabel("password");
        txtUserName = new JTextField();
        pwdPassword = new JPasswordField();
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        lblUserName.setSize(70,40);
        lblUserName.setLocation(100,60);

        lblPassword.setSize(70,40);
        lblPassword.setLocation(100,160);

        txtUserName.setSize(300,40);
        txtUserName.setLocation(200,60);
    }
}
