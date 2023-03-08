import javax.swing.*;

public class Power_List2 extends JFrame{

    private JPanel app_frame;
    private JPanel side_panel;
    private JPanel main_panel;
    private JPanel header_panel;
    private JPanel menu;
    private JButton all_tasks;
    private JButton todays_tasks;
    private JButton pl_list1;
    private JButton pl_list_2;
    private JButton new_list_button;
    private JRadioButton show_completed_RB;
    private JPanel list_window;
    private JLabel label;

    Power_List2(){
        // frame layout
        setContentPane(app_frame);
        setTitle("Power_List2");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(720, 540);
        setVisible(true);
    }


    public static void main(String[]args){

        Power_List2 myapp = new Power_List2();

    }


}
