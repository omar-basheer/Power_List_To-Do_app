import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test_gui implements ActionListener {
    JButton testButton;
    JCheckBox checker;
    JMenuBar my_menu_bar;

    JButton one, two, three;

    DrawPanel panel;

    public void go(){
        JFrame testFrame = new JFrame();

        testButton= new JButton("tap here");
        testButton.addActionListener(this);
//        testFrame.getContentPane().add(BorderLayout.EAST, testButton);

        checker = new JCheckBox("this box");
//        checker.addActionListener(this);
//        testFrame.getContentPane().add(BorderLayout.WEST, checker);

        my_menu_bar = new JMenuBar();
        one = new JButton("first button");
        one.addActionListener(this);
        two = new JButton();
        three = new JButton();
        my_menu_bar.add(one);
        two.setText("second button");
        my_menu_bar.add(two);
        three.setText("third button");
        my_menu_bar.add(three);
        testFrame.getContentPane().add(BorderLayout.NORTH, my_menu_bar);

        panel = new DrawPanel();
        testFrame.getContentPane().add(BorderLayout.SOUTH, panel);



        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setSize(720, 300);
        testFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        testButton.setText("devil's fancy prada but i say she fancy klein...");
        one.setText("one clicked");
    }


    public static class DrawPanel extends JPanel{

        public void paintComponents(Graphics grphx){
            grphx.setColor(Color.orange);
            grphx.fillRect(20, 50 , 100, 100);

        }
    }

    public static void main(String[]args){
        test_gui gui = new test_gui();
        gui.go();
        test_gui.DrawPanel dw = new DrawPanel();
        Graphics gp = new DebugGraphics();
        dw.paintComponents(gp);

    }
}
