import java.awt.*;

public class youngPanel {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        Panel p = new Panel();
        p.add(new TextField(20));
        p.add(new Button("Point at me"));
        f.add(p);
        f.setBounds(30,30,250,120);
        f.setVisible(true);
        System.out.println(System.getProperty("file.encoding"));
    }
}
