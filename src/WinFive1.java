import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinFive1 extends Frame implements ActionListener{

    Panel p = new Panel();
    Button bf = new Button("First");
    Button bl = new Button("Last");
    Button bn = new Button("Next");
    Button bp = new Button("Previous");
    Button bg = new Button("Search");
    TextField tf = new TextField();
    CardLayout cl = new CardLayout();

    WinFive1(){
        this.setTitle("利用CardLayout布局组件");
        this.setLayout(null);
        this.add(p);
        p.setLayout(cl);
        for (int i = 0; i < 3; i++) {
            Button btemp = new Button("Button"+i);
            p.add(btemp,""+i);
        }

        p.setBounds(10,40,100,100);
        this.add(bf);
        bf.addActionListener(this);
        bf.setBounds(120,40,60,20);
        this.add(bl);
        bl.addActionListener(this);
        bl.setBounds(120,70,60,20);
        this.add(bn);
        bn.addActionListener(this);
        bn.setBounds(120,100,60,20);
        this.add(bp);
        bp.addActionListener(this);
        bp.setBounds(120,130,60,20);
        this.add(bg);
        bg.addActionListener(this);
        bg.setBounds(60,160,40,20);
        this.add(tf);
        tf.setBounds(20,160,40,20);
        this.setBounds(200,200,400,380);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bn){
            cl.next(p);
        }
        if (e.getSource() == bp){
            cl.previous(p);
        }
        if (e.getSource() == bf){
            cl.first(p);
        }
        if (e.getSource() == bl){
            cl.last(p);
        }
        if (e.getSource() == bg){
            cl.show(p,tf.getText().trim());
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new WinFive1();
    }
}
