import java.awt.*;

public class WinNull1 extends Frame{
    Button b1 = new Button("one");
    Button b2 = new Button("two");
    Button b3 = new Button("three");

    WinNull1(){
        this.setTitle("Null布局");
        this.setLayout(null);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        b1.setBounds(50,50,100,50);
        b2.setBounds(50,120,100,50);
        b3.setBounds(50,190,100,50);
        this.setBounds(100,100,450,400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new WinNull1();
    }
}
