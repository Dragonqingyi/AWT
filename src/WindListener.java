import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindListener extends Frame implements WindowListener {

    WindListener() {
        this.setTitle("窗口监听");
        this.addWindowListener(this);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("打开");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("菜单关闭");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("释放");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("到最小化");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("到最大化");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("激活");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("失去焦点");
    }

    public static void main(String[] args) {
        new WindListener();
    }
}
