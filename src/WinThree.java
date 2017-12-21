import javafx.util.Builder;

import java.awt.*;

public class WinThree extends Frame {
    Button b1 = new Button("center");
    Button b2 = new Button("up");
    Button b3 = new Button("down");
    Button b4 = new Button("left");
    Button b5 = new Button("right");
    WinThree(){
        this.setTitle("5个按钮随意摆");
        this.setLayout(new BorderLayout());
        this.add(b1,BorderLayout.CENTER);
        this.add(b2,BorderLayout.NORTH);
        this.add(b3,BorderLayout.SOUTH);
        this.add(b4,BorderLayout.WEST);
        this.add(b5,BorderLayout.EAST);
        this.setBounds(300,200,450,450);
        this.setVisible(true);
        this.setBackground(Color.blue);
    }

    public static void main(String[] args) {
        new WinThree();
    }
}
