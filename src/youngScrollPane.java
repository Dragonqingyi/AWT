import java.awt.*;

public class youngScrollPane {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        //总是具有滚动条
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        sp.add(new TextField(20));
        sp.add(new Button("Point at me"));
        f.add(sp);
        f.setBounds(30,30,250,120);
        f.setVisible(true);
    }

}
