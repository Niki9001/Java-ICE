import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton button1;
    JButton button2;
    public MyFrame(String title){
        init(title);

    }
    private void init(String title){
        // 创建按钮
        button1=new JButton("Button 1");
        button2=new JButton("Button 2");
        Container container = this.getContentPane();

        //初始化窗体
        this.setSize(600,400);//设置窗体大小
        //jFrame.setLocation(100,200); //设置窗体位置，x左侧顶点距离屏幕左侧的距离，y左侧顶点距离屏幕上面的距离
        this.setLocationRelativeTo(null); //窗体出现在最中间，null设置为空
        this.setTitle("My first windows"); //设置窗体标题
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame静态属性，关闭的时候停止程序

        // 流式布局
        container.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        // button 左对齐
        //container.setLayout(new FlowLayout(FlowLayout.LEFT));
        container.setLayout(new FlowLayout(FlowLayout.LEADING,100,30));

        // 添加按钮
        container.add(button1);
        container.add(button2);
    }
}
