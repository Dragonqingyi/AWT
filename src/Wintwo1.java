import javax.swing.*;
import java.awt.*;

public class Wintwo1 extends Frame{
    Button b1 = new Button("commit");
    Button b2 = new Button("cancel");
    Button b3 = new Button("reset");

    Wintwo1(){
        this.setTitle("使用FlowLayout布局");
        this.setLayout(new FlowLayout());
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.setBounds(100,100,450,350);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Wintwo1();
    }
}
