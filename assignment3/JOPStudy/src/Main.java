import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame(); //虽然创建了，但是系统默认不显示
        jFrame.setSize(600,400);//设置窗体大小
        //jFrame.setLocation(100,200); //设置窗体位置，x左侧顶点距离屏幕左侧的距离，y左侧顶点距离屏幕上面的距离
        jFrame.setLocationRelativeTo(null); //窗体出现在最中间，null设置为空
        jFrame.setTitle("My first windows"); //设置窗体标题

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame静态属性，关闭的时候停止程序

        //获得窗体的主体区域
        Container container = jFrame.getContentPane();
        //设置流式布局管理器
        // 从左向右
        container.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        // button 左对齐
        //container.setLayout(new FlowLayout(FlowLayout.LEFT));
        container.setLayout(new FlowLayout(FlowLayout.LEADING,100,30));


        // 创建JButton对象
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        // 将JButton添加到窗体的主体区域
        container.add(button1);
        container.add(button2);



        jFrame.setVisible(true); //显示窗体
    }
}