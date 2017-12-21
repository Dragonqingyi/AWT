import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
左右数据选择框
 */
public class MyFrame extends Frame{
    JPanel mainPAnel = new JPanel();
    JButton add = new JButton();
    JButton left = new JButton();
    JButton right = new JButton();
    JLabel label  = new JLabel();
    JTextField field =new JTextField();
    DefaultListModel leftModel = new DefaultListModel();
    DefaultListModel rightModel = new DefaultListModel();
    JList leftList = new JList(leftModel);
    JList rightList = new JList(rightModel);

    JPanel left_right_panel = new JPanel();

    public MyFrame(){
        this.setTitle("test");
        this.setPreferredSize(new Dimension(600,400));
        this.initComponent();
        this.addData();
        this.setVisible(true);
        this.pack();
    }

    /*
    初始化组件
     */

    private void initComponent(){
        label.setText("添加选项:");
        add.setText("Add");
        leftList.setPreferredSize(new Dimension(150,150));
        rightList.setPreferredSize(new Dimension(leftList.getPreferredSize()));
        left.setText("left");
        right.setText("right");
        mainPAnel.setBorder(BorderFactory.createTitledBorder("左右选择框"));
        mainPAnel.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.weighty = 0;
        mainPAnel.add(label,c);

        c.gridx++;
        c.weightx = 1;
        mainPAnel.add(field, c);

        c.gridx++;
        c.weightx = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        mainPAnel.add(add,c);

        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.gridwidth = 2;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        mainPAnel.add(leftList,c);

        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0.5;
        c.anchor = GridBagConstraints.SOUTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        mainPAnel.add(left,c);

        c.gridx = 2;
        c.gridy = 2;
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        mainPAnel.add(right,c);

        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        mainPAnel.add(rightList,c);

        this.add(mainPAnel);
    }

    //添加数据
    private void addData(){
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leftItem();
            }
        });

        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rightItem();
            }
        });
    }

    //增加项
    private void addItem(){
        if (field.getText() != null && !field.getText().equals("")){
            ((DefaultListModel)leftList.getModel()).addElement(field.getText());
            field.setText("");
        }
    }

    //左移项
    private void leftItem(){
        if (rightList.getSelectedIndex() != -1){
            Object o = rightList.getSelectedValue();
            ((DefaultListModel)rightList.getModel()).remove(rightList.getSelectedIndex());
            ((DefaultListModel)leftList.getModel()).addElement(o);
        }
    }

    //右移项
    private void rightItem(){
        if (leftList.getSelectedIndex() != -1){
            Object o = leftList.getSelectedValue();
            ((DefaultListModel)leftList.getModel()).remove(leftList.getSelectedIndex());
            ((DefaultListModel)rightList.getModel()).addElement(o);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (UnsupportedLookAndFeelException e){
            e.printStackTrace();
        }
        MyFrame frame = new MyFrame();
    }
}