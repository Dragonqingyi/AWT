import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinFour1 extends Frame implements ActionListener {
    int i = 5;
    Button b1 = new Button("A");
    Button b2 = new Button("B");
    Button b3 = new Button("C");
    Button b4 = new Button("D");
    Button b5 = new Button("E");
    Button b6 = new Button("F");
    Button b7 = new Button("G");
    Button b8 = new Button("H");
    Button b9 = new Button("I");

    WinFour1(){
        this.setTitle("布局利器GridLayout");
        this.setLayout(new GridLayout(3,3));
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        this.setBounds(100,100,450,450);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        i++;
        Button bi = new Button("button"+i);
        this.add(bi);
        bi.addActionListener(this);
        this.isShowing();
    }

    public static void main(String[] args) {
        new WinFour1();
    }
}
