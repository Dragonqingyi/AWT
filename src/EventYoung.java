import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventYoung {
    private Frame f = new Frame("test");
    private Button ok = new Button("OK");
    private TextField tf = new TextField(30);

    public void init(){
        ok.addActionListener(new OkListener());
        f.add(tf);
        f.add(ok, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    class OkListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("用户单击了按钮");
            tf.setText("Hello world");
        }
    }

    public static void main(String[] args) {
        new EventYoung().init();
    }
}
