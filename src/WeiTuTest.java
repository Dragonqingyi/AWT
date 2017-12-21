import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class WeiTuTest {
    private final int AREA_WIDTH = 600;
    private final int AREA_HEIGHT = 400;
    private int preX = -1;
    private int preY = -1;
    PopupMenu huabi = new PopupMenu();
    MenuItem hongItem = new MenuItem("Red");
    MenuItem lvItem = new MenuItem("Green");
    MenuItem lanItem = new MenuItem("Blue");

    BufferedImage image = new BufferedImage(AREA_WIDTH,AREA_HEIGHT, BufferedImage.TYPE_INT_RGB);
    Graphics g = image.getGraphics();
    private Frame f = new Frame("绘图程序");
    private DrawCanves drawArea = new DrawCanves();
    private String shape = "";
    private Color foreColor = new Color(255,0,0);

    public void init(){
        ActionListener menuListener = e -> {
            if (e.getActionCommand().equals("Green")){
                foreColor = new Color(0,255,0);
            }
            if (e.getActionCommand().equals("Red")){
                foreColor = new Color(255,0,0);
            }
            if (e.getActionCommand().equals("Blue")){
                foreColor = new Color(0,0,255);
            }
        };

        hongItem.addActionListener(menuListener);
        lvItem.addActionListener(menuListener);
        lanItem.addActionListener(menuListener);

        huabi.add(hongItem);
        huabi.add(lvItem);
        huabi.add(lanItem);

        drawArea.add(huabi);
        g.fillRect(0,0,AREA_WIDTH,AREA_HEIGHT);
        drawArea.setPreferredSize(new Dimension(AREA_WIDTH,AREA_HEIGHT));
        drawArea.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (preX > 0 && preY > 0){
                    g.setColor(foreColor);
                    g.drawLine(preX,preY,e.getX(),e.getY());
                }

                preX = e.getX();
                preY = e.getY();
                drawArea.repaint();
            }
        });

        drawArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()){
                    huabi.show(drawArea,e.getX(),e.getY());
                }

                preX = -1;
                preY = -1;
            }
        });

        f.add(drawArea);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new WeiTuTest().init();
    }


    class DrawCanves extends Canvas{
        @Override
        public void paint(Graphics g) {
            g.drawImage(image,0,0,null);
        }
    }
}
