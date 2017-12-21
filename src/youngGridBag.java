import java.awt.*;

public class youngGridBag {
    private Frame f = new Frame("测试窗口");
    private GridBagLayout gb = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();
    private Button[] bs = new Button[10];
    public void init(){
        f.setLayout(gb);
        for (int i = 0; i < bs.length; i++) {
            bs[i] = new Button("Button"+i);
        }
        //所有组件都可以横向，纵向扩大
        gbc.fill = GridBagConstraints.BOTH;
        //界面改变时，组件的改变比例
        gbc.weightx = 1;
        addButton(bs[0]);
        addButton(bs[1]);
        addButton(bs[2]);

        //设置为横向的最后一个元素
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        addButton(bs[3]);

        //组件向上不会扩大
        gbc.weightx = 0;
        addButton(bs[4]);

        //组件横跨两个网格
        gbc.gridwidth = 2;
        addButton(bs[5]);

        //组件横跨一哥网格
        gbc.gridwidth = 1;

        //组件纵跨2个网格
        gbc.gridheight = 2;

        //组件设置为横向最后一个元素
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addButton(bs[6]);

        //组件横跨一个网格，纵跨2个网格
        gbc.gridwidth=1;
        gbc.gridheight = 2;

        //组件纵向扩大权重为1
        gbc.weighty = 1;
        addButton(bs[7]);

        //组件纵向不会扩大
        gbc.weighty=0;

        //组件设置为横向最后一个
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        //组合横跨一个网格
        gbc.gridheight=1;
        addButton(bs[8]);
        addButton(bs[9]);
        f.pack();
        f.setVisible(true);
    }

    private void addButton(Button button){
        gb.setConstraints(button,gbc);
        f.add(button);
    }

    public static void main(String[] args) {
        new youngGridBag().init();
    }
}
