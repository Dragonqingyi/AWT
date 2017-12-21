import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Adapter1 {
    private Frame f = new Frame("测试");
    private TextArea ta = new TextArea(6,40);
    public void init(){
        f.addWindowListener(new MyListener());
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    class MyListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            ta.append("用户视图关闭窗口!\n");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Adapter1().init();
    }
}
