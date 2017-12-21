import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener extends Frame implements ActionListener{
    Button b1 = new Button("Ok");
    Button b2 = new Button("Exit");

    ButtonListener(){
        this.setTitle("进入系统");
        this.add(b1);
        this.add(b2, BorderLayout.SOUTH);
        b1.addActionListener(this);
        b2.addActionListener(this);
        this.setBounds(100,100,300,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            System.out.println("进入系统");
        }
        else {
            System.out.println("退出");
        }
    }

    public static void main(String[] args) {
        new ButtonListener();
    }
}
