import javax.swing.*;
import java.awt.*;

public class youngBoxLayout {
    private Frame f = new Frame("测试");
    public void init(){
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        f.add(new Button("First"));
        f.add(new Button("Second"));
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new youngBoxLayout().init();
    }
}
