import java.awt.*;
import java.awt.event.TextEvent;

public class TextListener extends Frame implements java.awt.event.TextListener{
    TextArea ta = new TextArea("请输入心中想说的话");

    TextListener(){
        this.setTitle("监听文本框");
        this.add(ta);
        Font f = new Font("楷体", Font.ITALIC+Font.BOLD,18);
        ta.setFont(f);
        ta.addTextListener(this);
        ta.setForeground(Color.blue);
        this.setBounds(100,100,450,400);
        this.setVisible(true);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        System.out.println(ta.getText());
    }

    public static void main(String[] args) {
        new TextListener();
    }
}
