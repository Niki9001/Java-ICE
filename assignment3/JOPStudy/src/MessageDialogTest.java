import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MessageDialogTest {
    public static void main(String[] args){
        MyFrame6 myFrame = new MyFrame6();
        /*
        初始化窗体
        myFrame.setSize(600,400);//设置窗体大小
        //myFrame.setLocation(100,200); //设置窗体位置，x左侧顶点距离屏幕左侧的距离，y左侧顶点距离屏幕上面的距离
        myFrame.setLocationRelativeTo(null); //窗体出现在最中间，null设置为空
        myFrame.setTitle("My first windows"); //设置窗体标题
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame静态属性，关闭的时候停止程序
        */
        myFrame.setLocationRelativeTo(null);
        myFrame.setSize(600,400);//设置窗体大小
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
