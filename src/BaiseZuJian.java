import javax.swing.*;
import java.awt.*;

public class BaiseZuJian {
    Frame f = new Frame("测试");
    Button ok = new Button("OK");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox male = new Checkbox("Male",cbg,true);
    Checkbox female = new Checkbox("Female",cbg,false);
    Checkbox married = new Checkbox("Married？",false);
    Choice colorChoice = new Choice();
    List colorList = new List(6,true);
    TextArea ta = new TextArea(5,20);
    TextField name = new TextField(50);

    public void init(){
        colorChoice.add("red");
        colorChoice.add("green");
        colorChoice.add("blue");
        colorList.add("red");
        colorList.add("blue");
        colorList.add("green");
        Panel bottom = new Panel();
        bottom.add(name);
        bottom.add(ok);
        f.add(bottom, BorderLayout.SOUTH);
        Panel checkPanel = new Panel();
        checkPanel.add(colorChoice);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);
        Box topLeft = Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(checkPanel);

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);
        f.add(top);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BaiseZuJian().init();
    }
}
