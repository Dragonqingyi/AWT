import javax.swing.*;
import java.awt.*;

public class BoxJianJu {
    private Frame f = new Frame("测试");
    private Box horizontal = Box.createHorizontalBox();
    private Box vertical = Box.createVerticalBox();

    public void init(){
        horizontal.add(new Button("Horizontal one"));
        horizontal.add(Box.createHorizontalGlue());
        horizontal.add(new Button("Horizontal two"));
        horizontal.add(Box.createHorizontalStrut(10));
        horizontal.add(new Button("Horizontal three"));
        vertical.add(new Button("Vertical one"));
        vertical.add(Box.createVerticalGlue());
        vertical.add(new Button("Vertical two"));
        vertical.add(Box.createVerticalStrut(10));
        vertical.add(new Button("Vertical three"));
        f.add(horizontal,BorderLayout.NORTH);
        f.add(vertical);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxJianJu().init();
    }
}
