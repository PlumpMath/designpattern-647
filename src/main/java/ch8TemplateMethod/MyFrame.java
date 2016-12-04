package ch8TemplateMethod;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zhang.zj on 2016/12/4.
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }



    public void paint(Graphics graphics){
        super.paint(graphics);

        String message = "I rule!";

        graphics.drawString(message, 100, 100);
    }

    public static void main(String[] args){
        MyFrame myFrame = new MyFrame("Head frist Design Patterns!");
    }
}
