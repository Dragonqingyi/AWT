import java.awt.*;
import java.awt.event.*;

public class YoujianMenuTest {
    private TextArea ta = new TextArea(4, 30);
    private Frame f = new Frame("右键菜单");
    PopupMenu pop = new PopupMenu();
    CheckboxMenuItem autoWrap = new CheckboxMenuItem("new line");
    MenuItem copyItem = new MenuItem("copy");
    MenuItem pasteItem = new MenuItem("paste");
    Menu format = new Menu("format");
    MenuItem commentItem = new MenuItem("comment", new MenuShortcut(KeyEvent.VK_SLASH, true));
    MenuItem canaelItem = new MenuItem("cancel");

    public void init() {
        ActionListener menuListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                ta.append("单击" + cmd + "菜单" + "\n");
                if (cmd.equals("退出")) {
                    System.exit(0);
                }

            }
        };
        commentItem.addActionListener(menuListener);
        pop.add(autoWrap);
        pop.addSeparator();
        pop.add(copyItem);
        pop.add(pasteItem);
        format.add(commentItem);
        format.add(canaelItem);
        pop.add(new MenuItem("-"));
        pop.add(format);
        final Panel p = new Panel();
        p.setPreferredSize(new Dimension(300,160));
        p.add(pop);
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()){
                    pop.show(p,e.getX(),e.getY());
                }
            }
        });
        f.add(p);
        f.add(ta,BorderLayout.NORTH);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ta.append("试图关闭窗口!\n");
                System.exit(0);
            }
        });
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new YoujianMenuTest().init();
    }
}
