import java.awt.*;
import java.awt.event.*;

public class MenuTest {
    private Frame f = new Frame("菜单窗体");
    private MenuBar mb = new MenuBar();
    Menu file = new Menu("File");
    Menu edit = new Menu("Edit");
    MenuItem newItem = new MenuItem("new");
    MenuItem saveItem = new MenuItem("save");
    MenuItem exitItem = new MenuItem("exit", new MenuShortcut(KeyEvent.VK_X));
    CheckboxMenuItem autoWrap = new CheckboxMenuItem("newline");
    MenuItem copyItem = new MenuItem("copy");
    MenuItem pasteItem = new MenuItem("paste");
    Menu format = new Menu("format");
    MenuItem commentItem = new MenuItem("comment", new MenuShortcut(KeyEvent.VK_SLASH,true));
    MenuItem cancelItem = new MenuItem("delete comment");
    private TextArea ta = new TextArea(6,40);

    public void init(){
        ActionListener menuListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                ta.append("单击"+cmd+"菜单"+"\n");
                if (cmd.equals("退出")){
                    System.exit(0);
                }
            }
        };

        //添加两个监听器
        commentItem.addActionListener(menuListener);
        exitItem.addActionListener(menuListener);
        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);

        edit.add(autoWrap);
        edit.addSeparator();
        edit.add(copyItem);
        edit.add(pasteItem);

        format.add(commentItem);
        format.add(cancelItem);

        edit.add(new MenuItem("-"));
        edit.add(format);

        mb.add(file);
        mb.add(edit);

        f.setMenuBar(mb);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ta.append("试图关闭窗口!\n");
                System.exit(0);
            }
        });
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuTest().init();
    }
}
